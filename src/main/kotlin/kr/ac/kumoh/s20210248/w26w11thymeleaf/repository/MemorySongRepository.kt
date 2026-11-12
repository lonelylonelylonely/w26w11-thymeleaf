package kr.ac.kumoh.s20210248.w26w11thymeleaf.repository

import kr.ac.kumoh.s20210248.w26w11thymeleaf.model.Song

class MemorySongRepository : SongRepository {
        private val songs = listOf(
            Song(1, "Cosmic Echo", "NEBULA"),
            Song(2, "Neon Fever", "SPARK"),
            Song(3, "Velvet Bitter", "LUNA"),
            Song(4, "소란스러운 비밀", "Windy"),
        )

        override fun findAll(): List<Song> {
            return songs.toList()
        }

        override fun findById(id: Int): Song? {
            return songs.find { it.id == id }
        }
    }