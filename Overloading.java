class Student {
    String displayDetails(String name){
        return "Student Name:" + name;
    }

    String displayDetails(String name, int age){
        return "Student Name:" + name + ", Age: " + age;
    }
    String displayDetails(String name, int age, String grade){
        return "Student Name:" + name + ", Age: " + age + ", Grade: " + grade;
}}

public class Overloading{
    public static void main(String[] args){
        Student obj = new Student();
        System.out.println(obj.displayDetails("Sathvika"));
        System.out.println(obj.displayDetails("Sathvika",23));
        System.out.println(obj.displayDetails("Sathvika",23,"A"));

    }

}
