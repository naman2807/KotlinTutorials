package conditional

class Conditional {
    fun condition(){
        val lives = 3
        val isAlive = lives < 1
        if(lives < 1){
            println("Game Over.")
        }else {
            println("You are still alive.")
        }
    }
}