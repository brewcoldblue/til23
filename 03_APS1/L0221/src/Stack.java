public interface Stack {
  //자료구조
  //LIFO (Last In First Out)

  //1. isEmpty() (boolean)
  boolean isEmpty();
  //2. isFull() (boolean)
  boolean isFull();
  //3. push(n) (void)
  void push(int n);
  //4. pop() ()
  void pop();
  //5. peek() top의 값 확인
  void peek();
  //6. clear() 초기화
  void clear();
  //7. 출력문
  void printStack();
}
