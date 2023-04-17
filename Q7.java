import java.util.Scanner;
public class Q7
{
    public static void main(String[] argss)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = s.nextInt();
    /*while(i<=n)
    {
       System.out.println(i);
        i++;
    } */
    /*do
    {
    System.out.println(i);
    i++;
    }
    while(i<=n); */
    for(int i=1;i<=n;i+=2)
    {
        System.out.println(i);
    }
    }
}