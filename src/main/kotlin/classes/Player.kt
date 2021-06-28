package classes

import list.Loot

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {
    var weapon : Weapon = Weapon("Fist", 1)

    val inventory = ArrayList<Loot>()

    fun show(){
        println("""
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            Weapon Name: ${weapon.name}
            Weapon Damage Inflicted: ${weapon.damageInflicted}
        """.trimIndent())
    }

    fun showInventory(){
        println("$name's inventory")
        println(inventory.get(0))
        println("=".repeat(20))
    }
}