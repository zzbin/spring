package com.propertySourceDemo.factory;

import cn.hutool.core.text.UnicodeUtil;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 功能描述: 
 * @Param: 
 * @Return: 
 * @Author: zhangzibin
 * @Date: 2021/7/26 14:17
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        Properties propertiesFromYaml = loadYamlIntoProperties(resource);
        String sourceName = name != null ? name : resource.getResource().getFilename();
        return new PropertiesPropertySource(sourceName, propertiesFromYaml);
    }

    private Properties loadYamlIntoProperties(EncodedResource resource) throws IOException {
        try {
            YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
            factory.setResources(resource.getResource());
            factory.afterPropertiesSet();
            Properties properties = factory.getObject();
            // 将unicode编码转换成中文
            properties.entrySet().stream().forEach(a->a.setValue(UnicodeUtil.toString(a.getValue() + "")));

            return properties;
        } catch (IllegalStateException e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                throw (FileNotFoundException) e.getCause();
            }
            throw e;
        }
    }

    public static void main(String[] args) {
        System.out.println(UnicodeUtil.toString("\\u5C0F\\u72D71"));
    }
}
