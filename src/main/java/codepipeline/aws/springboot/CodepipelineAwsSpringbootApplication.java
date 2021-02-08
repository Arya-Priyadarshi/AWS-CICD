package codepipeline.aws.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("codepipeline.aws.springboot")
public class CodepipelineAwsSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodepipelineAwsSpringbootApplication.class, args);
	}

}
