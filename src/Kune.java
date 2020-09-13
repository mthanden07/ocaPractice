public class Kune {

   public static int[] oddNumbers = new int[10];

     public void addToArray() {
//int [] multiplesOfPrime = new int[];

         oddNumbers[0] = 2 ;
         oddNumbers[1] = 4 ;
         oddNumbers[2] = 6 ;
         oddNumbers[3] = 8 ;
         oddNumbers[4] = 10 ;
         oddNumbers[5] = 12 ;
         oddNumbers[6] = 14;
         oddNumbers[7] = 16 ;
         oddNumbers[8] = 18 ;
         oddNumbers[9] = 20;

         for (int i : oddNumbers) {
             if(i%3 ==0 || i%5 == 0){
                 i = 0;

             //    multiplesOfPrime.add(i);
             }
             System.out.println(i);


         }
     }

    public static void main(String[] args) {
         Kune kune = new Kune();
         kune.addToArray();
     //  System.out.println(i);

    }


}
