package classes;

/**
Created By: Naman Agarwal
User ID: naman2807
Package Name: classes
Project Name: KotlinTutorials
Date: 27-06-2021
 */

class Weapon(val name: String, var damageInflicted: Int) {
    override fun toString(): String {
        return """
            Weapon Name: $name
        """.trimIndent()
    }
}
