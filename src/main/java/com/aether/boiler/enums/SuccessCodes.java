package com.aether.boiler.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SuccessCodes implements com.aether.rms.enumInterfaces.SuccessCodes {

    CREATED("CREATED","Created"),
    SUCCESSFULLY_UPDATED("SUCCESSFULLY_UPDATED","Updated");

    @Getter
    private String code;
    @Getter
    private String description;
}
