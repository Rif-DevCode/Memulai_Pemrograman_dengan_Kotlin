package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferdReader {
    public static void main(String[]args){
        //inisialisasi buffer dibntu sreamreader agar dpt membca input dri keybord
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        System.out.println("Program penjumlahan sangat sederhana");
        int value1 = 0;
        int value2 = 0;

        try {
            System.out.println("Masukan Angka Pertama");
                    //parsing konversi kdlm bentuk integer
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukan Angka Kedua");
            value2 = Integer.parseInt(bufferedReader.readLine());
                //penanganan error buffereder
        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : "+ hasil);
    }
}
