package co.com.sofka.caminata.commands;

import co.com.sofka.caminata.Ruta;
import co.com.sofka.caminata.values.IdCaminata;
import co.com.sofka.caminata.values.Refrigerio;
import co.com.sofka.caminata.values.RegaloSorpresa;
import co.com.sofka.domain.generic.Command;

public class CrearCaminata extends Command {

    private final IdCaminata entityId;
    private final Refrigerio refrigerio;
    private final RegaloSorpresa regaloSorpresa;
    private final Ruta ruta;
    private final int horaLlegada;
    private final String puntoEncuentro;

    public CrearCaminata(IdCaminata entityId, Refrigerio refrigerio, RegaloSorpresa regaloSorpresa, Ruta ruta, int horaLlegada, String puntoEncuentro){

        this.entityId = entityId;
        this.refrigerio = refrigerio;
        this.regaloSorpresa = regaloSorpresa;
        this.ruta = ruta;
        this.horaLlegada = horaLlegada;
        this.puntoEncuentro = puntoEncuentro;
    }

    public IdCaminata getEntityId() {
        return entityId;
    }

    public Refrigerio getRefrigerio() {
        return refrigerio;
    }

    public RegaloSorpresa getRegaloSorpresa() {
        return regaloSorpresa;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }
}
