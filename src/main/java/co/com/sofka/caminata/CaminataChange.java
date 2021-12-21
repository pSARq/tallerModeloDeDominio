package co.com.sofka.caminata;

import co.com.sofka.caminata.events.*;
import co.com.sofka.domain.generic.EventChange;

public class CaminataChange extends EventChange {

    public CaminataChange(Caminata caminata) {

        apply((CaminataCreada event)->{
            caminata.refrigerio = event.getRefrigerio();
            caminata.regaloSorpresa = event.getRegaloSorpresa();
            caminata.ruta = event.getRuta();
            caminata.horaLlegada = event.getHoraLlegada();
            caminata.puntoEncuentro = event.getPuntoEncuentro();
        });

        apply((RefrigerioModificado event) ->{
            caminata.refrigerio = event.getRefrigerio();
        });

        apply((RegaloSorpresaModificado event) ->{
            caminata.regaloSorpresa = event.getRegaloSorpresa();
        });

        apply((HoraLlegadaModificada event) ->{
            caminata.horaLlegada = event.getHoraLlegada();
        });

        apply((PuntoEncuentroModificado event) ->{
            caminata.puntoEncuentro = event.getPuntoEncuentro();
        });

        apply((DuracionRutaModificada event) ->{
            caminata.ruta().modificarDuracion(event.getDuracionRuta());
        });

        apply((DistanciaRutaModificada event) ->{
            caminata.ruta().modificarDistanciaTotal(event.getDistanciaTotal());
        });

        apply((CapacidadCargaDeRutaModificada event) ->{
            caminata.ruta().modificarCapacidadCarga(event.getCapacidadCarga());
        });

        apply((DificultadRutaModificada event) ->{
            caminata.ruta().modificarDificultadRuta(event.getDificultad());
        });

    }
}
