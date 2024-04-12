var input = require('fs').readFileSync('/dev/stdin', 'utf8');

var dias = parseInt(input);
var anos, meses;

anos = parseInt(dias / 365);
dias = dias % 365;

meses = parseInt(dias / 30);
dias = dias % 30;

var resposta = `${anos} ano(s)
${meses} mes(es)
${dias} dia(s)`;

console.log(resposta);
