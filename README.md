# ssm
spring-springMVC-myBatis3

## 执行建表脚本
DROP TABLE IF EXISTS `user_t`;

CREATE TABLE `user_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_t` */

insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (1,'测试','sfasgfaf',24);

## 使用MyBatis Generator自动创建代码
1. 添加自动生成mybatis接口,实体类,和映射文件,三个价包git忽略文件被排除了,自己加上
2. mybatis-generator-core-1.3.2.jar
3. mysql-connector-java-5.1.38-bin.jar
4. mybatis-3.3.0.jar
5. 参考这篇博客:http://blog.csdn.net/zhshulin/article/details/23912615
6. Java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
7. 这样在生成之后，就可以在src目录下找到相应的文件夹，每个表格都会对应三个文件（实体类、接口、配置文件）。


## mybatis3参考文档:
1. (mybatis官方中文文档)-----------http://www.mybatis.org/mybatis-3/zh/index.html
2. (mybatis-spring官方中文文档)--- http://www.mybatis.org/spring/zh/index.html
3. (MyBatis相关工具)--------http://mybatis.tk/


