//Les listes se manipulent comme des tableaux à l'exception qu'on ne précise par leur taille
object ListExamples {
	
	//Déclaration et remplissage d'une nouvelle liste
	
	var l1:List[Int] = List(1,2,3,4,5);       //> l1  : List[Int] = List(1, 2, 3, 4, 5)
	
	//Autre syntaxe
	//Nil permet de terminer la liste
	var l2:List[Int] = 1::2::3::4::Nil;       //> l2  : List[Int] = List(1, 2, 3, 4)

	//Création d'une séquence dans une liste
	var l3:List[Int] = List.range(0, 20);     //> l3  : List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
	
	
	//Pour FUSIONNER deux listes :
	
	var l3And4:List[Int] = l2:::l3;           //> l3And4  : List[Int] = List(1, 2, 3, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                                                  //|  12, 13, 14, 15, 16, 17, 18, 19)
                                                  
	//Bien entendu il est possible de fusionner des listes aux types différents
	//Fusion de la liste ci-dessus avec une nouvelle liste de String ("Hello","world")
	//Ici le type en commun est Any
	var l3AndMixed:List[Any] = l3And4:::"Hello"::"world"::Nil;
                                                  //> l3AndMixed  : List[Any] = List(1, 2, 3, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                                  //|  11, 12, 13, 14, 15, 16, 17, 18, 19, Hello, world)
	
	var sum:Int = 0;                          //> sum  : Int = 0
	for(v <- l1) sum+=v;
	println(sum);                             //> 15
	
}