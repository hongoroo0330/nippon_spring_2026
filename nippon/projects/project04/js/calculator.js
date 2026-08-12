const buttons = document.querySelectorAll("button");
console.log(buttons);
const one = buttons[12];
const two = buttons[13];
const three = buttons[14];
const four = buttons[8];
const five = buttons[9];
const six = buttons[10];
const zero = buttons[16];
const seven = buttons[4];
const eight = buttons[5];
const nine = buttons[6];
const plus = buttons[15];
const multiply = buttons[7];
const subtract = buttons[11];
const divide = buttons[3];
const equal = buttons[18];
const dot = buttons[17];
const AC = buttons[0];
const C = buttons[1];
const precent  = buttons[2];

const output = document.querySelector("#output");

let outputString = "";

let first = '';
let operator = "";

//add event listener function


function appenNumber(num){
      console.log('button seven clicked')
    outputString += num;
    output.textContent = outputString;
}


seven.addEventListener('click', function() {
 appenNumber(7);
});
one.addEventListener('click', function() {
 appenNumber(1);
});
two.addEventListener('click', function() {
   appenNumber(2);
});
three.addEventListener('click', function() {
    appenNumber(3);
});
four.addEventListener('click', function() {
  appenNumber(4);
});
five.addEventListener('click', function() {
   appenNumber(5);
});
six.addEventListener('click', function() {
  appenNumber(6);
});
zero.addEventListener('click', function() {
    appenNumber(0);
});
eight.addEventListener('click', function() {
appenNumber(8);
});
nine.addEventListener('click', function() {
appenNumber(9);
});


//operators

function chooseOperator(op){
    if(outputString === "") return;
    first = parseFloat(outputString);
    operator = op;
    outputString = "";
}

plus.addEventListener('click', function() {
  appenNumber("+");
    chooseOperator("+");
});

multiply.addEventListener('click', function() {
    chooseOperator("*");
});

divide.addEventListener('click', function() {
    chooseOperator("/");
});
dot.addEventListener('click', function() {
if(!outputString.includes(".")){
    appenNumber(".");
}
});
subtract.addEventListener('click', function() {
   chooseOperator("-");
});
AC.addEventListener('click', function() {
   outputString = "";
   first = "";
   operator = "";
   output.textContent = "0";
});
C.addEventListener('click', function () {
  outputString = "";
  output.textContent = "0";
});
precent.addEventListener('click', function(){
  chooseOperator("%");
});


equal.addEventListener('click', function() {
    if (operator === "" || outputString === "") return;

    let second = parseFloat(outputString);
    let result = 0;

    switch(operator) {
      case "+":
        result = first + second;
        break;
      case "-":
        result = first - second;
        break;
      case "*":
        result = first * second;
        break;
      case "/":
        result = first / second;
        break;
      case "%":
        result = first % second;
        break;
      default:
        break;   
        
    }
    output.textContent = result;
    outputString = result.toString();
    operator = "";
   
   
});
