package co.com.sofka.administracion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gerenteRedesSociales.values.IdGerenteRedesSociales;

public class AdministracionCreada extends DomainEvent {
    private final String nombre;
    private final IdGerenteRedesSociales idGerenteRedesSociales;
    public AdministracionCreada(String nombre, IdGerenteRedesSociales idGerenteRedesSociales){
        super("sofka.administracion.administracioncreada");
        this.nombre = nombre;
        this.idGerenteRedesSociales = idGerenteRedesSociales;
    }

    public IdGerenteRedesSociales getIdGerenteRedesSociales() {
        return idGerenteRedesSociales;
    }

    public String getNombre() {
        return nombre;
    }
}
