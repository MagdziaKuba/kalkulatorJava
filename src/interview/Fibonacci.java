package interview;

public class Fibonacci {
    //n1-1 n2-1 n3-n2+n1

    //1,1,2,3,5,8,13,21,34,55,89

    public static void main(String[] args) {
        fibo(7);
        fibo(8);
        fibo(9);
    }

    public static void fibo(int n){
        long n1=1;
        long n2=1;
        for(int i=3;i<=n;i++){
            long temp=n2+n1;
            n1=n2;
            n2=temp;

        }
        System.out.println(n2);
    }
}
