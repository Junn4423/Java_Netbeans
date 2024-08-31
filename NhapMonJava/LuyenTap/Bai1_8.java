/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong1.BaiTap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap diem: ");
        double diem = sc.nextDouble();
        String thangDiemChu = chuyenSangDiemChu(diem);
        System.out.println("diem chu tuong ung: "+thangDiemChu);
    }
    public static String chuyenSangDiemChu(Double diem) {
        if(diem >= 8.5){
            return "A";
        }else if (diem <= 8.4){
            return "B";
        }else if (diem <= 6.9){
            return "C";
        }else if (diem <= 5.4){
            return "D";
        }else{
            return "F";
        }
        
    }
}
