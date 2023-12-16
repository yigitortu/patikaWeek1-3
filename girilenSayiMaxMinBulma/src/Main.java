import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım

        int n; // N kadar sayı.
        int minValue = 0;
        int maxValue = 0;
        int number;
        boolean entryIf = true;
        Scanner inp = new Scanner(System.in); // Scanner tanımlayalım.

        // :Kullanıcıdan kaç adet sayı isteyeceğini soralım.
        System.out.print("Girmek istediğiniz sayı miktarı : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i + " .Sayıyı giriniz : ");
            number = inp.nextInt();

            if (entryIf) {
                maxValue = number;
                 minValue = number;

                 entryIf = false;
            }
            if (number > maxValue){
                maxValue = number;
            } else if (number < minValue) {
                minValue = number;
            }
        }

        System.out.println("Max değer : " +maxValue);
        System.out.println("Min değer : " +minValue);

    }
}