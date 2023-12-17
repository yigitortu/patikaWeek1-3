import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n; // Basamak sayısı
        int total; // Sayıları toplamak için değişken.
        int firstNo = 0;
        // Kendinden bir önceki ile toplama yapabilmek için ilk başta iki sayıyı biz verelim.
        int secondNo = 1;

        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan basamak sayısını isteyelim.
        System.out.print("Fibonacci eleman sayısı giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(firstNo + " ");
            total = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = total; // toplam degiskene atamak icin
        }
    }
}