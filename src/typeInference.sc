object typeInference {
  /**
    * Scala possède l'inférence de typage
    * Cela permet au compilateur de déterminer le type d'une variable
    * à l'instar de JS
    */
    
    //Déterminé en Double
    val value = 10.1;                             //> value  : Double = 10.1
		
		//Fusionner un Integer avec un Double donne un Double
		val value2 = 10 + 10.1;           //> value2  : Double = 20.1

		//Associer une String avec un Integer rend une String (car la chaîne de caractères n'est pas traduisible en Integer)
		val strValue = 10 + "hello";      //> strValue  : String = 10hello
		
		var strValue2 = 10 + "10.1";      //> strValue2  : String = 1010.1
		
		//Déterminé en Double
		var boolValue = true;             //> boolValue  : Boolean = true
		
		//Déterminé en une liste d'entiers
		val list = List(1,2,3,4,5);       //> list  : List[Int] = List(1, 2, 3, 4, 5)
		
		//Déterminé en une liste de Double
		val list2 = List(1,1.5,2,4);      //> list2  : List[Double] = List(1.0, 1.5, 2.0, 4.0)
		//Déterminé en une liste de ANY !
		val list3 = List(1,2,3,"Str",1.4);//> list3  : List[Any] = List(1, 2, 3, Str, 1.4)
	
		val list4 = List(true,"str");     //> list4  : List[Any] = List(true, str)
		
		//Le type de retour est auto-déterminé aussi !
		def function() = println("hello world");
                                                  //> function: ()Unit
		//Attention, s'il faut utiliser des opérateurs logiques, il faut préciser le type du paramètre
		//D'ailleurs, il est vivement conseillé de ne pas laisser ses paramètres en Any !
	  
	  //def anyFunction(x:Any) = if(x>0) 1 else "negative"; KO : le signe > n'est pa utilisable pour le type Any
	  
	  //Le retour ici sera de type any car les types se mélangent : on retourne soit du Integer, soit du String
	  def anyFunction(x:Integer) = if(x>0) 1 else "negative";
                                                  //> anyFunction: (x: Integer)Any
	  
}