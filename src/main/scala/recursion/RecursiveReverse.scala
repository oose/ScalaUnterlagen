package recursion

trait RecursiveReverse {

  /**
   * Implementiere diese Funktion
   * so dass gilt:
   * reverse(List(1,2,3,4)) == List(4,3,2,1))
   *
   * Verwende dabei nicht die eingebaute Listenfunktion reverse,
   * sondern baue eine rekursive Lösung
   */
  def reverse(l: List[Int]): List[Int] = {
    List.empty // delete me
    
  }

  /**
   * Implementiere eine rekursive Funktion, die von einer gegebenen Liste
   * n Elemente vorne entfernt, und die restlichen Werte zurückliefert.
   * take(List(1,2,3,4,5), 3 ) = List(1,2)
   * Möchte man mehr Elemente nehmen als die Liste hat, wird die größtmögliche Menge zurückgeben.
   * start sbt mit : ~testOnly recursion.RecursionSpec
   */
  def take(l: List[Int], n: Int): List[Int] = {
    List.empty
  }

}