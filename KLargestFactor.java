//KLargestFactor
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KLargestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int k=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            if((n%i)==0)
                count++;
            if(count==k)
            {
                System.out.println(i);
                break;
            }
        }
        if(count<k)
            System.out.println("1");
    }
}

