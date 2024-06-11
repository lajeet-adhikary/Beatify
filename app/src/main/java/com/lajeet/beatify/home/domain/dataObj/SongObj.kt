package com.lajeet.beatify.home.domain.dataObj

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SongObj(
    val id: Long,
    val name: String,
    val artists: List<Long>, //artist id's
    val duration: Long,
    val lyrics: String,
    val playlist: List<Long> //playlist id's
) : Parcelable

@Parcelize
data class Artist(
    val id: Long, val name: String, val description: String
) : Parcelable

@Parcelize
data class Playlist(
    val id: Long, val name: String, val count: Long
) : Parcelable