package lt.okaminu.blockchain

class Blockchain(private val blocks: ArrayList<Block> = arrayListOf(Block("This is a genesis block", ""))) {

    fun addBlock(data: String) {
        val block = Block(data, blocks.last().hash)

        val (nounce, hash) = calculate(block)
        block.nounce = nounce
        block.hash = hash

        blocks.add(block)
    }

    fun printAllBlocks() = blocks.forEach {
        println("Data: ${it.data}")
        println("Timestamp: ${it.timestamp}")
        println("Hash: ${it.hash}")
        println("Previous hash: ${it.previousHash}")
        println("Nounce: ${it.nounce}")
        println()
    }
}