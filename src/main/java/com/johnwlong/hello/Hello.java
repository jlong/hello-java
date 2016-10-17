package com.johnwlong.hello;

public class Hello {

	public static void main(String[] args) {
		switch (args.length) {
		case 0:
			System.out.println("Hello world!");
			break;
		case 1:
			System.out.printf("Hello %s!\n", args[0]);
			break;
		default:
			System.err.println("hello: too many parameters!");	
		}
	}

}
