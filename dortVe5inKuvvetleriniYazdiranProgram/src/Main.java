import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Degiskenleri atayalim
        int n;

        Scanner inp = new Scanner(System.in); // Scanner tanımlandı

        System.out.println("Sınır sayısını giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4 ){ // 4'ün kuuvetlerini yazdıralım
            System.out.println(i);
        }
        for (int i = 1; i <= n; i *= 5 ){ // 5'in kuvvetlerini yazdıralım
            System.out.println(i);
        }

        System.out.println("Program bitti.");
    }
}