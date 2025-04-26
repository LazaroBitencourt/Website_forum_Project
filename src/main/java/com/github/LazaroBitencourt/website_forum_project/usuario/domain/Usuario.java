package com.github.LazaroBitencourt.website_forum_project.usuario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TAB_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "UUID", name = "USUARIO_ID", unique = true, nullable = false)
    private UUID usuarioId;
    @NotBlank
    @Column(name = "PRIMEIRO_NOME")
    private String primeiroNome;

    @NotBlank
    @Column(name = "SOBRENOME")
    private String sobrenome;

    @Email
    @Column(name = "E_MAIL",unique = true, nullable = false)
    private String email;

    @Column(name = "SENHA")
    private String senha;

    @NotNull
    @Column(name = "USUARIO_ATIVO")
    private boolean usuarioAtivo;

    @NotNull
    @Column(name = "DATA_HORA_ULTIMA_LOGIN")
    private LocalDateTime dataHoraUltimoLogin;

    @NotNull
    @Column(name = "DATA_HORA_CADASTRO")
    private LocalDateTime datahoraCadastro;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "TIPO_DO_USUARIO")
    private TipoUsuario tipoUsuario;
}
