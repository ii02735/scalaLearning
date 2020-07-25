
//Scala a une fonctionnalité très importante qui consiste à gérer des patterns / expressions (switch)

object PatternMatching extends App {
   
  //Définition d'une MÉTHODE (rappel : une méthode est plus légère qu'une fonction, mais dispose moins de fonctionnalités)
  //Type de retour nécessaire car écriture du "return"
  def greekAlphabet(letter:Char): String = {
    //vérification des correspondances (équivalant à un switch)
    letter match {
      case 'a' | 'A' => "Alpha";
      //Écriture équivalante 
      case 'b' | 'B' => {
        return "Beta";
      }
      case 'd' | 'D' => "Delta";
      //Si autre chose est saisi on utilise le wildcard (équivalant à default)
      case _ => {
        return null; //on peut ignorer le return ici, mais il faudrait alors enlever le type de return de la méthode (le return ci-dessus devra aussi être enlevé)
      }
    }
  }
  
  println(s"La lettre grecque de b est ${greekAlphabet('b')}"); 
  println(s"La lettre grecque de D est ${greekAlphabet('D')}");
  println(greekAlphabet('C'));
  
  //avec une expression logique
  //Fonction courte : on peut ignorer les accolades du début
  //C'est le match qui aura son propre bloc
    def greater(x:Int, y:Int):Int = x>y match {
      case true => x;
      case false => y;
   }
    
   println(greater(10,20)); //retournera 20
   
   println(greater(40,-1)); //retournera 40
  
}