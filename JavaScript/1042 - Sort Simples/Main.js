var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


values = lines.shift().split(' ');

a = parseInt(values.shift());
b = parseInt(values.shift());
c = parseInt(values.shift());

if (a < b && a < c) {
    console.log(a);
    if (b < c) {
        console.log(b);
        console.log(c);
    } 
    else {
        console.log(c);
        console.log(b);
    }
}

else if (b < c) {
    console.log(b);
    if (a < c) {
        console.log(a);
        console.log(c);
    }
    else {
        console.log(c);
        console.log(a);
    }
}

else {
    console.log(c);
    if (a < b) {
        console.log(a);
        console.log(b);
    }
    else {
        console.log(b);
        console.log(a);
    }
}

console.log('');
console.log(a);
console.log(b);
console.log(c);