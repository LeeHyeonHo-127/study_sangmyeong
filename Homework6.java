import java.util.*;
class Course
{
    public String code;
    public String name;

    public Course(String input_code,String input_name)
    {
        this.code = input_code;
        this.name = input_name;
    }
    public String getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
}

class OnlineCourse extends Course {
    public OnlineCourse(String input_code, String input_name) {
        super(input_code, input_name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

class OfflineCourse extends Course
{
    public OfflineCourse(String input_code, String input_name) {
        super(input_code, input_name);
    }
    public String toString()
    {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}





public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}
