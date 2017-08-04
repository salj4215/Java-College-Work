import java.time.*;
public class FitnessTracker
{
   String activity;
   int minutes;
   LocalDate date;
   //constructor added for Exercise 3a
   //change this constructor to use this reference
   public FitnessTracker()
   {
      activity = "running";
      minutes = 1;
      date = LocalDate.of(2016, 1, 1);
   }
   
   public String getActivity()
   {
      return activity;
   }
   public int getMinutes()
   {
      return minutes;
   }
   public LocalDate getDate()
   {
      return date;
   }
}               