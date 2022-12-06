package JavaClass;

public class OnlyOnce {

    static OnlyOnce instance = null;

    // private constructor can't be accessed outside the class
    private OnlyOnce() {  }

    // Factory method to provide the users with instances
    static public OnlyOnce getInstance()
    {
        if (instance == null) {
            instance = new OnlyOnce();
        }
        return instance;
    }
}

class ex {

    public static void main(String args[]) {

        OnlyOnce x = OnlyOnce.getInstance();

        OnlyOnce y = OnlyOnce.getInstance();


        OnlyOnce z = OnlyOnce.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

    }
}
