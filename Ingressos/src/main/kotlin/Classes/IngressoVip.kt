package Classes

//2) Crie uma classe IngressoVip, que herda de Ingresso e possui um valor adicional.
//   Sobrescreva a função imprimeValor(), para que faça a impressão do valor do
//   ingressoVip, que é acrescido de um adicional e concatenado com o texto: “Ingresso Vip”.

class IngressoVip(valor: Double = 150.00) : Ingresso(valor) {

    override fun imprimeValor(): String {
        valor += 150.00
        return "Ingresso Vip: R$$valor"
    }

}