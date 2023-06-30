let temp = prompt("Ingresa temperatura en grados Celsius")

!isNaN(temp)?aux = true: aux = false

while(!aux){
    alert("Ese no es un numero")
    temp = prompt("Ingresa temperatura en grados Celsius")

    !isNaN(temp)?aux = true: aux = false
}

numtemp = parseInt(temp)
const holder = document.getElementById("ejercicio2")

function cambiarTemperatura(var1) {
    const F = (var1 * 9/5) + 32
    const K = var1 + 273.15
    return [F,K]
}

const [a,b]=cambiarTemperatura(numtemp)

holder.textContent = `Ingresaste la temperatura ${temp}°C. Lo equivalente en Fahrenheit es ${a}°F y en Kelvin es ${b}°K`
