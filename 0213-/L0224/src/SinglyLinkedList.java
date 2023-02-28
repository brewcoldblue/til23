public class SinglyLinkedList {
  public Node head;
  public SinglyLinkedList() {

  }

  //가장 마지막에 추가: addToEnd(item)
  //가장 처음에 추가: addToStart(item)
  //특정 값을 갖는 노드 다음에 추가: addAfter(value)
  //특정 값을 갖는 노드: geeNode(value)
  // deleteLast()
  // deleteStart()
  // deleteAfter(value)
  // 리스트 순회 출력: printList()

  public void addToEnd(int data) {
    //새 노드 생성
    //가장 마지막에 추가해야 하므로 마지막 노드에 가서
    //가장 마지막 노드의 다음에 새 노드 추가
    Node n = new Node(data);
    //여러 노드가 이미 있을 때와
    //head가 null일 때 다름
    if(head == null) head = n;
    else {
      Node curr = head; //임시 변수 만들기
      while(curr.next != null) curr = curr.next; //다음 노드 있으면 그 다음 노드로 이동(주소값으로 덮음)
      //while이 끝났다면 마지막 노드에 온 것이므로, 현재 노드가 가장 마지막 노드임 (curr.next == null)
      curr.next = n; //새로운 노드로 연결
    }
  }
  public void printList() {
    Node curr = head;
    System.out.print("LinkedList[head: ");
    while(curr != null) { //지금 노드에 뭔가 있으면 출력
      System.out.print(curr.data+" -> ");
      curr = curr.next;
    }
    System.out.println(" ]");
  }

  public void addToStart(int data) {
    //새로운 노드 만들기
    //현재 첫 번째 노드는 head를 통해서만 접근 가능하고, 두 번째 노드가 되어야함
    //새 노드.next = 현재 첫 번째 노드의 주소값(head)
    Node n = new Node(data);
    n.next = head;
    //head가 새로운 노드 가리키도록 하기
    head = n;
  }
  public Node getNode(int target) {
    //target이란 값을 가지는 노드의 주소값 반환
    Node curr = head;
    while(curr != null) {
     if(curr.data == target) return curr;
    } curr = curr.next;
    return null; //노드 못 찾으면 null
  }
  public void addAfter(int target, int data) {
    Node targetNode = getNode(target);
    if(targetNode != null) {
      Node n = new Node(data);
      n.next = targetNode.next;
      targetNode.next = n;
    }
  }
}
