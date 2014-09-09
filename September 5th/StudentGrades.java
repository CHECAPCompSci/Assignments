//********************************************************************
//  StudentGrades FT.java
//
//  Prints a table of points students earned in lab work.
//*******************************************************************

public class StudentGrades
{
    //--------------------------------------------------------
    // Print the table with a border and aligned columns;
    // use the + operator to do arithmetic and concatenation.
    //--------------------------------------------------------
    public static void main (String[] args)
    {
  //Print Boarder
      System.out.println ("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println ("===\t Student Points \t    ===");
      System.out.println ("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
      
  //Print Table
      System.out.println ("   Names\t  Lab\tBonus\tTotal");
      System.out.println ("   ----\t  ---\t-----\t-----");
      System.out.println ("   Angelina  "+ 8 + "\t"+ 0 + "\t"+ (8+0));
      System.out.println ("   Oscar     "+ 7 + "\t"+ 1 + "\t"+ (7+1));
      System.out.println ("   Athena    "+ 9 + "\t"+ 0 + "\t"+ (9+0));
      System.out.println ("   Thomas    "+ 9 + "\t"+ 1 + "\t"+ (9+1));
      System.out.println ("   Silvia    "+ 6 + "\t"+ 2 + "\t"+ (6+2));
    }
}