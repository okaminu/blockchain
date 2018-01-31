package lt.okaminu.blockchain

fun calculate(block: Block) : Pair<Int, String>{

    val blockAsString = "${block.data}${block.previousHash}${block.timestamp}${block.nounce}"
    var nounce = 1


    return Pair(nounce, blockAsString)
}
