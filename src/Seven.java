public class Seven {
    int arr [][];
    int num  = 0;
    Seven(int arr[][]){
        this.arr = arr;

    }

    public int getNum() {
        for(int[] i: arr)
            for(int j: i)
            if(j % 5 == 0){
                num += j;
            }
        System.out.println(num);
        return num;
    }




    public static void main(String[] args) {
        int arr[][]={{2,5,12,15,18,20}, {25, 50}, {4,2,5}};



        Seven seven = new Seven(arr);
        seven.getNum();
//        System.out.println();
    }
}
