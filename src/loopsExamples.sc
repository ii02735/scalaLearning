object loopsExamples {
  /**
    * Il est bien évidemment possible en Scala
    * de manipuler des boucles
    */
   
   //while
   
   var stop:Integer = 10;                         //> stop  : Integer = 10
   
   while(stop != 0){
    //Interpolation de la variable pour éviter de concaténer manuellement
  	println(s"In while...$stop");
  	stop-=1; //attention stop-- KO
  }                                               //> In while...10
                                                  //| In while...9
                                                  //| In while...8
                                                  //| In while...7
                                                  //| In while...6
                                                  //| In while...5
                                                  //| In while...4
                                                  //| In while...3
                                                  //| In while...2
                                                  //| In while...1
 
  //for : de 0 à 5
  for(x <- 0 until 5) println(x)                  //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  //for : de 0 à 5, en compteur de 2
  for(x <- 0 until 5 by 2) println(x)             //> 0
                                                  //| 2
                                                  //| 4
  //création d'une séquence depuis une boucle
  //avec le mot yield
  //Attention, la séquence / le vector est immutable
  var result = for(x <- 0 until 5) yield x        //> result  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 2, 3, 4)
                                                  //| 
                                                  
	val word:String = "hello";                //> word  : String = hello
	
	//Séquence de lettres
	val wordSeq = for(x <- 0 until word.length) yield word(x); //attention, utilisation des parenthèses pour accéder à l'index ici
                                                  //> wordSeq  : scala.collection.immutable.IndexedSeq[Char] = Vector(h, e, l, l, 
                                                  //| o)
	
	//Autre moyen
	
	val wordArray = word.toCharArray();       //> wordArray  : Array[Char] = Array(h, e, l, l, o)
	
}