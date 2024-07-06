package baju;

public class Baju {
    // Atribut enkapsulasi
    private String nama;
    private int kode;
    
    // Konstruktor
    public Baju(String nama, int kode) {
        this.nama = nama;
        this.kode = kode;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
    
    // Aksesor (getter)
    public String getNama() {
        return nama;
    }

    public int getKode() {
        return kode;
    }
    
    // Metode untuk menampilkan informasi
    public String displayInfo() {
        return "Nama: " + getNama() + "\nKode: " + getKode();
    }
    
    // Polimorfisme overloading
    public String displayInfo(String ukuran) {
        return displayInfo() + "\nUkuran: " + ukuran;
    }
}
