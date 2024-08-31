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
public class Bai1_7 {
    static Scanner sc = new Scanner(System.in);
    public static boolean isNhuan (int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int month = 0;
        System.out.println("Moi ban nhap thang: ");
        month = sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+month+"co 31 ngay");
                break;
            case 4:
                System.out.println("Thang "+month+" la loi noi doi cua em");
                break;
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+month+"co 30 ngay");
                break;
            case 2:
                int year = 0;
                System.out.println("Moi ban nhap nam: ");
                year= sc.nextInt();
                if (isNhuan(year)){
                    System.out.println("nam nhuan. thang "+month+" co 29 ngay");
                }
                else
                    System.out.println("nam ko nhuan. thang "+month+" co 28 ngay");
        }
    }
}
