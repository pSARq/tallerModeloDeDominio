package co.com.sofka.gerenteRedesSociales.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

public class CrearGerenteRedesSociales extends Command {

    private IdGerenteRedesSociales idGerenteRedesSociales;
    private String nombre;

    public CrearGerenteRedesSociales(IdGerenteRedesSociales idGerenteRedesSociales, String nombre){
        this.idGerenteRedesSociales = idGerenteRedesSociales;
        this.nombre = nombre;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public String getNombre() {
        return nombre;
    }
}
