public class Penilaian {
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Mahasiswa mahasiswa = new Mahasiswa();

    public Penilaian (String mahasiswa, String mataKuliah, double tugas, double uts, double uas) {
    
        mahasiswa = mahasiswa;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas ;
    }

    void hitungNilaiAkhir (){
        System.out.println("");
    }
}
