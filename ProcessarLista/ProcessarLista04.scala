object ProcessarLista04 {
  
  def main(args: Array[String]) {
    println(aplicarFuncao(args, (argumento: String) => argumento.toDouble * 2 ))
    println(aplicarFuncao(args, (argumento: String) => scala.math.pow( argumento.toInt, 2 )))
    println(aplicarFuncao(args, (argumento: String) => argumento.toDouble / 2 ))
  }

  def toString(lista: Seq[_]) = {
    lista.mkString(", ")
  }

  def aplicarFuncao(lista: Seq[String], operacao: (String) => Double) = {
    toString( lista.map(operacao) )
  }
}

// vim: set ts=4 sw=4 et:
