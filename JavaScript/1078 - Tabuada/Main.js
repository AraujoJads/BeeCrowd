var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());

if(N > 2 && N < 1000){
    for(i = 1; i <= 10; i++){
        resultado = i * N;
        console.log(i + " x " + N +  " = " + resultado);
    }
}