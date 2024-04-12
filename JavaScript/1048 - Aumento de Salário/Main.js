var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var salario_inicial = parseFloat(lines.shift());
if (salario_inicial>0 && salario_inicial<=400){
    console.log(`Novo salario: ${(salario_inicial*1.15).toFixed(2)}`)
    console.log(`Reajuste ganho: ${(salario_inicial*0.15).toFixed(2)}`)
    console.log(`Em percentual: 15 %`)
}else if (salario_inicial>400 && salario_inicial<=800){
    console.log(`Novo salario: ${(salario_inicial*1.12).toFixed(2)}`)
    console.log(`Reajuste ganho: ${(salario_inicial*0.12).toFixed(2)}`)
    console.log(`Em percentual: 12 %`)
}else if (salario_inicial>800 && salario_inicial<=1200){
    console.log(`Novo salario: ${(salario_inicial*1.10).toFixed(2)}`)
    console.log(`Reajuste ganho: ${(salario_inicial*0.10).toFixed(2)}`)
    console.log(`Em percentual: 10 %`)
}else if (salario_inicial>1200 && salario_inicial<=2000){
    console.log(`Novo salario: ${(salario_inicial*1.07).toFixed(2)}`)
    console.log(`Reajuste ganho: ${(salario_inicial*0.07).toFixed(2)}`)
    console.log(`Em percentual: 7 %`)
}else if (salario_inicial>2000){
    console.log(`Novo salario: ${(salario_inicial*1.04).toFixed(2)}`)
    console.log(`Reajuste ganho: ${(salario_inicial*0.04).toFixed(2)}`)
    console.log(`Em percentual: 4 %`)
}