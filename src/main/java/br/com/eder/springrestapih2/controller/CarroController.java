package br.com.eder.springrestapih2.controller;

import br.com.eder.springrestapih2.model.Carro;
import br.com.eder.springrestapih2.repositorio.Carrorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarroController {


    @Autowired
    private Carrorepositorio carroRepositorio;

    @GetMapping
    public List<Carro> listAllCarros() {
        return carroRepositorio.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Carro carro){
        carroRepositorio.save(carro);
    }

    @PutMapping
    public void alterar(@RequestBody Carro carro){
        carroRepositorio.save(carro);
    }


    @DeleteMapping("/{registro}")
    public void deletar(@PathVariable Long registro) {
        carroRepositorio.deleteById(registro);
    }

    @GetMapping("/{registro}")
    public Optional<Carro> achar(@PathVariable Long registro) {
        return carroRepositorio.findById(registro);
    }


}



