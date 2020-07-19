object decisions {
  //instructions de conditions / décisions
  
  //iso à C
  
  val today = "Monday"                            //> today  : String = Monday
	
	if(today == "Monday")
		println("today we're Monday")     //> today we're Monday
		
	
	//on peut stocker le résultat d'une condition (comme un opérateur ternaire)
	
	//1>2 ? 0 : 10 ne fonctionne pas, syntaxe alternative :
	val logic = if(1>2) 0 else 10             //> logic  : Int = 10
}