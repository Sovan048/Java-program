public class Geomatric {
    public void add(float b,float h){
        float area = (b*h)/2;
        System.out.println("The area is "+area);
    }
    public void add(int wi,int he){
        int area = wi * he ; 
        System.out.println("The area is "+area);
    }
    public void add(double r){
        double area = 3.14 * r * r ;
        System.out.println("The area is "+area);
    }
    public static void main(String[] args) {
        Geomatric r = new Geomatric();
        r.add(30.0f,20.0f);
        r.add(20,40);
        r.add(3);
    }
}
