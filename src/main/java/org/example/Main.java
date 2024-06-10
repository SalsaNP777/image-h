package org.example;

import java.util.Scanner;

import static org.example.Image.image;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang (bilangan ganjil): ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar (bilangan ganjil): ");
        int lebar = scanner.nextInt();
        scanner.close();
        image(panjang, lebar);
    }
}
