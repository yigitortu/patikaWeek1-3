import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleria atayalım

        int n;
        int r;
        int facN = 1;
        int facR = 1;
        int totalMain = 1;
        int combination = 1;
        int facRminusN = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        n = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        r = inp.nextInt();


        for (int i = 1; i <= n; i++){   // N sayısının faktöriyelini bulalım
            facN *= i;                // N faktöriyel = facN
        }

        for (int a = 1; a <= r; a++){   // R sayısının faktöriyelini bulalım
            facR *= a;                // R faktöriyel = facN
        }

        for (int b = 1; b <= n - r; b++){
            facRminusN *= b;        // n-r sayısının faktöriyeli
        }

        System.out.println("N Sayısının faktöriyeli : " + facN);
        System.out.println("R Sayısının faktöriyeli : " + facR);

        combination = facN / (facR * facRminusN);

        System.out.println(n + " ve " + r + " Sayılarının kombinasyon sonucu : " +combination);
    }
}