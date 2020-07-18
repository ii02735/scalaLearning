object HigherOrderFns {

	/**
	  * Rappel : scala est un langage de programmation fonctionnel
		* Il est possible de manier les fonctions différemment
		* En passant par des arguments, en les retournant...
		*
		* Il est possible de passer des fonctions en paramètre d'une autre
		* fonction.
		* Ceci est une higher-order function
	  */
	
	//méthode
	def multiplyByTwo(x: Int):Int = x * 2;    //> multiplyByTwo: (x: Int)Int
	
	//méthode qui prend en argument une fonction
	
	def higherOrder(x:Int, fx:Int=>Int):Int = {
		return fx(x);
	}                                         //> higherOrder: (x: Int, fx: Int => Int)Int
	
	higherOrder(1,multiplyByTwo);             //> res0: Int = 2
	
	//lambda = "fonction"
	val multiplyByThree = (x: Int) => x * 3   //> multiplyByThree  : Int => Int = HigherOrderFns$$$Lambda$9/483422889@7c75222b
                                                  //| 
	
	higherOrder(3,multiplyByThree)            //> res1: Int = 9
	
	multiplyByTwo(2);                         //> res2: Int = 4
	
	//Stockage d'une méthode dans une variable : pour cela il faut convertir la méthode en fonction
	//Deux possibilités : mettre un underscore après avoir renseigné la fonction à stocker : multiplyByTwo _
	//Ou préciser le type de la variable / constante (type => type)
	
	val fun1:Int => Int= multiplyByTwo        //> fun1  : Int => Int = HigherOrderFns$$$Lambda$10/1277181601@27f674d
	fun1(10)                                  //> res3: Int = 20
	
	/**
	  * Attention, fonction et méthode SONT DIFFÉRENTS en Scala
	  * Une méthode (précédée par "def"), est censé être membre d'une classe
	  * et être invoqué ensuite après avoir créé un objet
	  *
	  * Une fonction, syntaxe fléchée "lambda", créée anonymement
	  * ou stockée dans une variable / constante, est un OBJET
	  *
	  * Elle possède des méthodes intéressantes, pour invoquer (en utilisant les paranthèses, ou la méthode apply)
	  * enchaîner le résultat de cette dernière avec une autre (andThen)
	  * Cependant, puisqu'il s'agit d'un objet, de type Lambda, le stocker dans une variable
	  * coûte en mémoire
	  *
	  * Une méthode est plus légère, mais comporte moins de possibilité, ce qui est l'inverse pour fonction (objet Lambda)
	  *
	  */
	  
	 //Les closures : il est possible d'invoquer un membre extérieur dans une fonction (comme un attribut d'une classe)
	 
	 //Pas de point virgule ici car worksheet n'arrive pas à fonctionner (éviter les points virgules sur worksheet)
	 val y = 10                               //> y  : Int = 10
	 
	 //création d'une fonction anonyme puis exécution
	 
	 ((x: Int) => x * y)(10)                  //> res4: Int = 100
	  
	  
}