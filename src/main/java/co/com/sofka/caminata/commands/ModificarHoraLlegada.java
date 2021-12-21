package co.com.sofka.caminata.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarHoraLlegada extends Command {

    private int horaLlegada;

    public ModificarHoraLlegada(int horaLlegada){
        this.horaLlegada = horaLlegada;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }
}
