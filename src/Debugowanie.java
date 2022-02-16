public class Debugowanie {
    public static void main(String[] args) {
        int[] numbers=new int[] {1,2,3,4,5};

        for(int i=0; i<(numbers.length/2);i++){
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
            System.out.println("Iteracja "+i);
        }

        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
