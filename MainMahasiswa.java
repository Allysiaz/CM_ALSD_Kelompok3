import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = {
                new Mahasiswa("22001", "Ali Rahman", "Informatika"),
                new Mahasiswa("22002", "Budi Santoso", "Informatika"),
                new Mahasiswa("22003", "citra Dewi", "Sistem Informasi Bisnis"),
        };

        MataKuliah[] mk = {
                new MataKuliah("MK001", "Struktur Data", 3),
                new MataKuliah("MK002", "Basis Data", 3),
                new MataKuliah("MK003", "Desain Web", 3),
        };

        Penilaian[] nilai = {
                new Penilaian("Ali Rahman", "Struktur Data", 80, 85, 90),
                new Penilaian("Ali Rahman", "Basis Data", 60, 75, 70),
                new Penilaian("Budi Santoso", "Struktur Data", 75, 70, 80),
                new Penilaian("Citra Dewi", "Basis Data", 85, 90, 95),
                new Penilaian("Citra Dewi", "Desain Web", 80, 90, 65),
        };

        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Niai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    for (MataKuliah Matkul : mk) {
                        Matkul.tampilMataKuliah();
                    }
                    break;
                case 3:
                    System.out.println("Data Penilaian:");

                    break;
                case 4:
                    System.out.println("Urutan Mahasiswa berdasarkan Nilai Akhir: ");
                    break;
                case 5:
                    System.out.println("Masukkan NIM Mahasiswa yang dicari:");
                    break;
                case 0:
                    System.out.println("Daftar Penilaian:");
                    return;
                default:
                    System.out.println("Pilihan Tidak Valid!");
            }
        }
    }
}
