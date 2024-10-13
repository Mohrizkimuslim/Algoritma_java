import java.util.Scanner;

public class HargaJeruk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jeruk yang dibeli: ");
        int jumlahJeruk = input.nextInt();

        int totalBiaya = 0;

        while (jumlahJeruk >= 5) {
            totalBiaya += 10000;  
            jumlahJeruk -= 5;     
        }

        while (jumlahJeruk >= 2) {
            totalBiaya += 5000;   
            jumlahJeruk -= 2;     
        }

        while (jumlahJeruk >= 1) {
            totalBiaya += 3000;  
            jumlahJeruk -= 1;     
        }

     
        System.out.println("Total biaya: Rp " + totalBiaya);

     
        input.close();
    }
}