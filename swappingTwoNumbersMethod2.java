public class swappingTwoNumbersMethod2
{
    public static void main(String[] args)
    {
        int x = 10, y = 20;
        System.out.println("Numbers before swapping : " + x+" "+y);

        //without using third variable
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("Numbers before swapping : " + x+" "+y);
    }
}

