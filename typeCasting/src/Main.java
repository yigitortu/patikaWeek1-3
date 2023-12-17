import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenleri atayalım.

        int n1;
        double n2;


        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan sayıları alalım.

        System.out.print("Tam sayı giriniz : ");
        n1 = inp.nextInt();

        System.out.print("Ondalıklı sayı giriniz : ");
        n2 = inp.nextDouble();

        // Tip dönüşümü yapıldığı yer.
        double myDouble = (double) n1;
        int myInt = (int) n2;

        // Ekrana yazdıralım.
        System.out.println(myDouble);

        System.out.println(myInt);

    }
}