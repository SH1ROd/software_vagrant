package org.example;

import java.util.List;
import java.util.Arrays;
import org.example.Unit;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! Made by Qiwei Lian");

	ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
	resolver.setTemplateMode(TemplateMode.TEXT);
	resolver.setPrefix("templates/");

	TemplateEngine engine = new TemplateEngine();
	engine.setTemplateResolver(resolver);

        Unit unit = new Unit("Software Tools", Arrays.asList("Linux", "GIt", "Maven"));

        Context context = new Context();
        context.setVariable("unit", unit);

	// Context c = new Context();
	// c.setVariable("name", "Software Tools");
	// List<String> topics = Arrays.asList("Linux", "Git", "Maven");
	// c.setVariable("topics", topics);
	// String greeting = engine.process("unit", c);

	String greeting = engine.process("unit", context);

	System.out.println(greeting);
    }
}
