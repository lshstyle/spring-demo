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

AOP 【动态代理】 在程序运行期间动态的将其段代码切人到指定方法指定位置运行的编程方式

1）导入aop 模块
2) 通知方法
       前置通知(@Before) 运行之前执行
      后置通知(@After)  运行结束之后执行
      返回通知(@AfterReturning) 在目标方法正常返回后运行
      异常通知(@AfterThrowing) 在目标方法出现异常以后运行
     环绕通知 (@Around)   动态代理，手动推进方法运行
    
  