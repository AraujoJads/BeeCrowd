var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var valor = input.split('\n');

var num = parseInt(valor.shift());
    var i = 0;
    if((num > 0) && (num <= 1000) ){
    
        for (i = 0 ; i <= num ; i++) {
            if ((i % 2) !== 0 ) {
                console.log(i);
            }
     }
    }
    

