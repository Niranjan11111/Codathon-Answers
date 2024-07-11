
import java.util.*;
class arrayInsertion_but_not
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int [n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int pos=sc.nextInt();
      if(pos>n)
      {
        System.out.println("Invalid Input");
      }
    else{
      int ele=sc.nextInt();
    System.out.println("Array after insertion is");
      for(int i=0;i<n;i++)
      {
        if(i==pos-1){
        System.out.println(ele);
        }
        System.out.println(arr[i]);
      }
    }
}}