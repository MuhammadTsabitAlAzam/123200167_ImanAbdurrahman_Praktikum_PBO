
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int pilihan;
        String air;
        double fahrenheit, celcius, reamur, kelvin, suhuInput;
        boolean kembali = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Program Konversi Suhu Air");
        System.out.print("Suhu (Celcius)\t: ");
        suhuInput = input.nextDouble();
        Konversi data = new Konversi(suhuInput); //constructor menyimpan data
        
        while (kembali) {
            //objek untuk menyimpan data-data yang sudah diolah
            fahrenheit = data.toFahrenheit();
            reamur = data.toReamur();
            kelvin = data.toKelvin();
            celcius = data.celcius;
            air = data.kondisiAir();

            System.out.println("\nOpsi");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilihan\t: ");
            pilihan = (int) input.nextDouble();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Suhu Celcius\t\t: " + celcius + "°C");
                    System.out.println("Suhu Fahrenheit\t: " + fahrenheit + "°F");
                    System.out.println("Suhu Reamur\t\t: " + reamur + "°R");
                    System.out.println("Suhu Kelvin\t\t: " + kelvin + "K");
                    System.out.println("Kondisi Air\t\t: " + air);
                    break;
                case 2:
                    System.out.print("Suhu (Celcius)\t: ");
                    suhuInput = input.nextDouble();
                    data.ubahData(suhuInput);
                    break;
                case 3:
                    kembali = false;
                    break;
            }

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Opsi tidak ada, mohon masukkan opsi dengan benar!");
            }
        }

    }
}
