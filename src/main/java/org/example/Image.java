package org.example;

public class Image {
    public static void image(int panjang, int lebar) {
        if (panjang % 2 == 0 || lebar % 2 == 0) {
            System.out.println("Panjang dan Lebar harus bilangan Ganjil!");
            return;
        }

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                if (j == 0 || j == lebar - 1) {
                    System.out.print("* ");
                } else if (i == panjang / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}
