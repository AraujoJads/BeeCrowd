var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var valor = 0;
var valorfinal = 0;

for(i = 0; i <= 6; i++){
    var valor = parseInt(lines.shift());
    if(valor % 2 === 0){
        valorfinal = valorfinal + 1;
    }
    
}
console.log(valorfinal + ' valores positivos');