let query = document.location.search;
let key = query.slice(5);
console.log(key);
const getReviewList = (key) => {
  const reviews = JSON.parse(localStorage.getItem(key));
  console.log(reviews);
  const TBODY = document.querySelector(".review-tbody");
  reviews.forEach((review) => {
    const TR = document.createElement("tr");

    const REVIEW_ID = document.createElement("th");
    REVIEW_ID.setAttribute("scope", "id");
    REVIEW_ID.textContent = review.reviewId;

    const REVIEW_TEXT = document.createElement("td");
    REVIEW_TEXT.textContent = review.reviewText;

    const REVIEW_CREATOR = document.createElement("td");
    REVIEW_CREATOR.textContent = review.reviewCreator;

    TR.appendChild(REVIEW_ID);
    TR.appendChild(REVIEW_TEXT);
    TR.appendChild(REVIEW_CREATOR);

    TBODY.prepend(TR);
    console.log("loaded");
  });
};

getReviewList(key);
