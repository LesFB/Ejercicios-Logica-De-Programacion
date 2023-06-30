const varf = prompt("Ingresa un número: ")

!isNaN(varf)?aux = true: aux = false

while(!aux){
    alert("Ese no es un numero")
    varf = prompt("Ingresa un número: ")

    !isNaN(varf)?aux = true: aux = false
}

numvarf = parseInt(varf)

function fibonacci(n){
    a = 0
    b = 1
    array = [1]
    for (i=1;i<n;i++){
        
        c = a+b
        a =b
        b =c
        array.push(b)
    }
    return array
}
newArray = fibonacci(varf)
string = newArray.join(",")


const holder = document.getElementById("ejercicio4");
holder.textContent=`Pediste los primeros ${varf} puestos de la serie y son: ${string}`
