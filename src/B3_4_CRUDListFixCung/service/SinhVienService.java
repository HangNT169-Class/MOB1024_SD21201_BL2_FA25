/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_CRUDListFixCung.service;

import B3_4_CRUDListFixCung.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    // table ? phan thu => list co bn phan tu thi table se co bang day phan tu
    private List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienService() {
        // them phan tu vao list => add
        listSinhVien.add(new SinhVien("SV01", "Nguyen van a", 10, "Ha noi", true));
        listSinhVien.add(new SinhVien("SV02", "Nguyen van b", 15, "Vinh phuc", false));
        listSinhVien.add(new SinhVien("SV03", "Nguyen van c", 13, "Ninh binh", false));
        listSinhVien.add(new SinhVien("SV04", "Nguyen van a", 14, "Hai Duong", true));
        listSinhVien.add(new SinhVien("SV05", "Nguyen van e", 20, "Hai Phong", false));
    }

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }
    

}
