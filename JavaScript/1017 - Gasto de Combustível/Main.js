const input = require('fs').readFileSync('/dev/stdin', 'utf8');

const [tempo, velocidade] = input.split("\n");

const percorrido = tempo * velocidade;

const combustivel = percorrido / 12;

console.log(combustivel.toFixed(3));