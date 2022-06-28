const textAreaEl = document.getElementById("textarea");
const totalCounterEl = document.getElementById("total-counter");
const remaincounterEl = document.getElementById("remaining-counter");

textAreaEl.addEventListener("keyup", () => {
    updateCounter();
})

updateCounter();

function updateCounter() {
    totalCounterEl.innerText = textAreaEl.value.length
    remaincounterEl.innerText = textAreaEl.getAttribute("maxLength") - (textAreaEl.value.length)
} 