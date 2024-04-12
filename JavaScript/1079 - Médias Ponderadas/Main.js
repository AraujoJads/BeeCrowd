var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());


for(i = 1; i <= N; i++){
    var mesmalinha = lines.shift().split(" ");
    var num1 = parseFloat(mesmalinha[0]);
    var num2 = parseFloat(mesmalinha[1]);
    var num3 = parseFloat(mesmalinha[2]);
    
    resultado = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;
    console.log(resultado.toFixed([1]));
}
