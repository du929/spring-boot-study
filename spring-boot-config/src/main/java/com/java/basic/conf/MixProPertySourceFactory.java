package xyz.zfdu.boot.basic.conf;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zfdu
 * @description 多种类型属性源配置工厂
 * @data 2021-03-11
 */
public class MixProPertySourceFactory extends DefaultPropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {
        String sourceName = name !=null ? name : resource.getResource().getFilename();
        if (sourceName != null && (sourceName.endsWith(".yml") || sourceName.endsWith(".yml"))) {
            Properties propertiesFromYaml = loadYml(resource);
            return new PropertiesPropertySource(sourceName,propertiesFromYaml);
        }else {
            return super.createPropertySource(name, resource);
        }
    }
    private Properties loadYml(EncodedResource resource) throws IOException{
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource.getResource());
        factory.afterPropertiesSet();
        return factory.getObject();
    }
}
