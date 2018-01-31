package lt.okaminu.blockchain

import java.time.Instant

data class Block(
        var data: String,
        var previousHash: String,
        var hash: String = "",
        var timestamp: Long = Instant.now().epochSecond,
        var nounce: Int = 0
)