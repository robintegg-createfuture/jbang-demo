package com.example.jbang;

import static java.lang.System.*;

import org.apache.commons.text.StringSubstitutor;

public class JBangNoBuildUtils {

	public static void printout( String[] args ) {

		out.println("Well done, you've just run a jbang script from GitHub sources!!!!!");

		out.println( StringSubstitutor.replaceSystemProperties(  "You are running with java.version = ${java.version} and os.name = ${os.name}." ) );

	}

}
