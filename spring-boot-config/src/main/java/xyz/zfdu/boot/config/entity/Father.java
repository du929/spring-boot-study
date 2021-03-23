package xyz.zfdu.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;


/**
 * @author zfdu
 * @description
 * @data 2021-03-09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Father {
    @NotEmpty
    private String name;
    @Min(21)
    private Integer age;
}
