import classes.Player
import conditional.Conditional

fun main(args: Array<String>) {
//    val conditional : Conditional = Conditional()
//    conditional.condition2()

    val naman = Player("Naman")
//    println(naman.name)
//    println(naman.lives)
//    println(naman.level)
//    println(naman.score)
    naman.show()

    val harshit = Player("Harshit",5,1,2)
    harshit.show()

    println(naman.weapon.name)
    println(naman.weapon.damageInflicted)
}

