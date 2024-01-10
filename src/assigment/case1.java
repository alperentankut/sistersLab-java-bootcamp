package assigment;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class case1 {

    public static void main(String[] args) {
        float vat = 10;
        float secondVat = 22;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tutarı giriniz : ");
        float cost  = scanner.nextInt();

        if(cost <= 1000){
            float vatCost = cost*(vat/100);
            float costWithVat = cost + vatCost;
            System.out.println("Kdvli tutar : " + costWithVat);
            System.out.println("Kdv tutarı : " + vatCost);
        }
        else{
            float otherVarCost = cost*(secondVat/100);
            float costWithOtherVat = cost + otherVarCost;
            System.out.println("Kdvli tutar : " + costWithOtherVat);
            System.out.println("Kdv tutarı : " + otherVarCost);
        }


        scanner.close();



    }
}