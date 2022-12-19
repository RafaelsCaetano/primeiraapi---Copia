package br.com.tech4me.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ola")
public class Ola {

    @GetMapping ("/{nome}")
    public String obterMensagemComNome (@PathVariable String nome) {
        return "Olá " + nome;
    } 

    @GetMapping 
    public String obterMensagem1 () {
        return "Olá alunos da Tech4Me!";
    
}

@GetMapping  ("/saudacao")
public String obterMensagem (@RequestBody String saudacao) {
    return "A mensagem foi" + saudacao;

}

}
