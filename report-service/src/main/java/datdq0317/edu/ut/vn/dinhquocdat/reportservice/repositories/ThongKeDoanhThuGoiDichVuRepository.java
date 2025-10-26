package datdq0317.edu.ut.vn.dinhquocdat.reportservice.repositories;

import datdq0317.edu.ut.vn.dinhquocdat.reportservice.modules.ThongKeDoanhThuGoiDichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThongKeDoanhThuGoiDichVuRepository extends JpaRepository<ThongKeDoanhThuGoiDichVu, Long> {
    @Query(value = """
        SELECT t.*
        FROM thongkedoanhthugoidichvu t
        INNER JOIN (
            SELECT ma_goi, MAX(ngay_cap_nhat) AS max_ngay
            FROM thongkedoanhthugoidichvu
            GROUP BY ma_goi
        ) m ON t.ma_goi = m.ma_goi AND t.ngay_cap_nhat = m.max_ngay
        """, nativeQuery = true)
    List<ThongKeDoanhThuGoiDichVu> thongKeDoanhThuMoiNhat();

}
