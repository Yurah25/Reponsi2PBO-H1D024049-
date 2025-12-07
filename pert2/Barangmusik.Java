class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    public String kodeBarang;
    public String namaBarang;
    public double hargaSatuan;
    public int jumlahStock;
    
    
    // constructor
    public BarangMusik(String kodeBarang, String namaBarang){
        this.kodeBarang= kodeBarang;
        this.namaBarang= namaBarang;
        this.hargaSatuan= 0.0;
        this.jumlahStock=0;
    }
    
    public BarangMusik(String kodeBarang, String namaBarang, double hargaSatuan){
        this.kodeBarang= kodeBarang;
        this.namaBarang= namaBarang;
        this.hargaSatuan= hargaSatuan;
        this.jumlahStock=0;
    }

    public BarangMusik(String kodeBarang, String namaBarang, double hargaSatuan, int jumlahStock){
        this.kodeBarang= kodeBarang;
        this.namaBarang= namaBarang;
        this.hargaSatuan= hargaSatuan;
        this.jumlahStock= jumlahStock;
    }
    
    
    void ubahHarga(double hargaBaru) {
        this.hargaSatuan= hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        this.jumlahStock= this.jumlahStock+jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat Musik "+ this.namaBarang + " | Kode: "+ this.kodeBarang+" | Harga: Rp " + this.hargaSatuan+" | Stok: " + this.jumlahStock+" unit");
        
    }
}