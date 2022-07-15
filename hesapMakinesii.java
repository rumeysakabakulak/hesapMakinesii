import java.util.Scanner;

public class hesapMakinesii {


    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sonuç : " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuç : " + result);
    }

    static void times(int a, int b) {
        int result = a * b;
        System.out.println("Sonuc : " + result);
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci Sayı 0'dan Farklı Olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuc : " + result);
        return result;
    }

    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuç : " + result);
    }

    static void rect(int a, int b) {
        int result = a * b;
        System.out.println("Çevre : " + ((2 * a) + (2 * b)));
        System.out.println("Alan : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        System.out.println("Hoşgeldiniz.");

        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Mod Alma\n"
                + "7 - Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0 - Çıkış Yap";
        System.out.println(menu);
        while (true) {

            System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
            select = inp.nextInt();

            if (select == 0) {
                break;

            }
            System.out.print("İlk Sayı : ");
            int a = inp.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = inp.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rect(a,b);
                    break;
                default:
                    System.out.println("Geçersiz Bir Seçim Yaptınız.");


            }
        }
        System.out.println("Güle Güle.");
    }
}

