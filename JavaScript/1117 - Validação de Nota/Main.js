var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto){ return lines.shift()};

var avaliacoes = 1;
var somaavaliacoes = 0;
while(avaliacoes <= 2){
    var nota = Number(prompt());
    var resultado = nota < 0 || nota > 10 ? "nota invalida" : "nota valida";
    if(resultado == "nota valida"){
        somaavaliacoes += nota;
        avaliacoes++;
    }
    else{
        console.log(resultado);
    }
}
var media = somaavaliacoes / 2;
console.log("media = " + media.toFixed(2));