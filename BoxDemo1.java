class Box{
    double width,height,depth;
    Box(){
        System.out.println("Constructor");
        width = 10;
        height = 10;
        depth =10;
    }
    double volume(){
        return (width*height*depth);
    }
}
public class BoxDemo1 {
    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box();
        double vol;
        vol = obj1.volume();
        System.out.println("volume="+vol);
        vol = obj2.volume();
        System.out.println("volume="+vol);
    }
}
