fun main(){
    val precoCoxinha: Double = 5.0
    val precoCerveja: Double = 15.0
    var quantidadeCoxinha: Int = 3
    var quantidadeCerveja: Int = 2
    var somaCoxinha = (precoCoxinha*quantidadeCoxinha)
    var somaCerveja = (precoCerveja*quantidadeCerveja)
    val total = (somaCerveja + somaCoxinha)
    val taxa = (total*0.1)
    val totalComTaxa = (total*0.1 + total)

    println("------------------------")
    println("  Lanchonete do vinny   ")
    println("------------------------")
    println("$quantidadeCoxinha coxinha      R$ $somaCoxinha")
    println("$quantidadeCerveja cerveja      R$ $somaCerveja")
    println("Somatoria      R$ $total")
    println("Taxa 10%       R$ $taxa")
    println("------------------------")
    println("Conta final      R$ $totalComTaxa")

}