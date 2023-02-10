const keywords = ["홈트", "전신", "상체", "하체", "복근"];

const getData = (keyword, ulClassName) => {
  const URL = "https://www.googleapis.com/youtube/v3/search";
  const API_KEY = "AIzaSyBKxUDe9As3cDYqYlvwXPaNIDADePZdpuk";
  let endpoint = `${URL}?key=${API_KEY}&part=snippet&q=${keyword}&type=video&maxResults=20`;
  const UL = document.querySelector(ulClassName); //상위 UL 요소 선택
  fetch(endpoint)
    .then((res) => res.json()) //json은 스토리지에 넣을 수 없으니 parse 안 하고 그대로 가지고 옴
    .then((body) => body.items)
    .then((items) =>
      items.forEach((item) => {
        const LI = document.createElement("li"); //리스트 만들기
        // LI.className = `carousel-item`;

        const IMG = document.createElement("img"); //이미지 만들기
        IMG.src = item.snippet.thumbnails.default.url; //이미지 경로 넣기

        const TITLE = document.createElement("h2");
        TITLE.textContent = item.snippet.title; //h2에 영상 제목 넣기

        const CHANNEL = document.createElement("h2");
        CHANNEL.textContent = item.snippet.channelTitle; //h2에 채널 이름 넣기

        const PUBLISH_TIME = document.createElement("p");
        PUBLISH_TIME.textContent = item.snippet.publishTime; //p에 영상 언제 올렸는지 넣기

        const VIEW_REVIEW = document.createElement("a"); //a태그 만들기
        VIEW_REVIEW.setAttribute(
          "href",
          `./reviewList.html?key=${item.id.videoId}`
        );
        VIEW_REVIEW.textContent = "리뷰 보기";

        LI.appendChild(IMG); //a태그 하위에 이미지,
        LI.appendChild(VIEW_REVIEW); //썸네일 누르면 리뷰 페이지로 가도록
        LI.appendChild(TITLE); //li태그 하위에 제목, 채널, 업로드 시간을 삽입
        LI.appendChild(CHANNEL);
        LI.appendChild(PUBLISH_TIME);
        LI.appendChild(VIEW_REVIEW);
        UL.appendChild(LI); //UL 하위에 삽입

        const reviewData = [
          {
            videoId: item.id.videoId,
            reviewId: 0,
            reviewText: "아직 리뷰가 없어요",
            reviewCreator: null,
          },
        ];
        if (!localStorage.getItem(item.id.videoId))
          localStorage.setItem(item.id.videoId, JSON.stringify(reviewData));
        //이니셜 리뷰데이터를...설정합니다...
      })
    ); //검색어와, 상위 ul 클래스명을 입력하면 자동으로 검색해서 결과를 뿌려준다.
};
getData(keywords[0], ".mostly-viewed-videos-ul"); //홈페이지 로딩했을 때 영상 뿌려주기

const BTN_PART1 = document.querySelector(".part1");
const BTN_PART2 = document.querySelector(".part2");
const BTN_PART3 = document.querySelector(".part3");
const BTN_PART4 = document.querySelector(".part4");

BTN_PART1.addEventListener("click", () => {
  getData(keywords[1], ".select-part-videos-ul");
});
BTN_PART2.addEventListener("click", () => {
  getData(keywords[2], ".select-part-videos-ul");
});
BTN_PART3.addEventListener("click", () => {
  getData(keywords[3], ".select-part-videos-ul");
});
BTN_PART4.addEventListener("click", () => {
  getData(keywords[4], ".select-part-videos-ul");
});
