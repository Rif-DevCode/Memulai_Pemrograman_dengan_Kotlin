package com.dicoding.javafundamental.percabangan;

public class Switch {
    public static void main(String[]args){
        int input = 3;
        switch (input){
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;

                default:
                    System.out.println("Nilai yang anda masukan belum terdaftar");
                    break;
        }
    }
}
