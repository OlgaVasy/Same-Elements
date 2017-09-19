import java.util.Arrays;

/** P. 654 programming#1: SameElements.java */

public class SameElements {

   public static boolean sameElements(int[] a, int[] b){

     Arrays.sort(a);
     Arrays.sort(b);
     for (int i = 0; i < a.length; i++){
         if (a[i] != b[i])
            return false;}
     return true;
   }
   public static void main(String[] args) {
      int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
      int[] b = {11, 121, 144, 19, 161, 19, 144, 19};
      if (sameElements(a, b)) {
         System.out.println("Test 1 passed");
      } else {
         System.out.println("Test 1 failed");
      }
      int[] c = {11, 121, 144, 18, 161, 19, 144, 19};
      if (sameElements(a, c)) {
         System.out.println("Test 2 passed");
      } else {
         System.out.println("Test 2 failed");
      }


   }}
