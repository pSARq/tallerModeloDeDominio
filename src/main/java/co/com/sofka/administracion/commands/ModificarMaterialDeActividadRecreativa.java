package co.com.sofka.administracion.commands;

import co.com.sofka.administracion.values.IdAdministracion;
import co.com.sofka.administracion.values.Material;
import co.com.sofka.domain.generic.Command;

public class ModificarMaterialDeActividadRecreativa extends Command {
    private final IdAdministracion idAdministracion;
    private final Material material;

    public ModificarMaterialDeActividadRecreativa(IdAdministracion idAdministracion, Material material) {
        this.idAdministracion = idAdministracion;
        this.material = material;
    }

    public IdAdministracion getIdAdministracion() {
        return idAdministracion;
    }

    public Material getMaterial() {
        return material;
    }
}
