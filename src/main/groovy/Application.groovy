import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean

/**
 * Created on 11/22/16.
 */
class Application {

  static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
  }
}
