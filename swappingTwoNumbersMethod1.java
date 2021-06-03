public class swappingTwoNumbersMethod1
{
    public static void main(String[] args)
    {
        int x = 10, y = 20;
        System.out.println("Numbers before swapping : " + x+" "+y);

        int z = x;
        x = y;
        y = z;

        System.out.println("Numbers before swapping : " + x+" "+y);
    }
}
