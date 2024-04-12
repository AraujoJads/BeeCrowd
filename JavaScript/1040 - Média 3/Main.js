var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var mesmalinha = lines.shift().split(" ");

var A = parseFloat(mesmalinha[0]);
var B = parseFloat(mesmalinha[1]);
var C = parseFloat(mesmalinha[2]);
var D = parseFloat(mesmalinha[3]);

var E = parseFloat(lines.shift());

result = ((A * 2) + (B * 3) + (C * 4) + (D * 1)) / 10;
if(result >= 7.0){
    console.log("Media: " + result.toFixed(1));
    console.log("Aluno aprovado.");
}
else if(result < 5.0){
    console.log("Media: " + result.toFixed(1));
    console.log("Aluno reprovado.");
}
else{

    resultado = (result + E) / 2;
    console.log("Media: " +result.toFixed(1));
    console.log("Aluno em exame.");
    console.log("Nota do exame: " +E.toFixed(1));
    if(resultado >= 5.0){
        console.log("Aluno aprovado.");
        console.log("Media final: " +resultado.toFixed(1));
    }
    else{
        console.log("Aluno reprovado.");
        console.log("Media final: " +resultado.toFixed(1));
    }
    
}