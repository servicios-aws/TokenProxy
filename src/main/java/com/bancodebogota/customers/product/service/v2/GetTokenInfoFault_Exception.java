
package com.bancodebogota.customers.product.service.v2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-03-24T11:00:08.034-05:00
 * Generated source version: 3.5.1
 */

@WebFault(name = "getTokenInfoFault", targetNamespace = "urn://bancodebogota.com/customers/product/service/v2/")
public class GetTokenInfoFault_Exception extends Exception {

    private com.bancodebogota.customers.product.service.v2.GetTokenInfoFault faultInfo;

    public GetTokenInfoFault_Exception() {
        super();
    }

    public GetTokenInfoFault_Exception(String message) {
        super(message);
    }

    public GetTokenInfoFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GetTokenInfoFault_Exception(String message, com.bancodebogota.customers.product.service.v2.GetTokenInfoFault getTokenInfoFault) {
        super(message);
        this.faultInfo = getTokenInfoFault;
    }

    public GetTokenInfoFault_Exception(String message, com.bancodebogota.customers.product.service.v2.GetTokenInfoFault getTokenInfoFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = getTokenInfoFault;
    }

    public com.bancodebogota.customers.product.service.v2.GetTokenInfoFault getFaultInfo() {
        return this.faultInfo;
    }
}
