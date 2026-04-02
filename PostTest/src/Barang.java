public class Barang {
    private String idBarang, namaBarang, kategori;
    private int stok, hargaSatuan;

    Barang(String idBarang, String namaBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    public String getIdBarang() {
        return idBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    
    public int getStok() {
        return stok;
    }
    public int getHargaSatuan() {
        return hargaSatuan;
    }
    
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public void setStok(int stok) {
        if(stok < 0) {
            System.out.println("Stok tidak boleh negatif.");
        }else{
            this.stok = stok;
        }
    }
    public void setHargaSatuan(int hargaSatuan) {
        if(hargaSatuan <= 0) {
            System.out.println("Harga satuan tidak boleh negatif.");
        }else{
            this.hargaSatuan = hargaSatuan;
            System.out.println("Harga satuan berhasil diubah.");
        }
    }
    public void tambahStok(int jumlah) {
        if(jumlah < 0){
            System.out.println("Jumlah yang ditambahkan tidak boleh negatif.");
        }else{
            this.stok += jumlah;
            System.out.println("Stok berhasil ditambahkan.");
        }
    }
    public void kurangiStok(int jumlah) {
        if(jumlah < 0) {
            System.out.println("Jumlah yang dikurangi tidak boleh negatif.");
        }else if(jumlah > getStok()) {
            System.out.println("Jumlah yang dikurangi melebihi stok yang tersedia.");
        }else{
            this.stok -= jumlah;
            System.out.println("Stok berhasil dikurangi.");
        }
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tampilkanDetailBarang() {
        System.out.println("=== Detail Barang ===");
        System.out.println("ID Barang: " + getIdBarang());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Kategori: " + getKategori());
        System.out.println("Stok: " + getStok());
        System.out.println("Harga Satuan: " + getHargaSatuan());
        System.out.println("=====================");
    }
}
