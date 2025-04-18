public class Penilaian {
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;

    public Penilaian(Mahasiswa mhs, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mhs;
        this.mataKuliah = mataKuliah;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    public double hitungNilaiAkhir() {
        nilaiAkhir = 0.3 * nilaiTugas + 0.3 * nilaiUTS + 0.4 * nilaiUAS;
        // System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | " + " Nilai Akhir :" + nilaiAkhir);
        return nilaiAkhir;
    }

    void tampilNilai() {
        System.out.println(mahasiswa.nama + mataKuliah.namaMK + nilaiTugas + nilaiUTS + nilaiUAS);
    }
    
}
