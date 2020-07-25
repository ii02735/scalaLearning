
//Lecture de fichiers depuis Scala : nécessité d'importer io.Source._
import io.Source._; //l'underscore est un wildcard (comme l'astérisque en Java)

object readFromFiles extends App{
    
  //lecture de chaque ligne d'un fichier

  for(line <- fromFile("src/fruits").getLines())
    println(line.toUpperCase()) //impression de chaque ligne en majuscule
    
  //utilisation d'un forEach
  println("forEach :");  
  fromFile("src/fruits").getLines().toList.foreach(println) //équivalant à forEach(System.out::println) 
                                                            //-> argument implicite (toList récupère chaque ligne en tant que paramètre)
                                                            //Pas besoin de fournir l'argument comme ceci : foreach(l => println(l)
}