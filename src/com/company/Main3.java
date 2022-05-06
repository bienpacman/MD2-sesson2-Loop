package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        a = scanner.nextInt();
        System.out.println("Nhập b : ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Không có ước số hung lớn nhất");
            while (a != b ){
                if (a > b)
                    a = a- b;
                else
                    b = b - a;
                System.out.println("Ước số chung lớn nhất là :" + a);
            }
        }

    }
}
