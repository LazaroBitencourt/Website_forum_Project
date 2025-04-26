package com.github.LazaroBitencourt.website_forum_project.usuario.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class UsuarioIdResponse {
    private UUID UsuarioId;
}
