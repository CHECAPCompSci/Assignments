//********************************************************************
//  StudentGrades.java
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
   System.out.println (" ///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
     System.out.println (" ==\t Student Points\t       ==");
       System.out.println (" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
      
  //Print Table
       System.out.println ();
          System.out.println ("Name\tLab\tBonus\tTotal");
       System.out.println ("Austin\t" + 7 + 8 + "\t" + 0 + 2 + "\t" + 1 + 0 + 0);
      System.out.println ("Ilia\t" + 1 + 0 + 0 + "\t" + 0 + 0 + "\t" + 1 + 0 + 0);
      System.out.println ("Daniel\t" + 2 + 0 + "\t" + 4 + 0 + "\t" + 1 + 0 + 0);
      System.out.println ("Nond\t" + 9 + 9 + "\t" + 0 + 1 + "\t" + 1 + 0 + 0);
  
    }
}