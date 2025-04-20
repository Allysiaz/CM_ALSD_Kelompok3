public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;

    public Mahasiswa() {

    }

    public Mahasiswa(String nim, String nama, String Prodi) {
        NIM = nim;
        this.nama = nama;
        this.prodi = Prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + NIM + " | Nama: " + nama + "\t| Prodi: " + prodi);
    }


}
