var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var e=lines.shift().split(' ');
var f =[];
for (var i of e){
    i=parseInt(i);
    f.push(i);
}
var [a,b,c, d] = f;
var ttm = (c-a)*60 + (d-b);
if (ttm <=0){
    ttm += 24*60;
}
console.log(`O JOGO DUROU ${parseInt(ttm/60)} HORA(S) E ${ttm%60} MINUTO(S)`);