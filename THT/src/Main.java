public class Main {
    public static void main(String[] args) throws Exception {
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 2, -100000);
        KamarHotel kamar2 = new KamarHotel("102", "Premium", 2, 150000);

        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);

        kamar2.pesanKamar();

        kamar1.hitungTotalBayar(2, "PROMO");
        kamar2.hitungTotalBayar(4, "PROMO");

        kamar1.tampilkanInfoKamar();
        kamar2.tampilkanInfoKamar();

    }
}
