var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var senha = 2002;
var tentativa = parseInt(lines.shift());

while(senha != tentativa){
    console.log('Senha Invalida');
    tentativa = parseInt(lines.shift());
}
console.log('Acesso Permitido');