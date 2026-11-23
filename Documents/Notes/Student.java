package Day3;

public class Student {
    String name;
    final int rollNumber;
    String address;
    static int count = 0;
    public Student(String name, String address){
        count++;
        this.name = name;
        this.rollNumber = count;
        this.address = address;
    }
    public void printStudent() {
        System.out.println(this.name + " " + this.rollNumber + " " + this.address);
    }
}
