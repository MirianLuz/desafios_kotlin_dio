import kotlin.math.pow

fun main() {
    var a: Float?
    var b: Float?

    do{
        println("Digite o primeiro número: ")
        a= readLine()?.toFloat()
        println("Digite o segundo número: ")
        b= readLine()?.toFloat()
        if(a == 0F || b == 0F) println("Números inválidos. Tente novamente")
    }while(a == 0F && b==0F)

    println("Esclha a operação: ")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    println("5 - Potenciação")
    println("6 - Fatorial")
    val operacao: Int? = readLine()?.toInt()

    when(operacao){
        1 -> soma(a,b)
        2 -> subtracao(a,b)
        3 -> multiplicacao(a,b)
        4 -> divisao(a,b)
        5 -> potenciacao(a,b)
        6 -> fatorial(a)
    }

}

fun soma(a: Float?, b: Float?) {
    val resultado = a!!.plus(b!!)
    println("O resultado da soma de $a * $b é: $resultado")
}

fun subtracao(a: Float?, b: Float?) {
    val resultado = a!!.minus(b!!)
    println("O resultado da subtração de $a * $b é: $resultado")
}

fun multiplicacao(a: Float?, b: Float?){
    val resultado = a!!*b!!
    println("O resultado da multiplicação de $a * $b é: $resultado")
}

fun divisao(a: Float?,b: Float?){
    val resultado = a!!.div(b!!)
    println("O resultado da divisão de $a * $b é: $resultado")
}

fun potenciacao(a: Float?,b: Float?) {
    val i: Int? = 0
    var resultado:Float = 1.0F

    for(i in 1..b!!.toInt())
        resultado = resultado*a!!

    println("O resultado de $a elevado a $b potência é: $resultado")

}

fun fatorial(a: Float?) {
    var resultado: Float = 1.0F

    for(i in a!!.toInt() downTo 1 )
        resultado = resultado * i

    println("O resultado do fatorial de $a é: $resultado")
}

