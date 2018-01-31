package lt.okaminu.blockchain

class Blockchain {

    val blocks: ArrayList<Block> = arrayListOf(createBlock("Genesis block", ""))

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

    fun validate() {
        for (block in blocks) {
            if (!isHashValid(block.hash)) {
                println("Invalid hash")
            }

            if (calculateHash(block) != block.hash) {
                println("Block corrupted, contains incorrect data")
            }
        }
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