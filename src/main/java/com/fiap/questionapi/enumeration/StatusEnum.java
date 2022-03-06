package com.fiap.questionapi.enumeration;

public enum StatusEnum {
    OPENED(1L, "Em Aberto"),
    FINISHED(2L, "Finalizado");

    private Long key;
    private String value;

    StatusEnum(Long key, String value){
        this.key = key;
        this.value = value;
    }

    public Long getKey(){
        return this.key;
    }

    public String getValue(){
        return this.value;
    }
}
