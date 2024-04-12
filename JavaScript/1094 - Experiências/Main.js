var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());

resultado = 0;
resultado1 = 0;
resultado2 = 0;
geral = 0;
for(i = 0; i <= N; i++){
    
    var mesmalinha = lines.shift().split(" ");
    var quantia = parseInt(mesmalinha[0]);
    var animal = String(mesmalinha[1]);
    if(quantia <= 15 && quantia >= 1){
        if(animal == 'C'){
            resultado = resultado + quantia;
        }
        if(animal == 'R'){
            resultado1 = resultado1 + quantia;
        }
        if(animal == 'S'){
            resultado2 = resultado2 + quantia;
        }
        geral = geral + quantia;
    }
}
console.log("Total: " + geral + " cobaias");
console.log("Total de coelhos: " + resultado);
console.log("Total de ratos: " + resultado1);
console.log("Total de sapos: " + resultado2);
porcentagem1 = 100 * resultado / geral;
porcentagem2 = 100 * resultado1 / geral;
porcentagem3 = 100 * resultado2 / geral;
console.log("Percentual de coelhos: " + porcentagem1.toFixed(2) + " %");
console.log("Percentual de ratos: " + porcentagem2.toFixed(2) + " %");
console.log("Percentual de sapos: " + porcentagem3.toFixed(2) + " %");
