var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var prompt = function(texto){ return lines.shift()};

var N = parseInt(prompt());
var anterior = 0;
var atual = 1;
var resposta = '0';

for(var i = 1; i<N; i++){
    resposta += " "+atual
    var a = anterior + atual
    anterior = atual
    atual = a
}

console.log(resposta)