
package Chuong1.BaiTap;

import java.util.Scanner;
public class Bai1_11 {
        static Scanner sc = new Scanner(System.in);

    public static boolean kiemTraNgayHopLe(int ngay, int thang, int nam) {
        if (nam <= 0 || thang < 1 || thang > 12 || ngay < 1) {
            return false;
        }

        int[] soNgayTrongThang = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            soNgayTrongThang[2] = 29;
        }

        return ngay <= soNgayTrongThang[thang];
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao ngay :");
        int ngay = sc.nextInt();
        System.out.println("Nhap vao thang :");
        int thang = sc.nextInt();
        System.out.println("Nhap vao nam :");
        int nam = sc.nextInt();
        if (!kiemTraNgayHopLe(ngay, thang, nam)) {
            System.out.println("Ngay khong hợp le");
            return;
        }
        int ngayKeTiep = ngay + 1;
        int thangKeTiep = thang;
        int namKeTiep = nam;

        if (ngayKeTiep > 28 && thangKeTiep == 2 && ((namKeTiep % 400 != 0 && namKeTiep % 4 == 0) || (namKeTiep % 100 == 0))) {
            ngayKeTiep = 1;
            thangKeTiep++;
        } else if (ngayKeTiep > 29 && thangKeTiep == 2) {
            ngayKeTiep = 1;
            thangKeTiep++;
        } else if (ngayKeTiep > 30 && (thangKeTiep == 4 || thangKeTiep == 6 || thangKeTiep == 9 || thangKeTiep == 11)) {
            ngayKeTiep = 1;
            thangKeTiep++;
        } else if (ngayKeTiep > 31) {
            ngayKeTiep = 1;
            thangKeTiep++;

            if (thangKeTiep > 12) {
                thangKeTiep = 1;
                namKeTiep++;
            }
        }
        int ngayKeTruoc = ngay - 1;
        int thangKeTruoc = thang;
        int namKeTruoc = nam;

        if (ngayKeTruoc < 1) {
            thangKeTruoc--;

            if (thangKeTruoc < 1) {
                thangKeTruoc = 12;
                namKeTruoc--;
            }

            int[] soNgayTrongThangTruoc = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (namKeTruoc % 400 == 0 || (namKeTruoc % 4 == 0 && namKeTruoc % 100 != 0)) {
                soNgayTrongThangTruoc[2] = 29;
            }

            ngayKeTruoc = soNgayTrongThangTruoc[thangKeTruoc];
        }
        System.out.println("Ngay ke tiep: " + ngayKeTiep + "/" + thangKeTiep + "/" + namKeTiep);
        System.out.println("Ngay ke truoc: " + ngayKeTruoc + "/" + thangKeTruoc + "/" + namKeTruoc);
    }
}
