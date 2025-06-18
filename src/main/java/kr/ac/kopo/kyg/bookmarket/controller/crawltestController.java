package kr.ac.kopo.kyg.bookmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class crawltestController {

    private final RestTemplate restTemplate = new RestTemplate();

    // 식당 리스트 조회
    @GetMapping("/search")
    public String search(
            @RequestParam(name = "place", required = false) String place,
            @RequestParam(name = "food", required = false) String food,
            Model model) {

        if (place != null && food != null) {
            String apiUrl = String.format("http://localhost:5000/getname?place=%s&food=%s", place, food);
            try {
                Map<String, String> restaurantsSummary = restTemplate.getForObject(apiUrl, Map.class);
                model.addAttribute("restaurants", restaurantsSummary);
            } catch (Exception e) {
                model.addAttribute("error", "식당 정보를 가져오는 중 오류가 발생했습니다.");
            }
            model.addAttribute("place", place);
            model.addAttribute("food", food);
        }
        return "search";
    }

    // 리뷰 조회
    @GetMapping("/review")
    public String review(
            @RequestParam(name = "restaurantName", required = true) String restaurantName,
            @RequestParam(name = "place", required = true) String place,
            @RequestParam(name = "food", required = true) String food,
            Model model) {

        String reviewApiUrl = String.format("http://localhost:5000/getreview?place=%s&food=%s&name=%s", place, food, restaurantName);
        try {
            Map<String, String> reviewSummary = restTemplate.getForObject(reviewApiUrl, Map.class);
            model.addAttribute("reviews", reviewSummary);
        } catch (Exception e) {
            model.addAttribute("error", "리뷰를 가져오는 중 오류가 발생했습니다.");
        }
        model.addAttribute("restaurantName", restaurantName);
        model.addAttribute("place", place);
        model.addAttribute("food", food);

        return "search";
    }
}
