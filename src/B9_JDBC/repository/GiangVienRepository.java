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
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            // ResultSet => 1 table tra ra cua cau truy van 
            ResultSet rs = ps.executeQuery();
            // Vs cac cau lenh select => executeQuery
            // Update/Delete...(Con lai) => executeUpdate
            while (rs.next()) {
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

    public GiangVien getOne(String ma1) {
        // code 
        // B1: Tao cau lenh sql
        String sql = "SELECT ma, ten, loai,bac, tuoi, gioi_tinh\n"
                + "FROM QLGV.dbo.giang_vien WHERE ma = ?";
        // B2: Mo cong ket noi 
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            // set gia tri cho dau ? 
            ps.setObject(1, ma1);
            // ResultSet => 1 table tra ra cua cau truy van 
            ResultSet rs = ps.executeQuery();
            // Vs cac cau lenh select => executeQuery
            // Update/Delete...(Con lai) => executeUpdate
            while (rs.next()) {
                // doc du lieu tung dong
                GiangVien gv = new GiangVien();
                // set gia tri o giua 
                gv.setBac(rs.getInt(4));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setMa(rs.getString(1));
                gv.setTuoi(rs.getInt(5));
                gv.setGioiTinh(rs.getBoolean(6));
                return gv;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null; // Khong tin thay doi tuong
    }

    public boolean add(GiangVien gv) {
        int check = 0; // Add/Update/ Delete fail => 0 
        // So luong dau ? chinh la so luong tham so truyen vao 
        String sql = "INSERT INTO QLGV.dbo.giang_vien\n"
                + "(ma, ten, loai, tuoi, bac, gioi_tinh)\n"
                + "VALUES(?,?,?,?,?,?);";
        // B2: Mo cong ket noi 
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            // co bn dau ? thi se setObject bang day lan
            ps.setObject(1, gv.getMa());
            ps.setObject(2, gv.getTen());
            ps.setObject(3, gv.getLoai());
            ps.setObject(4, gv.getTuoi());
            ps.setObject(5, gv.getBac());
            ps.setObject(6, gv.isGioiTinh());
            // excute update 
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return check > 0;
    }

    // Update & delete tuong tu add 
    public boolean update(GiangVien gv, String maCanUpdate) {
        int check = 0; // Add/Update/ Delete fail => 0 
        // So luong dau ? chinh la so luong tham so truyen vao 
        String sql = "UPDATE QLGV.dbo.giang_vien\n" +
                "SET ten=?, loai=?, tuoi=?, bac=?, gioi_tinh=?\n" +
                "WHERE ma=?;";
        // B2: Mo cong ket noi 
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            // co bn dau ? thi se setObject bang day lan
            ps.setObject(1, gv.getTen());
            ps.setObject(2, gv.getLoai());
            ps.setObject(3, gv.getTuoi());
            ps.setObject(4, gv.getBac());
            ps.setObject(5, gv.isGioiTinh());
            ps.setObject(6, maCanUpdate);
            // excute update 
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        int check = 0; // Add/Update/ Delete fail => 0 
        // So luong dau ? chinh la so luong tham so truyen vao 
        String sql = "DELETE FROM QLGV.dbo.giang_vien\n" +
                "WHERE ma=?;";
        // B2: Mo cong ket noi 
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            // co bn dau ? thi se setObject bang day lan
            ps.setObject(1, ma);
            // excute update 
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        System.out.println(new GiangVienRepository().getOne("HangNT16aa9"));
    }
}
