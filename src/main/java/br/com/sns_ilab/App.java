package br.com.sns_ilab;

import java.time.LocalDate;

import br.com.sns_ilab.services.SNSService;

public class App {
    public static void main(String[] args) {
        SNSService.sendMessage("Mensagem: " + LocalDate.now());
    }
}
