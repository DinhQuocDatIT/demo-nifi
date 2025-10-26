package datdq0317.edu.ut.vn.dinhquocdat.reportservice.modules;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "thongkedoanhthugoidichvu")
public class ThongKeDoanhThuGoiDichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long maGoi;
    private String tenGoi;
    private Integer soLuongDangKy;
    private double tongDoanhThu;
    private double giaTrungBinh;
    private LocalDateTime ngayCapNhat;

    // ===== Constructors =====
    public ThongKeDoanhThuGoiDichVu() {
    }

    public ThongKeDoanhThuGoiDichVu(Long id, Long maGoi, String tenGoi, Integer soLuongDangKy, double tongDoanhThu, double giaTrungBinh, LocalDateTime ngayCapNhat) {
        this.id = id;
        this.maGoi = maGoi;
        this.tenGoi = tenGoi;
        this.soLuongDangKy = soLuongDangKy;
        this.tongDoanhThu = tongDoanhThu;
        this.giaTrungBinh = giaTrungBinh;
        this.ngayCapNhat = ngayCapNhat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaGoi() {
        return maGoi;
    }

    public void setMaGoi(Long maGoi) {
        this.maGoi = maGoi;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public Integer getSoLuongDangKy() {
        return soLuongDangKy;
    }

    public void setSoLuongDangKy(Integer soLuongDangKy) {
        this.soLuongDangKy = soLuongDangKy;
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public double getGiaTrungBinh() {
        return giaTrungBinh;
    }

    public void setGiaTrungBinh(double giaTrungBinh) {
        this.giaTrungBinh = giaTrungBinh;
    }

    public LocalDateTime getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(LocalDateTime ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }
}
