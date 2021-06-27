package conditional

class Conditional {
    fun condition(){
        val lives = 3
        val isAlive = lives < 1

        if(isAlive){
            println("Game Over.")
        }else {
            println("You are still alive.")
        }
    }
}