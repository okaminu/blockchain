package lt.okaminu.blockchain

import java.security.MessageDigest

fun calculateHashAndNounce(block: Block) : Pair<Int, String>{
    var hash = ""
    var nounce = 0

    while (!isHashValid(hash)) {
        nounce++
        hash = calculateHash("${block.data}${block.previousHash}${block.timestamp}$nounce")
    }
    return Pair(nounce, hash)
}

private fun calculateHash(blockAsString: String): String {
    val md = MessageDigest.getInstance("SHA-256")
    val digest = md.digest(blockAsString.toByteArray())
    return digest.fold("", { str, byte -> str + "%x02".format(byte) })
}

private fun isHashValid(hash: String) = hash.startsWith("00")
