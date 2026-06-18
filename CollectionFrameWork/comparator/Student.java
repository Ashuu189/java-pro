package comparator;

public class Student {
    public int age;
    public String name;
    public int weight;


    public Student(int age, String name, int weight){
        this.age=age;
        this.name=name;
        this.weight=weight;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }


}
