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
    // 配置文件的加载，也就是将 classpath 下的文件读取成 InputStream 输入流
    InputStream resourceAsStream = Resources.getResourceAsStream("resources/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
  }
}
