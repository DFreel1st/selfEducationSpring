package main;

import configuration.ProjectConfig;
import model.Comment;
import services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Natasha");
        comment.setText("Demo comment");

        String  value = service.publishComment(comment);

        logger.info(value);
    }
}
