var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var A, B;
B = ['January', 'February', 'March', 'April','May','June','July','August','September','October','November','December'];
A =parseInt(lines.shift());
console.log(B[A-1]);