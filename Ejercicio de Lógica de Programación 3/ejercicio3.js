const varf = prompt("Ingresa un número: ")

!isNaN(varf)?aux = true: aux = false

while(!aux){
    alert("Ese no es un numero")
    varf = prompt("Ingresa un número: ")

    !isNaN(varf)?aux = true: aux = false
}

numvarf = parseInt(varf)


function factorial(n){
    aux =1
    for (i=1;i<=n;i++){
        aux = i*aux
    }
    return aux
}

const m = document.getElementById("ejercicio3")

m.textContent = `Ingresaste el número ${numvarf} y su factorial es ${factorial(numvarf)}`