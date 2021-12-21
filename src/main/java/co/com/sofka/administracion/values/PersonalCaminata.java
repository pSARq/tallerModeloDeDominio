package co.com.sofka.administracion.values;

import co.com.sofka.administracion.ActividadRecreativa;
import co.com.sofka.administracion.Guia;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;

import java.util.Objects;
import java.util.Set;

public class PersonalCaminata implements ValueObject<Objects> {
    private final IdCaminata idCaminata;
    private final IdCliente idCliente;
    private final Set<Guia> guias;
    private final ActividadRecreativa actividadRecreativa;

    public PersonalCaminata(IdCaminata idCaminata, IdCliente idCliente, Set<Guia> guias, ActividadRecreativa actividadRecreativa) {
        this.idCaminata = idCaminata;
        this.idCliente = idCliente;
        this.guias = guias;
        this.actividadRecreativa = actividadRecreativa;
    }

    public IdCaminata getIdCaminata() {
        return idCaminata;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Set<Guia> getGuias() {
        return guias;
    }

    public ActividadRecreativa getActividadRecreativa() {
        return actividadRecreativa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalCaminata that = (PersonalCaminata) o;
        return Objects.equals(idCaminata, that.idCaminata) && Objects.equals(idCliente, that.idCliente) && Objects.equals(guias, that.guias) && Objects.equals(actividadRecreativa, that.actividadRecreativa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaminata, idCliente, guias, actividadRecreativa);
    }

    @Override
    public Objects value() {
        return null;
    }
}
