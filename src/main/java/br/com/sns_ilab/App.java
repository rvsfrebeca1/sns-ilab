// package br.com.sns_ilab.sns;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class SnsApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SnsApplication.class, args);
// 	}

// }

package br.com.sns_ilab;

import java.time.LocalDate;

import br.com.sns_ilab.services.SNSService;

public class App 
{
    public static void main( String[] args )
    {
        SNSService.sendMessage("Uma mensagem - " + LocalDate.now());
    }
}
