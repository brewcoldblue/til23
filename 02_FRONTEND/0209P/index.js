const movieCard = (movie) => {
  //인덱스에 있는 객체 하나하나를 받아옵니다.

  const LI = document.createElement("li");
  LI.className = "movielist";
  const T = document.createElement("h3");
  T.className = "title";
  const G = document.createElement("p");
  G.className = "genre";
  const D = document.createElement("p");
  D.className = "director";
  const R = document.createElement("p");
  R.className = "runningTime";
  const B = document.createElement("input");
  B.className = "zzim";
  B.setAttribute("type", "submit");
  B.setAttribute("value", "찜"); //새로운 태그들을 생성해서, 클래스 이름을 부여해줍니다.

  T.textContent = movie.title;
  G.textContent = movie.genre;
  D.textContent = movie.director;
  R.textContent = movie.runningTime; //태그들 안에 오브젝트에서 가지고 온 텍스트를 집어넣어요.

  LI.append(T);
  LI.append(G);
  LI.append(D);
  LI.append(B);
  LI.append(R); //리스트에 만들어진 태그들을 위부터 넣습니다.

  const UL = document.querySelector(".movieContainer"); //꽂아주기 위한 UL 선택
  UL.append(LI); //LI 상단에 있는 UL에 만들어진 LI를 집어넣습니다.
}; //호이스팅되므로 코드 정리를 위해 아래에 이 함수를 선언합니다.

const zzim = (arr) => {
  const Z = document.querySelectorAll(".zzim"); //찜 버튼들을 선택합니다.
  const ZL = document.querySelector(".zzimList"); //리스트 상위의 UL 태그를 선택합니다.
  const NZ = document.querySelector(".nozzim"); //찜이 없을 때 표시할 nozzim을 선택합니다.

  Z.forEach((z, idx) => {
    //찜 버튼에 이벤트 리스너를 등록합니다.
    z.addEventListener("click", (e) => {
      e.stopPropagation(); // 버블링을 막아 input 상위의 엘리먼트에서 이벤트가 여러 번 작동하지 않도록 합니다.
      const target = arr[idx];
      localStorage.setItem("Data" + idx, JSON.stringify(target));
      //해당 인덱스에 해당하는 정보들을 JSON 문자열로 바꿔 로컬 스토리지에 저장합니다.
      //이때 중복 key를 써서 덮어쓰는 것을 방지하기 위해 idx를 사용하여 key를 고유하게 저장합니다.

      const displaydata = JSON.parse(localStorage.getItem("Data" + idx));
      const parsedText = `제목: ${displaydata.title}
                          장르: ${displaydata.genre}
                          감독: ${displaydata.director}
                          러닝타임: ${displaydata.runningTime}분`; //출력 텍스트를 미리 작성해 놓았습니다.
      const listItem = document.createElement("li");
      listItem.className = "zzims" + idx; //리스트 엘리먼트를 만들고, 인덱스를 이용하여 클래스 이름을 부여합니다.
      listItem.className += " zzims"; //리스트 엘리먼트에 사용할 공통된 클래스 이름도 부여합니다.
      const liSelector = document.querySelector(".zzims" + idx);
      if (liSelector === null) {
        //방금 만든 그 클래스가 이미 있는지 확인해서, 없으면
        listItem.textContent = parsedText; //아까 그 출력 텍스트를 li에 넣어주고,
        NZ.remove(); //찜 상태가 아니었을 때 나오는 텍스트 노드를 삭제합니다.
        ZL.prepend(listItem); //ul 안에 새로운 찜 영화가 위로 오도록 차례대로 삽입합니다.
      }
    });
  });
};

const main = () => {
  //페이지가 로딩되었을 때 실행할 함수입니다.
  const xhr = new XMLHttpRequest();
  xhr.onreadystatechange = () => {
    if (xhr.readyState == 4) {
      if (xhr.status == 200) {
        const data = JSON.parse(xhr.responseText); //문자열 데이터를 객체로 바꿉니다.
        data.movies.forEach((movie) => {
          movieCard(movie); //movie 하나하나에 위에서 선언한 movieCard() 함수를 적용시킵니다.
        });
        zzim(data.movies); //movie 하나하나에 아래에 있는 zzim() 함수를 적용시킵니다.
      } else {
        //데이터가 안 왔으면
        console.log("에러지롱");
      }
    }
  };
  xhr.open("get", "./data/movie.json");
  xhr.setRequestHeader("Content-Type", "application/text");
  xhr.send();
};

main(); //짠!
