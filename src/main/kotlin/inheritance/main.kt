package inheritance;

/**
Created By: Naman Agarwal
User ID: naman2807
Package Name: inheritance
Project Name: KotlinTutorials
Date: 03-07-2021
 */
fun main(args: Array<String>){
    val enemy = Enemy("Naman",20,5)
    println(enemy)

    enemy.takeDamage(10)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Troll", 20,10)
}