import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenleri atayalım
        int s;
        int ortalama = 0;
        int toplam = 0;
        int bolunecekSayi = 0;


        Scanner inp = new Scanner(System.in);
        // kullanıcıdan sayıyı alalım
        System.out.print("Sayıyı giriniz : ");
        s = inp.nextInt();

        int i = 1;// While döngüsüne girebilmek için int değeri atıyoruz.
        while (i <= s) {
            if (i % 3 == 0 && i % 4 == 0) { // seçilen sayının 3 ve 4 e bölünme kuralı.
                toplam += i;     // sayı bölünebiliyorsa toplam olan değişkene yazılmasını
                bolunecekSayi++; // bölünen bir sayı varsa bölünecekSayi sayısını artırmak için.
                System.out.println(i); // bölünen sayıları yazdırmak için
            }
            i++; // i'yi sürekli arttırıp baştaki while koşulunu sağlamak için
        }

        ortalama = toplam / bolunecekSayi; // ortalamasını almak için

        System.out.println("3 ve 4'e kalansız bölünen sayıların ortalaması : " +ortalama);


    }
}