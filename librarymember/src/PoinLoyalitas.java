public class PoinLoyalitas {
    private int poin;

    public PoinLoyalitas(int poin) {
        this.poin = poin;
    }

    public int getPoin() {
        return poin;
    }

    public boolean cukupUntukUpgrade() {
        return poin > 100;
    }
}
