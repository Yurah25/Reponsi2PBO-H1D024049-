public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================
    // TODO:
    // - String namaKendaraan
    // - int levelEnergi         (0–100)
    // - int kapasitasPenumpang
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.
    public KendaraanGalaksi(String namaKendaraan,int kapasitasPenumpang){
        this.namaKendaraan=namaKendaraan;
        this.kapasitasPenumpang=kapasitasPenumpang;
        this.levelEnergi=100;
    }
    // ==========================================================
    // GETTER
    // ==========================================================
    protected void setEnergi(int energiBaru) {
        if (energiBaru < 0){
            this.levelEnergi = 0;
        }
        else if (energiBaru > 100){
            this.levelEnergi = 100;
        }
        else{
            this.levelEnergi = energiBaru;
        }
    }
    // TODO: Getter namaKendaraan
    public String getNamaKendaraan(){
        return this.namaKendaraan;
    }
    // TODO: Getter levelEnergi
    public int getLevelEnergi(){
        return this.levelEnergi;
    }
    // TODO: Getter kapasitasPenumpang
    public int getKapasitasPenumpang(){
        return this.kapasitasPenumpang;
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"
    public final void tampilStatus(){
        System.out.println(this.namaKendaraan+" | Energi: "+ this.levelEnergi+"% | Kapasitas: "+ this.kapasitasPenumpang+" awak");
    }

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    // TODO:
    // abstract void aktifkanMesin();
    public abstract void aktifkanMesin();
    // TODO:
    // abstract void jelajah(int jarak);
    public abstract void jelajah(int jarak);
    // TODO:
    // abstract void isiEnergi(int jumlah);
    public abstract void isiEnergi(int jumlah);

}
