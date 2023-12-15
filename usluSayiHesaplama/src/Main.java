import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenleri atayalım

        int a,b;
        int total = 1;
        Scanner inp = new Scanner(System.in); // Scanner tanıtıldı.

        //Kullanıcıdan değerleri alalım
        System.out.print("Üssü alınacak sayı : ");
        a = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        b = inp.nextInt();

        for (int i = 1; i <= b; i++){ // i sayısının üs olacak sayıya kadar ilerlemesini sağlıyoruz
            total *= a; // çıkan sonucu total isimli değişkenle çarpıyoruz.

        }

        System.out.println("Cevap : " + total);

    }
}