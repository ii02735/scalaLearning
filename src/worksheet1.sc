object worksheet1 {
	/**
	  * Les worksheets sont pratiques car ils permettent d'afficher le résultat / retour de chaque instruction
    * Les résultats sont affichés en COMMENTAIRE, PAR INSTRUCTION !
    * Cela est utile pour déboguer
    **/
    
    
	print("Test hello world");                //> Test hello world
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val str:String = "Test hello";                  //> str  : String = Test hello
  
  //Création d'une liste, typée de type Nombre
  
  val numbers:List[Integer] = List(1,2,3,4,5);    //> numbers  : List[Integer] = List(1, 2, 3, 4, 5)
    
  //Il est possible, comme en Perl (2..10) , de créer une séquence d'élements
  //Il s'agit d'un objet de type Range
  
  val sequence:Range = 2 to 10;                   //> sequence  : Range = Range 2 to 10
  
  //Type booléen
  
  var bool:Boolean = false                        //> bool  : Boolean = false
  //Pas de point virgule, car implicitement c'est un return, c'est comme une lambda (pas d'accolade)
	//Le return est a+b
	def add(a:Int, b:Int):Integer = a + b     //> add: (a: Int, b: Int)Integer
	add(5,5);                                 //> res0: Integer = 10
	
}