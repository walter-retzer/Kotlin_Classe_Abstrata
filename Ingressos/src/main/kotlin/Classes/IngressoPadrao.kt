package Classes

//  3) Crie uma classe IngressoPadrão, que herda de Ingresso e sobrescreva a função
//  imprimeValor(), exibindo um valor original e concatenada com o texto: "Ingresso Padrão".


class IngressoPadrao(): Ingresso() {

    override fun imprimeValor(): String {
        return "Ingresso Padrão: R$${valor}"
    }

}