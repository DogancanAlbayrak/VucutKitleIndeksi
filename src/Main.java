import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double kilo, boy;

        Scanner veri = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = veri.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = veri.nextDouble();

        double index = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + index);
        
    }
}