public class MembershipStatus {
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;

    public MembershipStatus(boolean statusAktif, String tingkatKeanggotaan, int jumlahTerlambat, int jumlahDenda,
            int poinLoyalitas) {
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
    }

    public boolean isEligibleForUpgrade() {
        return tingkatKeanggotaan.equals("DASAR") && poinLoyalitas > 100;
    }

    public double calculateRiskScore() {
        double skor = jumlahTerlambat * 1.5 + jumlahDenda * 0.1;
        if (!statusAktif)
            skor += 5;
        if (tingkatKeanggotaan.equals("DASAR"))
            skor += 2;
        return skor;
    }
}
