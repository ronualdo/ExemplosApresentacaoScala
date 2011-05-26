import scala.collection.mutable.Set

class Pessoa(val nome: String, val idade: Int)

class Pair(val maiores: Set[Pessoa], val menores: Set[Pessoa])

object TuplasImp {
  val listaPessoas = List( new Pessoa("Joao", 21),
                           new Pessoa("Maria", 17),
                           new Pessoa("Silva", 25))

  def main(args: Array[String]) {
    val resultado = separarFaixaEtaria(listaPessoas)
    println("maiores: "+ resultado.maiores)
    println("menores: "+ resultado.menores)
  }
  
  def separarFaixaEtaria(pessoas: List[Pessoa]) = {
    var maiores: Set[Pessoa] = Set()
    var menores: Set[Pessoa] = Set()

    for (pessoa <- pessoas) {
      if(pessoa.idade < 18){
        menores+pessoa
      } else {
        maiores+pessoa
      }
    }

    new Pair(maiores, menores)
  }
}

// vim: set ts=4 sw=4 et:
