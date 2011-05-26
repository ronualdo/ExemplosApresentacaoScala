object ProcessarLista03 {
  
  def main(args: Array[String]){
    
    println("dobro: "+ toString(args.map( (argumento: String)  => argumento.toDouble * 2)))    
    println("potencia: "+  toString(args.map( (argumento: String) => scala.math.pow( argumento.toInt, 2 ))))
    println("metade: "+ toString(args.map( (argumento: String) => argumento.toDouble / 2 )))
  }

  def toString(lista: Seq[_]) = {
    lista.mkString(", ")
  }

}

// vim: set ts=4 sw=4 et:
