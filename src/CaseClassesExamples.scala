
//Les cases classes sont comme des classes normales
//À la différence que ses membres sont immutables
//Et ne nécessitent pas l'utilisation du mot-clé "new" pour instancer un nouvel objet

object CaseClassesExamples extends App {
  
  /**
   * En plus d'avoir des membres immutables
   * Et les instances de cases classes peuvent utiliser
   * des méthodes comme equals
   * 
   * Par conséquent on peut utiliser des patterns sur ces
   * objets
   */
  
  val personnes:Array[Person] = Array(Person("John","Doe",21),Person("Tim","Cook",40));
  
  for(person <- personnes){
    person match {
      case Person("John","Doe",21) => println("Hi Mr. Unknown !");
      case _ => println("Hi identified being !");
    }
  }
  
  //Il est aussi possible de passer par les attributs
  for(person <- personnes){
      person.age match {
        case 21 => println(s"Hi ${person.age} years old person !");
        //Attention, il faut veiller à ce que au moins un cas soit respecté
        //par objet, sinon on aura une exception du type MatchError
        case _ => println(s"Hi aged person !");
      }
  }
}

//Les attributs sont automatiquement immutables (val)
case class Person (fname:String,lname:String,age:Int);