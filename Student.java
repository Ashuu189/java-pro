class Student{
    String Name="Ashutosh";
    int roll_No=10;

    void setData(String name, int rollno){
        this.Name= name;
        this.roll_No=rollno;
    }
}

 void main(){
    Student s1= new Student();
 s1.setData("John", 20);
 System.out.println(s1.Name);
 System.out.println(s1.roll_No);
    


}