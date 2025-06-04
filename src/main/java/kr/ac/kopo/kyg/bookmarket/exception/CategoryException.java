package kr.ac.kopo.kyg.bookmarket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class CategoryException extends RuntimeException {
    private String errorMessage;
    public CategoryException() {
        super();
        errorMessage = "요청한 도서 분야를 찾을 수 없습니다.";
    }
}
