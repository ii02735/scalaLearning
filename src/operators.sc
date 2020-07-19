object operators {
  
  //011
  
  val x = 3;                                      //> x  : Int = 3
  //On déplace les bits du nombre 3 fois à gauche
  // 3 = 011 -> <<3 -> 11000
  val b4=x<<3                                     //> b4  : Int = 24
 	
 	//opérateurs logiques binaires
 	
 	//  001
 	//& 010
 	//= 000 -> 0
 	val b1 = 1&2;                             //> b1  : Int = 0
 	
 	//  001
 	//= 011 -> 3
 	
 	val b2 = 1|2;                             //> b2  : Int = 3
 	
 	//  001
 	//^ 011
 	//= 010
 	
 	val b3 = 1^b2                             //> b3  : Int = 2
 	
 	
 	//création d'une liste depuis ::
 	
 	val nums:List[Int] = 1::2::3::4::Nil;     //> nums  : List[Int] = List(1, 2, 3, 4)
 	 
 	 
}