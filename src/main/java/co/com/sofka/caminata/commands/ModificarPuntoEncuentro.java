package co.com.sofka.caminata.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarPuntoEncuentro extends Command {

    private String puntoEncuentro;

    public ModificarPuntoEncuentro(String puntoEncuentro){
        this.puntoEncuentro = puntoEncuentro;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }
}
