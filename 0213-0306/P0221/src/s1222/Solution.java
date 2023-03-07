package s1222;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int tc = 1; tc <= T; tc++) {
      int length = sc.nextInt();
      String str = sc.next();
      String[] arr = str.split("");
      String postfix = "";
      Stack<String> stack = new Stack<>();

      for(int i=0; i<arr.length; i++) {
        int temp = 0;
        if(!arr[i].equals("+")) postfix+=arr[i];
        if(arr[i].equals("+")) {
          stack.push(arr[i]);
        }
      }

      for(int i=0; i<arr.length; i++) {
        int temp = 0;
        if(!arr[i].equals("+")) stack.push(arr[i]);
        if(arr[i].equals("+")) {
          temp = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
          stack.push(Integer.toString(temp));
        }
      }
      System.out.printf(stack.peek());
    }

  }
}
