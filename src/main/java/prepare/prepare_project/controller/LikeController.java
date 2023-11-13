package prepare.prepare_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import prepare.prepare_project.entity.CountryInfoEntity;
import prepare.prepare_project.service.CountryInfoService;

import java.util.List;

@Controller
public class LikeController {
//    @GetMapping("/like")
//    public String showIndexPage(){
//        return "like";
//    }

    @Autowired
    private CountryInfoService countryInfoService;

    @GetMapping("/like")
    public String showCountryInfo(Model model) {
        List<CountryInfoEntity> countryInfoList = countryInfoService.getAllCountryInfo();
        model.addAttribute("countryInfoList", countryInfoList);
        return "like"; // Thymeleaf 템플릿의 이름
    }
}
