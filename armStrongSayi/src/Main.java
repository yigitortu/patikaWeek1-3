import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri atayalım.
        int number;
        int kalanSayi;
        int tempNumber;
        int total = 0;
        int a = 0;


        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        tempNumber = number;

        while (tempNumber != 0){
            kalanSayi = tempNumber % 10; // Basamaklardaki sayıları bulmak için
            total += kalanSayi;
            tempNumber = tempNumber / 10;
            a++;
            System.out.println( a + " . basamak " + kalanSayi);
        }
        System.out.println(number + " Sayısının rakamları toplamı : " + total);

    }
}