class defaultMesin {
    // Variabel umum mesin (namaMesin, tenagaHP)
    public String namaMesin;
    public int tenagaHP;

    // Constructor
    defaultMesin(String nama, int hp) {
        this.namaMesin=nama;
        this.tenagaHP=hp;
    }

    void tampilInfo() {
        // Tampilkan info dasar mesin
        System.out.println("Mesin "+ namaMesin + " | Tenaga: "+ tenagaHP+" HP");
    }

    double nilaiPerforma() {
        // Hitung performa dasar
        return tenagaHP*1.0;
    }

    String kategoriMesin() {
        // Kategori default
        return "Mesin Umum";
    }
}
