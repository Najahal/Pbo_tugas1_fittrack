/**
 * Class TesFitTrack digunakan untuk menguji fungsionalitas dan
 * validasi dari class Member sesuai dengan skenario yang diminta.
 */
public class TesFitTrack {
    public static void main(String[] args) {

        System.out.println("=== PENGUJIAN 1: INSTANSIASI OBJEK ===");

        // 1. Objek normal dengan jenis paket VIP
        Member member1 = new Member("Andi Matalata", "081122334455", "18-10-2026", "VIP");

        // 2. Objek normal dengan jenis paket Premium
        Member member2 = new Member("Budi Santoso", "082233445566", "19-10-2026", "Premium");

        // 3. Objek menggunakan constructor 3 parameter (Otomatis menjadi Basic)
        Member member3 = new Member("Citra Kirana", "083344556677", "20-10-2026");

        // 4. Objek dengan data melanggar validasi (Nomor telepon kurang dari 10 digit
        // dan tidak diawali 0)
        System.out.println(">> Menciptakan member4 dengan nomor telepon tidak valid:");
        Member member4 = new Member("Deni Sumargo", "12345", "21-10-2026", "Basic");

        // Menyimpan minimal 4 objek ke dalam satu array bertipe Member
        Member[] arrayMember = { member1, member2, member3, member4 };

        System.out.println("\n=== PENGUJIAN 2: UBAH DATA DENGAN SETTER TIDAK VALID ===");

        // Panggil setter dengan nilai tidak valid pada objek yang sudah jadi
        System.out.println(">> Mencoba mengubah paket Andi menjadi 'SuperVIP':");
        member1.setJenisPaket("SuperVIP");

        System.out.println(">> Mencoba mengubah nama Budi menjadi kosong:");
        member2.setNama("   ");

        System.out.println("\n=== PENGUJIAN 3: CETAK SELURUH DATA DARI ARRAY ===");

        // Cetak semua objek dari array memakai perulangan for dan toString()
        for (int i = 0; i < arrayMember.length; i++) {
            System.out.println(arrayMember[i].toString());
        }
    }
}
