/**
 * CatalogProductAttributeTierPriceUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogProductAttributeTierPriceUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String productId;

    private br.com.mind.magento.Client.CatalogProductTierPriceEntity[] tierPrices;

    private java.lang.String identifierType;

    public CatalogProductAttributeTierPriceUpdateRequestParam() {
    }

    public CatalogProductAttributeTierPriceUpdateRequestParam(
           java.lang.String sessionId,
           java.lang.String productId,
           br.com.mind.magento.Client.CatalogProductTierPriceEntity[] tierPrices,
           java.lang.String identifierType) {
           this.sessionId = sessionId;
           this.productId = productId;
           this.tierPrices = tierPrices;
           this.identifierType = identifierType;
    }


    /**
     * Gets the sessionId value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the productId value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the tierPrices value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @return tierPrices
     */
    public br.com.mind.magento.Client.CatalogProductTierPriceEntity[] getTierPrices() {
        return tierPrices;
    }


    /**
     * Sets the tierPrices value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @param tierPrices
     */
    public void setTierPrices(br.com.mind.magento.Client.CatalogProductTierPriceEntity[] tierPrices) {
        this.tierPrices = tierPrices;
    }


    /**
     * Gets the identifierType value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @return identifierType
     */
    public java.lang.String getIdentifierType() {
        return identifierType;
    }


    /**
     * Sets the identifierType value for this CatalogProductAttributeTierPriceUpdateRequestParam.
     * 
     * @param identifierType
     */
    public void setIdentifierType(java.lang.String identifierType) {
        this.identifierType = identifierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeTierPriceUpdateRequestParam)) return false;
        CatalogProductAttributeTierPriceUpdateRequestParam other = (CatalogProductAttributeTierPriceUpdateRequestParam) obj;
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
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.tierPrices==null && other.getTierPrices()==null) || 
             (this.tierPrices!=null &&
              java.util.Arrays.equals(this.tierPrices, other.getTierPrices()))) &&
            ((this.identifierType==null && other.getIdentifierType()==null) || 
             (this.identifierType!=null &&
              this.identifierType.equals(other.getIdentifierType())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getTierPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTierPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTierPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdentifierType() != null) {
            _hashCode += getIdentifierType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeTierPriceUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tierPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tierPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntity"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "complexObjectArray"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifierType"));
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
