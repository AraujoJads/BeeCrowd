var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var prompt = function(texto){ return lines.shift()};

var maior=0
var pos=1

for(var i =1;i<=100;i++){
    var N=parseInt(prompt())
    if(N>maior){
        maior=N
        pos=i
    }
}
console.log(maior)
console.log(pos)
