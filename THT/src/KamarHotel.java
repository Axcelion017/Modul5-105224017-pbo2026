public class KamarHotel {

    private String nomorKamar, tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal){
        this.nomorKamar = nomorKamar;
        this.setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0.0;
        this.isTersedia = true;
    }

    KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam){
        this.nomorKamar = nomorKamar;
        this.setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.setHargaPerMalam(hargaPerMalam);
        this.isTersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }
    
    public String getTipeKamar() {
        return tipeKamar;
    }
    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setTipeKamar(String tipeKamar) {
        if(tipeKamar.equalsIgnoreCase("Regular") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")){
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe kamar tidak valid. Tipe kamar diatur ke 'Regular' secara default.");
            this.tipeKamar = "Regular";
        }
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        if(hargaPerMalam < 50000.0){
            this.hargaPerMalam = 50000.0;
            System.out.println("Harga per malam tidak boleh kurang dari 50000.0. Harga diatur ke 50000.0.");
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    public void pesanKamar() {
        if(isTersedia){
            isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Maaf, kamar " + nomorKamar + " tidak tersedia.");
        }
    }

    public void pesanKamar(int jumlahTamu){
        if(isTersedia){
            if(jumlahTamu <= kapasitasMaksimal){
                isTersedia = false;
                System.out.println("Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " tamu.");
            } else {
                System.out.println("Maaf, jumlah tamu melebihi kapasitas maksimal kamar " + nomorKamar + ".");
            }
        } else {
            System.out.println("Maaf, kamar " + nomorKamar + " tidak tersedia.");
        }
    }

    public void batalPesan() {
        if(!isTersedia){
            isTersedia = true;
            System.out.println("Pemesanan kamar " + nomorKamar + " berhasil dibatalkan.");
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah tersedia, tidak ada pemesanan yang perlu dibatalkan.");
        }
    }

    public void hitungTotalBayar(int jumlahMalam){
        double totalBayar = hargaPerMalam * jumlahMalam;
        System.out.println("Total bayar untuk kamar " + nomorKamar + " selama " + jumlahMalam + " malam adalah: " + totalBayar);
    }

    public void hitungTotalBayar(int jumlahMalam, String kodeVoucher){
        if(kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3){
            double totalBayar = hargaPerMalam * jumlahMalam * 0.8; // Diskon 10%
            System.out.println("Total bayar untuk kamar " + nomorKamar + " selama " + jumlahMalam + " malam dengan kode voucher PROMO adalah: " + totalBayar);
        } else {
            System.out.println("Kode voucher tidak valid atau jumlah malam kurang dari 3. Penggunaan Voucher Ditolak.");
            hitungTotalBayar(jumlahMalam); // Hitung tanpa diskon jika kode voucher tidak valid
        }
    }

    public void tampilkanInfoKamar() {
        System.out.println("=== Informasi Kamar ===");
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Kapasitas Maksimal: " + kapasitasMaksimal + " tamu");
        System.out.println("Harga per Malam: " + hargaPerMalam);
        System.out.println("Status Ketersediaan: " + (isTersedia ? "Tersedia" : "Tidak Tersedia"));
        System.out.println("=======================");
    }

}
