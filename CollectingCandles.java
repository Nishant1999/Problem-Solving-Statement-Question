//CollectingCandles

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class CollectingCandles {
    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            File ip = new File("src/input");
            Scanner sc = new Scanner(ip);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();

                int arr[]=new int[n];
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=0;i<n;i++)
                    arr[i]=sc.nextInt();
                if(n==1)
                {
                    System.out.println(arr[0]);
                    return;
                }
                if(n==2)
                {
                    int c=arr[0]+arr[1];
                    System.out.println(c);
                    return;
                }
                Arrays.sort(arr);
                int c=arr[0]+arr[1];
                a.add(c);
                for(int i=2;i<n;i++){
                    c+=arr[i];
                    a.add(c);
                }
                Iterator itr=a.iterator();
                int count=0;
                while(itr.hasNext()) {

                    count += (Integer)itr.next();
                }

                System.out.println(count);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
