package JavaClass;

public class PolyQues1 {
    String name;
    long contact1;
    long contact2;

    void createcontact(String name,long contact1){
        System.out.println("single contact " + contact1+ " added under name " + name);
    }

    void createcontact(String name,long contact1, long contact2){
        System.out.println("Two contacts " + contact1+ " and "+ contact2 + " added under name " + name);
    }

    public static void main(String[] args) {
        PolyQues1 obj = new PolyQues1();
        obj.createcontact("lasya",6188067622L);
        obj.createcontact("manukonda",9704727693L,7382512192L);
    }


}
