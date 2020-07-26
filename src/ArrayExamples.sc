//Les tableaux sont équivalants à ceux de Java (taille fixée, possibilité de définir et initialiser un tableau)
object ArrayExamples {
	//Définition d'un tableau d'entiers de 10 cases
	val array1:Array[Int] = new Array[Int](10);
                                                  //> array1  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
	
	//Définition et initialisation d'un tableu de String (pas de new ici)
	val array2:Array[String] = Array("hello","world","!","how","is","everyone","here","today", "?", "!");
                                                  //> array2  : Array[String] = Array(hello, world, !, how, is, everyone, here, to
                                                  //| day, ?, !)
	
	//Pour itérer dans un tableau
	for(string <- array2) println(string)     //> hello
                                                  //| world
                                                  //| !
                                                  //| how
                                                  //| is
                                                  //| everyone
                                                  //| here
                                                  //| today
                                                  //| ?
                                                  //| !
	//ATTENTION : on utilise les paranthèses pour accéder à un élément, pas les crochets !
	println(array2(0))                        //> hello
	//À partir de yield on peut appliquer une opération à toutes les valeurs d'un tableau
	val array3:Array[Int] = Array(1,2,3,4,5)  //> array3  : Array[Int] = Array(1, 2, 3, 4, 5)
	//On crée un tableau en récupérant les valeurs de array3 dont chacun aura 3 ajouté
	val array4:Array[Int] = for(i <- array3) yield i+3;
                                                  //> array4  : Array[Int] = Array(4, 5, 6, 7, 8)
	
	//Si on souhaite récupérer les éléments pairs et les mettre dans un nouveau, on peut appliquer un filtre
	//yield s'exécutera si le if est respecté
	val arrayEven:Array[Int] = for(i<-array4 if i%2==0) yield i
                                                  //> arrayEven  : Array[Int] = Array(4, 6, 8)
	
}