class Pessoa(val nome: String, val idade: Int)

object TuplasFunc {
  val listaPessoas = List( new Pessoa("Joao", 21),
                           new Pessoa("Maria", 17), 
                           new Pessoa("Silva", 25))

  def main(args: Array[String]) {
    val resultado = listaPessoas.partition( pessoa => pessoa.idade < 18)
    println("maiores: "+ resultado._1)
    println("menores: "+ resultado._2) 
  }
}

// vim: set ts=4 sw=4 et:
