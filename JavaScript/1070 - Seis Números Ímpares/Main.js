var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
for(i = 0 ; i < 12; i++){
    resultado = x + i;
    if(resultado % 2 !== 0){
        console.log(resultado);
        
    }
}