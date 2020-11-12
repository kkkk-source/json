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

        Vendedor v2 = Vendedor.builder()
                .nombre("Jumbo")
                .apellido("Sas")
                .edad(50)
                .build();

        Vendedor v3 = Vendedor.builder()
                .nombre("Tilda")
                .apellido("mol")
                .edad(21)
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

        Cliente c3 = Cliente.builder()
                .nombre("Pepito")
                .direccion("Cll. Colombia")
                .telefono("2723454")
                .build();

        Cliente c4 = Cliente.builder()
                .nombre("Julano")
                .direccion("Av 33")
                .telefono("5093304")
                .build();

        Cliente c5 = Cliente.builder()
                .nombre("Elijah")
                .direccion("thatpart")
                .telefono("3013509")
                .build();

        List<Cliente> clientes1 = new ArrayList<Cliente>();
        clientes1.add(c1);
        clientes1.add(c2);

        List<Cliente> clientes2 = new ArrayList<Cliente>();
        clientes2.add(c1);
        clientes2.add(c2);
        clientes2.add(c3);
        clientes2.add(c4);

        List<Cliente> clientes3 = new ArrayList<Cliente>();
        clientes3.add(c1);
        clientes3.add(c2);
        clientes3.add(c3);
        clientes3.add(c4);
        clientes3.add(c5);

        v1.setClientes(clientes1);
        v2.setClientes(clientes2);
        v3.setClientes(clientes3);

        List<Vendedor> vendedores = new ArrayList<Vendedor>();
        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);

        try {
            JSONArray objVendedores = new JSONArray();
            for (Vendedor vendedor : vendedores) {
                JSONObject objVendedor = new JSONObject(vendedor);
                objVendedores.put(objVendedor);
            }
            System.out.println(objVendedores.toString(IDENT_FACTOR));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}