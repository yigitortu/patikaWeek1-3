import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner tanımlandı.

        System.out.print("Basamak sayısını giriniz : "); // Kullanıcıdan sayıyı isteyelim.
        int n = input.nextInt();

        // Yıldızlarla üçgen oluşturalım.
        //Basamak sayısı kadar ilerlemesi için for döngüsüne onu tanıtalım.
        for (int i = 1; i <= n; i++){ // Artık basamak sayısı kadar tekrar edicek.
            //Tablomuzda olucak olan boşlukları burada for döngüsüne yansıtalım.
            for (int a = 1; a <= n - i; a++ ){
                // Basamak sayısının bir eksiği kadar boşluk oluşturulacak anlamına geliyor.
                System.out.print(" ");
            }
            // Yıldızlarımızı hesaplayalım.
            // formul: hangi basamaktaysa 2 katının 1 eksiği yıldız formülünü verir
            for (int b = 1; b <= (2 * i) - 1; b++  ){
                // Yıldızlarımızı yukarıdaki formüle göre yazdıralım.
                System.out.print("*");
            }
            // Alt alta denk gelmesi için boş bir printLN oluşturalım.
            System.out.println();
        }
        // Elmas oluşturmak için aynı yıldızın tersi alınması gerekiyor bu işlemi
        // for döngüsüne tanıtalım.
        for (int u = n; u > 0; u--){
            // yukarıdaki yıldız formülünü tersten yazalım
            for (int a = 1; a <= n - u; a++){
                System.out.print(" ");
            }
            // Yıldızları yazdıralım.
            for (int b = 1; b <= (2 * u) - 1; b++){
                System.out.print("*");
            }

            // her seferinde bir alt satıra geçmesi için soutLN ekleyelim.
            System.out.println();

        }



    }
}