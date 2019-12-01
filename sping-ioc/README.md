create a new repository on the command line
echo "# spring-demo" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/lshstyle/spring-demo.git
git push -u origin master

push an existing repository from the command line
git remote add origin https://github.com/lshstyle/spring-demo.git
git push -u origin master


给容器中注册组件
  1）包扫描+注解（@Controller、@Service、@Repository、@Component） 自己写的类
  2）@Bean 导入的第三方包
  3）@Import 快速导入组件
  4）@ImportSelector 自定义全类名
  5）@ImortBeanDefinitionRegistrar 手动注册bean到容器中
  6）使用spring提供的FactoryBean 默认获取的是getObject获取的对象，要获取工厂bean,在前面加上&
 
 
bean生命周期
   bean 创建 -- 初始化 -- 销毁 
   
   1) 指定初始化和销毁方法
        构造函数 
           单实例 对象创建的时候执行
          多实例  对象调用的时候执行
       对象初始化 
                     对象创建完成并赋值成功
       对象销毁 
             单实例 容器关闭
             多实例 不销毁

   2) 让bean实现InitializingBean 定义初始化逻辑  DisposableBean 定义销毁逻辑
   3) 使用JSR250  
   4) BeanPostProcessor postProcessBeforeInitialization在初始化之前工作  postProcessAfterInitialization在初始化之后工作
        链路
    -->AnnotationConfigApplicationContext 注册容器
      -->refresh() 刷新容器
        -->finishBeanFactoryInitialization bean工厂的初始化
          -->doCreateBean  创建bean
            -->populateBean 属性赋值
              -->initializeBean 初始化bean
                -->applyBeanPostProcessorsBeforeInitialization
                   -->invokeInitMethods
                     -->applyBeanPostProcessorsAfterInitialization

加载配置
  1) 数值、字符串
  2) Spring EL表达式 #{}
  3) ${}

自动装配
  1) @Autowired
              1）默认按照类型去容器找对应的组件 spring定义的
              2）如果找到了多个，默认以属性的名称为组件的id去容器中查找
              3）使用@Qualifier 来指需要装配的组件的id,而不是使用属性
              4) 默认至少要有一个bean,如果没有，需要指定属性
              5) @Primary 在Spring自动装配的时候，默认使用首选的bean,也可以继续使用@Qualifier装配需要的bean
  2)@Resource(JSR250), @Inject(JSP330) java规范
     @Resource 可以和 @Autowired 一样实现自动装配，但是是按照名称来选择组件 可以使用name属性定义组件名称，但是没有@Qualifier
                                              和@Primary
     @Inject 需要导入javax.inject包，和@Autowired功能一样
     AutowiredAnnotationBeanPostProcessor 完成自动装配
     autowire 
              构造器   如果构造器只有一个参数，这个参数的@Autowired可以省略，参数位置的组件还是可以从容器中获取
              属性 
              方法  @Bean 标注的方法 创建对象的时候，方法参数的值从容器中获取
              参数
 
 自定义组件想要使用Spring容器底层的一些组件 比如ApplicationContext BeanFactory 自定义组件实现xxxAware,在创建对象的时候，会调用接口规定的方法注入相关组件，Aware 把Spring底层一些组件注入到自定义的bean中         
    ApplicationContextAware ==> ApplicationContextAwareProcessor

常用数据库连接池
  DBCP  Apache下独立的数据库连接池组件
  c3p0  
  druid

profile
  Spring根据我们的当前环境，动态的切换配置环境
   1) 启动时 添加参数 -Dspring.profiles.active=test
   2）
            1) 创建一个无参构造器，创建一个容器 
            2) 设置需要激活的环境  applicationContext.getEnvironment().setActiveProfiles("test");
            3) 注册主配置类
            4) 刷新容器
            
  加了环境标识的bean,只有这个环境被激活的时候才能注册到容器中，不指定，任何环境下都能注册这个组件
 写在配置类上，只有是指定的环境的时候，整个配置类里面的所有配置才能开始生效
没有标注环境表示的bean,任何环境都是加载的

  
      
    
  