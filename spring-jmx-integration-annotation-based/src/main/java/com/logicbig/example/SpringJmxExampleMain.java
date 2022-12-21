package com.logicbig.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.swing.*;
import java.awt.*;

public class SpringJmxExampleMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        try {
			Thread.sleep(200000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("=========completed=========");
      /*  ExamplePanel panel = context.getBean(ExamplePanel.class);
        JFrame frame = createFrame();
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/
    }

    /*private static JFrame createFrame() {
        JFrame frame = new JFrame("Spring JMX Integration Example ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 400));
        return frame;
    }*/
}