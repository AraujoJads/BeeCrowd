var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());

for(i = 0; i <= 10000; i++){
    if(i % N === 2){
        console.log(i);
    }
}