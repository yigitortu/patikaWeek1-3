import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım
        // Kullanıcıdan 2 sayı alacağız.

        int n1, n2;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz : ");
        n1 = inp.nextInt();

        System.out.print("2. Sayıyı giriniz : ");
        n2 = inp.nextInt();
        // ebob bulalım.
        int i = 1;
        int ebob = 1;
        while (i <= n1){
            if (n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
            }
            i++;
        }
        // Ekok bulalım

        int a = 1;
        while (a <= (n1 * n2)){
            if (a % n1 == 0 && a % n2 == 0) {
                System.out.println(a);
                break;
            }
            a++;
        }



    }
}