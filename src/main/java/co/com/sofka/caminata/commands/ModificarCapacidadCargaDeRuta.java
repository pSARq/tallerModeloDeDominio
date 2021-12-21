package co.com.sofka.caminata.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadCargaDeRuta extends Command {

    private int capacidadCarga;

    public ModificarCapacidadCargaDeRuta(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}
