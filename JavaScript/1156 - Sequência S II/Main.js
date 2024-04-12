var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var prompt = function(texto){ return lines.shift()};

var s = 6;
console.log(s.toFixed(2));