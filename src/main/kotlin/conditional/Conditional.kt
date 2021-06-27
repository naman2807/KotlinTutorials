package conditional

class Conditional {
    fun condition(){
        val lives = 0
        val isAlive = lives < 1

        if(isAlive){
            println("Game Over.")
        }else {
            println("You are still alive.")
        }
    }
}