package classes

class Player(val name: String) {
    var lives = 3
    var level = 1
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