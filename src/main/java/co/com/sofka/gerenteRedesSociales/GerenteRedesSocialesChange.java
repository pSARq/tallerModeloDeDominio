package co.com.sofka.gerenteRedesSociales;

import co.com.sofka.administracion.Guia;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.gerenteRedesSociales.events.*;
import co.com.sofka.gerenteRedesSociales.values.*;

import java.util.Optional;

public class GerenteRedesSocialesChange extends EventChange {

    public GerenteRedesSocialesChange(GerenteRedesSociales gerenteRedesSociales) {

        apply((GerenteRedesSocialesCreado event) ->{
            gerenteRedesSociales.nombre = event.getNombre();
        });

        apply((RegistradaInformacionFormulario event) ->{
            IdFormulario idFormulario = new IdFormulario();
            String nombreCompleto = event.getNombreCompleto();
            Email email = event.getEmail();
            NumeroCelular numeroCelular = event.getNumeroCelular();
            Identificacion identificacion = event.getIdentificacion();

            Informacion informacion = new Informacion(nombreCompleto, email, numeroCelular, identificacion);

            gerenteRedesSociales.formularios.add(new Formulario(idFormulario, informacion));
        });

        apply((ModificadaInformacionFormulario event) ->{
            Optional<Formulario> formulario = Optional.ofNullable(gerenteRedesSociales.getFormularioPorId(event.getIdFormulario())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontró el formulario")));
            formulario.get().modificarInformacion(event.getInformacion());
        });

        apply((ModificadoEmailCliente event) ->{
            Optional<Cliente> cliente = Optional.ofNullable(gerenteRedesSociales.getClientePorId(event.getIdCliente())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontró el cliente")));
            cliente.get().modificarEmail(event.getEmail());
        });

        apply((ModificadoNumeroCelularCliente event) ->{
            Optional<Cliente> cliente = Optional.ofNullable(gerenteRedesSociales.getClientePorId(event.getIdCliente())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontró el cliente")));
            cliente.get().modificarNumeroCelular(event.getNumeroCelular());
        });
    }
}
