package com.example.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.example.spring.ioc.bean.Person;
import com.example.spring.ioc.bean.RainBow;
import com.example.spring.ioc.config.BeanScopeConfig;
import com.example.spring.ioc.config.MainConfig;
import com.example.spring.ioc.config.MainConfigOfAutowire;
import com.example.spring.ioc.config.MainConfigOfLifeCycle;
import com.example.spring.ioc.config.MainConfigOfProfile;
import com.example.spring.ioc.config.MainConfigOfValue;
import com.example.spring.ioc.dao.BookDao;

import junit.framework.TestCase;

/**
 * 
 * @author Administrator
 *
 */

public class Test extends TestCase {

	/**
	 * 此用例为了研究容器中类的加载过程，如何获取bean, 组件是按照什么规则加载进容器。扫描组件的包含和排除类的配置等。
	 */
	public void test01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println("获取bean");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);

		System.out.println("获取bean的类型");
		String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String name : beanNamesForType) {
			System.out.println(name);
		}

		System.out.println("获取注册bean");
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}

	/**
	 * 此用例是为了研究bean的生命周期，原子性和实例性的区别，应用场景
	 */
	public void test02() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopeConfig.class);
		System.out.println("开始加载 bean.....");
		Person person1 = applicationContext.getBean(Person.class);
		Person person2 = applicationContext.getBean(Person.class);
		System.out.println(person1 == person2);
	}

	// 条件选择注入bean
	public void test03() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopeConfig.class);
		Environment environment = applicationContext.getEnvironment();
		System.out.println(environment.getProperty("os.name"));
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person.toString());
	}

	// bean生命周期
	public void test04() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigOfLifeCycle.class);
		System.out.println("容器创建完成");
		applicationContext.close();
	}

	// 加载配置文件
	public void test05() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigOfValue.class);
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person.toString());
	}

	// 自动装配
	public void test06() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigOfAutowire.class);
		BookDao bookDao = applicationContext.getBean(BookDao.class);
		System.out.println(bookDao.toString());
	}

	// 根据环境注册bean
	public void test07() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("test");
		applicationContext.register(MainConfigOfProfile.class);
		applicationContext.refresh();
		RainBow rainBow = applicationContext.getBean(RainBow.class);
		System.out.println(rainBow.toString());
	}
	
	// 根据环境注册bean
		public void test08() {
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
			RainBow rainBow = applicationContext.getBean(RainBow.class);
			System.out.println(rainBow.toString());
		}


}
