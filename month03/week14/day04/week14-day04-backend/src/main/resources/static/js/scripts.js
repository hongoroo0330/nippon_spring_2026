///
const cource = "Java Fullstack";

function printCource(){
	console.log(cource);
}

printCource();



function makeMessage(name){
	const message = `Hello, ${name}`;
	
	return message;
}




const message = "Secret";

function printMessage(){
	console.log(message);
}

console.log(message);


if (true){
	const status = "inside block";
	let count = 1;
}




const double = (number) => {
	return number * 2;
}

console.log(double(4));

const doubleImplicit = number => number * 2

console.log(doubleImplicit(4));

const add = (a, b) => a + b;
console.log(add(5, 10));

const createStudent = (name, score) => ({name, score});
console.log(createStudent("Khangaikhuu", 100));


const studentNames = ["Dorjoo", "Saraa", "Boldoo"];
const upperNames = studentNames.map(s => s.toUpperCase());
console.log(upperNames);




const scores = [55, 80, 92, 40];
const passingScores = scores.filter(score => score >= 60);
console.log(passingScores);



let sumScores = 0;

for(let s of scores){
	sumScores += s;
}
console.log(sumScores);

const total = scores.reduce((sum, score) => sum + score, 0);
console.log(total);

console.log("Exercises");

const students = [
    { name: "Bataa", score: 82, program: "java" },
    { name: "Saraa", score: 94, program: "web" },
    { name: "Dorj", score: 58, program: "java" },
    { name: "Naraa", score: 76, program: "web" }
];

const getNames = (students) => { 
	return students.map (student => student.name);
	}
	console.log(getNames(students));
	

    
	 
const getPassingStudents = (students) => {
	return students.filter(student => student.score >= 60);
	
};	 
console.log(getPassingStudents((students).length));
