//PatternPrinting
import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        int c=1;
        int r=n-2;
        int b=0;
        int row=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("**");
            }
            for(int j=n-i+1;j>=1;j--)
            {
                System.out.print(k+"0");
                k++;
            }

                b=n*n+1;
                row=b-c;


            for(int j=n-i+1;j>=1;j--)
            {

                if(i==1) {
                    if (j == 1) {
                        System.out.print(b);
                        break;
                    } else {
                        System.out.print(b + "0");
                        b++;
                    }
                }
                else
                {
                    if (j == 1) {
                        System.out.print(row);
                        break;
                    } else {
                        System.out.print(row + "0");
                        row++;
                    }

                }


            }
            c++;
            System.out.println();
        }
    }
}

