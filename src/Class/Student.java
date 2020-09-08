/*
Implementation of equals,hashcode(),hash() function
 */

package Class;

import java.util.Objects;

public class Student {

    //Getter and Setter Methods
    private String name;
    private int roll;
    private String email;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //overriding equals method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        //checking the type of current object and obj
        if (obj instanceof Student) {
            Student student = (Student) obj;

            //compare instance variables for equality
            if (roll == student.getRoll() && name.equals(student.getName()) && email.equals(student.getEmail())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

        public int hashcode(){

        return Objects.hash(name,roll,email);

         /*
         We can use this func to  print the hash code

        public int hashcode(){
        int response=0;
        int t=31;
        response=roll*31+name.hashCode()+email.hashCode();
        return response;

        or we can also use the function hash()*/
    }
}