import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenleri atayalim

        Scanner input = new Scanner(System.in);
        System.out.print(" N sayısını giriniz : "); // Kullanıcıdan sayıyı isteyelim.
        int n = input.nextInt();
        double result = 0;


        for (double i = 1; i <= n; i++ ){
            result += (i/n);
        }

        System.out.println(n + " sayısının harmonik serisi. " + result);




    }
}