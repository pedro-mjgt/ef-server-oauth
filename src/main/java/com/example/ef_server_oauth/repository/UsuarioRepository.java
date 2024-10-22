package com.example.ef_server_oauth.repository;

import com.example.ef_server_oauth.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByUsuario(String usuario);
}

