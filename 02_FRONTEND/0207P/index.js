const Z = document.querySelectorAll(".zzim");

const T = document.querySelectorAll(".title");
const G = document.querySelectorAll(".genre");
const A = document.querySelectorAll(".actor");
const R = document.querySelectorAll(".runningtime");

Z.forEach((z, idx) => {
  z.addEventListener("click", (e) => {
    console.log(
      idx,
      T[idx].textContent,
      G[idx].textContent,
      A[idx].textContent,
      R[idx].textContent
    );
  });
});

(() => console.log("엥 이게 된다고?"))();
