package hello;

import org.joda.time.LocalTime;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("We're in!!!");
		LocalTime currentTime = new LocalTime();
		System.out.println("Local time is:  "+currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}

}
