package kr.ac.kumoh.s20210248.w26w11thymeleaf.service

import kr.ac.kumoh.s20210248.w26w11thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongServic(
    private val repository : SongRepository
) {
    /**
     * 모든 노래 리스트 얻음
     */
    fun findAllSongs() = repository.findAll()
    fun findSongById(id: Int) = repository.findById(id)
    fun getRandomSong() = repository.findAll().randomOrNull()
}