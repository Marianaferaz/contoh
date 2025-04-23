import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Buat tanggal gabung: 1 Januari 2023
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JANUARY, 1);
        Date tanggalGabung = calendar.getTime();

        // Buat objek MemberInfo (semua getter digunakan di LibraryMember)
        MemberInfo info = new MemberInfo(
                "Maria Nathasya Desfera Pangestu",
                "Jl. D.I Panjaitan No. 32",
                "082363242595",
                "nathasyamaria80@email.com",
                "Perempuan",
                "AGT123456",
                tanggalGabung,
                true,
                "DASAR",
                "REF98765",
                true);

        // Buat objek poin dan denda
        PoinLoyalitas poin = new PoinLoyalitas(120);
        Denda denda = new Denda(30000); // Rp 30.000

        // Buat LibraryMember dan cetak profil
        LibraryMember anggota = new LibraryMember(info, 25, 3, denda, poin);
        anggota.cetakProfilLengkap();
    }
}
