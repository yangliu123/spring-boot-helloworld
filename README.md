命令:
mvn spring-boot:run

eclipse:
通过在UserController中加上@EnableAutoConfiguration开启自动配置，
然后通过SpringApplication.run(UserController.class);运行这个控制器；这种方式只运行一个控制器比较方便；
