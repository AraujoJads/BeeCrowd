var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var [a, b, c] = lines.shift().split(' ').map(Number);
var a2, b2, c2;
a2 = Math.pow(a,2);
b2 = Math.pow(b,2);
c2 = Math.pow(c,2);
var i = 0
var j = 0 
var t = 0
if (a>=b+c || b>=a+c|| c>=a+b){
    i ++
    console.log('NAO FORMA TRIANGULO')
}else if (i === 0){
    if  (a2===b2+c2 || b2===a2+c2|| c2===a2+b2){
        t ++
        console.log('TRIANGULO RETANGULO')
        if (a==b||b==c||c==a){
            console.log('TRIANGULO ISOSCELES')
        }
    }if (a2>b2+c2 || b2>a2+c2|| c2>a2+b2){
        if (t === 0){
            j = j+1
            console.log('TRIANGULO OBTUSANGULO')
            if (a==b||b==c||c==a){
            console.log('TRIANGULO ISOSCELES')
            }
        }
    }if (a2<b2+c2 || b2<a2+c2|| c2<a2+b2){
        if (j === 0 && t === 0){
            console.log('TRIANGULO ACUTANGULO')
            if (a==b||b==c||c==a){
                if (a+b+c == a*3){
                console.log('TRIANGULO EQUILATERO')
                }else {
                console.log('TRIANGULO ISOSCELES')
                }
            }
        }
    }
}