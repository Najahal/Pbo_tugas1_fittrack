/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {

    // Konstanta untuk batas validasi dan nilai default (mencegah magic
    // number/string)
    public static final int MIN_PANJANG_TELEPON = 10;
    public static final String AWALAN_TELEPON = "0";
    public static final String PAKET_DEFAULT = "Basic";
    public static final String NAMA_DEFAULT = "Member Tanpa Nama";
    public static final String TELEPON_DEFAULT = "0000000000";
    public static final String TANGGAL_DEFAULT = "01-01-2026";

    // Deklarasi atribut privat
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Constructor lengkap dengan 4 parameter.
     * Mengisi atribut melalui pemanggilan setter masing-masing untuk menjaga
     * validasi.
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon aktif member
     * @param tanggalDaftar tanggal pertama kali mendaftar
     * @param jenisPaket    jenis paket keanggotaan (Basic, Premium, VIP)
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        // Set nilai awal default yang aman untuk menghindari atribut bernilai null jika
        // ditolak setter
        this.nama = NAMA_DEFAULT;
        this.noTelepon = TELEPON_DEFAULT;
        this.tanggalDaftar = TANGGAL_DEFAULT;
        this.jenisPaket = PAKET_DEFAULT;

        // Memanggil setter agar aturan validasi dipusatkan di setter (prinsip DRY)
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor tanpa paket dengan 3 parameter.
     * Memanggil constructor lengkap via this(...) dengan paket otomatis bernilai
     * "Basic".
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon aktif member
     * @param tanggalDaftar tanggal pertama kali mendaftar
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_DEFAULT);
    }

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
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Penolakan: Nama tidak boleh kosong atau hanya berisi spasi.");
        } else {
            this.nama = nama;
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
     * Jika format tidak valid, nomor lama dipertahankan dan pesan penolakan
     * dicetak.
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0 dan minimal 10
     *                  digit
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || noTelepon.length() < MIN_PANJANG_TELEPON || !noTelepon.startsWith(AWALAN_TELEPON)) {
            System.out.println("Penolakan: Nomor telepon harus diawali angka " + AWALAN_TELEPON + " dan minimal "
                    + MIN_PANJANG_TELEPON + " digit.");
        } else {
            this.noTelepon = noTelepon;
        }
    }

    /**
     * Mendapatkan tanggal pendaftaran member.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran member.
     *
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            System.out.println("Penolakan: Tanggal daftar tidak boleh kosong.");
        } else {
            this.tanggalDaftar = tanggalDaftar;
        }
    }

    /**
     * Mendapatkan jenis paket keanggotaan member.
     *
     * @return jenis paket keanggotaan
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket keanggotaan member.
     * Hanya menerima "Basic", "Premium", atau "VIP".
     *
     * @param jenisPaket jenis paket baru
     */
    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket != null
                && (jenisPaket.equals("Basic") || jenisPaket.equals("Premium") || jenisPaket.equals("VIP"))) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println(
                    "Penolakan: Jenis paket '" + jenisPaket + "' tidak valid. Pilih antara Basic, Premium, atau VIP.");
            // Jika nilai lama belum diset (saat constructor), otomatis tetap bernilai
            // PAKET_DEFAULT
        }
    }

    /**
     * Menghasilkan representasi String dari objek Member yang rapi dan berlabel.
     *
     * @return deskripsi lengkap data member
     */
    @Override
    public String toString() {
        return "Member FitTrack [" +
                "Nama: " + nama +
                " | No. Telp: " + noTelepon +
                " | Tgl Daftar: " + tanggalDaftar +
                " | Paket: " + jenisPaket +
                ']';
    }
}