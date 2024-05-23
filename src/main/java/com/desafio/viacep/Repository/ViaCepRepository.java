package com.desafio.viacep.Repository;

import com.desafio.viacep.Entity.ViaCepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaCepRepository extends JpaRepository<ViaCepData, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
