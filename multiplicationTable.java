import java.util.Scanner;

public class multiplicationTable
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Any Number : ");
        int x = sc.nextInt();
        for(int i=1; i<=10; i++){
            int ans = x*i;
            System.out.println(x + " x " + i + " = " + ans);

        }
    }
}
