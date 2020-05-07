import java.util.*;

class Sample{
  public static void generateAllStrings(String output , int k , int len){
    if(len == k){
         System.out.print(output + " ");
         return ;
    }

     generateAllStrings(output + '0' , k , len + 1);
     if(len == 0 || output.charAt(len - 1) == '0')
     generateAllStrings(output + '1' , k , len + 1);
  }

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of k..");
  int  k = sc.nextInt();
  generateAllStrings("" , k , 0);
  }
}

