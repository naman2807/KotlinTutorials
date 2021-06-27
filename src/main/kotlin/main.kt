import classes.Player
import classes.Weapon
import conditional.Conditional

fun main(args: Array<String>) {
//    val conditional : Conditional = Conditional()
//    conditional.condition2()

    val naman = Player("Naman")
    val harshit = Player("Harshit",5,1,2)

//    println(naman.name)
//    println(naman.lives)
//    println(naman.level)
//    println(naman.score)

    naman.show()
//    harshit.show()

    harshit.weapon = naman.weapon

//    println(naman.weapon.name)
//    println(naman.weapon.damageInflicted)
//
//    val axe = Weapon("Axe",12)
//    naman.weapon = axe
//    println(naman.weapon.name)
}

