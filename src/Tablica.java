public class Tablica {
    public static void main(String[] args) {
    //wypisz liczby z zakresu 1-100 podzielne przez 3


       for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.println(i+" dzieli się przez 3.");
            }

        }

        //odwróć elementy tabliczy np [1,2,3] -> [3,2,1]
        int[] tablica=new int[] {1,3,5};
        int[] odwroconaTablica=new int[3];
        int z=2;
        for(int j=0;j<tablica.length;j++){
            //System.out.println("z:"+z);
            //System.out.println("j:"+j);
            odwroconaTablica[j]=tablica[z];
            //System.out.println(odwroconaTablica[j]);
            z--;

        }
        System.out.println("tablica:{"+tablica[0]+","+tablica[1]+","+tablica[2]+"}");
        System.out.println("Odwrócona tablica: {"+odwroconaTablica[0]+","+odwroconaTablica[1]+","+odwroconaTablica[2]+"}");



        /*int[] lottoNumbers=new int[] {1,2,3,4,5,6};
        for(int i=0;lottoNumbers.length;i++){
            System.out.println(lottoNumbers[i]);
        }
        */
       /* String[] imiona= new String[3];
        imiona[0]="Marta";
        imiona[1]="Jaś";
        imiona[2]="łucja";
        for(int i=0;i<3;i++){
            System.out.println(imiona[i]);

        }*/
    }
}
