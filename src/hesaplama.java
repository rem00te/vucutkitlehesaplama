import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        double kilo, boy;
        double kitle;
        boolean ktl;

       Scanner input = new Scanner(System.in);


        System.out.print("Lütfen boyunuzu giriniz : ");
          boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
          kilo = input.nextDouble();


          kitle = kilo / (boy * boy) ;






          ktl = (10>kitle) && (10<kitle);
          String ack = ktl ? "Güzel vücut" : "Az ye az!";


        System.out.println("Vücut kitle indeksiniz :" + kitle);
        System.out.println("Sana tavsiyemiz :" + ack);


    }
}
