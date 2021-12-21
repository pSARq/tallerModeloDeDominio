package co.com.sofka.administracion.values;

import co.com.sofka.administracion.ActividadRecreativa;
import co.com.sofka.administracion.Guia;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.gerenteRedesSociales.Cliente;
import co.com.sofka.gerenteRedesSociales.values.IdCliente;

import java.util.Objects;
import java.util.Set;

public class PersonalCaminata implements ValueObject<PersonalCaminata.Properties> {
    private final IdCaminata idCaminata;
    private final Set<Cliente> clientes;
    private final Set<Guia> guias;
    private final ActividadRecreativa actividadRecreativa;

    public PersonalCaminata(IdCaminata idCaminata, Set<Cliente> clientes, Set<Guia> guias, ActividadRecreativa actividadRecreativa) {
        this.idCaminata = idCaminata;
        this.clientes = clientes;
        this.guias = guias;
        this.actividadRecreativa = actividadRecreativa;
    }

    public interface Properties{
        IdCaminata idCaminata();
        Set<Cliente> clientes();
        Set<Guia> guias();
        ActividadRecreativa actividadRecreativa();
    }

    public Properties value(){
        return new Properties() {
            @Override
            public IdCaminata idCaminata() {
                return idCaminata;
            }

            @Override
            public Set<Cliente> clientes() {
                return clientes;
            }

            @Override
            public Set<Guia> guias() {
                return guias;
            }

            @Override
            public ActividadRecreativa actividadRecreativa() {
                return actividadRecreativa;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalCaminata that = (PersonalCaminata) o;
        return Objects.equals(idCaminata, that.idCaminata) && Objects.equals(clientes, that.clientes) && Objects.equals(guias, that.guias) && Objects.equals(actividadRecreativa, that.actividadRecreativa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaminata, clientes, guias, actividadRecreativa);
    }
}
