import java.util.*;
public class alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Char = sc.next().charAt(0);
        
        if(Char=='a' || Char=='e' || Char=='i' || Char=='o' || Char=='u' || Char=='E' || Char=='A' || Char=='I' || Char=='O' || Char=='U'){
            System.out.println("Vowel");
        }
        else if(Char>'a' && Char<='z' || Char>'A' && Char<='Z'){
            System.out.println("Consonant");
        }
        else{
          System.out.print("Not an alphabet");
        }
    }
    
}
