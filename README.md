Berikut adalah README.md yang diimplementasikan untuk kode aplikasi pengolahan data baju menggunakan Java:

```markdown
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data baju menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan kode baju, dan memberikan output berupa informasi detail dari baju tersebut termasuk kategori, tipe, dan ukuran.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Baju`, `BajuDetail`, dan `BajuBeraksi` adalah contoh dari class.

```java
public class Baju {
    ...
}

public class BajuDetail extends Baju {
    ...
}

public class BajuBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `baju[i] = new BajuDetail(nama, kode);` adalah contoh pembuatan object.

```java
baju[i] = new BajuDetail(nama, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kode` adalah contoh atribut.

```java
private String nama;
private int kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Baju` dan `BajuDetail`.

```java
public Baju(String nama, int kode) {
    this.nama = nama;
    this.kode = kode;
}

public BajuDetail(String nama, int kode) {
    super(nama, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKode` adalah contoh method mutator.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setKode(int kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` dan `getKode` adalah contoh method accessor.

```java
public String getNama() {
    return nama;
}

public int getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private String nama;
private int kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BajuDetail` mewarisi `Baju` dengan sintaks extends.

```java
public class BajuDetail extends Baju {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Baju` merupakan overloading method `displayInfo` dan `displayInfo` di `BajuDetail` merupakan override dari method `displayInfo` di `Baju`.

```java
// Polimorfisme overloading
public String displayInfo(String ukuran) {
    return displayInfo() + "\nUkuran: " + ukuran;
}

// Polimorfisme overriding
@Override
public String displayInfo() {
    return super.displayInfo() +
           "\nKategori: " + getKategori() +
           "\nTipe: " + getTipe() +
           "\nUkuran: " + getUkuran();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, seleksi digunakan dalam method `getKategori` dan `getTipe`.

```java
public String getKategori() {
    int kodeKat = getKode() / 10000;  // Ambil digit pertama
    if (kodeKat == 1) {
        return "Formal";
    } else {
        return "Kasual";
    }
}

public String getTipe() {
    int kodeTipe = (getKode() / 1000) % 10;  // Ambil digit kedua
    switch (kodeTipe) {
        case 1:
            return "Kemeja";
        case 2:
            return "T-Shirt";
        default:
            return "Tipe Lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

```java
for (int i = 0; i < baju.length; i++) {
    ...
}

for (BajuDetail data : baju) {
    System.out.println("============");
    System.out.println("Data baju: ");
    System.out.println(data.displayInfo());
}
```

12. **IO Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama baju ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BajuDetail[] baju = new BajuDetail[2];` adalah contoh penggunaan array.

```java
BajuDetail[] baju = new BajuDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try-catch` untuk menangani error.

```java
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
    System.out.println("Kesalahan format nomor: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan umum: " + e.getMessage());
}
```

## Usulan Nilai

| No | Materi         | Nilai |
|----|----------------|-------|
| 1  | Class          | 5     |
| 2  | Object         | 5     |
| 3  | Atribut        | 5     |
| 4  | Constructor    | 5     |
| 5  | Mutator        | 5     |
| 6  | Accessor       | 5     |
| 7  | Encapsulation  | 5     |
| 8  | Inheritance    | 5     |
| 9  | Polymorphism   | 10    |
| 10 | Seleksi        | 5     |
| 11 | Perulangan     | 5     |
| 12 | IO Sederhana   | 10    |
| 13 | Array          | 15    |
| 14 | Error Handling | 15    |
| **TOTAL** | | **100** |

## Pembuat

Nama: Asjai Robi
NPM: 2210010643
