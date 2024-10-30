package bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static abstract class CayCanh {
        protected String tenCay;
        protected String loaiCay;
        protected double chiPhiChamSoc;

        public CayCanh(String tenCay, String loaiCay, double chiPhiChamSoc) {
            this.tenCay = tenCay;
            this.loaiCay = loaiCay;
            this.chiPhiChamSoc = chiPhiChamSoc;
        }

        public abstract String hienThiThongTin();

        public String getTenCay() {
            return tenCay;
        }

        public String getLoaiCay() {
            return loaiCay;
        }

        public double getChiPhiChamSoc() {
            return chiPhiChamSoc;
        }
    }

    public static class CayTrongNha extends CayCanh {
        private String yeuCauAnhSang;

        public CayTrongNha(String tenCay, double chiPhiChamSoc, String yeuCauAnhSang) {
            super(tenCay, "Cây trong nhà", chiPhiChamSoc);
            this.yeuCauAnhSang = yeuCauAnhSang;
        }

        @Override
        public String hienThiThongTin() {
            return String.format("%s: Loại - %s, Ánh sáng yêu cầu: %s, Chi phí chăm sóc %.0f VND",
                    tenCay, loaiCay, yeuCauAnhSang, chiPhiChamSoc);
        }
    }

    public static class CayNgoaiTroi extends CayCanh {
        private String yeuCauDoAm;

        public CayNgoaiTroi(String tenCay, double chiPhiChamSoc, String yeuCauDoAm) {
            super(tenCay, "Cây ngoài trời", chiPhiChamSoc);
            this.yeuCauDoAm = yeuCauDoAm;
        }

        @Override
        public String hienThiThongTin() {
            return String.format("%s: Loại - %s, Độ ẩm yêu cầu: %s, Chi phí chăm sóc %.0f VND",
                    tenCay, loaiCay, yeuCauDoAm, chiPhiChamSoc);
        }
    }

    public static class DichVu {
        private List<CayCanh> danhSachCay;

        public DichVu() {
            this.danhSachCay = new ArrayList<>();
        }

        public void themCay(CayCanh cay) {
            danhSachCay.add(cay);
        }

        public double tinhTongChiPhi() {
            return danhSachCay.stream()
                    .mapToDouble(CayCanh::getChiPhiChamSoc)
                    .sum();
        }

        public void hienThiDanhSachCay() {
            System.out.println("Danh sách cây cảnh:");
            danhSachCay.forEach(cay -> System.out.println(cay.hienThiThongTin()));
        }

        public void hienThiChiPhiCaoThapNhat() {
            Map<String, List<CayCanh>> cayTheoLoai = danhSachCay.stream()
                    .collect(Collectors.groupingBy(CayCanh::getLoaiCay));

            for (Map.Entry<String, List<CayCanh>> entry : cayTheoLoai.entrySet()) {
                List<CayCanh> cayCungLoai = entry.getValue();
                
                CayCanh cayChiPhiCaoNhat = Collections.max(cayCungLoai, 
                    Comparator.comparingDouble(CayCanh::getChiPhiChamSoc));
                CayCanh cayChiPhiThapNhat = Collections.min(cayCungLoai, 
                    Comparator.comparingDouble(CayCanh::getChiPhiChamSoc));

                System.out.printf("%s có chi phí cao nhất: %s (%.0f VND)\n",
                        entry.getKey(), cayChiPhiCaoNhat.getTenCay(), cayChiPhiCaoNhat.getChiPhiChamSoc());
                System.out.printf("%s có chi phí thấp nhất: %s (%.0f VND)\n",
                        entry.getKey(), cayChiPhiThapNhat.getTenCay(), cayChiPhiThapNhat.getChiPhiChamSoc());
            }
        }
    }

    public static void main(String[] args) {
        DichVu dichVu = new DichVu();
                              
        dichVu.themCay(new CayTrongNha("Cây Xương rồng", 300000, "Yếu"));
        dichVu.themCay(new CayTrongNha("Cây Hoa sứ", 50000, "Trung bình"));
        dichVu.themCay(new CayNgoaiTroi("Cây Mai", 500000, "Trung bình"));
        dichVu.themCay(new CayNgoaiTroi("Cây Si", 100000, "Cao"));

        System.out.printf("Tổng chi phí chăm sóc hàng tháng: %.0f VND\n", dichVu.tinhTongChiPhi());

        System.out.println("\nDanh sách các cây cảnh:");
        dichVu.hienThiDanhSachCay();

        System.out.println("\nThống kê chi phí cao nhất và thấp nhất theo loại:");
        dichVu.hienThiChiPhiCaoThapNhat();
    }
}