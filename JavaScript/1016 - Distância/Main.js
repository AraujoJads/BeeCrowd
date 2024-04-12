var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var temponecessario = (60*input) / 30;

console.log(temponecessario + " minutos");