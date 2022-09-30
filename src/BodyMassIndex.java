import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre beden kitle indeksini bulunuz

        Beden kitle indeksi :  Kilo / Boy(m) * Boy(m)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight : ");
        int weight = scanner.nextInt();

        System.out.println("Please enter yor height");
        double height = scanner.nextDouble();

        double average = (weight / (height * height));
        System.out.println("Your average : " + average);
    }
}
