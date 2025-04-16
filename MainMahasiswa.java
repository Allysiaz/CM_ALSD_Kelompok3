import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa daftarMahasiswa = new Mahasiswa();

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
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
