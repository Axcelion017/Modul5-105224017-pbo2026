public class Main {
    public static void main(String[] args) throws Exception {
        KamarHotel k1 = new KamarHotel("101", "Reguler", 2);
        System.out.println("--- Uji Kamar 1 ---");
        k1.setTipeKamar("Presidential");
        k1.setHargaPerMalam(-10000);


        KamarHotel k2 = new KamarHotel("102", "Premium", 2, 150000);
        System.out.println("--- Uji Kamar 2 ---");
        k2.pesanKamar(4);
        k2.pesanKamar(2); 
        k2.pesanKamar(); 

        System.out.println("--- Uji Pembayaran ---");
        System.out.println("Tagihan Kamar 101: " + k1.hitungTotalBayar(2, "PROMO"));
        System.out.println("Tagihan Kamar 102: " + k2.hitungTotalBayar(4, "PROMO"));

        k1.tampilkanInfoKamar();
        k2.tampilkanInfoKamar();

    }
}
