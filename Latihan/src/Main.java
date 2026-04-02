public class Main {
    public static void main(String[] args) throws Exception{
        Karyawan karyawan1 = new Karyawan("012847934", "Michael Alex");
        karyawan1.setDepartemen("IT");
        karyawan1.setGajiPokok(-5000000);
        karyawan1.setGajiPokok(5000000);
        karyawan1.tampilkanDataKaryawan();
    }
}
