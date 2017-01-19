/**
 * CatalogProductAttributeSetRemoveRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductAttributeSetRemoveRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String attributeSetId;

    private java.lang.String forceProductsRemove;

    public CatalogProductAttributeSetRemoveRequestParam() {
    }

    public CatalogProductAttributeSetRemoveRequestParam(
           java.lang.String sessionId,
           java.lang.String attributeSetId,
           java.lang.String forceProductsRemove) {
           this.sessionId = sessionId;
           this.attributeSetId = attributeSetId;
           this.forceProductsRemove = forceProductsRemove;
    }


    /**
     * Gets the sessionId value for this CatalogProductAttributeSetRemoveRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductAttributeSetRemoveRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the attributeSetId value for this CatalogProductAttributeSetRemoveRequestParam.
     * 
     * @return attributeSetId
     */
    public java.lang.String getAttributeSetId() {
        return attributeSetId;
    }


    /**
     * Sets the attributeSetId value for this CatalogProductAttributeSetRemoveRequestParam.
     * 
     * @param attributeSetId
     */
    public void setAttributeSetId(java.lang.String attributeSetId) {
        this.attributeSetId = attributeSetId;
    }


    /**
     * Gets the forceProductsRemove value for this CatalogProductAttributeSetRemoveRequestParam.
     * 
     * @return forceProductsRemove
     */
    public java.lang.String getForceProductsRemove() {
        return forceProductsRemove;
    }


    /**
     * Sets the forceProductsRemove value for this CatalogProductAttributeSetRemoveRequestParam.
     * 
     * @param forceProductsRemove
     */
    public void setForceProductsRemove(java.lang.String forceProductsRemove) {
        this.forceProductsRemove = forceProductsRemove;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeSetRemoveRequestParam)) return false;
        CatalogProductAttributeSetRemoveRequestParam other = (CatalogProductAttributeSetRemoveRequestParam) obj;
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
            ((this.attributeSetId==null && other.getAttributeSetId()==null) || 
             (this.attributeSetId!=null &&
              this.attributeSetId.equals(other.getAttributeSetId()))) &&
            ((this.forceProductsRemove==null && other.getForceProductsRemove()==null) || 
             (this.forceProductsRemove!=null &&
              this.forceProductsRemove.equals(other.getForceProductsRemove())));
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
        if (getAttributeSetId() != null) {
            _hashCode += getAttributeSetId().hashCode();
        }
        if (getForceProductsRemove() != null) {
            _hashCode += getForceProductsRemove().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeSetRemoveRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetRemoveRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceProductsRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forceProductsRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
