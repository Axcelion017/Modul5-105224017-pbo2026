public class RekeningBank {
    private String nomorRekening;
    private int saldo;

    RekeningBank(String nomorRekening, int saldo){
        this.nomorRekening = nomorRekening;
        setSaldo(saldo);
    }

    public String getNoRekening(){
        return this.nomorRekening;
    }
    public int getSaldo(){
        return this.saldo;
    }

    public void setSaldo(int saldo){
        if(saldo < 0){
            System.out.println("Pengisian tidak boleh negatif.");
        }else{
            this.saldo += saldo;
            System.out.println("Saldo berhasil diisi. Saldo saat ini: " + getSaldo());
        }
    }

    public void getInfoRekening(){
        System.out.println("Nomor Rekening: " + getNoRekening());
        System.out.println("Saldo: " + getSaldo());
    }

}
