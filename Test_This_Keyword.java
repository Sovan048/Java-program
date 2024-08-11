class Student{
    int rollno;
    String name;
    float fee;

    Student(int r, String n, float f){
        this.rollno = r;
        this.name = n;
        this.fee = f;
    }

    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }

}

public class Test_This_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sovan", 500000f);
        Student s2 = new Student(102,"Sayan",600000f);

        s1.display();
        s2.display();
    }
    
}
