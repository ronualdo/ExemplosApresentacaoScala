object ProcessarLista02 {
  
  def main(args: Array[String]){
    println("dobro: "+ toString(dobrarLista(args)))
    println("potencia: "+ toString(potenciarLista(args)))
    println("metade: "+ toString(dividirLista(args)))
  }

  def toString(lista: Seq[_]) = {
    lista.mkString(", ")
  }

  def dobrarLista(args: Array[String]) = {
    for {
      arg <- args
    } yield arg.toDouble * 2
  }

  def potenciarLista(args: Array[String]) = {
    for {
      arg <- args
    } yield scala.math.pow(arg.toDouble, 2)
  }

  def dividirLista(args: Array[String]) = {
    for {
      arg <- args
    } yield arg.toDouble / 2
  }

}

// vim: set ts=4 sw=4 et:
