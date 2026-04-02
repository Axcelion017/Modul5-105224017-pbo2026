import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan ID Barang : ");
        String idBarang = sc.nextLine();
        System.out.print("Masukan Nama Barang : ");
        String namaBarang = sc.nextLine();
        Barang barang1 = new Barang(idBarang, namaBarang);
        //barang1.stok = 50; Karena stok dan hargaSatuan bersifat private, maka tidak bisa diakses langsung dari luar kelas secara langsung seperti ini, harus menggunakan method setter yang sudah disediakan di kelas Barang
        barang1.setKategori("Elektronik");
        barang1.setHargaSatuan(-10000000);
        barang1.setHargaSatuan(10000000);
        barang1.tampilkanDetailBarang();
        barang1.setStok(50);
        barang1.tampilkanDetailBarang();
        barang1.kurangiStok(100);
        barang1.tampilkanDetailBarang();
        barang1.kurangiStok(20);
        barang1.tampilkanDetailBarang();
        sc.close();
    }
}
