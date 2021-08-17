package Classes

//   2) Crie uma classe IngressoVip, que herda de Ingresso e possui um valor adicional.
//   Sobrescreva a função imprimeValor(), para que faça a impressão do valor do
//   ingressoVip, que é acrescido de um adicional e concatenado com o texto: “Ingresso Vip”.

class IngressoVip() : Ingresso() {
    var valor_Ad: Double = 200.00
    override fun imprimeValor(): String {
        var valorVip = valor_Ad + valor
        return "Ingresso Vip: R$${valorVip}"
    }

    fun imprimeVip(): String {
        return "Ingresso Vip: R$${valor} + valor adicional de R$${valor_Ad}"
    }

}