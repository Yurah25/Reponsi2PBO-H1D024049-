class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    public String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor=tipe;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor
        System.out.print("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: " + tenagaHP + " HP");
        
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        // Override kategori
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
