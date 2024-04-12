var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var valores = input.split('\n');

    var A = parseInt(valores.shift());
    var B = parseInt(valores.shift());
    
    var resultado = A + B
    
    console.log("SOMA = " + resultado);
    