let var1 = prompt("ingresa 1:");
let var2 = prompt("ingresa 2:");
let var3 = prompt("ingresa 3:");

const holder = document.getElementById("ejercicio1");

function numerosDescendente(a,b,c){
   const array = [a,b,c];
   array.sort((a,b)=>b-a);
   return array
    
}

function numerosAscendente(a,b,c){
    const array = [a,b,c]
    array.sort((a,b)=>a-b);
    return array
}

newArray1 = numerosDescendente(var1,var2,var3)
newArray2 = numerosAscendente(var1,var2,var3)

const [a,b,c]=newArray1
const [d,e,f]=newArray2

holder.textContent =`Ingresaste los números: ${var1}, ${var2}, ${var3}. 
El orden descendente es ${a}, ${b}, ${c} y el ascencente es ${d}, ${e}, ${f} `



