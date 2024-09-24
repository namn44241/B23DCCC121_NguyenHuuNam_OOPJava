package B3.HELLOJAR;

import java.util.ArrayList;
import java.util.Scanner;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;
import vn.edu.ptit.Rule;
import view.InvoiceView;

public class HELLOJAR {

    static class PaymentController {
        private Invoice invoice;

        public PaymentController(Scanner sc) {
            Student st = new Student(sc.nextLine(), sc.nextLine());

            int n_subject = Integer.parseInt(sc.nextLine());
            ArrayList<Subject> AlSubject = new ArrayList<>();

            for (int i = 0; i < n_subject; i++) {
                String code = sc.nextLine();
                String name = sc.nextLine();
                AlSubject.add(new Subject(name, code, Integer.parseInt(sc.nextLine())));
            }

            Rule rule = new Rule(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));

            invoice = new Invoice(rule);
            invoice.setSt(st);
            invoice.setAlSubject(AlSubject);
            double amount = 0;
            for (Subject sj : AlSubject) {
                amount += sj.getCredit() * rule.getCreditPrice();
            }
            invoice.setAmount(amount);
        }

        public Invoice getInvoice() {
            return invoice;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentController pc = new PaymentController(sc);
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
        sc.close();
    }
}