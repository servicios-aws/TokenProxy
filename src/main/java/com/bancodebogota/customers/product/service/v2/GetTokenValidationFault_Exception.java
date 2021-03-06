
package com.bancodebogota.customers.product.service.v2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-03-24T11:00:08.027-05:00
 * Generated source version: 3.5.1
 */

@WebFault(name = "getTokenValidationFault", targetNamespace = "urn://bancodebogota.com/customers/product/service/v2/")
public class GetTokenValidationFault_Exception extends Exception {

    private com.bancodebogota.customers.product.service.v2.GetTokenValidationFault faultInfo;

    public GetTokenValidationFault_Exception() {
        super();
    }

    public GetTokenValidationFault_Exception(String message) {
        super(message);
    }

    public GetTokenValidationFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GetTokenValidationFault_Exception(String message, com.bancodebogota.customers.product.service.v2.GetTokenValidationFault getTokenValidationFault) {
        super(message);
        this.faultInfo = getTokenValidationFault;
    }

    public GetTokenValidationFault_Exception(String message, com.bancodebogota.customers.product.service.v2.GetTokenValidationFault getTokenValidationFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = getTokenValidationFault;
    }

    public com.bancodebogota.customers.product.service.v2.GetTokenValidationFault getFaultInfo() {
        return this.faultInfo;
    }
}
