class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private double gajiPokok; //Soal 2
    private String departemen;//Soal 3

    Karyawan(String idKaryawan, String namaKaryawan){
        setIdKaryawan(idKaryawan);
        setNamaKaryawan(namaKaryawan);
    } //Soal 1

    public String getIdKaryawan(){
        return this.idKaryawan;
    }
    public String getNamaKaryawan(){
        return this.namaKaryawan;
    }

    public void setIdKaryawan(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }
    public void setNamaKaryawan(String namaKaryawan){
        this.namaKaryawan = namaKaryawan;
    }
    public void setGajiPokok(double gajiPokok){
        if(gajiPokok < 0){
            System.out.println("Gaji pokok tidak boleh negatif.");
        }else{
            this.gajiPokok = gajiPokok;
        }
    }//Soal 2
    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen; 
    }//Soal 3

    public String getDepartemen(){
        return this.departemen;
    }

    public void tampilkanDataKaryawan(){
        System.out.println("ID Karyawan: " + getIdKaryawan());
        System.out.println("Nama Karyawan: " + getNamaKaryawan());
        System.out.println("Departemen: " + getDepartemen());
        System.out.println("Informasi Gaji Pokok: " + getGajiPokok());   
    }//Soal 3
}
