package prepare.prepare_project.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Join;
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
    @GetMapping("/join")
    public String joinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String save(@ModelAttribute JoinDTO joinDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + joinDTO);
        joinService.save(joinDTO);

        return "index";
    }

    @GetMapping("/index-form")
    public String loginForm(){
        return "index";
    }

    @PostMapping("/index") // session : 로그인 유지
    public String login(@ModelAttribute JoinDTO joinDTO, HttpSession session) {
        JoinDTO loginResult = joinService.login(joinDTO);
        if (loginResult != null) {
            // login 성공
            session.setAttribute("loginId", loginResult.getMemberId());
            return "main";
        } else {
            // login 실패
            return "index";
        }
    }

}