package spring.expression;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

@Configuration
@ComponentScan(basePackageClasses = MySingletonBean.class)
@ImportResource("classpath:bean.xml")
public class AppConfig {

	
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        /*Define MySingletonBean as component & then using @ComponentScan */
        //MySingletonBean bean = context.getBean(MySingletonBean.class);
        MySingletonBean bean = (MySingletonBean)context.getBean("youCanDefineBeanNameHereAlsoPleaseNote"); 
        System.out.println("name of the MySingletonBean is : "+bean.getName());
        System.out.println("address of the MySingletonBean is : "+bean.getAddress()); 
        bean.showMessageDetail();
        Car carBean=(Car)context.getBean("car"); //here i am passing the bean name.
        System.out.println("Horse Power of car  is : "+carBean.getHorsePower());
        
        // Using ExpressionParser
        
        
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("'Any string'");
        String result = (String) expression.getValue();
        System.out.println("result=="+result);
        
        Expression expression1 = expressionParser.parseExpression("'Any string'.length()");
        Integer result1 = (Integer) expression1.getValue();
        System.out.println("result1.length()=="+result1);
        
        
        Car car = new Car();
        car.setMake("Good manufacturer");
        car.setModel("Model 3 jiiii");
         
        //The most common usage is to provide an expression string that is evaluated against a specific object instance
        
        ExpressionParser expressionParser2 = new SpelExpressionParser();
        Expression expression2 = expressionParser2.parseExpression("model");
         
        EvaluationContext context1 = new StandardEvaluationContext(car);
        String result3 = (String) expression2.getValue(context1);
        System.out.println("result3=="+result3);
        
    }
}
