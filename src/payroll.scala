//Utilisation des classes en Scala

//payroll = registre d'employés
object payroll extends App {
  //Création de tuples qu'on va transformer en objets ensuite
   val dataEmployes:Array[Tuple2[String,String]] = Array(("john","doe"),("patrick","mcallister"),("rowan","finnegan"));
   //Création d'un tableau d'objets de type Employe
   var Employes:Array[Employe] = new Array(3);
   /**
    * On ajoute chaque objet dans le tableau
   		Il est nécessaire de préciser chaque indice puisqu'il s'agit d'un tableau classique
   		
   		Pour cela on passe par zipWithIndex qui va constituer un nouveau tableau de tuples
   		Mais dont chacun aura un index :
    * (("john","doe"),0),(("patrick","mcallister"),1), etc.)
    */
   for((tuple,index) <- dataEmployes.zipWithIndex)
     Employes(index) = new Employe(tuple._1,tuple._2) //._1 et ._2 permettent respectivement d'accéder au premier et au second argument
   
   for(employe <- Employes) println(employe)
}
//comme on doit gérer des employés
//il faut créer une classe Employe

/**
 * création des attributs de la classe
 * ces derniers sont passés en paramètres
 * car ils définissent la méthode du constructeur
 * salarie : statut si salarié ou non, ou autre
 */
class Employe(private var fname:String, private val lname:String, private var salarie:Char = 'n')
{
  //redéfinition de la méthode toString (pour corriger l'affichage de l'objet)
  override def toString = s"Employé{${fname},${lname},${salarie},${EmployeID.newEEID()}}"; //génération d'un ID grâce à l'objet singleton
  //Setter
  def fname_ (fname:String){
    this.fname = fname;
  }
}

//Création d'un objet pour utiliser un singleton
//À la différence de Java, ici on ne passe pas par une classe
//mais par un objet (l'objet n'a pas besoin d'être instancié,
//car il l'est déjà depuis une classe anonyme
//cela est ok pour un singleton, car on ne peut instancier une seconde fois)
//Utile pour générer des IDs uniques (en passant par un incrément)
object EmployeID{
  var EmployeID = 0;
  def newEEID():Int = {
    EmployeID +=1;
    return EmployeID;
  }
}