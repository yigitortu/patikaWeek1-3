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
            System.out.print(i + " .Sayıyı giriniz : ");        // Kullanıcıdan sayıları isteyelim
            number = inp.nextInt();

            // Minimum ve Maksimum değerleri number'a bağlıyoruz çünkü bir değeri olması gerekiyor
            if (entryIf) {
                maxValue = number;
                 minValue = number; // Burda bağlıyoruz

                 entryIf = false; // Bağladıktan sonra bu döngüden çıkmasını sağlıyoruz.
            }
            // Minimum ve maximum değerleri bulalım
            if (number > maxValue){
                maxValue = number;
            } else if (number < minValue) {
                minValue = number;
            }
        }

        System.out.println("Max değer : " + maxValue);
        System.out.println("Min değer : " + minValue);

    }
}