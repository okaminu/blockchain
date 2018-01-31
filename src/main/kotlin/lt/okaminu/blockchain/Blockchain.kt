package lt.okaminu.blockchain

class Blockchain(private val blocks: ArrayList<String> = ArrayList()) {

    fun addBlock(data: String) {
        blocks.add(data)
    }

    fun printAllBlocks() = blocks.forEach { print(it) }
}