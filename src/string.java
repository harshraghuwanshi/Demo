import java.util.Scanner;
 public class string{
     static void printString (String str){
    int n = str.length();
    for(int i = 0;i<n;i++){
        char ch = str.charAt(i);
        System.out.println(ch);
    }
     }

     static int getlenghtofsraingwithoutusinglength(String str){
         char[] arr = str.toCharArray();
             int len = arr.length;

         return len;
     }
     static int countTheVowelsInTheString(String str){
         int count = 0;
         int n = str.length();
         for(int i =0; i<n; i++) {
             char ch = str.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                 count++;
                 System.out.println(ch);
             }
         }
         return count;
         }


     public static void main(String[] args){
         String str = " Harshhu";
         printString(str);
         //System.out.println(getlenghtofsraingwithoutusinglength(str));
         System.out.println(countTheVowelsInTheString(str));

     }
}
