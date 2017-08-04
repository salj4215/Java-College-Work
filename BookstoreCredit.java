//Salleh Jahaf
import java.util.Scanner;
class BookstoreCredit
{
   public static void main(String[] args)
   {
      String studentName;
      double gradePointAverage;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name >> ");
      studentName = input.nextLine();
      System.out.print("Enter your GPA >> ");
      gradePointAverage = input.nextDouble();
      displayCredit(studentName, gradePointAverage);
   }
   public static void displayCredit(String name, double gpa)
   {
      String fCredit;
      double credit;
      final int RATE = 10;
      credit = gpa * RATE;
      fCredit = String.format("%.2f", credit);
      System.out.print("Hello " + name + ", your GPA is " + gpa + ". Your bookstore credit is $" + fCredit + "!");
   }
}         
      