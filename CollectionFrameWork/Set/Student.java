package Set;

public class Student {
 public int RollNo;
 public String Name;
 
 public Student(int RollNo, String Name){
    this.RollNo=RollNo;
    this.Name=Name;
 }

 @Override
 public String toString() {
    return "Student [RollNo=" + RollNo + ", Name=" + Name + "]";
 }

 @Override
 public int hashCode() {
   final int prime = 31;
   int result = 1;
   result = prime * result + ((Name == null) ? 0 : Name.hashCode());
   return result;
 }

 @Override
 public boolean equals(Object obj) {
   if (this == obj)
      return true;
   if (obj == null)
      return false;
   if (getClass() != obj.getClass())
      return false;
   Student other = (Student) obj;
   if (Name == null) {
      if (other.Name != null)
         return false;
   } else if (!Name.equals(other.Name))
      return false;
   return true;
 }

 

}
