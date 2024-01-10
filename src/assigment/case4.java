package assigment;
import java.util.Scanner;
public class case4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " çift bir sayı");
        } else {
            System.out.println(sayi + " tek bir sayı");
        }

        scanner.close();
    }
}
