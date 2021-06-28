package list;

/**
Created By: Naman Agarwal
User ID: naman2807
Package Name: list
Project Name: KotlinTutorials
Date: 28-06-2021
 */

enum class LootType{
    POTION, RING, ARMOR
}

class Loot(val name: String, val lootType: LootType, val value: Double) {
    override fun toString(): String {
        return super.toString()
    }
}
