package prepare.prepare_project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import prepare.prepare_project.dto.MemoDTO;
import prepare.prepare_project.service.MemoService;

@Controller
@RequiredArgsConstructor
public class MemoController {
    private final MemoService memoService;
    @GetMapping("/memo")
    public String showIndexPage() {
        return "memo";
    }

    @PostMapping("/memo")
    public String save(@ModelAttribute MemoDTO memoDTO) {
        memoService.save(memoDTO);

        return "redirect:memo";
    }
}