package kr.ac.kumoh.s20210248.w26w11thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(): String {
        return "random" // templates의 html 파일을 의미하는 것
    }
}