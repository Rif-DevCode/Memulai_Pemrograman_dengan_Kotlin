package com.dicoding.javafundamental.inputoutput;


import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[]args){
        //inisialisasi awal ketika menggunakan fungsi Scanner / perintah input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program penjumlahan sangat sederhana");
        System.out.println("Masukan Angka Pertama : ");
        //input yang diberikan akan tersimpan discanner
        //scanner.nextInt() setiap input keyboard akan tersimpan di value1
        int value1 = scanner.nextInt();
        System.out.println("Masukan Angka Kedua : ");

        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : " + hasil);
    }
}
