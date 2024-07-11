import java.util.*;
class current_bill
{
  public static void main(String args[])
  {
    double bill;
    Scanner sc=new Scanner(System.in);
    int unit = sc.nextInt();
    double units = (double)unit;
    
    if (units <= 200){
      bill = units*0.50;
      System.out.println((int)bill);
    }
    else if(units > 200 && units <= 400){
      bill = units*0.65 + 100;
      System.out.println((int)bill);
    }
    else if(units > 400 && units <= 600){
      bill = units*0.80 + 200;
      System.out.println((int)bill);
    }
    else if(units > 600){
      bill = units*1.25 + 425;
      System.out.println((int)bill);
    }
    
  }
}