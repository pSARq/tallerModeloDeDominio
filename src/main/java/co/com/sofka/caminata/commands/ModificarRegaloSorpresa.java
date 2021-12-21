package co.com.sofka.caminata.commands;

import co.com.sofka.caminata.values.RegaloSorpresa;
import co.com.sofka.domain.generic.Command;

public class ModificarRegaloSorpresa extends Command {

    private RegaloSorpresa regaloSorpresa;

    public ModificarRegaloSorpresa(RegaloSorpresa regaloSorpresa){
        this.regaloSorpresa = regaloSorpresa;
    }

    public RegaloSorpresa getRegaloSorpresa() {
        return regaloSorpresa;
    }
}
