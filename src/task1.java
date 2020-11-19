import java.util.Scanner;
/*
Необходимо проверить, является ли введенное число, состоящее из 5 цифр полиндромом
Если введено более 5 или менее 5 цифр - ожидать введения нового числа
*/

public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your number");
            int number = in.nextInt();
            if ((number <= 99999) & (number >= 9999)) {
                flag = false;
                int a = number % 10;
                int b = (number/10) % 10;
                int c = (number/100) % 10;
                int d = (number/1000) % 10;
                int e = (number/10000) % 10;
                if ((a == e) & (b == d)) {
                    System.out.println("Number is polindrom!");
                } else {
                    System.out.println("Number is not polindrom!");
                }
            }
        }
    }
}