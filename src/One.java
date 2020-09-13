public class One implements Three, Four {
    public String name ;
    public String fname;

    public void singleMale(String name) {
        this.name = name;
    }

      public void singleFemale(String fname){
           this.fname = fname;
        }

        public void happyCouple(){
            System.out.println(this.name + " and " +  this.fname + "  are now a happy couple." );
        }

    public static void main(String[] args) {
        System.out.println("hello  everyone ");
One  one = new One();
one.singleMale("Danny");
one.singleFemale("Sihle");
one.happyCouple();


       }
    }



