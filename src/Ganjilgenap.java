import java.util.Scanner;

public class Ganjilgenap {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int hasil = inputan.nextInt();

        int kondisi = hasil % 2;
        if (kondisi == 1 || kondisi == -1) {
            System.out.println("Angka ganjil");
        } else {
            System.out.println("Angka genap");
        }
        inputan.close();
    }
    
}