var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var mesmalinha = lines.shift().split(" ");
    var X = parseInt(mesmalinha[0]);
    var Y = parseInt(mesmalinha[1]);

while(X !== 0 && Y !== 0){
    if(X > 0 && Y > 0){
        console.log('primeiro');
    }
    else if(X > 0 && Y < 0){
        console.log('quarto');
    }
    else if(X < 0 && Y < 0){
        console.log('terceiro');
    }
    else if(X < 0 && Y > 0){
        console.log('segundo');
    }
    var mesmalinha = lines.shift().split(" ");
    var X = parseInt(mesmalinha[0]);
    var Y = parseInt(mesmalinha[1]);
}