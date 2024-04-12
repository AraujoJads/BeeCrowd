var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = 0;
var numfinal = 0;
var aux = 0;

for(i = 0; i <= 6; i++){
    var num = parseFloat(lines.shift());
    if(num > 0){
        numfinal = numfinal + 1;
        
        aux = aux + num;
        resultado = aux / numfinal;
        
        
    }
    
}
console.log(numfinal + ' valores positivos');
console.log(resultado.toFixed(1));