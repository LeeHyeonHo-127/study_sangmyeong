import java.util.*;
class Student
{
    String ID_blank;
    int Student_ID;
    String Name;
    String Name_blank;
    String Major;
    String Major_blank;
    String Number;
    String Number_blank;
    int Number_int;

    void getStudent_ID(String ID)
    {
        ID_blank = ID;
    }

    void setStudent_ID(String ID_blank) {
        Student_ID = Integer.parseInt(ID_blank);
    }

    void getName(String Name)
    {
        Name_blank = Name;
    }

    void setName(String ID_blank) {
        Name = Name_blank;
    }

    void getMajor(String Major)
    {
        Major_blank = Major;
    }

    void setMajor(String Major_blank) {
        Major = Major_blank;
    }

    void getNumber(String Number)
    {
        Number_blank = Number;
        Number_int = Integer.parseInt(Number_blank);
    }

    void setNumber(String Number_blank)
    {
        Number =  Number_blank.substring(0,3) + "-" + Number_blank.substring(3,7) + "-" + Number_blank.substring(7,10);

    }

}



public class homework2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        Student[] student = {a,b,c};

        String input = new String();
        String[] information = new String[20];
        String Blank;
        String Num;

        for(int i=0; i<3; i++)
        {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
            input = scanner.nextLine();
            information = input.split(" ");

            student[i].getStudent_ID(information[0]);
            student[i].setStudent_ID(student[i].ID_blank);
            student[i].getName(information[1]);
            student[i].setName(student[i].Name_blank);
            student[i].getMajor(information[2]);
            student[i].setMajor(student[i].Major_blank);
            student[i].getNumber(information[3]);
            student[i].setNumber(student[i].Number_blank);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.\n");
       for(int i=0 ;i<3; i++)
       {
           System.out.printf("%d %s %s %s",student[i].Student_ID,student[i].Name,student[i].Major,student[i].Number);
           System.out.printf("\n");
       }

    }
}
