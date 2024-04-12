var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var prompt=function(texto) {return lines.shift()};

var flag = 0
var al = 0
gaso = 0
die = 0
while(flag<4){
    var escolha =parseInt(prompt("1.Álcool 2.Gasolina 3.Diesel 4.Fim"))
    while(escolha<1 && escolha>4){
        var escolha =parseInt(prompt("1.Álcool 2.Gasolina 3.Diesel 4.Fim"))
    }
    if(escolha==1){
        al++
    }else if(escolha==2){
        gaso++
    }else if(escolha==3){
        die++
    }else if(escolha==4){
        flag=escolha
    }
}
console.log("MUITO OBRIGADO")
console.log("Alcool: "+al)
console.log("Gasolina: "+gaso)
console.log("Diesel: "+die)