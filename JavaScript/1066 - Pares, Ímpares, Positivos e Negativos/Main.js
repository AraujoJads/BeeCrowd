var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = 0;
var positivo = 0;
var negativo = 0;
var par = 0;
var impar = 0;

for(i = 1; i <= 5; i++){
    var num = parseInt(lines.shift());
    if(num > 0){
        positivo = positivo + 1;
    }
    if(num < 0){
        negativo = negativo + 1;
    }
    if(num % 2 === 0){
        par = par + 1;
    }
    if(num % 2 !== 0){
        impar = impar + 1;
    }
}
console.log(par + ' valor(es) par(es)');
console.log(impar + ' valor(es) impar(es)');
console.log(positivo + ' valor(es) positivo(s)');
console.log(negativo + ' valor(es) negativo(s)');