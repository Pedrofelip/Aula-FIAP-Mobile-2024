//Exercicio 2: Maior e Menor Elemento

fun main(){
    val numbers = intArrayOf(8,3,12,6,20)
    var max = numbers[0] //variavel para armazenar o maior elemento
    var min = numbers[0] //variavel para armazenar o menor elemento

    //Loop para encontrar o menor e o maior elemento

    for(number in numbers){
        if(number < min){
            min = number
        }
        if(number > max){
            max = number
        }
    }

    println("o menor elemento é: $min")
    println("o maior elemento é: $max")
}