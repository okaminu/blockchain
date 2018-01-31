package lt.okaminu.blockchain

import java.time.Instant

data class Block(
        val data: String,
        val timestamp: Long = Instant.now().epochSecond,
        val hash: String = "",
        val previousHash: String = ""
)