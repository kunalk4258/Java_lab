import java.util.Scanner;

public class Q9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = 0;
        sum = n1+n2+n3;
        System.out.println("The sum = " +sum );
    }
    
}
