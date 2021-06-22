import java.util.Scanner;

public class areaAndPermeterOfCircle
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        Double x = sc.nextDouble();
        Double perimeter = 2 * Math.PI * x;
        Double area = Math.PI * x * x;
        System.out.println("Perimeter of circle is : " + perimeter);
        System.out.println("Area of circle is : " + area);
    }
}
