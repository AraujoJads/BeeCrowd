var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = 0;
var numfinal = 0;

for(i = 0; i <= 5; i++){
    var num = parseInt(lines.shift());
    if(num % 2 === 0){
        numfinal = numfinal + 1;
    }
}
console.log(numfinal + ' valores pares');
