package classes

class Player(val name: String, var lives: Int = 3, var level: Int = 1) {
    var score = 0

    fun show(){
        println("""
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
        """)
    }
}