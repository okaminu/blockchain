package lt.okaminu.blockchain

import java.security.MessageDigest

fun calculate(block: Block) : Pair<Int, String>{

    val blockAsString = "${block.data}${block.previousHash}${block.timestamp}${block.nounce}"
    var nounce = 1

    val md = MessageDigest.getInstance("SHA-256")
    val digest = md.digest(blockAsString.toByteArray())
    val hash = digest.fold("", { str, byte -> str + "%x02".format(byte) })

    return Pair(nounce, hash)
}
