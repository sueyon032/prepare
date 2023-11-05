package prepare.prepare_project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import prepare.prepare_project.dto.JoinDTO;
import prepare.prepare_project.service.JoinService;

@Controller
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;
//    @GetMapping("/join")
//    public String showIndexPage() {
//        return "join";
//    }

    @GetMapping("/join")
    public String joinForm(Model model) {
        JoinDTO joinDTO = new JoinDTO();
        model.addAttribute("joinDTO", joinDTO);
        return "join"; // Thymeleaf 템플릿 이름
    }

    @PostMapping("/join")
    public String save(@ModelAttribute JoinDTO joinDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + joinDTO);
        joinService.save(joinDTO);

        return "index";
    }

}