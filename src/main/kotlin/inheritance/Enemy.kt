package inheritance;

/**
Created By: Naman Agarwal
User ID: naman2807
Package Name: inheritance
Project Name: KotlinTutorials
Date: 02-07-2021
 */

open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {
    fun takeDamage(damage: Int){
        val remainingPoints = hitPoints - damage
        if(remainingPoints > 0){
            hitPoints = remainingPoints
            println("$name took $damage points of damage, and has $hitPoints left.")
        }else{
            lives -= 1
        }
    }
}
