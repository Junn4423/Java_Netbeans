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
public class Bai1_4 {
    public static void main(String[] args) {
        int a,b,c,min,max;
        Scanner inp = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        a = inp.nextInt();     
        System.out.println("nhap vao b: ");
        b = inp.nextInt();
        System.out.println("nhap vao c: ");
        c = inp.nextInt();
        min = a<b?a:b;
        min = min<c?min:c;
        max = a>b?a:b;
        max = max>c?max:c;
        System.out.println("min la : "+min);
        System.out.println("max la : "+max);
    }
}
