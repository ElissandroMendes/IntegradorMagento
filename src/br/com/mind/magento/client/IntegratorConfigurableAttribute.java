/**
 * IntegratorConfigurableAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class IntegratorConfigurableAttribute  implements java.io.Serializable {
    private java.lang.String attribute_code;

    private java.lang.String attribute_name;

    public IntegratorConfigurableAttribute() {
    }

    public IntegratorConfigurableAttribute(
           java.lang.String attribute_code,
           java.lang.String attribute_name) {
           this.attribute_code = attribute_code;
           this.attribute_name = attribute_name;
    }


    /**
     * Gets the attribute_code value for this IntegratorConfigurableAttribute.
     * 
     * @return attribute_code
     */
    public java.lang.String getAttribute_code() {
        return attribute_code;
    }


    /**
     * Sets the attribute_code value for this IntegratorConfigurableAttribute.
     * 
     * @param attribute_code
     */
    public void setAttribute_code(java.lang.String attribute_code) {
        this.attribute_code = attribute_code;
    }


    /**
     * Gets the attribute_name value for this IntegratorConfigurableAttribute.
     * 
     * @return attribute_name
     */
    public java.lang.String getAttribute_name() {
        return attribute_name;
    }


    /**
     * Sets the attribute_name value for this IntegratorConfigurableAttribute.
     * 
     * @param attribute_name
     */
    public void setAttribute_name(java.lang.String attribute_name) {
        this.attribute_name = attribute_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorConfigurableAttribute)) return false;
        IntegratorConfigurableAttribute other = (IntegratorConfigurableAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attribute_code==null && other.getAttribute_code()==null) || 
             (this.attribute_code!=null &&
              this.attribute_code.equals(other.getAttribute_code()))) &&
            ((this.attribute_name==null && other.getAttribute_name()==null) || 
             (this.attribute_name!=null &&
              this.attribute_name.equals(other.getAttribute_name())));
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
        if (getAttribute_code() != null) {
            _hashCode += getAttribute_code().hashCode();
        }
        if (getAttribute_name() != null) {
            _hashCode += getAttribute_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorConfigurableAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "integratorConfigurableAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute_name"));
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
