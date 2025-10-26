package datdq0317.edu.ut.vn.dinhquocdat.reportservice.services;

import datdq0317.edu.ut.vn.dinhquocdat.reportservice.modules.ThongKeDoanhThuGoiDichVu;

import java.util.List;
import java.util.Optional;

public interface IThongKeDoanhThuGoiDichVuService {
    List<ThongKeDoanhThuGoiDichVu> getAll();
    Optional<ThongKeDoanhThuGoiDichVu> getById(Long id);
    ThongKeDoanhThuGoiDichVu save(ThongKeDoanhThuGoiDichVu thongKe);
    ThongKeDoanhThuGoiDichVu update(Long id, ThongKeDoanhThuGoiDichVu thongKe);
    void delete(Long id);
    List<ThongKeDoanhThuGoiDichVu> thongKeDoanhThuGoiDichVu();

}
