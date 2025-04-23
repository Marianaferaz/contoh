public class LibraryMember {
    private MemberInfo info;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private Denda denda;
    private PoinLoyalitas poin;

    public LibraryMember(MemberInfo info, int jumlahBukuDipinjam, int jumlahTerlambat, Denda denda,
            PoinLoyalitas poin) {
        this.info = info;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.denda = denda;
        this.poin = poin;
    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        System.out.println("Nama             : " + info.getNamaLengkap());
        System.out.println("Jenis Kelamin    : " + info.getJenisKelamin());
        System.out.println("Alamat           : " + info.getAlamat());
        System.out.println("Telepon          : " + info.getNomorTelepon());
        System.out.println("Email            : " + info.getEmail());
        System.out.println("Kode Anggota     : " + info.getKodeAnggota());
        System.out.println("Tanggal Gabung   : " + info.getTanggalGabung());
        System.out.println("Status Aktif     : " + info.isStatusAktif());
        System.out.println("Tingkat          : " + info.getTingkatKeanggotaan());
        System.out.println("Buku Dipinjam    : " + jumlahBukuDipinjam);
        System.out.println("Terlambat        : " + jumlahTerlambat);
        System.out.println("Denda            : Rp " + denda.getJumlah());
        System.out.println("Poin Loyalitas   : " + poin.getPoin());
        System.out.println("Kode Referal     : " + info.getKodeReferal());
        System.out.println("Langganan Buletin: " + info.isLanggananBuletin());
        System.out.println("Skor Risiko      : " + hitungSkorRisiko());
        System.out.println("Layak Upgrade?   : " + periksaKelayakanUpgrade());
        System.out.println("===========================");
    }

    public boolean periksaKelayakanUpgrade() {
        return info.getTingkatKeanggotaan().equals("DASAR") && poin.cukupUntukUpgrade();
    }

    public double hitungSkorRisiko() {
        double skor = 0;
        skor += jumlahTerlambat * 1.5;
        skor += denda.getJumlah() * 0.1;
        if (!info.isStatusAktif())
            skor += 5;
        if (info.getTingkatKeanggotaan().equals("DASAR"))
            skor += 2;
        if (jumlahBukuDipinjam > 50)
            skor -= 1.5;
        return skor;
    }
}
