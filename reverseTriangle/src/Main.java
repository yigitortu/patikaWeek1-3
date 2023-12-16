import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri atayalım.

        int n;

        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan basamak sayısını alalım.
        System.out.print("Basamak sayısını giriniz : ");
        n = inp.nextInt();


        // Ters bir üçgen oluşturacağımız için değerin yüksekten küçüğe gitmesi gerekiyor.
        for (int i = n; i > 0; i--){
            for (int a = 1; a <= n - i; a++){       // Boşluk sayısını oluşturalım.
                System.out.print(" ");
            }

            for (int b = 1; b <= (2 * i) - 1; b++){
                System.out.print("*");              // Boşlukların yanına kaç adet yıldız geleceğini hesaplayalım.
            }

            System.out.println();       // İşlem bittikten sonra sürekli bir alt satıra geçsin diye eklenmiştir.
        }



    }
}