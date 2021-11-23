import java.util.*;

abstract class Printer
{
    String model;
    int printedCount;
    int availableCount;
    abstract boolean print();
}

class InkjetPrinter extends Printer
{

    public InkjetPrinter(String model,int availableCount)
    {
        super.model = model;
        super.availableCount = availableCount;
        super.printedCount = 0;
    }


    public boolean print()
    {
        boolean b = true;
        if (availableCount == 0)
        {
            System.out.printf("%s: %d매째 인쇄 실패 -잉크부족\n",model,printedCount+1);
            b = false;
            return b;
        }
        else
        {
           printedCount++;
           availableCount--;
           b = true;
           return b;
        }
    }
}

class LaserPrinter extends Printer
{

    public LaserPrinter(String model,int availableCount)
    {
        super.model = model;
        super.availableCount = availableCount;
        super.printedCount = 0;
    }


    public boolean print()
    {
        boolean b = true;
        if (availableCount == 0)
        {
            System.out.printf("%s: %d매째 인쇄 실패 -잉크부족\n",model,printedCount+1);
            b = false;
            return b;
        }
        else
        {
            printedCount++;
            availableCount--;
            b = true;
            return b;
        }
    }
}


public class Homework7 {
    public static void main(String[] args)
    {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW",7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw",1500);
        while(inkjet.print());
        while(laser.print());
    }
}
