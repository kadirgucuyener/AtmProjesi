import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.println("Kullanıcı Adınızı Giriniz: ");
            userName = inp.nextLine();
            System.out.println("Parolanızı Giriniz: ");
            password = inp.nextLine();

            if (userName.equals("kadir") && password.equals("12345")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!: ");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select = inp.nextInt();

                    switch (select){
                        case 1: {
                            System.out.print("Para Miktarı: ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.print("Para Miktarı: ");
                            int price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                        default:
                            System.out.println("");
                            break;
                    }
                }
                while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfe banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
