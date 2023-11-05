package prepare.prepare_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemoController {
    @GetMapping("/memo")
    public String showIndexPage() {
        return "memo";
    }
}