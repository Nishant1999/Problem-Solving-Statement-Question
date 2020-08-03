//DivineDivisor
import java.util.Scanner;
import java.util.Stack;

public class DivineDivisor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        Stack<Integer> s=new Stack<>();
        int x=sc.nextInt();
        int sqrt=(int)Math.sqrt(x);
        for(int i=1;i<=sqrt;i++)
        {
            if(x%i==0) {
                sb.append(i + " ");
                if (i * i != x)
                    s.push(x / i);
            }
        }
        while(s.isEmpty()==false)
            sb.append(s.pop()+" ");

        System.out.println(sb);
    }
}
