package prepare.prepare_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class joinController {
    @GetMapping("/join")
    public String showIndexPage() {
        return "join";
    }
}