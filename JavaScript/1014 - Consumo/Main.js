const input = require('fs').readFileSync('/dev/stdin', 'utf8');

const [distancia, combustivel] = input.split("\n");


const consumo = distancia / combustivel;

console.log(consumo.toFixed(3) + " km/l");