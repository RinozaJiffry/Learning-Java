public class reverseString
{
    public static void main (String[] args)
    {
        //calling the method
        String word = reverse("rinoza");
        System.out.println(word);
    }

    //Creating a method to reverse the string
    public static String reverse(String str)
    {
        //Settle the every character in the array and return it
        char letters[] = new char[str.length()];

        //Creating index for letters
        int letterIndex = 0;

        for(int i = str.length()-1 ; i >= 0 ; i--)
        {
           letters[letterIndex] = str.charAt(i);
           letterIndex++;
        }
        String reverse = "";
        for(int i = 0 ; i <str.length() ; i++)
        {
            reverse = reverse + letters[i];
        }

        return reverse;
    }
}
