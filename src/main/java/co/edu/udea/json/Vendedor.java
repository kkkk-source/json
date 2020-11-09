package co.edu.udea.json;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
public class Vendedor {

    @NonNull
    private int edad;

    @NonNull
    private String nombre;

    @NonNull
    private String apellido;

    private List<Cliente> clientes;
}
