console.log('Javascript Function');

//alert("This is alert");
// Browser API


const result = prompt("What is your name");

//code
function greet(name) {
    return `Hello, my name is ${name}`;
}




console.log(greet(result));

function add(a, b) {
    return a + b;
}
console.log(add(5, 6));
function introduce(name, age) {
    console.log(`My names ${name} and i'm ${age} years old`);

}
introduce("Khongoroo, 25");

function printSum(a, b) {
    console.log(a + b);
}

const printSumResult = print(5, 6);
console.log(printSumResult);

const minus = function(a, b) {
    return a - b;

}
console.log(minus(10, 5));

const subtract = (a, b) => {
    return a - b;
}
console.log(subtract(10, 6));


function divide(a, b) {
    return a / b;
}
console.log(divide(4, 2));


function multiply(a, b) {
    return a * b;
}
console.log(multiply(5, 5));


const circleArea = (radius) => {
    return 2 * 3.14 * radius;
}
console.log(circleArea(5));

const power = function(base, exponent) {


    let result = 1;

    for (let i = 1;i <= exponent;i++) {
        result = result * base;
    }
    return result;
}
console.log(power(8, 2));


console.log("===================");
console.log("Object Literal");

const student = {
	name: "Sarah",
	age: 20
};
console.log(student);

const mixedObject = {
	name: "Dog",
	gender: "male",
	age: 5,
	isBig: false,
	weight: 5.6,
	kids:["Shiro", "Kuro", "Ao", "Aka"]
}
console.log(mixedObject);

console.log(mixedObject.age = 10);
const complicateObject = {
	"high-grade":95,
	"low-grade":45
}
console.log(complicateObject["high-grade"]);

mixedObject.name = "Cat";

complicateObject["high-grade"] = 85;
console.log(complicateObject);

const funcObject = {
	name: "Bird",
	color: "Black",
	say: function(){
		console.log("Guag Guag");
	}
}
funcObject.say();

console.log("Exercises");


function max (a, b) {
	if (a > b) {
		return a;
	}
	else {
		return b;
	}
}
console.log(max(8, 10));

function gradeLabel(score) {
	if (score >= 90) { 
		return "A";
	}
	   else if (score >= 80) {
		 return "B";
		 }
	   else if (score >= 70) {
		 return "C";
		 }
	   else if (score >= 60){
		 return "D";
		 }
	    else { 
			return "F";
			}
}
console.log(gradeLabel(95));
