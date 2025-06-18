package kr.ac.kopo.kyg.bookmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class CalcController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/cal")
    public String calculate(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2,
            @RequestParam(name = "num3", required = false) Integer num3,
            @RequestParam(name = "num4", required = false) Integer num4,
            Model model) {

        // 파라미터가 없으면 (최초 접근) 입력 폼만 보여줌
        if (num1 == null || num2 == null || num3 == null || num4 == null) {
            return "calcResult";  // 뷰 이름 (HTML 파일명)
        }

        // 파라미터가 있으면 Flask API 호출해서 결과 받아오기
        String sumUrl = String.format(
                "http://localhost:5000/sum?num1=%d&num2=%d&num3=%d&num4=%d",
                num1, num2, num3, num4);
        String mulUrl = String.format(
                "http://localhost:5000/mul?num1=%d&num2=%d&num3=%d&num4=%d",
                num1, num2, num3, num4);

        String sumResult = restTemplate.getForObject(sumUrl, String.class);
        String mulResult = restTemplate.getForObject(mulUrl, String.class);

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("num3", num3);
        model.addAttribute("num4", num4);
        model.addAttribute("sumResult", sumResult);
        model.addAttribute("mulResult", mulResult);

        return "calcResult";  // 뷰 이름
    }
}
