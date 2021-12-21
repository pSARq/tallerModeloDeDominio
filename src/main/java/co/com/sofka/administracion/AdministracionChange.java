package co.com.sofka.administracion;

import co.com.sofka.administracion.events.*;
import co.com.sofka.administracion.values.PersonalCaminata;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;
import java.util.Optional;

public class AdministracionChange extends EventChange {

    public AdministracionChange(Administracion administracion) {

        apply((AdministracionCreada event) ->{
            administracion.nombre = event.getNombre();
            administracion.idGerenteRedesSociales = event.getIdGerenteRedesSociales();
            administracion.guias = new HashSet<>();
        });

        apply((GuiasSeleccionados event) ->{
            administracion.guias.add(new Guia(event.getIdGuia(), event.getNombre(), event.getCapacidadClientes()));
        });

        apply((ActividadRecreativaSeleccionada event) ->{
            administracion.actividadRecreativa = new ActividadRecreativa(event.getIdActividadRecreativa(), event.getNombre(), event.getMaterial(), event.getActividad());
        });

        apply((ModificadaCapacidadClientesDelGuia event) ->{
            Optional<Guia> guia = Optional.ofNullable(administracion.getGuiaPorId(event.getIdGuia())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontró al guia")));
            guia.get().modificarCapacidadClientes(event.getCapacidadClientes());
        });

        apply((AsignadoPersonalCaminata event) ->{
            administracion.personalCaminata = new PersonalCaminata(event.getIdCaminata(), event.getIdCliente(), event.getGuias(), event.getActividadRecreativa());
        });

        apply((AsignadoBinocularAGuia event)->{
            Optional<Guia> guia = Optional.ofNullable(administracion.getGuiaPorId(event.getIdGuia())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontró al guia")));
            guia.get().asignarBinoculares(event.getBinoculares());
        });

        apply((ModificadoAsignacionBinocularesGuia event) ->{
            Optional<Guia> guia = Optional.ofNullable(administracion.getGuiaPorId(event.getIdGuia())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontró al guia")));
            guia.get().modificarBinoculares(event.getBinoculares());
        });

        apply((ModificadoNombreActividadRecreativa event) ->{
            administracion.actividadRecreativa().modificarNombre(event.getNombre());
        });

        apply((ModificadoMaterialActividadRecreativa event) ->{
            administracion.actividadRecreativa().modificarMaterial(event.getMaterial());
        });

        apply((ModificadaActividadDeActividadRecreativa event) ->{
            administracion.actividadRecreativa().modificarActividad(event.getActividad());
        });

        apply((PersonalCaminataModificado event) ->{
            administracion.personalCaminata = event.getPersonalCaminata();
        });
    }
}
