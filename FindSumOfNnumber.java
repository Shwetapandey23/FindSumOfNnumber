import java.util.Scanner;
public class FindSumOfNnumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the natural number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println(" Sum of "+num+" Number  is "+sum);
    }
    
}
