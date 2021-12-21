package co.com.sofka.caminata.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarDistanciaRuta extends Command {

    private int distanciaTotal;

    public ModificarDistanciaRuta(int distanciaTotal){
        this.distanciaTotal = distanciaTotal;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }
}
