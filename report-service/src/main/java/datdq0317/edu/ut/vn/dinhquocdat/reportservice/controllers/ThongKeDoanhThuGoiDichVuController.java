package datdq0317.edu.ut.vn.dinhquocdat.reportservice.controllers;

import datdq0317.edu.ut.vn.dinhquocdat.reportservice.modules.ThongKeDoanhThuGoiDichVu;
import datdq0317.edu.ut.vn.dinhquocdat.reportservice.services.IThongKeDoanhThuGoiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/report-service/thongkegoi")
public class ThongKeDoanhThuGoiDichVuController {

    @Autowired
    private IThongKeDoanhThuGoiDichVuService thongKeService;

    @GetMapping
    public ResponseEntity<List<ThongKeDoanhThuGoiDichVu>> getAll() {
        List<ThongKeDoanhThuGoiDichVu> list = thongKeService.getAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<ThongKeDoanhThuGoiDichVu> thongKe = thongKeService.getById(id);
        return thongKe.isPresent()
                ? ResponseEntity.ok(thongKe.get())
                : ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<ThongKeDoanhThuGoiDichVu> create(@RequestBody ThongKeDoanhThuGoiDichVu thongKe) {
        ThongKeDoanhThuGoiDichVu saved = thongKeService.save(thongKe);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody ThongKeDoanhThuGoiDichVu thongKe) {
        ThongKeDoanhThuGoiDichVu updated = thongKeService.update(id, thongKe);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        thongKeService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/doanhthu")
    public List<ThongKeDoanhThuGoiDichVu> thongKeDoanhThuGoiDichVu() {
        return thongKeService.thongKeDoanhThuGoiDichVu();
    }
}