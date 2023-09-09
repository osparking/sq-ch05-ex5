package main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import service.CommentService;

public class AppMain {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var svc1 = ctx.getBean("commentService", CommentService.class);
		var svc2 = ctx.getBean("commentService", CommentService.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println("동명의 두 원형 빈은 같은 빈 객체이다: " + (svc1 == svc2));
	}

}
