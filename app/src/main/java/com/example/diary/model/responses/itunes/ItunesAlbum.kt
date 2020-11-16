package com.example.diary.model.responses.itunes

import com.google.gson.annotations.SerializedName

data class ItunesAlbum(
    @SerializedName("collectionId")
    val albumId: Long,
    @SerializedName("collectionName")
    val albumName: String,
    val artistId: Long,
    val artistName: String,
    val trackCount: Int,
    @SerializedName("primaryGenreName")
    val genreName: String
)

//{
//    "wrapperType":"collection",
//    "collectionType":"Album",
//    "artistId":1128249621,
//    "collectionId":1501672457,
//    "artistName":"Miasto Gniewu",
//    "collectionName":"Splin - EP",
//    "collectionCensoredName":"Splin - EP",
//    "artistViewUrl":"https://music.apple.com/us/artist/miasto-gniewu/1128249621?uo=4",
//    "collectionViewUrl":"https://music.apple.com/us/album/splin-ep/1501672457?uo=4",
//    "artworkUrl60":"https://is4-ssl.mzstatic.com/image/thumb/Music124/v4/4e/65/e4/4e65e415-85d3-6248-de45-731ecb7011e7/source/60x60bb.jpg",
//    "artworkUrl100":"https://is4-ssl.mzstatic.com/image/thumb/Music124/v4/4e/65/e4/4e65e415-85d3-6248-de45-731ecb7011e7/source/100x100bb.jpg",
//    "collectionPrice":3.99,
//    "collectionExplicitness":"notExplicit",
//    "trackCount":6,
//    "copyright":"℗ 2017 Perlazza Studio",
//    "country":"USA",
//    "currency":"USD",
//    "releaseDate":"2016-01-01T08:00:00Z",
//    "primaryGenreName":"Rock"
//}