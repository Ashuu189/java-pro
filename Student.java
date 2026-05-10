public class Student {
    //Attibutes
    public int id;
    public String name;
    public int age;
    public int nos;

    //constructor
    // public Student(){
    //     System.out.println("This is a constructor");
    // }



    //parameterized constructor
    public Student(int id, String name, int age, int no_of_subjects){
        this.id=id;
        this.name=name;
        this.age=age;
        this.nos=no_of_subjects;
    }

   //copy ctor
    public Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.age=s.age;
        this.nos=s.nos;
    }

    //behavior
    public void studying(){
        System.out.println(name+"is Studying");
    }

    public void sleeping(){
        System.out.println(name+" "+"is sleeping");
    }
}

