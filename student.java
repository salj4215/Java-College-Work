//Salleh Jahaf
//Student.java
//Chapter3, Exercise 12

class Student
{
   //the private data members
   private int idNumber;
   private int hours;
   private int points;
   
   public Student()
   {
      idNumber = 9999;
      points = 12;
      hours = 3;
   }   
   
   //the public get and set methods
   
   public void setIDnumber(int number)
   {
      idNumber = number;
   }
   
   public int getIdnumber()
   {
      return idNumber;
   }
   
   public void setHours(int number)
   {
      hours = number;
   }
   
   public int getHours()
   {
      return hours;
   }
   
   public void setPoints(int number)
   {
      points = number;
   }
   
   public int getPoints()
   {
      return points;
   }
   
   //methods to display the fields
   
   public void showIDnumber()
   {
      System.out.println("ID Number is : " + idNumber);
   }
   
   public void showHours()
   {
      System.out.println("Credit Hours: " + hours);
   }
   
   public void showPoints()
   {
      System.out.println("Points Earned: " + points);  
   }
   
   public double getGradePoint()
   {
      return (points * 1.0 / hours);
         //simple integer division will truncate the decimal places
   }
}
                  