package lt.okaminu.blockchain

import java.time.Instant

class Blockchain(private val blocks: ArrayList<Block> = ArrayList()) {

    fun addBlock(data: String) {
        blocks.add(Block(data, Instant.now().epochSecond))
    }

    fun printAllBlocks() = blocks.forEach {
        println("Data: ${it.data}")
        println("Timestamp: ${it.timestamp}")
        println()
    }
}