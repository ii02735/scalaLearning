//Les combinaisons de valeurs, comme clé - valeur dans les maps sont nommés des tuples
//On peut créer des combinaisons de valeurs
object tupleExamples {
	
	//Ici on crée une combinaison de 3 valeurs entières
	val tuple:Tuple3[Int,Int,Int] = (1,2,3);  //> tuple  : (Int, Int, Int) = (1,2,3)
	//On accède à la 3ème valeur (les tuples commencent à 1 et non à 0 ! )
	val thirdElement:Int = tuple._3;          //> thirdElement  : Int = 3
	
	//On peut "destructurer" (comme en JS) un tuple en plusieurs valeurs
	
	val(first:Int,second:Int,third:Int) = tuple;
                                                  //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| third  : Int = 3
		
	//créer des tuples depuis des tableaux
	
	val symbols:Array[String] = Array("<","-",">");
                                                  //> symbols  : Array[String] = Array(<, -, >)
	val numbers:Array[Int] = Array(8,2,4)     //> numbers  : Array[Int] = Array(8, 2, 4)
	//Cela créera un tableau qui sera composé de tuples
	var associed:Array[Tuple2[String,Int]] = symbols.zip(numbers);
                                                  //> associed  : Array[(String, Int)] = Array((<,8), (-,2), (>,4))
	//on indique qu'on souhaite écrire n fois chaque string (n est le nombre se trouvant en seconde position du tuple)
	//println pour permettre de libérer le buffer de sortie
	for((s,n) <- associed)print(s*n)          //> <<<<<<<<-->>>>
	println                                   //> 
	
	//zip est pertinent à utiliser cela crée un tableau, ce qui est itérable. Un tuple lui n'est pas itérable
	
	//il est utile d'utiliser des tuples pour 1) assembler une map 2) associer des types non primitifs (pour avoir plus de signification)
	
	val reversedAssocied:Array[Tuple2[Int,String]] = for(tuple <- associed) yield tuple.swap
                                                  //> reversedAssocied  : Array[(Int, String)] = Array((8,<), (2,-), (4,>))
	//Assembler une map
	val myMap:Map[Int,String] = reversedAssocied.toMap;
                                                  //> myMap  : Map[Int,String] = Map(8 -> <, 2 -> -, 4 -> >)
  //la méthode par défaut d'une map est get (ici on récupère la valeur qui a pour clé 2)
  println(myMap(2));                              //> -
  
}