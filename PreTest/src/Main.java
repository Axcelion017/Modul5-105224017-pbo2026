public class Main {
    public static void main(String[] args) throws Exception{
        RekeningBank nasabah = new RekeningBank();

        nasabah.getInfoRekening();

        nasabah.isiSaldo(100000000);

        nasabah.getInfoRekening();

    }
}
