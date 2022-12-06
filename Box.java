package JavaClass;
public class Box {
    double width, height;

    Box(Box ob)
    {
        width = ob.width;
        height = ob.height;
    }

    Box(double w, double h)
    {
        width = w;
        height = h;
    }

    double volume() { return width * height; }
}

class Box3D extends Box{
    double depth;
    Box3D(double width, double height, double depth){
        super(width, height);
        this.depth = depth;

    }
    double volume() {
        return width * height * depth; }
}



// MAin class
class GFG {
    // Main driver method
    public static void main(String args[])
    {

        Box mybox = new Box(10, 20);

        Box myclone = mybox;
        myclone.width = 12;

        double vol;

        // Get volume of mybox
        vol = mybox.volume();
        System.out.println("Volume of mybox is " + mybox.width);

        // Get volume of myclone
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + myclone.width);


        Box my3dbox = new Box3D(10,12,13);
        System.out.println(my3dbox.volume());
    }
}

