//Coin Distribution

import java.util.Scanner;

public class CoinDistibution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int five=0;
        int one=0;
        int two=0;

        five=(n-4)/5;

        if((n-5)%2==0)
            one=2;
        else
            one=1;

        two=(n-five*5-one*1)/2;

        System.out.println(five+two+one+" "+five+" "+two+" "+one);

    }
}
