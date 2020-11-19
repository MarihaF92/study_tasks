package Lesson_1;

import java.util.Scanner;
//Написать программу, которая будет принимать две группы параметров:
//        - количество циклов выполнения программы;
//        - 3 числа a, b, n
//         и выводить на экран последовательность результатов вычисления следующего выражения
//         (a + 2^0*b),(a + 2^0*b + 2^1*b),(a + 2^0*b + 2^1*b + 2^2*b)..., (a+2^0*b + 2^1*b + 2^2*b +...+ 2^(n-1)*b)
public class Sequence {

        public static void main(String[] args) {
            System.out.println("Please enter the number of iterations");
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
//      System.out.println(k);
            for(int i=0; i<k; i++){
                System.out.println("Please enter parameters");
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int temp = a;
                for(int j = 0; j<n; j++){
                    int l = (int)Math.pow(2, j);
                    temp = temp + b*l;
                    System.out.print(temp+" ");
                }
                System.out.println("");
            }

        }
    }

