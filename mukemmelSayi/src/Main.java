import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri atayalım.

        int number;
        int totalNumbers = 0;

        Scanner input = new Scanner(System.in); // Scanner tanıtıldı.
        // Kullanıcıdan sayı tahsis edelim.
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        int i = 1;
        while (i < number){
            if (number % i == 0 ) {     // Kendine kalansız bölümünden olan sayıları toplayalım.
                totalNumbers += i;
            }
            i++;

        }
        //Sayı müko mu değil mi yazdıralım.
        if (totalNumbers == number){
            System.out.println(number + " Sayısı mükemmel sayıdır.");
        }else {
            System.out.println(number + " Sayısı mükemmel sayı değildir.");
        }





    }
}