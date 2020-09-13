public class Five {

    public static void main(String[] args) {
        int[][] tenByTen =new int[10][10];
        int store = 0;


        for (int i = 0; i < tenByTen.length; i++) {
            for (int j = 0; j < tenByTen.length; j++) {
                store++;
                int k = store *2;

//                System.out.println(store);
               tenByTen[i][j] = k;
//
                if (tenByTen[i][j] % 3 == 0 || tenByTen[i][j] % 5 == 0) {
//
                    tenByTen[i][j] = 0;
               }
//
              System.out.println(tenByTen[i][j]);
            }


        }


    }
}
