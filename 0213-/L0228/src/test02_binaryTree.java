public class test02_binaryTree {
  public static void main(String[] args) {
    char[] arr = {'\u0000', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
    /*
        A
      B   C
     D E F G
    H
     */
    int parent = 1;
    int leftChild = parent * 2;
    int rightChild = parent * 2 + 1;
    System.out.printf("idx: %d, node: %c", leftChild, arr[leftChild]);

  }
}
