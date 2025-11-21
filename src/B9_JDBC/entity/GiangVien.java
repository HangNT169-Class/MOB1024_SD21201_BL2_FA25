/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_JDBC.entity;

/**
 *
 * @author hangnt
 */
public class GiangVien {

    // liet ke cac thuoc tinh vao class Giang vien 
    private String ma;
    private String ten;
    private String loai;
    private int tuoi;
    private int bac;
    private boolean gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String loai, int tuoi, int bac, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "ma=" + ma + ", ten=" + ten + ", loai=" + loai + ", tuoi=" + tuoi + ", bac=" + bac + ", gioiTinh=" + gioiTinh + '}';
    }

}
