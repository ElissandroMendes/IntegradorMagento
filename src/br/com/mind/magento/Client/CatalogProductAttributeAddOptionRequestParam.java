/**
 * CatalogProductAttributeAddOptionRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogProductAttributeAddOptionRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String attribute;

    private br.com.mind.magento.Client.CatalogProductAttributeOptionEntityToAdd data;

    public CatalogProductAttributeAddOptionRequestParam() {
    }

    public CatalogProductAttributeAddOptionRequestParam(
           java.lang.String sessionId,
           java.lang.String attribute,
           br.com.mind.magento.Client.CatalogProductAttributeOptionEntityToAdd data) {
           this.sessionId = sessionId;
           this.attribute = attribute;
           this.data = data;
    }


    /**
     * Gets the sessionId value for this CatalogProductAttributeAddOptionRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductAttributeAddOptionRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the attribute value for this CatalogProductAttributeAddOptionRequestParam.
     * 
     * @return attribute
     */
    public java.lang.String getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this CatalogProductAttributeAddOptionRequestParam.
     * 
     * @param attribute
     */
    public void setAttribute(java.lang.String attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the data value for this CatalogProductAttributeAddOptionRequestParam.
     * 
     * @return data
     */
    public br.com.mind.magento.Client.CatalogProductAttributeOptionEntityToAdd getData() {
        return data;
    }


    /**
     * Sets the data value for this CatalogProductAttributeAddOptionRequestParam.
     * 
     * @param data
     */
    public void setData(br.com.mind.magento.Client.CatalogProductAttributeOptionEntityToAdd data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeAddOptionRequestParam)) return false;
        CatalogProductAttributeAddOptionRequestParam other = (CatalogProductAttributeAddOptionRequestParam) obj;
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
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeAddOptionRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeAddOptionRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionEntityToAdd"));
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
