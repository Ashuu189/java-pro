public class Student {
    //Attibutes
    public int id;
    public String name;
    private int age;
    public int nos;
    private String gf;

    //constructor
    // public Student(){
    //     System.out.println("This is a constructor");
    // }



    //parameterized constructor
    public Student(int id, String name, int age, int no_of_subjects, String gf){
        this.id=id;
        this.name=name;
        this.age=age;
        this.nos=no_of_subjects;
        this.gf=gf;
    }

    public String getGfName(){
        return gf;
    }

    public int setAge(int a){
        return age=a;
    }

     public int getAge(){
        return age;
    }


   //copy ctor
    public Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.age=s.age;
        this.nos=s.nos;
        this.gf=s.gf;
    }

    //behavior
    public void studying(){
        System.out.println(name+"is Studying");
    }

    public void sleeping(){
        System.out.println(name+" "+"is sleeping");
    }

    private void gf(){
        System.out.println(gf+" "+"is gf");
    } 
    
    
public void display(){
    gf();
}
}

