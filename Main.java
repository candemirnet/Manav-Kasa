import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double armut = 2.14, elma = 3.67, domates = 1.11;
        double muz = 0.95, patlican = 5.00, toplam;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        Scanner imp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutkg = imp.nextDouble();
        armut *= armutkg;

        System.out.print("Elma Kaç Kilo ? :");
        elmakg = imp.nextDouble();
        elma *= elmakg;

        System.out.print("Domates Kaç Kilo ? :");
        domateskg = imp.nextDouble();
        domates *= domateskg;

        System.out.print("Muz Kaç Kilo ? :");
        muzkg = imp.nextDouble();
        muz *= muzkg;

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicankg = imp.nextDouble();
        patlican *= patlicankg;

        toplam = (armut + elma + domates + muz + patlican);
        System.out.print("Toplam Tutar :" + toplam + " TL");

    }
}