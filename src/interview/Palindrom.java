package interview;

public class Palindrom {
    //czy wyraz jest palindromem
    //czytany odl lewej do prawej jest taki sam
    //np. kajak

    public static void main(String[] args) {
        System.out.println(isPallindrom("kajak"));
        System.out.println(isPallindrom("jaja"));

    }

    public static boolean isPallindrom(String word){
        int n=word.length();
        for (int i=0;i<(n/2);i++){
            //sprawdzamy czy pierwszy jest różny od ostatniego, wtedy nie jest palindromem
            if(word.charAt(i)!=word.charAt(n-i-1)){
                return false;

            }
        }
        return true;
    }


}
