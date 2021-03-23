package xyz.zfdu.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

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
public class Friend {
    private String hobby;
    private String gender;
}
