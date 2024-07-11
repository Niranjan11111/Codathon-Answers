import java.util.*;
class salary_niranjan
{
  public static void main(String args[])
  {
    float rate_sun,rate_sat;
    Scanner sc = new Scanner(System.in);
    int sun = sc.nextInt();
    int mon = sc.nextInt();
    int tue = sc.nextInt();
    int wed = sc.nextInt();
    int thu = sc.nextInt();
    int fri = sc.nextInt();
    int sat = sc.nextInt();

    System.out.println("output");
    //sunday
    if(sun<=8){
      rate_sun = (sun*100);
      rate_sun = rate_sun+(rate_sun/2);
      System.out.println(rate_sun);
    }
    else{
      int temp = sun-8;
      rate_sun = (sun*100)+(temp*15);
      rate_sun = rate_sun+(rate_sun/2);
      System.out.println(rate_sun);
    }
    //saturday
    if(sat<=8){
      rate_sat = (sat*100);
      rate_sat = rate_sat+(rate_sat/4);
      System.out.println(rate_sat);
    }
    else{
      int temp2 = sat-8;
      rate_sat = (sat*100)+(temp2*15);
      rate_sat = rate_sat+(rate_sat/4);
      System.out.println(rate_sat);
    }

  }
}