public class Mahasiswa {
        String NIM;
        String nama;
        String prodi;
        public Mahasiswa () {
    
        }
        public Mahasiswa (String nim, String nama, String Prodi) {
            NIM = nim;
            this.nama = nama;
            this.prodi = prodi;
        }
    
        void tampilMahasiswa() {
            System.out.println("Nama    : ");
            System.out.println("NIM     : ");
            System.out.println("Prodi   : ");
        }
}
