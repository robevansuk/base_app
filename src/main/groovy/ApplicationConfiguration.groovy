import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Created on 11/22/16.
 */
@Configuration
@ComponentScan
class ApplicationConfiguration {

  @Bean
  def getApplication(){
    return new Application()
  }
}