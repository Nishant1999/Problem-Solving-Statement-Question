//ReverseGear
import java.util.Scanner;

public class ReverseGear {
    public static int getAnswer(int f,int b,int t,int d){
        int time=0;
        int oneCycleTime = b*t+f*t;
        int oneCycleDist = b-f;
        while (d>b){
            time+=oneCycleTime;
            d-=oneCycleDist;
        }
        time+=d*t;
        return time;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f,b,t,d,testCase;
        testCase = sc.nextInt();
        while (testCase-->0) {
            f =  sc.nextInt();
            b =  sc.nextInt();
            t =  sc.nextInt();
            d =  sc.nextInt();
            System.out.println(getAnswer(f, b, t, d));
        }
    }
}