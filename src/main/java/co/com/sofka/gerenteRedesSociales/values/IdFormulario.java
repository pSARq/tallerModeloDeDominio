package co.com.sofka.gerenteRedesSociales.values;

import co.com.sofka.domain.generic.Identity;

public class IdFormulario extends Identity {

    public IdFormulario(){

    }

    public IdFormulario(String id){
        super(id);
    }

    public IdFormulario of(String id){
        return new IdFormulario(id);
    }
}
