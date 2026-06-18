package Comparable;

public class Student implements Comparable<Student> {
    
 public int age;
 public String name;
 public int weight;

 public Student(int age, String name, int weight) {
  this.age = age;
  this.name = name;
  this.weight = weight;
}

 public void setAge(int age) {
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getWeight() {
  return weight;
 }

 public void setWeight(int weight) {
  this.weight = weight;
 }

 @Override
public String toString() {
  return "Student [age=" + age + ", name=" + name + ", weight=" + weight + "]";
}

 public int compareTo(Student that) {

  if(this.age == that.age) {
   return this.name.compareTo(that.name); //ascending order
  }
  // return this.age - that.age; //ascending order
  return that.age - this.age; //descending order

 }
}
