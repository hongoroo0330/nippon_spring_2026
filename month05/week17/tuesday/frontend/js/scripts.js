console.log('Promise');

const promise = new Promise(function(resolve, reject) {
    resolve('succes');
});
console.log('promise');

const rejectedPromise = new Promise(function(resolve, reject) {
    reject("failed");
});
console.log(rejectedPromise);

const p = new Promise((resolve, reject) => {
    const score = 40;
    if (score > 50){
        resolve("You win");
    } else {
        reject("You lose");
    }
    
});

console.log(p);

p.then((value) => {
    console.log(value);
}).catch((error) => {
    console.error(error);
})
const loadScore = new Promise((resolve, reject) => {
    const score = 10;
    if (score > 0) {
        resolve(score);
    } else {
        reject("Invalid score");
    }

    
});
loadScore.then((v) => {
    console.log(v);
}).catch(e => {
    console.error(e);
})


function wait(ms) {
    return new Promise(function(resolve, reject) {

        setTimeout(()=> {
            resolve("Waited" + ms + "ms");

        }, ms)
    });
}
console.log(wait(2000));

wait(2000).then(function(msg) {
    console.log(msg);
});
function fetchPlayer(name) {
    return new Promise((resolve, reject) => {
         setTimeout(function(){
            if(Math.random() > 0.3) {
                resolve({name: name, score: 1500});
            } else {
                reject("Server error: could not load" + name);

            }

            
         }, 1000)
        })
    }
    fetchPlayer("Bat")
    .then((player) => {
        console.log(player.name + " has " + player.score + " points ");

    })
    .catch((error) => {
        console.error(error);
    });