public class 마이쮸 {

  public static void main(String[] args) {
    int stock = 20;
    //poll이 되면서 마이쮸를 받는다고 가정하면
    //1, 1, 2, 1, 3, 2, 1, 4, 3, 2, 1, 5, 4, 3, 2, 1, ... 순으로
    //마이쮸를 받아가고, 이때 각 번호가 나온 횟수를 모두 더해주면 된다.
    int[]arr = new int[1000];
    arr[1] = 1;
    stock--; //1번은 하나를 받은 상황
    int p = 1; //사람 번호 매기기
    int person = 0; //방금 마이쮸 받아간 사람
    while(stock > 0) {
      for (int i = p; i > 0; i--) {
        arr[i]++; //마이쮸를 드립니다
        stock = stock - arr[i]; //재고에서 받아간 마이쮸 빼기
        person = i; //마이쮸 받아간 사람 번호
        p++; //다음에 추가될 사람 번호
      }
    }
    //stock이 0 이하이기 직전에 멈췄기 때문에
    //남은 걸 받아가는 사람은 다음 사람이 된다.

    //만약 마지막으로 받아간 사람이 추가되기 전의 마지막 사람이라면 1개가 남는데
    //그 1개는 새로 들어온 사람이 막차로 받아가게 되고
    if(person == p-1) System.out.println(p);
    //아니라면 그 다음 사람이 남은걸 다 가져간다.
    else System.out.println(person + 1);
  }
}
