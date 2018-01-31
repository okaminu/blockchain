package lt.okaminu.blockchain

fun main(args: Array<String>) {
    val blockchain = Blockchain()

    blockchain.addBlock("Cake is a lie")
    blockchain.addBlock("Show me da way")

    blockchain.printAllBlocks()

    blockchain.blocks[2].hash = "0000dddd"

    blockchain.validate()

}