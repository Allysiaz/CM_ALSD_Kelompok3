public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah() {

    }

    public MataKuliah(String kodeMk, String namaMK, int sks) {
        this.kodeMK = kodeMk;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah() {
        System.out.println("Kode MK: " +kodeMK+ " | Nama: " +namaMK+ "\t| SKS: " +sks);
    }
}
