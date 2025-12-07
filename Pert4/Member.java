package Responsi2PBO.Pert4;

public class Member extends Customer {
    int poinReward;
    String level;

    public Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}
