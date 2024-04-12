var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var prompt = function(texto){ return lines.shift()};

var x = parseInt(prompt());
fatorial = 1;
while(x>0){
    fatorial = fatorial*x;
    x--;
}
console.log(fatorial);