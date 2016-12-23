/**
 * SalesOrderInvoiceInfoRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderInvoiceInfoRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String invoiceIncrementId;

    public SalesOrderInvoiceInfoRequestParam() {
    }

    public SalesOrderInvoiceInfoRequestParam(
           java.lang.String sessionId,
           java.lang.String invoiceIncrementId) {
           this.sessionId = sessionId;
           this.invoiceIncrementId = invoiceIncrementId;
    }


    /**
     * Gets the sessionId value for this SalesOrderInvoiceInfoRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderInvoiceInfoRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the invoiceIncrementId value for this SalesOrderInvoiceInfoRequestParam.
     * 
     * @return invoiceIncrementId
     */
    public java.lang.String getInvoiceIncrementId() {
        return invoiceIncrementId;
    }


    /**
     * Sets the invoiceIncrementId value for this SalesOrderInvoiceInfoRequestParam.
     * 
     * @param invoiceIncrementId
     */
    public void setInvoiceIncrementId(java.lang.String invoiceIncrementId) {
        this.invoiceIncrementId = invoiceIncrementId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderInvoiceInfoRequestParam)) return false;
        SalesOrderInvoiceInfoRequestParam other = (SalesOrderInvoiceInfoRequestParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.invoiceIncrementId==null && other.getInvoiceIncrementId()==null) || 
             (this.invoiceIncrementId!=null &&
              this.invoiceIncrementId.equals(other.getInvoiceIncrementId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getInvoiceIncrementId() != null) {
            _hashCode += getInvoiceIncrementId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderInvoiceInfoRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceIncrementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceIncrementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
