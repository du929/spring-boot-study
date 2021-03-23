package xyz.zfdu.boot.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookReader {
    private  String name;
    private  Integer age;

}
