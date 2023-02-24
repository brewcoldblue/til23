public class Node {
  public int data;
  public Node next; //자기 자신을 타입으로 써서 링크 데이터 부분 선언

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}
