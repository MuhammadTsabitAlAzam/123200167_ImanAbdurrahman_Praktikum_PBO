
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int kembali;
        
        do{
            System.out.println("Menu Utama");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            
            if (pilihan == 1){
                double panjang, lebar, tinggi;
                System.out.print("Input Panjang: ");
                panjang = input.nextDouble();
                System.out.print("Input Lebar: ");
                lebar = input.nextDouble();
                System.out.print("Input Tinggi: ");
                tinggi = input.nextDouble();
                
                Balok balok = new Balok(panjang, lebar, tinggi);
                
                System.out.println("Luas Persegi Panjang = " + balok.hitungLuas());
                System.out.println("Keliling Persegi Panjang = " + balok.hitungKeliling());
                System.out.println("Volume Balok = " + balok.hitungVolume());
                System.out.println("Luas Permukaan Balok = " + balok.hitungLuasP());
                
            }else if(pilihan == 2){
                double jarijari, tinggi;
                System.out.print("Input Tinggi: ");
                tinggi = input.nextDouble();
                System.out.print("Input Jari - jari: ");
                jarijari = input.nextDouble();
                Tabung tabung = new Tabung(jarijari, tinggi);
                
                System.out.println("Luas Lingkaran= " + tabung.hitungLuas());
                System.out.println("Keliling Lingkaran= " + tabung.hitungKeliling());
                System.out.println("Volume Tabung= " + tabung.hitungVolume());
                System.out.println("Luas Permukaan Tabung= " + tabung.hitungLuasP());
                
            }else if(pilihan == 0){
                System.exit(0);
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            kembali = input.nextInt();
        }while (kembali == 1);
    }
}
