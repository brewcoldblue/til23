public class test03_traversal {
  static char[] arr;
  static int n;

  public static void main(String[] args) {
    arr = new char[] {'\u0000', 'A', 'B' ,'C', 'D', 'E', 'F', 'G','\u0000','\u0000', 'H', 'I'};
        /*
          A
      B        C
   D    E   F    G
       H I
     */
    VLR(1);
    LVR(1);
    LRV(1);
  }
  public static void VLR(int i) {
    if(i <= n-1) { //인덱스 범위 넘어가지 않도록
      //전위 순회, VLR
        if(arr[i] != '\u0000') System.out.print(arr[i]+" "); //Visit
        VLR(i*2); //L
        VLR(i*2+1); //R
    }
  }
  public static void LVR(int i) {
    if(i <= n-1) { //인덱스 범위 넘어가지 않도록
      //중위 순회, VLR
      LVR(i*2); //L
      if(arr[i] != '\u0000') System.out.print(arr[i]+" "); //Visit
      LVR(i*2+1); //R
    }
  }
  public static void LRV(int i) {
    if(i <= n-1) { //인덱스 범위 넘어가지 않도록
      //후위 순회, VLR
      LRV(i*2); //L
      LRV(i*2+1); //R
      if(arr[i] != '\u0000') System.out.print(arr[i]+" "); //Visit
    }
  }
}
