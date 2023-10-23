package p1;

import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите первое число");
        int x = scanner.nextInt();
        System.out.print ("Введите второе число");
        int y = scanner.nextInt();
        System.out.println ("Каждой операции соответствует цифра: 1=+, 2=-, 3=*, 4=/. Введите нужную цифру");
        int z = scanner.nextInt();
        if (z == 1){
            System.out.println(x + y);
        }else if (z == 2){
            System.out.println(x - y);
        }else if (z == 3){
            System.out.println(x * y);
        }else
            System.out.println(x / y);
        scanner.close();
    }
}
