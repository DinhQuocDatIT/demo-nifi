package datdq0317.edu.ut.vn.dinhquocdat.reportservice.services;

import datdq0317.edu.ut.vn.dinhquocdat.reportservice.modules.ThongKeDoanhThuGoiDichVu;
import datdq0317.edu.ut.vn.dinhquocdat.reportservice.repositories.ThongKeDoanhThuGoiDichVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ThongKeDoanhThuGoiDichVuService implements IThongKeDoanhThuGoiDichVuService {

    @Autowired
    private ThongKeDoanhThuGoiDichVuRepository repository;

    @Override
    public List<ThongKeDoanhThuGoiDichVu> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ThongKeDoanhThuGoiDichVu> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ThongKeDoanhThuGoiDichVu save(ThongKeDoanhThuGoiDichVu thongKe) {
        return repository.save(thongKe);
    }

    @Override
    public ThongKeDoanhThuGoiDichVu update(Long id, ThongKeDoanhThuGoiDichVu thongKe) {
        if (repository.existsById(id)) {
            thongKe.setId(id);
            return repository.save(thongKe);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ThongKeDoanhThuGoiDichVu> thongKeDoanhThuGoiDichVu() {
        return repository.thongKeDoanhThuMoiNhat();
    }
}