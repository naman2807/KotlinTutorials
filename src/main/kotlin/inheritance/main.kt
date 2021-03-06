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
    println(uglyTroll)
    uglyTroll.takeDamage(10)
    println(uglyTroll)

    val vampire = Vampire("Vampire")
    println(vampire)
    vampire.takeDamage(11)
    println(vampire)

    val vampireKing = VampireKing("Vampire King", 2)
    println(vampireKing)
    vampireKing.takeDamage(8)
}