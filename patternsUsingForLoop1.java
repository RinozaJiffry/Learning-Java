public class patternsUsingForLoop1
{
    public static void main (String[] args)
    {
        for (int i = 1; i <= 5; i++) //i is for rows
        {
            for (int j = 0 ; j < i; j++) //j is for columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--)
        {
            for (int j = 0 ; j < i; j++) //j is for columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
