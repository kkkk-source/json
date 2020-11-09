package co.edu.udea.json;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Cliente {

    @NonNull
    private String nombre;

    @NonNull
    private String direccion;

    @NonNull
    private String telefono;
}
