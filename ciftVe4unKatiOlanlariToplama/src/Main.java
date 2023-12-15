import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // degiskenleri atayalım
        int number;
        int total = 0;

        Scanner inp = new Scanner(System.in); // Scanner tanımlandı

        do {
            System.out.print("Sayı giriniz : "); // kullanıcıdan sayı isteyelim
            number = inp.nextInt();
            if (number % 2 == 0 && number % 4 == 0){ // aldığımız sayının 2 ve 4 ün ortak
                total += number;                        //  katı olup olmadıgını bulalım
            }
        }while (number % 2 == 0); // Sayı tek ise programdan çıkış yapalım.

        System.out.println("Sayıların toplamı : " + total); // Aldığımız ortak sayıların toplamını yazdıralım.
    }
}