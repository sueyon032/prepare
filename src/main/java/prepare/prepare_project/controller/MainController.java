package prepare.prepare_project.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import prepare.prepare_project.entity.CountryInfoEntity;
import prepare.prepare_project.service.CountryInfoService;
import prepare.prepare_project.service.LikeService;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private CountryInfoService countryInfoService;

    @Autowired
    private LikeService likeService;

    @GetMapping("/main")
    public String showCountryInfo(Model model) {
        List<CountryInfoEntity> countryInfoList = countryInfoService.getAllCountryInfo();
        model.addAttribute("countryInfoList", countryInfoList);
        return "main"; // Thymeleaf 템플릿의 이름
    }

    // In your MainController
    @PostMapping("/like")
    public String likeCountry(@RequestParam Long countryId, HttpSession session, Model model) {
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
            // Get the liked country information by countryId
            Optional<CountryInfoEntity> countryInfoOptional = countryInfoService.getCountryInfoById(countryId);

            if (countryInfoOptional.isPresent()) {
                CountryInfoEntity countryInfoEntity = countryInfoOptional.get();

                // Save the liked country information for the user
                likeService.saveLikedCountry(userId, countryInfoEntity);

                // Redirect to like.html with the countryId as a parameter
                return "redirect:/like?countryId=" + countryId;
            } else {
                // Handle the case where the country is not found
                return "redirect:/main";
            }
        } else {
            // Handle the case where the user is not logged in
            return "redirect:/login"; // Redirect to the login page or another appropriate page
        }
    }

}
