import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

public class JavaSpring {
    @Service
    public class UserBean {
        private String name;

        public UserBean() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Configuration
    public class AppConfig {
        @Bean
        public MyService myService() {
        }
    }

}
