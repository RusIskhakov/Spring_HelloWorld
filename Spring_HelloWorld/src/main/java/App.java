import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1=
                (HelloWorld) applicationContext.getBean("helloworld");

        boolean isHelloWorldSame = bean == bean1;
        System.out.println("Резултат сравнения бинов HelloWorld: "+ isHelloWorldSame);

        Cat cat1 = (Cat) applicationContext.getBean("Cat");
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println("Результат сравнения бинов Cats: "+ (cat1 == cat2));
    }
}