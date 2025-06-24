# jbang-demo
A project for demonstrating JBang features

```java

///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.apache.commons:commons-text:1.13.1

import static java.lang.System.*;

import org.apache.commons.text.StringSubstitutor;

public class jbangurl {

	public static void main(String... args) {

		out.println("Well done, you've just run a jbang script from some markdown!!!!!");

		out.println( StringSubstitutor.replaceSystemProperties(  "You are running with java.version = ${java.version} and os.name = ${os.name}." ) );

	}

}

```