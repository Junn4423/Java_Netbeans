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
public class Bai1_9 {
    public static void main(String[] args) {
        // Nhập vào chỉ số điện cũ và chỉ số điện mới
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào chỉ số điện cũ: ");
        int chiSoCu = scanner.nextInt();
        
        System.out.print("Nhập vào chỉ số điện mới: ");
        int chiSoMoi = scanner.nextInt();
        
        // Kiểm tra điều kiện nhập liệu
        if (chiSoCu > chiSoMoi) {
            System.out.println("Chỉ số điện mới phải lớn hơn hoặc bằng chỉ số điện cũ.");
            return;
        }

        // Tính số kWh tiêu thụ
        int soKWh = chiSoMoi - chiSoCu;

        // Tính tiền điện theo quy định
        double tienDien = tinhTienDien(soKWh);

        // In ra kết quả
        System.out.printf("Số tiền điện cần thanh toán: %.2f VNĐ", tienDien);
    }

    public static double tinhTienDien(int soKWh) {
        double tienDien = 0;

        if (soKWh <= 50) {
            tienDien = soKWh * 1480;
        } else if (soKWh <= 100) {
            tienDien = 50 * 1480 + (soKWh - 50) * 1533;
        } else if (soKWh <= 200) {
            tienDien = 50 * 1480 + 50 * 1533 + (soKWh - 100) * 1786;
        } else if (soKWh <= 300) {
            tienDien = 50 * 1480 + 50 * 1533 + 100 * 1786 + (soKWh - 200) * 2242;
        } else {
            tienDien = 50 * 1480 + 50 * 1533 + 100 * 1786 + 100 * 2242 + (soKWh - 300) * 2503;
        }

        return tienDien;
    }
}
