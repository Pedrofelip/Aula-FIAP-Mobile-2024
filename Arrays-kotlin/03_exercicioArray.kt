//Exercicio 3: Média dos elementos

fun main(){
    val values = doubleArrayOf(12.5,9.8,8.3,15.2,18.7,20.0) //Array de double
    var sum = 0.0 //variavel para armazenar a soma

    //Loop para somar os elementos de array
    for(value in values){
        sum += value
    }

    val average = sum / values.size //calcula a media
    println("A media: $average") //impressão da media
}