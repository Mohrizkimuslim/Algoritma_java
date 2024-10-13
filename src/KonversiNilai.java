import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input nilai dari pengguna
        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        // Variabel untuk menampung hasil konversi
        String hasil;

        // Menentukan nilai konversi berdasarkan kriteria
        if (nilai > 85) {
            hasil = "A";
        } else if (nilai > 75 && nilai <= 85) {
            hasil = "B";
        } else if (nilai > 65 && nilai <= 75) {
            hasil = "C";
        } else if (nilai > 55 && nilai <= 65) {
            hasil = "D";
        } else {
            hasil = "E";
        }

        // Menampilkan hasil konversi
        System.out.println("Nilai konversi: " + hasil);

        // Menutup scanner
        input.close();
    }
}