public class Eight {
int [][] arr;
int sumOfMultiples = 0;
int product;

    Eight (int arr [][]){
        this.arr = arr;

    }

   public int[] setMultiple(int multiple) {

       int[] arr1 = new int[0];
       for (int[] i : arr) {
           for (int j : i) {
               if (j % multiple == 0) {
                   System.out.println(j);
                   arr1 = new int[j];


                    /*
                    int k = (j/multiple);
                  product =  (j*k);
                    System.out.println("These are multiples of  =>  "+  product + " :  " +j+ "  and   " +  k );
                  sumOfMultiples += (j+k);
                    System.out.println("This is the perfect some of all multiples  " + sumOfMultiples);
                  //  return product;

                     */
                   System.out.println(product);
                   return arr1;
               }
           }
       }
       return arr1;
   }
    public static void main(String[] args) {
        int [][] arr1 = {
                {2,4,8,10}, {3,6,9,12}
        };
        Eight eight = new Eight(arr1);
       // eight.setMultiple(50);
        eight.setMultiple(4);
    }
}



