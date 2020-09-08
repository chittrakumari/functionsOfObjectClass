package Main;
import Class.Student;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //Creating objects of student class.
        Student object1 = new Student();
        Student object2 = new Student();

        System.out.println("Enter roll ");
        object1.setRoll(obj.nextInt());

        obj.nextLine();

        System.out.println("Enter Name ");
        object1.setName(obj.nextLine());

        System.out.println("Enter email ");
        object1.setEmail(obj.nextLine());

        System.out.println("Enter roll ");
        object2.setRoll(obj.nextInt());
        obj.nextLine();

        System.out.println("Enter Name ");
        object2.setName(obj.nextLine());

        System.out.println("Enter email ");
        object2.setEmail(obj.nextLine());

        System.out.println("Are object1 and object2 equal? "+object1.equals(object2));

        //if both the objects are equal they will have the same hash code otherwise not.
        System.out.println(object1.hashcode());
        System.out.println(object2.hashcode());

        //getClass() function displays the class of any object.
        System.out.println(object1.getClass());
    }
}
