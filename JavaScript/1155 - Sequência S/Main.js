var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

soma=0;
for(i=1;i<=100;i++){
    soma+=(1/i);
}
console.log(soma.toFixed(2));