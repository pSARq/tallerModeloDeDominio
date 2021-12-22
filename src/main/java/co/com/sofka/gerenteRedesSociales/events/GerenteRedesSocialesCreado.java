package co.com.sofka.gerenteRedesSociales.events;

import co.com.sofka.domain.generic.DomainEvent;


public class GerenteRedesSocialesCreado extends DomainEvent {

    private final String nombre;

    public GerenteRedesSocialesCreado(String nombre) {
        super("sofka.gerenteredessociales.gerenteredessocialescreado");
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
