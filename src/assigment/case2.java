package assigment;

import java.util.Scanner;

public class case2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz : ");
        float note = scanner.nextInt();
        if(note<50 && note>0){
            System.out.print("Notunuzun Harf Karşılığı : FF");
        }
        else if(note<=59 && note>=50){
            System.out.println("Notunuzun Harf Karşılığı : CC");
        }else if(note<=69 && note>=60){
            System.out.println("Notunuzun Harf Karşılığı : CB");
        }else if(note<=79 && note>=70){
            System.out.println("Notunuzun Harf Karşılığı : BB");
        }else if(note<=89 && note>=80){
            System.out.println("Notunuzun Harf Karşılığı : BA");
        }
        else if(note<=100 && note>=90){
            System.out.println("Notunuzun Harf Karşılığı : AA");
        }
        scanner.close();
    }

}
