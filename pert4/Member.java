class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    private int pointReward;
    private String level;

    // TODO: Buat constructor dengan super
    public Member(String nama, String idCustomer, int totalBelanja, int pointReward, String level){
        super(nama,idCustomer,totalBelanja);
        this.pointReward=pointReward;
        this.level=level;
    }
    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: "+pointReward+" | Level: "+ level);
    }
}
