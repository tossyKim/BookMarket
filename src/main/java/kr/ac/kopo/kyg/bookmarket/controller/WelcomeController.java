package kr.ac.kopo.kyg.bookmarket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value ="/home",method = RequestMethod.GET)
    public String welcomeMethod(){
        String welcomeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Welcome BookMarket</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<svg xmlns=\"http://www.w3.org/2000/svg\" class=\"d-none\">\n" +
                "    <symbol id=\"check2\" viewBox=\"0 0 16 16\">\n" +
                "        <path d=\"M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z\"/>\n" +
                "    </symbol>\n" +
                "    <symbol id=\"circle-half\" viewBox=\"0 0 16 16\">\n" +
                "        <path d=\"M8 15A7 7 0 1 0 8 1v14zm0 1A8 8 0 1 1 8 0a8 8 0 0 1 0 16z\"/>\n" +
                "    </symbol>\n" +
                "    <symbol id=\"moon-stars-fill\" viewBox=\"0 0 16 16\">\n" +
                "        <path d=\"M6 .278a.768.768 0 0 1 .08.858 7.208 7.208 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277.527 0 1.04-.055 1.533-.16a.787.787 0 0 1 .81.316.733.733 0 0 1-.031.893A8.349 8.349 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.752.752 0 0 1 6 .278z\"/>\n" +
                "        <path d=\"M10.794 3.148a.217.217 0 0 1 .412 0l.387 1.162c.173.518.579.924 1.097 1.097l1.162.387a.217.217 0 0 1 0 .412l-1.162.387a1.734 1.734 0 0 0-1.097 1.097l-.387 1.162a.217.217 0 0 1-.412 0l-.387-1.162A1.734 1.734 0 0 0 9.31 6.593l-1.162-.387a.217.217 0 0 1 0-.412l1.162-.387a1.734 1.734 0 0 0 1.097-1.097l.387-1.162zM13.863.099a.145.145 0 0 1 .274 0l.258.774c.115.346.386.617.732.732l.774.258a.145.145 0 0 1 0 .274l-.774.258a1.156 1.156 0 0 0-.732.732l-.258.774a.145.145 0 0 1-.274 0l-.258-.774a1.156 1.156 0 0 0-.732-.732l-.774-.258a.145.145 0 0 1 0-.274l.774-.258c.346-.115.617-.386.732-.732L13.863.1z\"/>\n" +
                "    </symbol>\n" +
                "    <symbol id=\"sun-fill\" viewBox=\"0 0 16 16\">\n" +
                "        <path d=\"M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8zM8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0zm0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13zm8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5zM3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8zm10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0zm-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0zm9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707zM4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708z\"/>\n" +
                "    </symbol>\n" +
                "</svg>\n" +
                "\n" +
                "<div class=\"dropdown position-fixed bottom-0 end-0 mb-3 me-3 bd-mode-toggle\">\n" +
                "    <button class=\"btn btn-bd-primary py-2 dropdown-toggle d-flex align-items-center\"\n" +
                "            id=\"bd-theme\"\n" +
                "            type=\"button\"\n" +
                "            aria-expanded=\"false\"\n" +
                "            data-bs-toggle=\"dropdown\"\n" +
                "            aria-label=\"Toggle theme (auto)\">\n" +
                "        <svg class=\"bi my-1 theme-icon-active\" width=\"1em\" height=\"1em\"><use href=\"#circle-half\"></use></svg>\n" +
                "        <span class=\"visually-hidden\" id=\"bd-theme-text\">Toggle theme</span>\n" +
                "    </button>\n" +
                "    <ul class=\"dropdown-menu dropdown-menu-end shadow\" aria-labelledby=\"bd-theme-text\">\n" +
                "        <li>\n" +
                "            <button type=\"button\" class=\"dropdown-item d-flex align-items-center\" data-bs-theme-value=\"light\" aria-pressed=\"false\">\n" +
                "                <svg class=\"bi me-2 opacity-50\" width=\"1em\" height=\"1em\"><use href=\"#sun-fill\"></use></svg>\n" +
                "                Light\n" +
                "                <svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\"><use href=\"#check2\"></use></svg>\n" +
                "            </button>\n" +
                "        </li>\n" +
                "        <li>\n" +
                "            <button type=\"button\" class=\"dropdown-item d-flex align-items-center\" data-bs-theme-value=\"dark\" aria-pressed=\"false\">\n" +
                "                <svg class=\"bi me-2 opacity-50\" width=\"1em\" height=\"1em\"><use href=\"#moon-stars-fill\"></use></svg>\n" +
                "                Dark\n" +
                "                <svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\"><use href=\"#check2\"></use></svg>\n" +
                "            </button>\n" +
                "        </li>\n" +
                "        <li>\n" +
                "            <button type=\"button\" class=\"dropdown-item d-flex align-items-center active\" data-bs-theme-value=\"auto\" aria-pressed=\"true\">\n" +
                "                <svg class=\"bi me-2 opacity-50\" width=\"1em\" height=\"1em\"><use href=\"#circle-half\"></use></svg>\n" +
                "                Auto\n" +
                "                <svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\"><use href=\"#check2\"></use></svg>\n" +
                "            </button>\n" +
                "        </li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "<main>\n" +
                "    <div class=\"container py-4\">\n" +
                "        <header class=\"pb-3 mb-4 border-bottom\">\n" +
                "            <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
                "                <svg width=\"32px\" height=\"32px\" viewBox=\"0 -0.5 20 20\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
                "\n" +
                "                    <title>book [#1207]</title>\n" +
                "                    <desc>Created with Sketch.</desc>\n" +
                "                    <defs>\n" +
                "\n" +
                "                    </defs>\n" +
                "                    <g id=\"Page-1\" stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\">\n" +
                "                        <g id=\"Dribbble-Light-Preview\" transform=\"translate(-260.000000, -2759.000000)\" fill=\"#000000\">\n" +
                "                            <g id=\"icons\" transform=\"translate(56.000000, 160.000000)\">\n" +
                "                                <path d=\"M222,2612.40709 C222,2612.84565 221.729,2613.23594 221.324,2613.3787 L215,2615.60539 L215,2603.71501 L215,2603.53322 L220.676,2601.53454 C221.325,2601.3055 222,2601.80055 222,2602.50615 L222,2612.40709 Z M213,2603.71501 L213,2615.60539 L206.676,2613.3787 C206.271,2613.23594 206,2612.84565 206,2612.40709 L206,2602.50615 C206,2601.80055 206.675,2601.3055 207.324,2601.53454 L213,2603.53322 L213,2603.71501 Z M221.337,2599.11785 L214.331,2601.64444 C214.117,2601.72147 213.883,2601.72147 213.669,2601.64444 L206.663,2599.11785 C205.362,2598.64847 204,2599.6396 204,2601.05592 L204,2613.11577 C204,2613.997 204.547,2614.78065 205.36,2615.06207 L213.68,2617.94608 C213.888,2618.01797 214.112,2618.01797 214.32,2617.94608 L222.64,2615.06207 C223.453,2614.78065 224,2613.997 224,2613.11577 L224,2601.05592 C224,2599.6396 222.638,2598.64847 221.337,2599.11785 L221.337,2599.11785 Z\" id=\"book-[#1207]\">\n" +
                "\n" +
                "                                </path>\n" +
                "                            </g>\n" +
                "                        </g>\n" +
                "                    </g>\n" +
                "                </svg>\n" +
                "                <span class=\"fs-4\">&nbsp;&nbsp;Book Market</span>\n" +
                "            </a>\n" +
                "        </header>\n" +
                "\n" +
                "        <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
                "            <div class=\"container-fluid py-5\">\n" +
                "                <h1 class=\"display-5 fw-bold\">도서 쇼핑몰에 오신 것을 환영합니다.</h1>\n" +
                "                <p class=\"col-md-8 fs-4\">BookMarket</p>\n" +
                "\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"row align-items-md-stretch text-center\">\n" +
                "            <div class=\"col-md-12\">\n" +
                "                <div class=\"h-100 p-5\">\n" +
                "                    <h2>Welcome to Web Market</h2>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <footer class=\"pt-3 mt-4 text-body-secondary border-top\">\n" +
                "            <span class=\"text-body-secondary\">&copy; 2025 BookMarket</span>\n" +
                "        </footer>\n" +
                "    </div>\n" +
                "</main>\n" +
                "</body>\n" +
                "</html>";

        return welcomeHtml;
    }
}
