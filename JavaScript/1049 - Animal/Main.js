var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto){return lines.shift()};



var A = String(prompt());


switch(A){
    case "vertebrado":
        var B = String(prompt());
        switch(B){
            case "ave":
                var C = String(prompt());
                if(C == "carnivoro"){
                    console.log("aguia");
                }
                else{
                    console.log("pomba");
                }
                break;
            case "mamifero":
                var C = String(prompt());
                if(C == "onivoro"){
                    console.log("homem");
                }
                else{
                    console.log("vaca");
                }
                break;
            
            default:
                console.log("não tem");
            

        }
        break;
    case "invertebrado":
    var B = String(prompt());
        switch(B){
            case "inseto":
                var C = String(prompt());
                if(C == "hematofago"){
                    console.log("pulga");
                }
                else{
                    console.log("lagarta");
                }
                break;
            case "anelideo":
                var C = String(prompt());
                if(C == "hematofago"){
                    console.log("sanguessuga");
                }
                else{
                    console.log("minhoca");
                }
                break;
            
            default:
                console.log("não tem");
            }
         break;

    default:
        console.log("não tem");
    
    
        
    
}


