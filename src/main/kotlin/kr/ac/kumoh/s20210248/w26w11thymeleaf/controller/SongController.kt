package kr.ac.kumoh.s20210248.w26w11thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute(
            "songTitle",
            "Cosmic Echo")
        // model에 song이라는 이름으로 Random Song이라는 값을 넣어줌

        return "random" // templates의 html 파일을 의미하는 것
    }
}