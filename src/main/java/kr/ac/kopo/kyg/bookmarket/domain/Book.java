package kr.ac.kopo.kyg.bookmarket.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@Data
//@Getter
//@Setter
//@NoArgsConstructor
public class Book {
    private String bookId; // 도서번호
    private String name; // 도서 명
    private BigDecimal unitPrice ; // 단가
    private String author; // 저자
    private String description; // 도서 설명
    private String publisher; // 출판사
    private String category; // 도서 분류
    private long unitsInStock; // 재고량
    private String releaseDate; // 출판일
    private String condition; // 도서 상태(신규,중고,E북)
    private String fileName; // 도서 이미지 파일
    private MultipartFile BookImage; // 업로드된 도서 이미지 파일
}
