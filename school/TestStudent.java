package school;

public class TestStudent{
    public static void main(String[] args){
        Student s = new Student();
        s.firstName = "John";
        s.lastName = "Smith";
        s.number = "1111";

        System.out.println(s.firstName +" "+ s.lastName);
        System.out.println(s.number);
    
    }
}
