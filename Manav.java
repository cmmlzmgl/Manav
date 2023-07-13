import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut?: ");
        armutKg = input.nextInt();

        System.out.print("Kaç kilo elma?: ");
        elmaKg = input.nextInt();

        System.out.print("Kaç kilo domates?: ");
        domatesKg = input.nextInt();

        System.out.print("Kaç kilo muz?: ");
        muzKg = input.nextInt();

        System.out.print("Kaç kilo patlıcan?: ");
        patlicanKg = input.nextInt();

        double toplam = (armut * armutKg) + (elma * elmaKg) + (domatesKg * domates) + (muz * muzKg) + (patlicanKg * patlican);
        System.out.print("Ödemeniz gereken toplam tutar: "+toplam + " TL'dir");


    }
}
