package org.example.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class ConfigTest {

  @Test
  void configFileLoad() throws IOException {
    // 配置文件的加载
    InputStream resourceAsStream = Resources.getResourceAsStream("resources/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
  }
}
