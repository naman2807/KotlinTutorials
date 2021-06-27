package conditional

class Conditional {
    fun condition1(){
        val lives = 0
        val isAlive = lives < 1
        if(isAlive){
            println("Game Over.")
        }else {
            println("You are still alive.")
        }
    }

    fun condition2(){
        println("Enter your age:")
        val age =  readLine()!!.toInt()
        println("Age is: $age")

        val message : String
        if(age < 18){

        }
    }
}