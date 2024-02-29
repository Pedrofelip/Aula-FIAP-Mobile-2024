//Exercicio 1: Soma dos elementos

fun main(){
    //Array de inteiros
    val numbers = intArrayOf(5,10,15,20,25) //val = imutavel
    var sum = 0 //variavel para armazenar a soma // mutável

    //Loop para somar os elementos da array
    for(number in numbers){
        sum += number
    }

    //imprimindo o resultado
    println("A soma dos elementos e $sum")
}