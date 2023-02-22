package s1218;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //테스트 케이스의 수
    int T = 10;

    //tc번 테스트 케이스
    for(int tc=1; tc<=T; tc++) {
      //length
      int N = sc.nextInt();
      String str = sc.next();
      String[] arr = str.split("");

      Stack<String> S = new Stack<>();
      for(int i=0; i<arr.length; i++) {
        try {
          //여는 괄호는 무조건 스택에 집어넣는다
          if (arr[i].equals("[") || arr[i].equals("(") || arr[i].equals("{")) {
            S.push(arr[i]);
          }
          //짝이 맞으면 스택에서 pop합니다
          else if (S.peek().equals("[") && arr[i].equals("]")) {
            S.pop();
          }
          else if (S.peek().equals("(") && arr[i].equals(")")) {
            S.pop();
          }
          else if (S.peek().equals("{") && arr[i].equals("}")) {
            S.pop();
          }
          //스택이 비어있는데 닫는 괄호가 들어온다?
          //일단 넌 틀렸지만 스택에 넣어는 드릴게
        } catch (Exception e){
          S.push(arr[i]);
        }
      }
      //스택이 완전히 비어 있으면 1, 하나라도 남아있으면 0
      if (S.isEmpty()) System.out.println("#"+tc+" "+1);
      else System.out.println("#"+tc+" "+0);
    }
  }
}
