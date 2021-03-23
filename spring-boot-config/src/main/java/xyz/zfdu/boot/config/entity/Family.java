package xyz.zfdu.boot.config.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import xyz.zfdu.boot.basic.conf.MixProPertySourceFactory;



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
@Validated
@PropertySource(value = {"classpath:family.yml"}, factory = MixProPertySourceFactory.class)
@ConfigurationProperties(prefix = "family")
public class Family {
    @Length(min = 5, max = 20, message = "家庭名长度必须位于5到20之间")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}


