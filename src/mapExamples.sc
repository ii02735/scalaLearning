//Les maps ont les mêmes propriétés que celles en Java

object mapExamples {

	//La création d'une map remplie est assez directe
							//[K,V]
	var dico:Map[Char,String] = Map('A' -> "Arbalète", 'B' -> "Bombe", 'C' -> "Canon");
                                                  //> dico  : Map[Char,String] = Map(A -> Arbalète, B -> Bombe, C -> Canon)
	
	//Pour rajouter une nouvelle entrée dans notre Map
	//Attention, ne pas oublier de mettre la map en var !
	dico += ('E' -> "Electricité");
	
	//Pour récupérer une valeur
	println(dico.get('C'));                   //> Some(Canon)
	
	//get est implicite, il s'agit de la méthode par défaut de la Map
	println(dico('C'));                       //> Canon
	
	/**
	  * Si on veut récupérer un élément depuis une clé inexistante
	  * On aura une exception du type NoSuchElementException
	  * Il est possible de retourner un message d'erreur personnalisé
	  * Depuis la méthode getOrElse
	  */
	println(dico.getOrElse('D', "L'élément n'existe pas"));
                                                  //> L'élément n'existe pas
	
	//Pour imprimer que les valeurs
	
	for(v <- dico.values) println(v);         //> Arbalète
                                                  //| Bombe
                                                  //| Canon
                                                  //| Electricité
                                                  
  //Pour manipuler les clés et les valeurs ensemble
  //yield, équivalant à la fonction map, cela retourne de nouveaux éléments pour la collection
  //Ici, on a inversé la clé avec la valeur
  val inversedMap:Map[String,Char] = for((k,v)<-dico) yield(v,k)
                                                  //> inversedMap  : Map[String,Char] = Map(Arbalète -> A, Bombe -> B, Canon -> 
                                                  //| C, Electricité -> E)
                                                  
                                                  
}