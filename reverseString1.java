//Reverse Method using without inbuilt method
package company;

public class reverseString1
{
    public static void main(String[] args)
    {
        String name = "helloworld";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse of "+ name +" is: " + reverse);
    }
}
