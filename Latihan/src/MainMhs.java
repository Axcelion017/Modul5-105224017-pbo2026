public class MainMhs {
    public static void main(String[] args) throws Exception{
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Michael Alex";
        mhs1.setNIM("105224017");
        mhs1.setNamaO("Michael");
        System.out.println("Nama Mahasiswa: " + mhs1.getNamaO());
        System.out.println("NIM: " + mhs1.getNIM());
    }
}
