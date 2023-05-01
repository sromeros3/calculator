package com.micro.calculator.services;

import com.micro.calculator.utils.Operacion;

import java.math.BigDecimal;

public interface IServicioCalculadora {

    /**
     * Method is used for calculation for given numbers and operator type
     *
     * @param primerNumero
     * @param segundoNumero
     * @param operacion 
     * @return el resultado de la operación 
     */
    double calcula(BigDecimal primerNumero, BigDecimal segundoNumero, String operacion);
}
