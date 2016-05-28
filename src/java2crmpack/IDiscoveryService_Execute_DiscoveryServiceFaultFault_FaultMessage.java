/**
 * IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.2  Built on : May 02, 2016 (05:55:18 BST)
 */
package java2crmpack;

public class IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1464416570508L;
    private com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument faultMessage;

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage() {
        super(
            "IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage");
    }

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument msg) {
        faultMessage = msg;
    }

    public com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument getFaultMessage() {
        return faultMessage;
    }
}
