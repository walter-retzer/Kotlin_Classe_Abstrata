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

    val scanner = Scanner(System.`in`)
    println(green + "=================Bem Vindo a Bilheteria!================" + reset)
    println(cyan + "Qual ingresso deseja escolher?" + reset)
    println(
        blue +
                """
        1 - Ingresso Padrão: R$150.00
        2 - Ingresso Vip: R$150.00 + valor adicional de R$150.00

    """.trimIndent() + reset
    )
    var retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        var voucher1 = IngressoPadrao().imprimeValor()
        println(yellow + voucher1 + reset)

    } else {
        var voucher2 = IngressoVip().imprimeValor()
        println(red + voucher2 + reset)
    }

}