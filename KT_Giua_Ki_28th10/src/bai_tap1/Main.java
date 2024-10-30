package bai_tap1;

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
            super(tenCay, "Cây trong nhà", chiPhiChamSoc);
            this.yeuCauDoAm = yeuCauDoAm;
        }

        @Override
        public String hienThiThongTin() {
            return String.format("%s: Loại - %s, Ánh sáng yêu cầu: %s, Chi phí chăm sóc %.0f VND",
                    tenCay, loaiCay, yeuCauDoAm, chiPhiChamSoc);
        }
    }
    
