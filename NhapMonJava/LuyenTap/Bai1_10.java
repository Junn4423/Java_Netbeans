
package Chuong1.BaiTap;

import java.util.Scanner;

public class Bai1_10 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày: ");
        int ngay = scanner.nextInt();
        System.out.println("Nhập tháng: ");
        int thang = scanner.nextInt();
        System.out.println("Nhập năm: ");
        int nam = scanner.nextInt();

        if (kiemTraNgayHopLe(ngay, thang, nam)) {
            System.out.println("Ngày hợp lệ.");
        } else {
            System.out.println("Ngày không hợp lệ.");
        }
    }

    public static boolean kiemTraNgayHopLe(int ngay, int thang, int nam) {
        if (nam <= 0) {
            return false;
        }

        if (thang < 1 || thang > 12) {
            return false;
        }

        int soNgayTrongThang = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgayTrongThang = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgayTrongThang = 30;
                break;
            case 2:
                if (nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) {
                    
                    soNgayTrongThang = 29;
                } else {
                  
                    soNgayTrongThang = 28;
                }
                break;
        }

        if (ngay < 1 || ngay > soNgayTrongThang) {
            return false;
        }

        return true;
    }  
}
