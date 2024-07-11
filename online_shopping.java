import java.util.*;
class online_shopping
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int flip_a=sc.nextInt();
    int flip_d=sc.nextInt();
    int flip_s=sc.nextInt();
    int snap_a=sc.nextInt();
    int snap_d=sc.nextInt();
    int snap_s=sc.nextInt();
    int amazon_a=sc.nextInt();
    int amazon_d=sc.nextInt();
    int amazon_s=sc.nextInt();
    int flip_as=(flip_a*flip_d)/100;
    int ftot=(flip_a-flip_as)+flip_s;
    int snap_as=(snap_a*snap_d)/100;
    int stot=(snap_a-snap_as)+snap_s;
    int amazon_as=(amazon_a*amazon_d)/100;
    int atot=(amazon_a-amazon_as)+amazon_s;
    System.out.println("In Flipkart: Rs."+ftot);
    System.out.println("In Snapdeal: Rs."+stot);
    System.out.println("In Amazon: Rs."+atot);
      if(ftot<=stot && ftot<=atot)
      {
        System.out.println("Choose Flipkart");
      }
    else if(stot<=ftot && stot<=atot)
    {
      System.out.println("Choose Snapdeal");
    }
    else
    {
      System.out.println("Choose Amazon");
    }
  }
}