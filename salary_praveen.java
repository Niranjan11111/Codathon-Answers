import java.util.*;
class salary_praveen
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[7];
    for(int i=0;i<7;i++){
      a[i]=sc.nextInt();
    }
    double pay=0;
    for(int i=0;i<7;i++){
      int rate=100;
    if(a[i]>8){
  	rate+=15;
    }
      if(i==6){
      pay+=(a[i]*rate);
        pay+=pay*1.25;
      }
      else if(i==0){
      pay+=(a[i]*rate);
        pay+=pay*1.5;
      }
      else{
      pay+=a[i]*rate;
      }
     }
    System.out.println((int)pay);
  }
}