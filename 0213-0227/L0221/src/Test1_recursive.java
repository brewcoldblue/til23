public class Test1_recursive {
  public static void main(String[] args) {
    int n=10;
    long start = System.nanoTime();
    System.out.println(fib(n));
    long end = System.nanoTime();
    System.out.println(end - start);

    long start2 = System.nanoTime();
    System.out.println(mfib(n));
    long end2 = System.nanoTime();
    System.out.println(end2 - start2);
  }
  //regular recursion
  public static int factorial(int n) {
    if(n==0) return 1; //exception handling
    if(n==1) return 1; //base case
    return n * factorial(n-1); //recursive case
  }

  //memoization
  static int[] memo = new int[100];

  // 클래스가 로딩될 때 클래스 변수가 준비되고 난 후 이 부분을 실행할 수 있음
  // 한 클래스 안에 여러 개의 static block을 넣을 수 있음
  // 주로 class 변수(static 변수)를 초기화할 때 사용함
  static { //static block을 사용
    memo[0] = 0;
    memo[1] = 1;
  }
  public static int mfib(int i) {
    if(i >= 2 && memo[i] == 0) { //계산한 값이 없으면 계산한다
      //즉 계산해야 할 때만 계산해서 배열에 저장한다
      memo[i] = fib(i-1)+fib(i-2);
    }
    //계산한 적이 있으면
    return memo[i];
  }
  public static int fib(int i) {
    if(i<=1) return i;
    return fib(i-1)+fib(i-2);
  }
}
