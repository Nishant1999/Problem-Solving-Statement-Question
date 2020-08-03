//ZombieWorld1
import java.util.*;

public class ZombieWorld1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean flag=true;

            int b = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;

            Arrays.sort(arr);

            if(b<arr[count])
            {
                System.out.println("NO");
                return;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(b>arr[i]) {
                    b -= arr[i] % 2 + arr[i] / 2;
                }
                else
                {
                    flag=false;
                    break;
                }

            }
            if(flag==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

}