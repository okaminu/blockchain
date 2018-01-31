package lt.okaminu.blockchain

class Blockchain {

    private val blocks: ArrayList<Block> = arrayListOf(createBlock("Genesis block", ""))

    fun addBlock(data: String) {
        blocks.add(createBlock(data, blocks.last().hash))
    }

    private fun createBlock(data: String, previousHash: String): Block {
        val block = Block(data, previousHash)

        val (nounce, hash) = calculateHashAndNounce(block)
        block.nounce = nounce
        block.hash = hash
        return block
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