var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


var C, D;
var[A, B] = lines.shift().split(' ').map(Number);
C = B - A;
if(C <= 0){
    D = 24 + C;
    console.log(`O JOGO DUROU ${D} HORA(S)`);
}
else{
    console.log(`O JOGO DUROU ${C} HORA(S)`);
}