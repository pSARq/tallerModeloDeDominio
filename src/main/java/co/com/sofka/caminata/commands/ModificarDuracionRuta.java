package co.com.sofka.caminata.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarDuracionRuta extends Command {

    private int duracionRuta;

    public ModificarDuracionRuta(int duracionRuta){
        this.duracionRuta = duracionRuta;
    }

    public int getDuracionRuta() {
        return duracionRuta;
    }
}
