/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_OverviewSwing;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NgoaiLe {

    // Expection 
    // ArrayIndexOutOfBoundsException => phan tu ngoai pham vi 
    // NumberFormatException: nhap sai kieu du lieu 
    // => loi than thien vs nguoi dung 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // try..catch 
        // throw
        System.out.println("Moi nhap so:");
        try {
            // chua doan code nghi ngo xay ra 
            int number = Integer.valueOf(sc.nextLine());
             System.out.println("Number:" + number);
        } catch (NumberFormatException e) {
            // xu ly loi 
            System.out.println("Bạn nhập sai kiểu giá trị, nhập lại đi");
        }
        // try..with..resource
//        https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%207/try-with-resources.md
//        int[] c = {1, 2, 3, 4, -5};
//        System.out.println(c[10]);
    }
}
