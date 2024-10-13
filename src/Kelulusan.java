import java.util.Scanner;

public class Kelulusan {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input nilai dari pengguna
        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        // Menentukan apakah lulus atau tidak
        if (nilai > 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        // Menutup scanner
        input.close();
    }
}