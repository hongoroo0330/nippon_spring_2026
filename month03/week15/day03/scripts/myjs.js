const myParagraph = document.getElementById("demo")
myParagraph.innerHTML = "HelloWorld"
console.log(myParagraph)
console.log(myParagraph.innerHTML)
const myButtons = document.getElementsByClassName("btn")
console.log(myButtons.length)
for (let i = 0; i < myButtons.length; i++) {
    console.log(myButtons[i].textContent)
}
const h1 = document.querySelector("h1")
console.log(h1.textContent)
h1.textContent = "Shine Garchig"
const div = document.getElementById("content")
console.log(div.innerHTML)
div.innerHTML = "<strong>Nuur huudas</strong>"
const input = document.querySelector("input")
console.log(input.value)
input.value = "Shine utga"
const button = document.querySelector("button")

button.addEventListener("click", function() {
alert("Darlaa")
})
input.addEventListener("input", (e) => {console.log(e.target.value)})