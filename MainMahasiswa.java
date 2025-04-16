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

        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Niai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilih Menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    daftarMahasiswa[i].tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    mk[i].tampilMataKuliah();
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
