package baju;

// Pewarisan
public class BajuDetail extends Baju {
    // Konstruktor
    public BajuDetail(String nama, int kode) {
        super(nama, kode);
    }
    
    public String getKategori() {
        int kodeKat = getKode() / 10000;  // Ambil digit pertama
        // Seleksi if
        if (kodeKat == 1) {
            return "Formal";
        } else {
            return "Kasual";
        }
    }
    
    public String getTipe() {
        int kodeTipe = (getKode() / 1000) % 10;  // Ambil digit kedua
        // Seleksi switch
        switch (kodeTipe) {
            case 1:
                return "Kemeja";
            case 2:
                return "T-Shirt";
            default:
                return "Tipe Lain";
        }
    }
    
    public int getUkuran() {
        return getKode() % 1000;  // Ambil tiga digit terakhir
    }
    
    // Polimorfisme overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nKategori: " + getKategori() +
                "\nTipe: " + getTipe() +
                "\nUkuran: " + getUkuran();
    }
}
