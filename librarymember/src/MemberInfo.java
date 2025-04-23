import java.util.Date;

public class MemberInfo {
    private String namaLengkap;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private String kodeReferal;
    private boolean langgananBuletin;

    public MemberInfo(String namaLengkap, String alamat, String nomorTelepon, String email, String jenisKelamin,
            String kodeAnggota, Date tanggalGabung, boolean statusAktif, String tingkatKeanggotaan,
            String kodeReferal, boolean langgananBuletin) {
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }

    // Getter (harus dibuat semua)
    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public Date getTanggalGabung() {
        return tanggalGabung;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public String getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }

    public String getKodeReferal() {
        return kodeReferal;
    }

    public boolean isLanggananBuletin() {
        return langgananBuletin;
    }
}
