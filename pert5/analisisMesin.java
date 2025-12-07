class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] inventaris = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        // Isi array dengan objek mesinTraktor
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        // Isi array dengan objek mesinTraktorListrik
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        // Loop untuk menampilkan info masing-masing mesin
        // Loop untuk menampilkan kategori dan performa
        for (defaultMesin m : inventaris) {
            m.tampilInfo();
            System.out.println("\nKategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }
        System.out.println("=== SUARA MESIN ===");
        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin m : inventaris) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }
        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin terbaik = inventaris[0];
        for (defaultMesin m : inventaris) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }
        System.out.println(terbaik.namaMesin + " -> " + terbaik.nilaiPerforma());
        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        for (int i = 0; i < inventaris.length - 1; i++) {
            for (int j = 0; j < inventaris.length - i - 1; j++) {
                if (inventaris[j].nilaiPerforma() < inventaris[j + 1].nilaiPerforma()) {
                    defaultMesin temp = inventaris[j];
                    inventaris[j] = inventaris[j + 1];
                    inventaris[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + inventaris[i].namaMesin + " -> " + inventaris[i].nilaiPerforma());
        }
    }
}
