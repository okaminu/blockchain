package lt.okaminu.blockchain

import java.time.Instant

data class Block(
        var data: String,
        var timestamp: Long = Instant.now().epochSecond,
        var hash: String = "",
        var previousHash: String = "",
        var nounce: Int = 0
)