//Utilisation des classes en Scala

//payroll = registre d'employés
object payroll extends App {
   var e:Employe = new Employe("john","doe");
   e.fname_("tom");
   println(e);
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
  override def toString = s"Employé{${fname},${lname},${salarie}}";
  def fname_ (fname:String){
    this.fname = fname;
  }
}

