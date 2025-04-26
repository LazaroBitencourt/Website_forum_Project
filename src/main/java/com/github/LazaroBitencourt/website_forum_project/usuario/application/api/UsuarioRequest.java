package com.github.LazaroBitencourt.website_forum_project.usuario.application.api;


import jakarta.validation.constraints.*;
import lombok.Getter;


    @Getter
    public class UsuarioRequest {
    @NotBlank
    @Size(max = 20, message = "A descrição deve ter no minimo 20 caracteres")
    private String primeiroNome;

    @NotBlank
    @Size(max = 50, message = "A descrição deve ter no minimo 50 caracteres")
    private String sobrenome;

    @Email(message = "Por favor, insira um e-mail válido.")
    private String email;

    @NotBlank
    private String senha;

}
