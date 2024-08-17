package com.project.restaurantowners.controller;

import com.project.restaurantowners.dto.ColaboradorRequest;
import com.project.restaurantowners.dto.ColaboradorResponse;
import com.project.restaurantowners.model.Colaborador;
import com.project.restaurantowners.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public List<Colaborador> findAll() {
        return colaboradorService.findAll();
    }

    @GetMapping("/{id}")
    public Colaborador findById(@PathVariable Long id) {
        return colaboradorService.findById(id);
    }

    @PostMapping
    public ResponseEntity<ColaboradorResponse> create(@RequestBody ColaboradorRequest colaboradorRequest, UriComponentsBuilder uriBuilder) {
        var colaborador = colaboradorService.create(colaboradorRequest.toModel());
        var uri = uriBuilder.path("/colaboradores/{id}").buildAndExpand(colaborador.getId()).toUri();

        return ResponseEntity.create(uri).body(ColaboradorResponse.from(colaborador));
    }

    @PutMapping("/{id}")
    public Colaborador update(@PathVariable Long id, @RequestBody Colaborador colaborador) {
        return colaboradorService.update(id, colaborador);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        colaboradorService.deleteById(id);
    }
}