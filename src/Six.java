public class Six {
int arr [];
int num  = 0;
    Six(int arr[]){
        this.arr = arr;

    }

    public int getNum() {
        for(int i : arr)
        if(i%3 == 0){
            num += i;
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        Six six =  new Six(arr1);
        six.getNum();
    }
}
