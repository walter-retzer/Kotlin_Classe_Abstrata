package Classes

//  1) Crie uma classe chamada Ingresso que possui um valor em reais, valor que deve
//  ser definido na própria classe Ingresso, e uma função imprimeValor(). A classe
//  Ingresso não poderá ser instanciada.

abstract class Ingresso(var valor: Double) {

    abstract fun imprimeValor(): String
}