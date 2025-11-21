/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_JDBC.repository;

import B9_JDBC.entity.GiangVien;
import B9_JDBC.util.DBConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author hangnt
 */
public class GiangVienRepository {
    // repository => Tang trao doi truc tiep vs CSDL
    // CRUD: 
    // C: CREATE : Add
    // R: READ: SELECT: hien thi du lieu
    // U: Update
    // D: Delete 
    // JDBC: Java Database Connectivity

    // GET ALL: Hien thi tat ca 
    public List<GiangVien> getAll() {
        List<GiangVien> lists = new ArrayList<>();
        // code 
        // B1: Tao cau lenh sql
        String sql = "SELECT ma, ten, loai,bac, tuoi, gioi_tinh\n"
                + "FROM QLGV.dbo.giang_vien;";
        // B2: Mo cong ket noi 
        try ( Connection con = DBConnect.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            // ResultSet => 1 table tra ra cua cau truy van 
            ResultSet rs = ps.executeQuery();
            // Vs cac cau lenh select => executeQuery
            // Update/Delete...(Con lai) => executeUpdate
            while(rs.next()){
                // doc du lieu tung dong
                GiangVien gv = new GiangVien();
                // set gia tri o giua 
                gv.setBac(rs.getInt(4));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setMa(rs.getString(1));
                gv.setTuoi(rs.getInt(5));
                gv.setGioiTinh(rs.getBoolean(6));
                lists.add(gv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }
    public static void main(String[] args) {
        System.out.println(new GiangVienRepository().getAll());
    }
}
