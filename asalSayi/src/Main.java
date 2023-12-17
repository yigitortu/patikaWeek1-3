
public class Main {
    public static void main(String[] args) {
        // değişkenleri atayalım
        int asalSayi = 0;

        for (int i = 1; i <= 100; i++){ // 1'den 100'e kadar olan sayıları sıralayalım.
            for (int k = 1; k <= i; k++){ // Bize sayıları verecek
                if (i % k == 0){        // 1'den 100' e kadar olan sayıları kendisine böldüğümüzde
                                        // cevap 0 ise o bir asal sayıdır.
                    asalSayi += 1;
                }
            }

            if (asalSayi == 2) {        // asal sayı 2 adet çıkıyorsa bu sayı asaldır
                System.out.print(i + ",");  // çünkü sadece 1 ve kendisi vardır.
            }

            asalSayi = 0;
        }

    }
}