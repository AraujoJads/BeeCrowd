const input = require('fs').readFileSync('/dev/stdin', 'utf8');

let valor = parseInt(input);

const notas = [100, 50, 20, 10, 5, 2, 1];

console.log(valor);

for(let nota of notas) {
    let numnotas = parseInt(valor / nota);
    console.log(`${numnotas} nota(s) de R$ ${nota},00`);
    valor = valor % nota;
}

