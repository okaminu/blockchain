package lt.okaminu.blockchain

class Blockchain(private val blocks: ArrayList<Block> = ArrayList()) {

    fun addBlock(data: String) {
        blocks.add(Block(data))
    }

    fun printAllBlocks() = blocks.forEach { print(it.data + "\n") }
}