const varf = prompt("Ingresa el número secreto: ")

!isNaN(varf)?aux = true: aux = false

while(!aux){
    alert("Ese no es un numero")
    varf = prompt("Ingresa el número secreto: ")

    !isNaN(varf)?aux = true: aux = false
}

const numvarf = parseInt(varf)

/*(numvarf>0 && numvarf<=100)?aux1 =true: aux1 = false
console.log(aux1)
while(!aux1){
    alert("Debe ser un número entre 1 y 100")
    varf = prompt("Ingresa el número secreto: ")

    (varf>0 && varf<=100)?aux1 =true: aux1 = false
}*/

var numeroAleatorio = Math.floor(Math.random() * 100) + 1;

numeroAleatorio === varf? tex="Felicidades!!! Le atinaste": tex="Lo siento, suerte para la próxima :("

const holder = document.getElementById("ejercicio5")

holder.textContent=`${tex}. El número era ${numeroAleatorio}`