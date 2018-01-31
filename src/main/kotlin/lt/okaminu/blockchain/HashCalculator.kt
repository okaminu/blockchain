package lt.okaminu.blockchain

import java.security.MessageDigest

fun calculateHashAndNounce(block: Block) : Pair<Int, String>{
    var hash = ""

    while (!isHashValid(hash)) {
        block.nounce++
        hash = calculateHash(block)
    }
    return Pair(block.nounce, hash)
}

fun calculateHash(block: Block): String {
    val blockAsString = "${block.data}${block.previousHash}${block.timestamp}${block.nounce}"
    val md = MessageDigest.getInstance("SHA-256")
    val digest = md.digest(blockAsString.toByteArray())
    return digest.fold("", { str, byte -> str + "%x02".format(byte) })
}

fun isHashValid(hash: String) = hash.startsWith("0".repeat(difficulty))

private const val difficulty = 2
