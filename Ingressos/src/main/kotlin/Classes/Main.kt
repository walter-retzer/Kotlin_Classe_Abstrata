package Classes

import java.util.*

fun main() {

    Bilheteria()
}

fun Bilheteria() {

    val red = "\u001b[31m"
    val green = "\u001b[32m"
    val yellow = "\u001b[33m"
    val blue = "\u001b[34m"
    val cyan = "\u001b[36m"
    val reset = "\u001b[0m"

    var voucher1 = IngressoPadrao().imprimeValor()
    var voucher2 = IngressoVip().imprimeValor()

    val scanner = Scanner(System.`in`)
    println(green + "=================Bem Vindo a Bilheteria!================" + reset)
    println("--------------------------------------------------------")
    println(cyan + "Qual ingresso deseja escolher?" + reset)
    println(
        blue +
                """
        [1] - ${IngressoPadrao().imprimeValor()}  
        [2] - ${IngressoVip().imprimeVip()} 
    """.trimIndent() + reset
    )

    println("--------------------------------------------------------")
    println("")
    var retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        println(yellow + voucher1 + reset)
    } else {
        println(red + voucher2 + reset)
    }

}