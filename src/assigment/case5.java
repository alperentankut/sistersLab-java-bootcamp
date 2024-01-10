package assigment;

import java.util.Scanner;
import java.util.Arrays;

public class case5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        int[] sayilar = {sayi1, sayi2, sayi3};

        Arrays.sort(sayilar);

        System.out.println("Sıralanmış sayılar: " + sayilar[0] + ", " + sayilar[1] + ", " + sayilar[2]);

        scanner.close();
    }
}
