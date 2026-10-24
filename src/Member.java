/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {

    // Konstanta batas validasi untuk menghindari magic number dan magic string
    public static final int MIN_PANJANG_TELEPON = 10;
    public static final String AWALAN_TELEPON = "0";
    public static final String PAKET_DEFAULT = "Basic";

    // Deklarasi atribut sesuai spesifikasi
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Mendapatkan nama lengkap member.
     *
     * @return nama lengkap member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member. (Validasi menolak nama kosong akan diterapkan di sini).
     *
     * @param nama nama lengkap baru member, tidak boleh kosong atau hanya spasi
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mendapatkan nomor telepon member.
     *
     * @return nomor telepon aktif member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member. (Validasi format akan diterapkan di sini).
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0 dan minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    /**
     * Mendapatkan tanggal pertama kali member mendaftar.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran member.
     *
     * @param tanggalDaftar tanggal baru pendaftaran member (contoh: 17-08-2026)
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mendapatkan jenis paket keanggotaan member.
     *
     * @return jenis paket (Basic, Premium, atau VIP)
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket keanggotaan member. (Validasi pilihan paket akan diterapkan di sini).
     *
     * @param jenisPaket jenis paket baru, hanya menerima Basic, Premium, atau VIP
     */
    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }
}