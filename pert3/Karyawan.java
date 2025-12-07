class Karyawan {
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    protected String nama;
    protected double gajiPokok;

    // Gunakan access modifier yang tepat agar bisa diakses oleh subclass (misal: protected)
    
    
    // Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gajiPokok){
        this.nama=nama;
        this.gajiPokok=gajiPokok;
    }
    
    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.print("Nama: "+ this.nama+ " | Gaji Pokok: Rp "+ this.gajiPokok);
    }
}