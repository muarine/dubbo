package com.muarine.dubboclient;

public class TestClient {
	private static String javaVersion = null;
	private static String majorJavaVersion = null;
	
	static {
        javaVersion = System.getProperty("java.version");
        // version String should look like "1.4.2_10"
        if (javaVersion.indexOf("1.8.") != -1) {
            majorJavaVersion = "JAVA_18";
        }
        else if (javaVersion.indexOf("1.7.") != -1) {
        	majorJavaVersion = "JAVA_17";
        }
        else if (javaVersion.indexOf("1.6.") != -1) {
            majorJavaVersion = "JAVA_16";
        }
        else if (javaVersion.indexOf("1.5.") != -1) {
            majorJavaVersion = "JAVA_15";
        }
        else {
            // else leave 1.4 as default (it's either 1.4 or unknown)
            majorJavaVersion = "JAVA_14";
        }
    }
	
	public static void main(String[] args) throws Exception {
//	    com.alibaba.dubbo.container.Main.main(args);
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "applicationConsumer.xml" });
//		
//		context.start();
//		DemoAction action = context.getBean(DemoAction.class);
//		DemoAction action = new DemoAction();
//		action.start();
		System.out.println(majorJavaVersion);
		
	}

}