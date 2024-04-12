var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function (texto){return lines.shift()}
var n = parseInt(prompt());
var pum = 0;
for(let i = 0; i<n; i++){
    pum = pum + 3;
    console.log(pum-2+' '+(pum-1) + ' ' + pum + " PUM");
    pum++;
}
