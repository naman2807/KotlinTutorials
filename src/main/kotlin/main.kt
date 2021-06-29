import classes.Player
import classes.Weapon
import conditional.Conditional
import list.Loot
import list.LootType

fun main(args: Array<String>) {
//    val conditional : Conditional = Conditional()
//    conditional.condition2()

//    val naman = Player("Naman")
//    val harshit = Player("Harshit",5,1,2)
//
////    println(naman.name)
////    println(naman.lives)
////    println(naman.level)
////    println(naman.score)
//
//    naman.show()
////    harshit.show()
//
//    harshit.weapon = naman.weapon
//    harshit.show()
//
////    println(naman.weapon.name)
////    println(naman.weapon.damageInflicted)
////
////    val axe = Weapon("Axe",12)
////    naman.weapon = axe
////    println(naman.weapon.name)
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.0)
//    naman.inventory.add(redPotion)
//    naman.inventory.add(chestArmor)
//    naman.showInventory()
//
//    naman.inventory.add(Loot("Ring of Protection +2", LootType.RING,52.0))
//    naman.inventory.add(Loot("Invisibilty Potion", LootType.POTION, 21.0))
//    naman.showInventory()
//    println(naman)

    for (i in 1..10){
        println(i)
        println("$i squared to ${i*i}")
    }

    println("*".repeat(100))
    for(i in 1 until 10){
        println(i)
    }

    println("*".repeat(100))
    for (i in 10 downTo 0){
        println(i)
    }

    println("*".repeat(100))
    for (i in 10 downTo 0 step 2){

    }
}



















