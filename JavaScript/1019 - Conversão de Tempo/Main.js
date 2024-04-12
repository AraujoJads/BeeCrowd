const input = require('fs').readFileSync('/dev/stdin', 'utf8');

let segundos = parseInt(input);

const valores = [3600, 60, 1];
const resultado = [];

for (let valor of valores) {
    resultado.push( parseInt(segundos / valor));
    segundos = segundos % valor;

}

console.log(resultado.join(":"));

