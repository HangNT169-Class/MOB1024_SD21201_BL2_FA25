package B3_4_CRUDListFixCung.entity;

/**
 *
 * @author hangnt
 */
public class SinhVien {
    //Tạo class SinhVien gồm các thuộc tính maSV-String ,
    // ten-String, tuoi-int, diaChi-String,
    // gioiTinh-boolean(true-Nam, false-Nữ) 
    // và các method contructor có và không có
    // tham số, getter, setter)

    private String maSV;

    private String tenSV;

    private int tuoiSV;

    private String diaChi;

    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, int tuoiSV, String diaChi, boolean gioiTinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoiSV = tuoiSV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
