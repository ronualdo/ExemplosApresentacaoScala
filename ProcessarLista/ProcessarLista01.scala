object ProcessarLista01 {
  
  def main(args: Array[String]){
    println("dobro: "+ toString(dobrarLista(args)))
    println("potencia: "+ toString(potenciarLista(args)))
    println("metade: "+ toString(dividirLista(args)))
  }

  def toString(lista: Seq[_]) = {
    lista.mkString(", ")
  }

  def dobrarLista(args: Array[String]) = {
    var resultado: List[Double] = List()
    for(arg <- args){
      resultado = resultado:+arg.toDouble*2
    }
    resultado
  }

  def potenciarLista(args: Array[String]) = {
    var resultado: List[Double] = List()
    for (arg <- args) {
      resultado = resultado:+scala.math.pow(arg.toDouble, 2)
    }
    resultado
  }

  def dividirLista(args: Array[String]) = {
    var resultado: List[Double] = List()
    for (arg <- args) {
      resultado = resultado:+arg.toDouble/2
    }
    resultado
  }

}

// vim: set ts=4 sw=4 et:
