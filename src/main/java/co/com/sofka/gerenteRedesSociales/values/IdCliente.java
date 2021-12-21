package co.com.sofka.gerenteRedesSociales.values;

import co.com.sofka.domain.generic.Identity;

public class IdCliente extends Identity {

    public IdCliente(){

    }

    public IdCliente(String id){
        super(id);
    }

    public IdCliente of(String id){
        return new IdCliente(id);
    }
}
