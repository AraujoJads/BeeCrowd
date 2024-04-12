var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
var numin = 0;
var numout = 0;

for(i = 1; i <= N; i++){
    var num = parseInt(lines.shift());
    if(num >= 10 && num <= 20){
        numin = numin + 1;
    }
    else{
        numout = numout + 1;
    }
}
console.log(numin + " in");
console.log(numout + " out");