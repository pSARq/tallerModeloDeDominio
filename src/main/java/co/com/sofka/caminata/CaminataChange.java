package co.com.sofka.caminata;

import co.com.sofka.caminata.events.*;
import co.com.sofka.domain.generic.EventChange;

public class CaminataChange extends EventChange {

    private int validarHoraDeLlegada(int horaLlegada){
        if (horaLlegada < 0 && horaLlegada > 24) {
            throw new IllegalArgumentException("La hora de la caminata debe estar entre las 24 horas del día");
        }
        return horaLlegada;
    }

    private String validarPuntoEncuentro(String puntoEncuentro){
        if (puntoEncuentro.isBlank()){
            throw new IllegalArgumentException("El punto de encuentro no puede estar vacio");
        }
        return puntoEncuentro;
    }

    private String validarDificultadRuta(String dificultad){
        if (dificultad.isBlank()){
            throw new IllegalArgumentException("La dificultad de la ruta no puede estar vacia");
        }
        return dificultad;
    }

    public CaminataChange(Caminata caminata) {

        apply((CaminataCreada event)->{
            caminata.refrigerio = event.getRefrigerio();
            caminata.regaloSorpresa = event.getRegaloSorpresa();
            caminata.ruta = event.getRuta();
            caminata.puntoEncuentro = validarPuntoEncuentro(event.getPuntoEncuentro());
            caminata.horaLlegada = validarHoraDeLlegada(event.getHoraLlegada());
        });

        apply((RefrigerioModificado event) ->{
            caminata.refrigerio = event.getRefrigerio();
        });

        apply((RegaloSorpresaModificado event) ->{
            caminata.regaloSorpresa = event.getRegaloSorpresa();
        });

        apply((HoraLlegadaModificada event) ->{
            caminata.horaLlegada = validarHoraDeLlegada(event.getHoraLlegada());
        });

        apply((PuntoEncuentroModificado event) ->{
            caminata.puntoEncuentro = validarPuntoEncuentro(event.getPuntoEncuentro());
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
            caminata.ruta().modificarDificultadRuta(validarDificultadRuta(event.getDificultad()));
        });

    }
}
