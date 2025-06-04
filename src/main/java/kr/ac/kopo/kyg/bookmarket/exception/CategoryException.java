package kr.ac.kopo.kyg.bookmarket.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class CategoryException extends RuntimeException {
    private String errorMessage;
    private String category;
    public CategoryException(String category) {
        super();
        this.category = category;
        errorMessage = "요청한 도서 분야를 찾을 수 없습니다.";
    }
}
