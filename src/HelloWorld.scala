

object HelloWorld {
    /**
     * Comme en JS
     * Les fonctions définies par "def" sont des objets
     * Et s'il retournent rien, mettre en type de retour "Unit"
     * En argument : un tableau de String ayant pour nom "args"
     */
    def main(args: Array[String]):Unit = {
       
      //Définition d'une variable
      //Le type peut être dynamiquement supposé comme en JS
      //Mais peut être aussi précisé, comme en JAVA (plus conseillé : cohérence + signification)
      
      //Le point virgule n'est pas obligatoire comme en JS
      
      //Création d'une variable (var)
      var firstname:String = "Hello World"
      
      //Création d'une CONSTANTE (val)
      val AGE:Integer = 22;
      
      //On peut changer une variable
      
      firstname = "ii02735";
      
      //Changer une constante aboutira à une erreur de compilation
      //AGE = 21; --> KO
      
      //Puisque la méthode ne retourne rien, "return" n'est pas obligé
      //Mais peut être précisé
      
      println(firstname);
      
      return;
    }
}