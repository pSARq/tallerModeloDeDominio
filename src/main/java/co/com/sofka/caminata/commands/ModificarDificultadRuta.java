package co.com.sofka.caminata.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarDificultadRuta extends Command {

    private String dificultad;

    public ModificarDificultadRuta(String dificultad){
        this.dificultad = dificultad;
    }

    public String getDificultad() {
        return dificultad;
    }
}
