package xyz.zfdu.boot.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String githubName;
    private String nickname;
    private String hometown;
    private Date birthday;
    private String constellation;
    private String mobile;
    private String qq;
    private String email;
    private String avatar;
    private String github;
    private String hobby;
    private String signature;
    private String color;
}