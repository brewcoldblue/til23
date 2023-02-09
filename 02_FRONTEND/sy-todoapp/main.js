function getData() {
  fetch("./assets/data.json")
    .then((res) => res.json())
    .catch((e) => console.log(e, "에러났읍니다"));
}
