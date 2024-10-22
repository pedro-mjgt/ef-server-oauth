package com.example.ef_server_oauth.service.imp;

import com.example.ef_server_oauth.model.Usuario;
import com.example.ef_server_oauth.repository.UsuarioRepository;
import com.example.ef_server_oauth.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsuarioService implements IUsuarioService, UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorUsuario(String usuario) {
        return usuarioRepository.findByUsuario(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = obtenerUsuarioPorUsuario(username);

        return User.withUsername(usuario.getUsuario())
                .password(usuario.getPassword())
                .roles(usuario.getRol())
                .build();
    }

}
