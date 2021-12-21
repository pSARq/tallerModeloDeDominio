package co.com.sofka.administracion.events;

import co.com.sofka.administracion.values.IdActividadRecreativa;
import co.com.sofka.administracion.values.Material;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoMaterialActividadRecreativa extends DomainEvent {
    private final Material material;

    public ModificadoMaterialActividadRecreativa(Material material) {
        super("sofka.administracion.modificadomaterialactividadrecreativa");
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
}
