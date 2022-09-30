import java.util.Scanner;

public class FuelFee {
    public static void main(String[] args) {
        /*
        Bir aracın kilometrede ne kadar yaktığını ve kça kilometre yol yaptığı bilgilerini alın
        ve sürücünün toplamda kaç para ödemesi gerektiğini hesaplayın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much does your car burn per km? : ");
        double burn = scanner.nextDouble();

        System.out.println("How many km have you traveled with your car : ?");
        int km = scanner.nextInt();

        double amount = burn * km;

        System.out.println("The amount you have to pay: " + amount);
    }
}
