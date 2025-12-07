public interface KaryawanKontrak {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    public double hitungGaji(int jamKerja);
    public void perpanjangKontrak(int durasiBulan);
    // DEKLARASI METHOD 1: hitungGaji
    // Menerima satu parameter: int jamKerja
    // Mengembalikan nilai: double (total gaji)

    
    // DEKLARASI METHOD 2: perpanjangKontrak
    // Menerima satu parameter: int durasiBulan
    // Mengembalikan nilai: void
    
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
    // DEKLARASI DEFAULT METHOD: getStatusCuti
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Tersedia 12 hari"
}