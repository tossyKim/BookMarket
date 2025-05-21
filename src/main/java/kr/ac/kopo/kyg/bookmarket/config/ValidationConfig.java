package kr.ac.kopo.kyg.bookmarket.config;

import kr.ac.kopo.kyg.bookmarket.validator.BookValidator;
import kr.ac.kopo.kyg.bookmarket.validator.UnitsInStockValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationConfig {
    @Autowired
    UnitsInStockValidator unitsInStockValidator;

    @Bean
    public BookValidator bookValidator(){
        BookValidator bookValidator = new BookValidator();
        bookValidator.springValidators.add(unitsInStockValidator);
        return bookValidator;
    }
}
