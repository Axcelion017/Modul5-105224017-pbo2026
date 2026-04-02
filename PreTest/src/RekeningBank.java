public class RekeningBank {
    private String nomorRekening;
    private int saldo;

    public String getNoRekening(){
        return nomorRekening;
    }
    public int getSaldo(){
        return saldo;
    }

    public void getInfoRekening(){
        System.out.println("Nomor Rekening: " + getNoRekening());
        System.out.println("Saldo: " + getSaldo());
    }

    public void isiSaldo(int jumlah){
        if(jumlah > 0){
            this.saldo += jumlah;
            System.out.println("Saldo berhasil diisi. Saldo saat ini: " + getSaldo());
        }else{
            System.out.println("Pengisian tidak boleh negatif.");
        }
    }

    RekeningBank(){
        this.nomorRekening = "null";
        isiSaldo(0);
    }
}
