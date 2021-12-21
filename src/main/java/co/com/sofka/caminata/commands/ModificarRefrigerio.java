package co.com.sofka.caminata.commands;

import co.com.sofka.caminata.values.Refrigerio;
import co.com.sofka.domain.generic.Command;

public class ModificarRefrigerio extends Command {

    private Refrigerio refrigerio;

    public ModificarRefrigerio(Refrigerio refrigerio){
        this.refrigerio = refrigerio;
    }

    public Refrigerio getRefrigerio() {
        return refrigerio;
    }
}
