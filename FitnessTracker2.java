import java.time.*;
public class FitnessTracker2
{
   String activity;
   int minutes;
   LocalDate date;
   //constructor added for Exercise 3a
   //change this constructor to use this reference
   public FitnessTracker2()
   {
      activity = "running";
      minutes = 1;
      date = LocalDate.of(2016, 1, 1);
   }
   public FitnessTracker2(String act, int min, LocalDate dte)
   {
      activity = act;
      minutes = min;
      date = dte;
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