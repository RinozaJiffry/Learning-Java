public class patternsUsingForLoop
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
    }
}
