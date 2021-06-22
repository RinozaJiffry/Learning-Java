package company;

import java.util.Scanner;

public class divideTwoNumbers
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second Number : ");
        int secondNum = sc.nextInt();
        int divisionOfTwoNumbers = firstNum / secondNum;
        System.out.println("Division of " + firstNum + " / " + secondNum + " is "+divisionOfTwoNumbers);
    }
}
