package classes

import list.Loot

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {
    var weapon : Weapon = Weapon("Fist", 1)

    private val inventory = ArrayList<Loot>()

    fun show(){
        if(lives > 0){
            println("$name is alive")
        }else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            $weapon
        """
    }

    fun getLoot(item : Loot){
        this.inventory.add(item)
    }

    fun dropLoot(item: Loot) : Boolean{
        return if (inventory.contains(item)){
            inventory.remove(item)
            true
        }else{
            false
        }
    }

    fun dropLoot(item: String) : Boolean{
        println("$name will be dropped.")
        return inventory.removeIf { it.name == item }
    }

    fun showInventory(){
        println("$name's inventory")
        for(item in inventory){
            println(item)
        }
        println("=".repeat(20))
    }
}