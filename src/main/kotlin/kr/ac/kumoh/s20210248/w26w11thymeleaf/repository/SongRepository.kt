package kr.ac.kumoh.s20210248.w26w11thymeleaf.repository

import kr.ac.kumoh.s20210248.w26w11thymeleaf.model.Song

interface SongRepository {
    fun findAll(): List<Song>
    fun findById(id: Int): Song?
}