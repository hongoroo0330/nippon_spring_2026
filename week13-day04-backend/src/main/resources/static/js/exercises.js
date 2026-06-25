console.log('Exercises');

const role = "user";

if (role === "admin") {
    console.log("Зөвшөрөлтэй");
} else if (role === "user") {
    console.log("Энгийн хэрэглэгч");
} else {
    console.log("Танихгүй хэрэглэгч");
}

const game = "PUBG";

switch (game) {
	case "Minecraft":
		console.log("Minecraft блок тоглоом");
		break;
	case "PUBG":
		console.log("Буудлагын тоглоом");
		break;
	case "FIFA":
		console.log("Хөл бөмбөгийн тоглоом");
	default:
		console.log("Танихгүй тоглоом");
}
for(let i = 0; i <= 20; i++) {
	if(i % 2 === 0){
		console.log(i + "Тэгш")
	}else{
		console.log( i + "Сондгой")
	} 
	
}
const names = ["Хонгор", "Сарнай", "Дорж", "Оюунаа"];
for(let i = 0; i < names.length; i++){
	console.log((i + 1) + ". " + names[i]);
}
let total = 0;
let num = 1;
while(num <= 100){
	total = total + num;
	num++;
	
}
console.log("Niit dun:" + total);