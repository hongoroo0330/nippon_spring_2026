const button = document.querySelector("button")
button.addEventListener("click", () => { 
    alert("Сайн байна уу!!")
})
const input = document.getElementById("nameInput")
        const button02 = document.getElementById("Btn")
        const greeting = document.getElementById("greeting")

        button02.addEventListener("click", () => {
            const name = input.value
            if (name) {
                greeting.textContent = `Сайн байна уу, ${name}!`
            } else {
                greeting.textContent = "Нэр оруулна уу!"
            } 
        })


        const input02 = document.getElementById("textInput")
        const button03 = document.getElementById("Btn02")
        const result = document.getElementById("result")

        button03.addEventListener("click", () => {
            const text = input.value
            const reversed = text.split("").reverse().join("")

            result.textContent = reversed
        })