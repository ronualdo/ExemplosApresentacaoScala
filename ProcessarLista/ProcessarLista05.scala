object ProcessarLista05 {
  
  def main(args: Array[String]) {
    val processamentoLista = processarLista(args)_

    println("dobro "+ processamentoLista( (argumento: String) => argumento.toDouble * 2))
    println("potencia "+ processamentoLista( (argumento: String) => scala.math.pow( argumento.toDouble, 2)))
    println("metade "+ processamentoLista( (argumento: String) => argumento.toDouble / 2))

  }

  def toString(lista: Seq[_]) = {
    lista.mkString(", ")
  }

  def processarLista(lista: Seq[String]) (operacao: (String) => Double) = {
    toString( lista.map(operacao) )
  }
}

// vim: set ts=4 sw=4 et:
