var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var prompt = function(texto){ return lines.shift()};

soma = 0;
quant = 0;

 while(true){
     idade = parseInt(prompt());
     if(idade<0){
         break;
     } else{
         soma += idade;
         quant += 1;
     }
 }
 console.log((soma/quant).toFixed(2));