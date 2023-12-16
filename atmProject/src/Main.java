import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ATM
        //Değişkenleri tanımlayalım.
        String userName = "";
        String password = "";
        int select;
        int balance = 0;



        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        switch (userName){
            case "patika":
                switch (password){
                    case "dev123":
                        System.out.println("Merhaba, Hoş geldiniz.");
                        do {
                            System.out.println("1- Para yatırma\n" +
                                    "2- Para çekme \n" +
                                    "3- Bakiye sorgulama \n" +
                                    "4- Çıkış");
                            select = input.nextInt();
                            System.out.println("Yapmak istediğiniz işlemi seçiniz");
                            switch (select){
                                case 1:
                                    System.out.print("Tutar giriniz :");
                                    int price = input.nextInt();
                                    balance += price;
                                    System.out.println("Başarılı.");
                                    break;
                                case 2:
                                    System.out.print("Tutar giriniz : ");
                                    int pricePull = input.nextInt();
                                    balance -= pricePull;
                                    System.out.println("Başarılı");
                                    break;
                                case 3:
                                    System.out.println("Bakiyeniz : " + balance);
                                    break;
                                case 4:
                                    System.out.println("Çıkış yapılıyor.");
                            }
                        }while (select != 4);
                        System.out.println("Çıkış yapıldı.");
                }
                break;
            default:
                System.out.println("Kullanıcı adı veya şifre yanlış. tekrar deneyiniz.");
        }
    }
}