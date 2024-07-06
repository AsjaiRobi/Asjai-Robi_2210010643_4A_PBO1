package baju;
import java.util.Scanner;

public class BajuBeraksi {
    public static void main(String[] args) {
        // IO sederhana
        try {
            Scanner scanner = new Scanner(System.in);
            
            // Array untuk menyimpan detail baju
            BajuDetail[] baju = new BajuDetail[2];
            
            for (int i = 0; i < baju.length; i++) {
                System.out.print("Masukkan nama baju ke-" + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan kode baju (5 angka) ke-" + (i + 1) + ": ");
                String kodeInput = scanner.nextLine();
                
                // Validasi kode harus berupa 5 angka
                if (kodeInput.length() != 5 || !kodeInput.matches("\\d+")) {
                    throw new NumberFormatException("Kode baju harus terdiri dari 5 angka.");
                }
                int kode = Integer.parseInt(kodeInput);
                
                // Membuat objek
                baju[i] = new BajuDetail(nama, kode);
            }
            
            for (BajuDetail data : baju) {
                System.out.println("============");
                System.out.println("Data baju: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }  
    }
}
