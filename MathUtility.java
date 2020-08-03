

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/*
 *  Constants
 *
 *   Static METHODS
 * - probably()
 * - factorial()
 * - combination()
 * - gcd()
 * - isCoPrime()
 * - isMultiplicativeInverse()
 * - distanceBW2Point()
 * - distanceBWPointFromOrigin()
 * - timeSpeedDistance()
 * - getAllPrimeBySieve()
 * */
class MathUtility {

    public static int max =10000;
    // probably = favorOutcome/totalOutcome
    static double probably(int favorOutcome,int totalOutcome){
        return (double) favorOutcome/totalOutcome;
    }


    // n! = n*(n-1)*(n-2)............
    static int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }


    //nCr - 𝑛!/(𝑟!(𝑛−𝑟)!)
    static int combination(int n,int r){
        int num=1,dem=1;
        for(int i=1;i<=r;i++){
            num*=(n-(i-1));
            dem*=i;
        }
        /*if(n-r<r) {
            for (int i = n; i > r; i--)
                num *= i;
            for (int i = r - 1; i > 0; i--)
                dem *= i;
        }
        else {
            for (int i = n; i >n-r; i--)
                num *= i;
            for (int i = r ; i > 0; i--)
                dem *= i;
        }*/
        /*
            return factorial(n)/factorial(r)*factorial(n-r);
        */
        return num/dem;
    }


    // Euclid's algorithm
    static double  gcd(double a, double b) {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }


    // if gcd(a,b) == 1
    static boolean isCoPrime(double a,double b){
        return gcd(a,b) == 1;
    }


    //Multiplicative Inverse
    static boolean isMultiplicativeInverse(int a,int b){
        return a*b == 1;
    }

    //distance = √(x2-x1)^2 + (y2-y1)^2
    public static double distanceBW2Point(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    //distance = √(x1)^2 + (y1)^2
    public static double distanceBWPointFromOrigin(int x1,int y1) {
        return Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
    }

    //time = distance/speed
    public static double timeSpeedDistance(double speed,double distance) {
        return speed/distance;
    }

    //    getAllPrimeBySieve()
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
    public static ArrayList<Integer> getAllFactor(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt((double)n);i++){
            if(n%i==0 && Math.pow(i,2)!=n){
                al.add(i);
                al.add(Math.abs(n/i));
            }
        }
        Collections.sort(al);
        return al;
    }

}
