package kr.ac.kopo.kyg.bookmarket.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommonException {
    @ExceptionHandler(value = CategoryException.class)
    private ModelAndView commonExceptionHandler(HttpServletRequest request, CategoryException e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e.toString());
        mav.addObject("invalidCategory", e.getCategory());
        mav.addObject("url", request.getRequestURL()+"/"+request.getQueryString());
        mav.setViewName("errorCommon");
        return mav;
    }
}
