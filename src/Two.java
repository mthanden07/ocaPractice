import org.w3c.dom.ls.LSOutput;

public class Two {
    String name;
    String fname;

     Two(String name, String fname){
         this.name = name; this.fname = fname;
    }
    public void happyCouple(){
        System.out.println(this.fname  + " and  " +  this.name + " are a perfect couple.");
    }

    public static void main(String[] args) {
        Two two = new Two("theo", "mellisa");
        two.happyCouple();



    }


}




