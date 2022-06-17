const num1 = Math.ceil(Math.random() * 10);
const num2 = Math.ceil(Math.random() * 10);
const formEl = document.getElementById("form");
const inputEl = document.getElementById("input");
const quesEl = document.getElementById("question");
let score = JSON.parse(localStorage.getItem("score"));
if (!score) {
    score = 0;
}
const scoreEl = document.getElementById("score");
scoreEl.innerText = `Score: ${score}`;
quesEl.innerText = `What is ` + num1 + ` multiply by ` + num2 + `?`;
const corrAns = num1 * num2;
formEl.addEventListener("submit", () => {
    const userAns = +inputEl.value;
    if (userAns === corrAns) {
        score++;
        updateLocalStorage();

    }
    else {

        score--;
        updateLocalStorage();
    }
});

function updateLocalStorage() {
    localStorage.setItem("score", JSON.stringify(score));

}