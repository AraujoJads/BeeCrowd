var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var valores = input.split('\n');

var funcionario = valores.shift();
var horas = valores.shift();
var valorhora = valores.shift();

var salario = horas * valorhora;

console.log("NUMBER = " + funcionario);
console.log("SALARY = U$ " + salario.toFixed(2));