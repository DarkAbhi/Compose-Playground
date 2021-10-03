package com.example.composeproject.data.remote.dto


import com.example.composeproject.domain.model.CoinDetail
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoinDetailDto(
    @Json(name = "description")
    val description: String,
    @Json(name = "development_status")
    val developmentStatus: String?,
    @Json(name = "first_data_at")
    val firstDataAt: String,
    @Json(name = "hardware_wallet")
    val hardwareWallet: Boolean,
    @Json(name = "hash_algorithm")
    val hashAlgorithm: String?,
    @Json(name = "id")
    val id: String,
    @Json(name = "is_active")
    val isActive: Boolean,
    @Json(name = "is_new")
    val isNew: Boolean,
    @Json(name = "last_data_at")
    val lastDataAt: String,
    @Json(name = "links")
    val links: Links,
    @Json(name = "links_extended")
    val linksExtended: List<LinksExtended>?,
    @Json(name = "message")
    val message: String?,
    @Json(name = "name")
    val name: String,
    @Json(name = "open_source")
    val openSource: Boolean,
    @Json(name = "org_structure")
    val orgStructure: String?,
    @Json(name = "proof_type")
    val proofType: String?,
    @Json(name = "rank")
    val rank: Int,
    @Json(name = "started_at")
    val startedAt: String?,
    @Json(name = "symbol")
    val symbol: String,
    @Json(name = "tags")
    val tags: List<Tag>,
    @Json(name = "team")
    val team: List<TeamMember>,
    @Json(name = "type")
    val type: String,
    @Json(name = "whitepaper")
    val whitepaper: Whitepaper
) {
    @JsonClass(generateAdapter = true)
    data class Links(
        @Json(name = "explorer")
        val explorer: List<String>?,
        @Json(name = "facebook")
        val facebook: List<String>?,
        @Json(name = "reddit")
        val reddit: List<String>?,
        @Json(name = "source_code")
        val sourceCode: List<String>?,
        @Json(name = "website")
        val website: List<String>?,
        @Json(name = "youtube")
        val youtube: List<String>?
    )

    @JsonClass(generateAdapter = true)
    data class LinksExtended(
        @Json(name = "stats")
        val stats: Stats?,
        @Json(name = "type")
        val type: String,
        @Json(name = "url")
        val url: String
    ) {
        @JsonClass(generateAdapter = true)
        data class Stats(
            @Json(name = "contributors")
            val contributors: Int?,
            @Json(name = "followers")
            val followers: Int?,
            @Json(name = "stars")
            val stars: Int?,
            @Json(name = "subscribers")
            val subscribers: Int?
        )
    }

    @JsonClass(generateAdapter = true)
    data class Tag(
        @Json(name = "coin_counter")
        val coinCounter: Int,
        @Json(name = "ico_counter")
        val icoCounter: Int,
        @Json(name = "id")
        val id: String,
        @Json(name = "name")
        val name: String
    )

    @JsonClass(generateAdapter = true)
    data class TeamMember(
        @Json(name = "id")
        val id: String,
        @Json(name = "name")
        val name: String,
        @Json(name = "position")
        val position: String
    )

    @JsonClass(generateAdapter = true)
    data class Whitepaper(
        @Json(name = "link")
        val link: String?,
        @Json(name = "thumbnail")
        val thumbnail: String?
    )
}

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}