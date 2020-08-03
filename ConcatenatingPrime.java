import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ConcatenatingPrime {
    public static LinkedHashSet<Integer> getAllPrimeBySieve(int n){
        boolean[] arr = new boolean[n];
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<arr.length;i++){
            if(!arr[i]) {
                for (int j = i * i; j < arr.length; j = j + i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]) hs.add(i);
        }
        return hs;
    }

    static  int prime(int n)
    {
        int c=1;
        for(int i = 2; i <= n/2; ++i)
        {

            if(n % i == 0)
            {
                c=0;
                break;
            }
        }

        return c;
    }
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0 || n==1){
            System.out.print(n);
            return;
        }

        LinkedHashSet<Integer> l=new LinkedHashSet<>();

        LinkedHashSet<Integer> l2=new LinkedHashSet<>();

        l=getAllPrimeBySieve(n);

        Iterator<Integer> i=l.iterator();

        for (Integer element : l) {
            String s1 = Integer.toString(element);
            for(Integer e:l)
            {
                if(element==e)
                    continue;
                String s2 = Integer.toString(e);
                String s = s1 + s2;
                int c = Integer.parseInt(s);
                l2.add(c);
            }
        }


        for(Integer ele:l2)
            count+=prime(ele);
        System.out.println(count);

    }
}
