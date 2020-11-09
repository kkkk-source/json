package co.edu.udea.json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class App 
{
    public static int IDENT_FACTOR = 4;

    public static void main(String[] args) {
        Vendedor v1 = Vendedor.builder()
            .nombre("Juan")
            .apellido("Perez")
            .edad(10)
            .build();

        Cliente c1 = Cliente.builder()
            .nombre("HIVYMAR")
            .direccion("Victor Emilio Estrada 204")
            .telefono("5020800")
            .build();

        Cliente c2 = Cliente.builder()
            .nombre("PROMESA")
            .direccion("Via. Daule KM 5.5")
            .telefono("5013604")
            .build();

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);

        JSONObject objVendedor = new JSONObject(v1);
        JSONArray objClientes = new JSONArray();
        try {
            for (Cliente cliente : clientes) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientes.put(objCliente);
            }
            JSONObject objVendedorClientes = new JSONObject();
            objVendedorClientes.put("vendedor", objVendedor);
            objVendedorClientes.put("clientes", objClientes);
            System.out.println(objVendedorClientes.toString(IDENT_FACTOR));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
