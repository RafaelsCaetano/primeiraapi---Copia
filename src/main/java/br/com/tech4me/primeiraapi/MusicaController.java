package br.com.tech4me.primeiraapi;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/musicas")

public class MusicaController {
     private List<Musica> musicas = new ArrayList<>();

     @GetMapping
    public List <Musica> obterMusicas(){
        return musicas;
    }

    @PostMapping
    public List<Musica> cadastarMusica(@RequestBody Musica musica){
        musicas.add(musica);
        return musicas;
    }
    
    @DeleteMapping("/{nome}")
    public List<Musica> excluirMusica (@PathVariable String nome){
        musicas.removeIf(m -> m.getNome() .equalsIgnoreCase(nome));
        return musicas;
    }
     
    @PutMapping ("/{nome}")
    public List<Musica> alterarMusica(@PathVariable String nome, @RequestBody Musica musica){
        for (Musica m: musicas){
            if (m.getNome().equalsIgnoreCase(nome)){
                m.setNome (musica.getNome());
                m.setCantor (musica.getCantor());
                m.setAnoLancamento(musica.getAnoLancamento());
            }
        }
        return musicas;
    }
        
        
    }
    
