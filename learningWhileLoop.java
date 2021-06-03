import java.util.Scanner;

public class learningWhileLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        while(num<1 || num>10)
        {
            System.out.println(num + " is not between 1 and 10..Try again : ");
            num = sc.nextInt();
        }
        System.out.println(num+ " is between 1 and 10.");
    }
}
