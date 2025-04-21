import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Hitung Luas Bangun Dasar");
        System.out.println("=================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Trapesium");
        System.out.print("Pilih bangun (1-5): ");
        
        int pilihan = scanner.nextInt();
        double luas = 0;
        
        switch(pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                luas = sisi * sisi;
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                luas = panjang * lebar;
                break;
            case 3:
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                luas = 0.5 * alas * tinggi;
                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                double jari = scanner.nextDouble();
                luas = Math.PI * jari * jari;
                break;
            case 5:
                System.out.print("Masukkan sisi sejajar 1: ");
                double sisi1 = scanner.nextDouble();
                System.out.print("Masukkan sisi sejajar 2: ");
                double sisi2 = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiTrapesium = scanner.nextDouble();
                luas = 0.5 * (sisi1 + sisi2) * tinggiTrapesium;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        
        System.out.printf("Luas bangun adalah: %.2f", luas);
        scanner.close();
    }
}
