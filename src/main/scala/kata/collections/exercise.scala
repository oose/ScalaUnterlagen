package kata.collections

// Kontinent ->* Land ->* Stadt
trait Data {
  val kontinente = List(
    Kontinent("Afrika",
      Land("Ägypten", Stadt("Kairo", 10000, true), Stadt("Alexandria", 322345345)),
      Land("Tunesien", Stadt("Tunis", 11341244, true),
        Stadt("Sousse", 1234124))),
    Kontinent("Europa",
      Land("Deutschland",
        Stadt("Berlin", 1000, true),
        Stadt("Hamburg", 200000),
        Stadt("Köln", 13241241),
        Stadt("Aachen", 3)),
      Land("Polen",
        Stadt("Danzig", 1234),
        Stadt("Warschau", 12345, true)),
      Land("Frankreich",
        Stadt("Toulouse", 1234),
        Stadt("Paris", 12345, true))))
}

trait Exercise {
  self : Data =>
    
    def alleNamenAllerKontinente : List[String] = {
      kontinente.map(kontinent => kontinent.name)
    }
    
    def alleLänderNamen : List[String] = {
      List.empty
    }
    
    def alleStädteNamen : List[String] = {
      List.empty
    }
    
    def alleStädteinDeutschland : List[String] = {
      List.empty
    }
    
    def alleHauptstädte : List[String] = {
      List.empty
    }
    
    def dieGrößteStadt : Stadt = {
      Stadt("deleteMe",0)
    }
    
    def summeAllerEinwohnerDerWelt : Int = {
      0 // delete me
    }
}