import java.util.*;
public class IntSort
{
   public static void main(String[] args)
   {
      int[] userNums = new int[20];
      int entry = 0;
      Scanner input = new Scanner(System.in);
      int a, b, temp;
         
         for(a = 0; a < userNums.length; ++a)
         {
            System.out.print("Enter a number or 99999 to end");
            if(entry == 99999)
               break;
            entry = input.nextInt();
            userNums[a] = entry;
         }   
      int comparisons = userNums.length - 1;
            
            for(a = 0; a < userNums.length - 1; ++a)
            {
               for(b = 0; b < comparisons; ++b)
               {
                  if(userNums[b] > userNums[b + 1])
                  {
                     temp = userNums[b];
                     userNums[b] = userNums[b + 1];
                     userNums[b + 1] = temp;
                  }
               }
            }      
         for(int x = 0; x < userNums.length; ++x)
         System.out.print(userNums[x] + " ");
         System.out.println();
         --comparisons;
         for(int y = userNums.length - 1; y > 0; --y)
            System.out.print(userNums[y] + " ");
      }
   }