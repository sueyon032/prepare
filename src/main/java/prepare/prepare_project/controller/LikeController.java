package prepare.prepare_project.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

//    @GetMapping("/like")
//    public String showCountryInfo(Model model, HttpSession session, @RequestParam(required = false) Long countryId) {
//        // Existing code to load countryInfoList...
//
//        String userId = (String) session.getAttribute("userId");
//
//        if (userId != null) {
//            // Existing code to load likedCountries...
//
//            // If countryId parameter is present, handle it (you can highlight the liked country or display a message)
//            if (countryId != null) {
//                // Handle the countryId, e.g., show a message or highlight the liked country
//                model.addAttribute("highlightedCountryId", countryId);
//            }
//        }
//
//        return "like";
//    }


}
