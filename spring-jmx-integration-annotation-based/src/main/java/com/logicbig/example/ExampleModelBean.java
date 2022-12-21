package com.logicbig.example;

import java.lang.management.ManagementFactory;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class ExampleModelBean {
	
	@ManagedOperation
    public void print() {
		
		Thread thread=new Thread(){
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("Thread is running");
					try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} } } };
		thread.run();
       // System.out.println("This is my first spring-jmx-application");
    }
	
	@ManagedOperation
	public void stopMethod()
	{
		 
		 try {
			    MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
			    mbeanServer.unregisterMBean(new ObjectName("com.logicbig.example:name=exampleModelBean,type=ExampleModelBean"));
			    
			  } catch (JMException e) {
			    throw new IllegalArgumentException("com.logicbig.example:name=exampleModelBean,type=ExampleModelBean", e);
			  }
		System.out.println("=====stopped successfully==========");
	}
	
    /*private int lineLength;
    private int delay;
    private List<Consumer<Boolean>> stopListeners=new ArrayList<>();

    @ManagedAttribute
    public int getLineLength() {
        return lineLength;
    }

    @ManagedAttribute
    public void setLineLength(int lineLength) {
        this.lineLength = lineLength;
    }

    @ManagedAttribute
    public int getDelay() {
        return delay;
    }

    @ManagedAttribute
    public void setDelay(int delay) {
        this.delay = delay;
    }

    @ManagedOperation
    public void stop() {
        stopListeners.forEach(c->c.accept(true));
    }

    @ManagedOperation
    public void start() {
        stopListeners.forEach(c->c.accept(false));
    }

    public void addStopListener(Consumer<Boolean> stopListener) {
        stopListeners.add(stopListener);
    }*/
}