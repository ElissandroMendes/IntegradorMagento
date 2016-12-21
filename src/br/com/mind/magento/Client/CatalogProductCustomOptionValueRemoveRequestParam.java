/**
 * CatalogProductCustomOptionValueRemoveRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogProductCustomOptionValueRemoveRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String valueId;

    public CatalogProductCustomOptionValueRemoveRequestParam() {
    }

    public CatalogProductCustomOptionValueRemoveRequestParam(
           java.lang.String sessionId,
           java.lang.String valueId) {
           this.sessionId = sessionId;
           this.valueId = valueId;
    }


    /**
     * Gets the sessionId value for this CatalogProductCustomOptionValueRemoveRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductCustomOptionValueRemoveRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the valueId value for this CatalogProductCustomOptionValueRemoveRequestParam.
     * 
     * @return valueId
     */
    public java.lang.String getValueId() {
        return valueId;
    }


    /**
     * Sets the valueId value for this CatalogProductCustomOptionValueRemoveRequestParam.
     * 
     * @param valueId
     */
    public void setValueId(java.lang.String valueId) {
        this.valueId = valueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductCustomOptionValueRemoveRequestParam)) return false;
        CatalogProductCustomOptionValueRemoveRequestParam other = (CatalogProductCustomOptionValueRemoveRequestParam) obj;
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
            ((this.valueId==null && other.getValueId()==null) || 
             (this.valueId!=null &&
              this.valueId.equals(other.getValueId())));
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
        if (getValueId() != null) {
            _hashCode += getValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductCustomOptionValueRemoveRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueRemoveRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueId"));
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
