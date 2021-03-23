package xyz.zfdu.boot.jdbc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private Integer id;
    private String author;

    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    private List<BookReader> readers;


}
