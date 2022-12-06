package JavaClass;

public class PolyQues2{
    public void jeans() {
        System.out.println("Default AllenSolly Jeans");
    }
}

class FirstShop extends PolyQues2{
    @Override
    public void jeans() {
        System.out.println("Firstshop AllenSolly Jeans");
    }

}

class SecondShop extends PolyQues2{
    @Override
    public void jeans() {
        System.out.println("Secondshop AllenSolly Jeans");
    }

}

class MainMethodClass{
    public static void main(String[] args) {
        PolyQues2 obj = new SecondShop();
        FirstShop obj1 = new FirstShop();
        SecondShop obj2 = new SecondShop();
        obj.jeans();
        obj1.jeans();
        obj2.jeans();

    }




}


