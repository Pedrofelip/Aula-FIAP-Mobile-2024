//Exercicio 4: Buscando elementos do Array

fun main(){
    //Array de strings

    val names = arrayOf("Mariana","Beatriz","Kaue","Lucas")
    val serchName = "Kaue" //elemento a ser buscando
    var found = false //Variavel para verificar se o elemento foi encontrado

    //Loop para verificar se o elemento esta presente

    for(name in names){
        if(name == serchName){
            found = true
            break
        }
    }
     if(found){
        println("$serchName foi encontrado o array")
     }else{
        println("$serchName não foi encontrado o array")
     }
}