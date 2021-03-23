package xyz.zfdu.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-09
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Child {
    private String name;
    private Integer age;
    // private List<Map<String, Object>> friends;
    private List<xyz.zfdu.boot.basic.entity.Friend> friends;
}
