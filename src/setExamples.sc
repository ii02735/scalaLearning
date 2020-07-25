//Les sets sont des collections qui ne contiennent que des éléments uniques (équivalants aux HashSets en Java
import scala.collection.immutable.TreeSet;

object setExamples {
	val fruits:Set[String] = Set("banana","apple","banana");    //On voit dans l'impression que "banana" est en double, donc il est retiré
                                                  //> fruits  : Set[String] = Set(banana, apple)
  //l'ordre des éléments n'est pas ordonné
  //car c'est une propriété d'un Set
  var nums:Set[Int] = Set(1,2,3,4,6);             //> nums  : Set[Int] = Set(1, 6, 2, 3, 4)
  
  //On peut ordonner des éléments uniques depuis un TreeSet (similaire à Java)
  var sortedNums:Set[Int] = TreeSet(1,343,3,141,-1,29);
                                                  //> sortedNums  : Set[Int] = TreeSet(-1, 1, 3, 29, 141, 343)
  
  //Fusionner des sets ensemble
  val mixed = nums ++ fruits;                     //> mixed  : scala.collection.immutable.Set[Any] = Set(banana, 1, 6, 2, 3, apple
                                                  //| , 4)
  
  //On supprime l'élément ayant pour valeur 2 dans le set
	nums -= 2;
	println(nums)                             //> Set(1, 6, 3, 4)
	
	//On peut aussi créer une set qui contient des éléments en commun entre 2 sets
	val common:Set[Int] = nums & sortedNums;  //> common  : Set[Int] = Set(1, 3)
	
	//Pour récupérer le premier élément d'un set
	println(sortedNums.head);                 //> -1
	
	//Pour récupérer tout ce qui se trouve après le premier (après la "tête" du set)
	println(sortedNums.tail);                 //> TreeSet(1, 3, 29, 141, 343)
	
	//Pour vérifier si un set est vide
	println(sortedNums.isEmpty);              //> false
	
	
}