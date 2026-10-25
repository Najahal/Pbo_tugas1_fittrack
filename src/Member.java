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
     * Mengubah nama member. 
     * Nama akan ditolak jika kosong atau hanya berisi spasi.
     *
     * @param nama nama lengkap baru member, tidak boleh kosong atau hanya spasi
     */
    public void setNama(String nama) {
        // Mengecek apakah string kosong atau hanya berisi spasi
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Penolakan: Nama tidak boleh kosong atau hanya berisi spasi.");
        } else {
            this.nama = nama; // Menyimpan nilai jika valid
        }
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
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Jika format tidak valid, nomor lama dipertahankan dan pesan
     * penolakan dicetak.
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0
     *                  dan memiliki panjang minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        // Mengecek apakah panjangnya kurang dari batas atau tidak diawali "0"
        if (noTelepon == null || noTelepon.length() < MIN_PANJANG_TELEPON || !noTelepon.startsWith(AWALAN_TELEPON)) {
            System.out.println("Penolakan: Nomor telepon harus diawali angka " + AWALAN_TELEPON + " dan minimal " + MIN_PANJANG_TELEPON + " digit.");
        } else {
            this.noTelepon = noTelepon; // Menyimpan nilai jika valid
        }
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