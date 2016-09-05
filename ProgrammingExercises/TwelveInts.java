/*
 * Created by Zola on 5/09/2016.
 */
public class TwelveInts
{
    public static void main(String[] args)
    {
        int[] numbers = {1,3,2,5,12,6,23,54,43,10,8,31};
        int i;
        System.out.println("Numbers in the array:");
        for(i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.println("Numbers in reverse order:");
        for(i = numbers.length -1; i >= 0; i--)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
