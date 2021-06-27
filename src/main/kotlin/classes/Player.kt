package classes

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {
    var weapon : Weapon = Weapon("Fist", 1)

    fun show(){
        println("""
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            Weapon Name: ${weapon.name}
            
        """.trimIndent())
    }
}