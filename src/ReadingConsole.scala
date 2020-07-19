import scala.collection.mutable.ListBuffer
import java.util.ArrayList


//Hériter une classe de App permet d'exécuter le corps
//de l'objet dans une fonction main qui est implicite
//Par conséquent, il n'est pas nécessaire de définir une méthode main
//la classe App nous l'a fait pour nous
object ReadingConsole extends App {
  
  var yourName:String = io.StdIn.readLine("Your name please : ");
  println(s"Thank you ${yourName}");
  
  var done = false;
  
  var scores:ListBuffer[Double] = ListBuffer(); //ListBuffer permet de créer une Liste mutable
  var scores2:ArrayList[Double] = new ArrayList(); //En java (rappel : il est possible d'écrire du code Java dans un fichier Scala)

  while(!done){
    println("Add score : ");
    scores += io.StdIn.readDouble();
    println("Are you finished ? ");
    done = io.StdIn.readBoolean();
  }
  
  println("Insertion de 4 éléments dans une ArrayList en Java");
  
  scores2.add(io.StdIn.readDouble());
  scores2.add(io.StdIn.readDouble());
  scores2.add(io.StdIn.readDouble());
  scores2.add(io.StdIn.readDouble());
  
  println("Résultat ListBuffer :")
  
  for(x <- scores) println(x)
  
  println("Résultat ArrayList : ")
  
  scores2.forEach((x) => println(x));
}