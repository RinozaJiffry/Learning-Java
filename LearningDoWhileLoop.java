import java.util.Scanner;

public class LearningDoWhileLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            num = sc.nextInt();
        }while (num < 1 || num >10);

        System.out.println(num+ " is between 1 and 10");
    }
}
