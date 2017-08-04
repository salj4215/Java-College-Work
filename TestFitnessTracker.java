import java.time.*;
public class TestFitnessTracker
{
   public static void main(String[] args)
   {
      LocalDate date = LocalDate.of(2016,1,26);
      FitnessTracker2 exercise = new FitnessTracker2("bicycling", 35, date);
      
      System.out.println(exercise.getActivity() + " " + exercise.getMinutes() + " minutes on " + exercise.getDate());
   }
}      