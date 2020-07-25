
//Lecture de fichiers depuis Scala : nécessité d'importer io.Source._
import io.Source._; //l'underscore est un wildcard (comme l'astérisque en Java)
import java.io.FileNotFoundException

object readFromFiles extends App{
    
  //lecture de chaque ligne d'un fichier

  for(line <- fromFile("src/fruits").getLines())
    println(line.toUpperCase()) //impression de chaque ligne en majuscule
    
  //utilisation d'un forEach
  println("forEach :");  
  fromFile("src/fruits").getLines().toList.foreach(println) //équivalant à forEach(System.out::println) 
                                                            //-> argument implicite (toList récupère chaque ligne en tant que paramètre)
                                                            //Pas besoin de fournir l'argument comme ceci : foreach(l => println(l)

                                                            
  //gestion des exceptions : le fichier "unknown" n'existe pas
  
  try {
    val list:List[String] = fromFile("unknown").getLines().toList;
  }catch //En Scala la syntaxe por gérer plusieurs exceptions est différente, et se rapproche d'un switch case
  {
    case e: FileNotFoundException => println(s"Erreur : ${e}"); //S'il s'agit d'une telle exception, on exécute un println
    //pour exécuter une fonction sur n'importe quelle autre exception (attention l'ordre d'écriture est bien-sûr important)
    case _: Exception => println("Le programme a dû s'arrêter pour une erreur");
  }
   
  try {  
    val quotient:Double = 10/0;
  }catch{
    case e: ArithmeticException => println(s"Erreur durant l'exécution de l'opération arithmétique : ${e}");
  }
}