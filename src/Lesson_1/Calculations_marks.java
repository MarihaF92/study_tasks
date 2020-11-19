package Lesson_1;
import java.util.Scanner;
//Написать программу, которая суммирует все вводимые положительные числа, пока не на вход не будет подано отрицательное число
public class Calculations_marks {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int S = 0;
            while(true){
                int k = in.nextInt();
                if(k<=0){
                    break;
                }else{
                    S = S + k;
                }
            }
            System.out.print(S);
        }
    }
