package com.desafio.viacep.Service;

import com.desafio.viacep.Entity.ViaCepData;
import com.desafio.viacep.Repository.ViaCepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {
    private final ViaCepRepository viaCepRepository;

    @Autowired
    public ViaCepService(ViaCepRepository viaCepRepository) {
        this.viaCepRepository = viaCepRepository;
    }

    public void salvarDados(ViaCepData data) {
        viaCepRepository.save(data);
    }

    // Outros métodos de serviço, se necessário
}
