import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa [] daftarMahasiswa = new Mahasiswa[3]; //buat objek baru daftarmhs yg isinya 3 array
        MataKuliah [] mk = new MataKuliah[3]; //buat objek baru mk isinya 3 array 

        Mahasiswa mhs0 = new Mahasiswa(); //instansiasi
        mhs0.NIM = "22001"; 
        mhs0.nama = "Ali Rahman";
        mhs0.prodi = "Informatika";
        daftarMahasiswa[0] = mhs0;  

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.NIM = "22002";
        mhs1.nama = "Budi Santoso";
        mhs1.prodi = "Informatika";
        daftarMahasiswa[1] = mhs1;

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.NIM = "22003";
        mhs2.nama = "Citra Dewi";
        mhs2.prodi = "Sistem Informasi Bisnis";
        daftarMahasiswa[2] = mhs2;

        MataKuliah mk0 = new MataKuliah(); //instansiasi
        mk0.kodeMK = "MK001"; 
        mk0.namaMK = "Struktur Data";
        mk0.sks    = 3;
        mk[0] = mk0;

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "MK002";
        mk1.namaMK = "Basis Data";
        mk1.sks    = 3;
        mk[1] = mk1;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK =  "MK003";
        mk2.namaMK = "Desain Web";
        mk2.sks    = 3;
        mk[2] = mk2;

        Penilaian[] nilai = {
                new Penilaian(mhs0, mk0, 80, 85, 90), //assignment
                new Penilaian(mhs0, mk1, 60, 75, 70),
                new Penilaian(mhs1, mk0, 75, 70, 80),
                new Penilaian(mhs2, mk1, 85, 90, 95),
                new Penilaian(mhs2, mk2, 80, 90, 65),
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
                    for (Mahasiswa mhs : daftarMahasiswa) { //utk setiap objek mhs dlm mahasiswa tampilkan data mahasiswa dalam daftarMahasiswa
                        mhs.tampilMahasiswa(); //mhs varaibel sementara yang digunakan untuk 
                    }
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    for (MataKuliah matakuliah : mk) { //utk setiap objek matakuliah dalam daftar mata kuliah tampilkan matakuliah
                        matakuliah.tampilMataKuliah();
                    }
                    break;
                case 3:
                    System.out.println("Data Penilaian:");
                    for (Penilaian penilaian : nilai) { //utk setiap objek penilaian dalam penilaian hitung nilai akhir
                        penilaian.hitungNilaiAkhir();
                    }
                    for (Penilaian penilaian : nilai) {
                        System.out.println(penilaian.mahasiswa.nama + "\t| " + penilaian.mataKuliah.namaMK + "\t| Nilai Akhir: " + penilaian.nilaiAkhir );
            }
                    break;
                case 4:
                    System.out.println("Urutan Mahasiswa berdasarkan Nilai Akhir: ");
                    for (Penilaian penilaian : nilai) { //utl setiap objek penilaian dalam penilaian tampilkan nilai akhir
                        penilaian.hitungNilaiAkhir();
                    }

                    for (int i = 0; i < nilai.length - 1; i++) { //bubble sort 
                        for (int j = 0; j < nilai.length - i - 1; j++) { //sorting dsc pakai "<" 
                           if (nilai[j].nilaiAkhir < nilai [j + 1].nilaiAkhir) {  //jk nilai pada indeks kiri lebih kecil tukar dg data kanan
                            Penilaian temp = nilai[j]; //temp variabel sementara 
                            nilai[j] = nilai [j+1]; //swap data 
                            nilai[j+1] = temp; //simpan di varaibel temp
                           } 
                        }
                        
                    }
                    for (Penilaian penilaian : nilai) {
                                System.out.println(penilaian.mahasiswa.nama + "\t| " + penilaian.mataKuliah.namaMK + "\t| Nilai Akhir: " + penilaian.nilaiAkhir );
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari:");
                    String nimCari = sc.nextLine();
                    boolean ditemukan =false;
                    for (int i = 0; i < daftarMahasiswa.length; i++) { //linear search
                        if (daftarMahasiswa[i].NIM.equalsIgnoreCase(nimCari)) { //jk nim di daftar mhs sesuai dg nim yg dicari tampilkan nim data mhs
                            daftarMahasiswa[i].tampilMahasiswa();
                            ditemukan = true;                          
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Tidak ada Mahasiswa dengan NIM tersebut!");
                    }
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan Tidak Valid!");
            }
        }
    }
}
