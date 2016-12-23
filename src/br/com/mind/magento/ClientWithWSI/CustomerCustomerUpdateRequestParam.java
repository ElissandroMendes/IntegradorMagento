/**
 * CustomerCustomerUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CustomerCustomerUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private int customerId;

    private br.com.mind.magento.ClientWithWSI.CustomerCustomerEntityToCreate customerData;

    public CustomerCustomerUpdateRequestParam() {
    }

    public CustomerCustomerUpdateRequestParam(
           java.lang.String sessionId,
           int customerId,
           br.com.mind.magento.ClientWithWSI.CustomerCustomerEntityToCreate customerData) {
           this.sessionId = sessionId;
           this.customerId = customerId;
           this.customerData = customerData;
    }


    /**
     * Gets the sessionId value for this CustomerCustomerUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CustomerCustomerUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the customerId value for this CustomerCustomerUpdateRequestParam.
     * 
     * @return customerId
     */
    public int getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerCustomerUpdateRequestParam.
     * 
     * @param customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerData value for this CustomerCustomerUpdateRequestParam.
     * 
     * @return customerData
     */
    public br.com.mind.magento.ClientWithWSI.CustomerCustomerEntityToCreate getCustomerData() {
        return customerData;
    }


    /**
     * Sets the customerData value for this CustomerCustomerUpdateRequestParam.
     * 
     * @param customerData
     */
    public void setCustomerData(br.com.mind.magento.ClientWithWSI.CustomerCustomerEntityToCreate customerData) {
        this.customerData = customerData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCustomerUpdateRequestParam)) return false;
        CustomerCustomerUpdateRequestParam other = (CustomerCustomerUpdateRequestParam) obj;
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
            this.customerId == other.getCustomerId() &&
            ((this.customerData==null && other.getCustomerData()==null) || 
             (this.customerData!=null &&
              this.customerData.equals(other.getCustomerData())));
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
        _hashCode += getCustomerId();
        if (getCustomerData() != null) {
            _hashCode += getCustomerData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCustomerUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntityToCreate"));
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
