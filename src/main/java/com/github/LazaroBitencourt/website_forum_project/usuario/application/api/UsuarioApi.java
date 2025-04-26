package com.github.LazaroBitencourt.website_forum_project.usuario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/usuario")
public interface UsuarioApi {
    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioIdResponse postCadastraNovoUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest);
}
