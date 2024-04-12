var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


var mesmalinha = lines.shift().split(" ");

var prod1 = 4.00;
var prod2 = 4.50;
var prod3 = 5.00;
var prod4 = 2.00;
var prod5 = 1.50;

var A = parseFloat(mesmalinha[0]);
var B = parseFloat(mesmalinha[1]);

if(A == 1){
    if(B == 1){
        result = prod1 * 1;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 2){
        result = prod1 * 2;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 3){
        result = prod1 * 3;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 4){
        result = prod1 * 4;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else{
        result = prod1 * 5;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }
   
}
else if(A == 2){
    if(B == 1){
        result = prod2 * 1;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 2){
        result = prod2 * 2;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 3){
        result = prod2 * 3;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 4){
        result = prod2 * 4;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else{
        result = prod2 * 5;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }
        
}
else if(A == 3){
    if(B == 1){
        result = prod3 * 1;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 2){
        result = prod3 * 2;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 3){
        result = prod3 * 3;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 4){
        result = prod3 * 4;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else{
        result = prod3 * 5;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }
        
}
else if(A == 4){
    if(B == 1){
        result = prod4 * 1;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 2){
        result = prod4 * 2;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 3){
        result = prod4 * 3;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 4){
        result = prod4 * 4;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else{
        result = prod4 * 5;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }
        
}
else{
    if(B == 1){
        result = prod5 * 1;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 2){
        result = prod5 * 2;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 3){
        result = prod5 * 3;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else if(B == 4){
        result = prod5 * 4;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }else{
        result = prod5 * 5;
        console.log("Total: R$ " + result.toFixed(2)) ;

    }
}