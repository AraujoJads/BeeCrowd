var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var linhas = input.split('\n');

var nome = linhas.shift();

var salarionormal = parseFloat(linhas.shift());

var vendas = parseFloat(linhas.shift());

var comissao = vendas * 0.15;

var salariofinal = salarionormal + comissao;

console.log("TOTAL = R$ " + salariofinal.toFixed(2));