import java.util.*;
class leapyear
{
  public static void main(String args[])
  {
  //Try out your code here
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    if(year%4==0)
    {
      if(year%100==0){
        if(year%400==0){
          System.out.println(year+" is a leap year");
        }
        else{
          System.out.println(year+" is not a leap year");}
        }
      else{
        System.out.println(year+" is a leap year");}
      }
    else{
      System.out.println(year+" is not a leap year");}
    }
  }