import java.util.*;
class Mornitor{
    private String mornitorSize;
    private String color;
    private String power;

    public Mornitor(String mornitorSize, String color, String power)
    {
        this.mornitorSize = mornitorSize;
        this.color = color;
        this.power = power;
    }

    public void printInfo()
    {
        System.out.printf("The spec of the mornitor\n");
        System.out.printf("Size: %s\n Color: %s\n Power: %s\n",mornitorSize,color,power);
    }

    public void turnon()
    {
        System.out.println("Turning on the mornitor");
    }

    public String getMornitorSize()
    {
        return mornitorSize;
    }

    public String getColor()
    {
        return color;
    }

    public String getPower()
    {
        return power;
    }
}

class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu,String memory,String hd, String color, String power)
    {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void printInfo()
    {
        System.out.printf("The spec of the computer\n");
        System.out.printf("CPU: %s \n Memory: %s\n HDD: %s\n Color: %s\n Power: %s\n",cpu,memory,hd,color,power);
    }

    public void turnon()
    {
        System.out.println("Turning on the computer");
    }

    public String getCpu()
    {
        return cpu;
    }
    public String getMemory()
    {
        return memory;
    }
    public String getHd()
    {
        return hd;
    }

    public String getColor()
    {
        return color;
    }

    public String getPower()
    {
        return power;
    }
}

class PersonalComputer
{
    Computer computer = new Computer("Core i7 CPU","16GB 메모리","2TB HDD","흰색","500w");
    Mornitor mornitor = new Mornitor("24인치","검은색","45W");


    public void turnon()
    {
        computer.turnon();
        mornitor.turnon();
    }

    public void printInfo()
    {
        computer.printInfo();
        mornitor.printInfo();
    }

}

public class Homework5 {
    public static void main(String[] args)
    {
        PersonalComputer pc = new PersonalComputer();
        pc.turnon();
        pc.printInfo();

    }

}
