//ZombieWorld
import java.util.Arrays;
import java.util.Scanner;

public class ZombieWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int time = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int initial_energy = sc.nextInt();
            int minimum_energy = sc.nextInt();
            int count = 0;
            Arrays.sort(arr);
            while (initial_energy >= minimum_energy) {
                if (arr.length == count)
                    break;
                if (initial_energy > arr[count]) {
                    initial_energy += initial_energy - arr[count];
                    count++;
                }

            }
            if (initial_energy >= minimum_energy)
                System.out.print("YES");
            else
                System.out.print("NO");


        }
    }
}