package conditional

class Conditional {
    fun condition(){
        val lives = 3
        if(lives < 1){
            println("Game Over.")
        }else {
            println("You are still alive.")
        }
    }
}