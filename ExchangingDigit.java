//ExchangingDigit
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExchangingDigit {
    static int count=0;
    static int arr[]=new int[100];
    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    static void permute(String str, int l, int r,long b)
    {


        if (l == r) {
            arr[count]=Integer.parseInt(str);
            if(arr[count]>b) {
                System.out.println(arr[count]);
                System.exit(0);
            }
            count++;
        }

        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,b);
                str = swap(str,l,i);
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(a<=0 || b<=0)
        {
            System.out.println(-1);
            return;
        }
       char c[]=String.valueOf(a).toCharArray();
        Arrays.sort(c);

        permute(new String(c), 0, new String(c).length()-1,b);


    }

}
