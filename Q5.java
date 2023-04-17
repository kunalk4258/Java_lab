//find factorial of number
public class Q5 {
    public static void main(String[] args) {
        int n=7;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+ n +" is "+fact);
    }
}