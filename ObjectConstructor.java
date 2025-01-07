class Student {
int id;
String name;
public Student(int id,String name) {
this.id = id;
this.name = name;
}
public void displayInformation() {
System.out.println("Student ID: " + id);
System.out.println("Student NAME: " + name);
}
}
public class ObjectConstructor {
public static void main (String [] arg){
Student student1 = new Student (1,"FAIZ");
Student student2 = new Student (2,"KASHIF");
student1.displayInformation();
student2.displayInformation();
}
}
