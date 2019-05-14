import java.util.*;
public class Q1A
{
  public static double getAverage(int [] nums)
  {
    int total = 0;
    for(int i = 0; i < nums.length; i++)      /*or for(int i:nums)*/
      total += i;
  }
  double average = total / nums.length;
  return average;
}
