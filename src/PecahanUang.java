import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        int[] jumlahLembar = new int[pecahan.length];

        for (int i = 0; i < pecahan.length; i++) {
            jumlahLembar[i] = uang / pecahan[i]; 
            uang = uang % pecahan[i]; 
        }

        
        System.out.println("Pecahan uang:");
        for (int i = 0; i < pecahan.length; i++) {
            if (jumlahLembar[i] > 0) { 
                System.out.println(jumlahLembar[i] + " lembar/keping " + pecahan[i]);
            }
        }

        input.close();
    }
}