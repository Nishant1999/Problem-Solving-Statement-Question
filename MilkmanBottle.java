//MilkmanBottle
import java.io.File;
import java.util.Scanner;

public class MilkmanBottle {
    static int getMin(int li)
    {
        int count=0;
        if(li==1)
        {
            return 1;
        }
        if(li>=10) {
            count += li / 10;
            li=li%10;
        }
        if(li>=7) {

            count += li / 7;
            li=li%7;

        }
        if(li>=5) {
            count += li / 5;
           li=li%5;
        }
        if(li==2 || li==3 || li==4)
        {
            count+=li-1;

        }
        return count;
    }
    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            File ip = new File("src/input");
            Scanner sc = new Scanner(ip);
            int n=sc.nextInt();
            while(n-->0)
            {
                int li=sc.nextInt();
                if(li<0){
                    sb.append("Invalid Input");
                    return;
                }
                sb.append(getMin(li)+"\n");
            }
            System.out.print(sb);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
