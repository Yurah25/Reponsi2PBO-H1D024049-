class Pengguna {
    public int umur;
    public double beratBadan;
    public double tinggiBadan;
    public final double faktorAktivitas = 1.2;

    
    double hitungBMI() {
        double tinggiMeter = tinggiBadan/100;
        double BMI = beratBadan / (tinggiMeter * tinggiMeter);
        return BMI;
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        if(bmi<18.5){
            System.out.println("Kategori: Kurus");
        }else if(bmi<25){
            System.out.println("Kategori: Normal");
        }else{
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        double kalori= beratBadan * faktorAktivitas*10;
        return kalori;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: "+ this.umur +" tahun");
        System.out.println("Berat: "+ this.beratBadan +" kg");
        System.out.println("Tinggi: "+ this.tinggiBadan+ " cm");
        System.out.println("BMI: "+ hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: "+ hitungKalori()+" kal/hari");
        System.out.println("===============================================");
    }
}