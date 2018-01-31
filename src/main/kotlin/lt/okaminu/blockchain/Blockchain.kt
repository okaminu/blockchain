package lt.okaminu.blockchain

class Blockchain(private val blocks: ArrayList<Block> = ArrayList()) {

    fun addBlock(data: String) {
        blocks.add(Block(data))
    }

    fun printAllBlocks() = blocks.forEach {
        println("Data: ${it.data}")
        println("Timestamp: ${it.timestamp}")
        println("Hash: ${it.hash}")
        println("Previous hash: ${it.previousHash}")
        println()
    }
}