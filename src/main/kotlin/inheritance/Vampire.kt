package inheritance;

/**
Created By: Naman Agarwal
User ID: naman2807
Package Name: inheritance
Project Name: KotlinTutorials
Date: 03-07-2021
 */

class Vampire(name: String): Enemy(name, 20,5) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}
