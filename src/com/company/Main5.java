package com.company;

public class Main5 {
    public static void main(String[] args) {
        //H1
//        for (int i = 0; i < 5; i++) {
//            System.out.println("");
//            for (int j = 4; j > i ;j--) {
//                System.out.print("   ");
//            }
//            for (int k = 0; k <= i ; k++) {
//                System.out.print(" * ");
//            }
//        }

        // H2

//        for (int i = 0; i < 5; i++) {
//            System.out.println("");
//            for (int k = 1; k <= i; k++) {
//                System.out.print("   ");
//            }
//            for (int j = 5; j > i; j--) {
//                System.out.print(" * ");
//            }
//        }

        //H3
//        for (int i = 0; i < 5; i++) {
//            System.out.println("");
//            for (int k = 4; k < i; k--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" * ");
//            }
//        }

//H4
//        for (int i = 0; i < 5; i++) {
//            System.out.println("");
//            for (int k = 1; k <= i; k++) {
//                System.out.print("");
//            }
//            for (int j = 5; j > i; j--) {
//                System.out.print(" * ");
//            }
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}
