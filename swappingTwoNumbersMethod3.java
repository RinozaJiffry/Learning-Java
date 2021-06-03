public class swappingTwoNumbersMethod3
{
    public static void main(String[] args)
    {
        int x = 10, y = 20;
        System.out.println("Numbers before swapping : " + x+" "+y);

        //This logic will work only if x and y values are not zero
        x = x*y;
        y = x/y;
        x = x/y;

        System.out.println("Numbers before swapping : " + x+" "+y);
    }
}
