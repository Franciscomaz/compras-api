
package com.compras.infrastructure.serializer;

import com.google.gson.Gson;

public class ObjectSerializer {
    private static ObjectSerializer serializador;
    private final Gson gson;

    public static synchronized ObjectSerializer instance() {
        if (ObjectSerializer.serializador == null) {
            ObjectSerializer.serializador = new ObjectSerializer();
        }
        return ObjectSerializer.serializador;
    }

    public String serializar(Object anObject) {
        return this.gson.toJson(anObject);
    }
    
    public <T extends Object> T desserializar(String umaSerializacao, final Class<T> umTipo) {
        return this.gson.fromJson(umaSerializacao, umTipo);
    }

    private ObjectSerializer() {
        this.gson = new Gson();
    }
}
