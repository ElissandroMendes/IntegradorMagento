/**
 * CatalogProductAttributeGroupPriceUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductAttributeGroupPriceUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String productId;

    private br.com.mind.magento.ClientWithWSI.CatalogProductGroupPriceEntity[] groupPrices;

    private java.lang.String identifierType;

    public CatalogProductAttributeGroupPriceUpdateRequestParam() {
    }

    public CatalogProductAttributeGroupPriceUpdateRequestParam(
           java.lang.String sessionId,
           java.lang.String productId,
           br.com.mind.magento.ClientWithWSI.CatalogProductGroupPriceEntity[] groupPrices,
           java.lang.String identifierType) {
           this.sessionId = sessionId;
           this.productId = productId;
           this.groupPrices = groupPrices;
           this.identifierType = identifierType;
    }


    /**
     * Gets the sessionId value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the productId value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the groupPrices value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @return groupPrices
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductGroupPriceEntity[] getGroupPrices() {
        return groupPrices;
    }


    /**
     * Sets the groupPrices value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @param groupPrices
     */
    public void setGroupPrices(br.com.mind.magento.ClientWithWSI.CatalogProductGroupPriceEntity[] groupPrices) {
        this.groupPrices = groupPrices;
    }


    /**
     * Gets the identifierType value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @return identifierType
     */
    public java.lang.String getIdentifierType() {
        return identifierType;
    }


    /**
     * Sets the identifierType value for this CatalogProductAttributeGroupPriceUpdateRequestParam.
     * 
     * @param identifierType
     */
    public void setIdentifierType(java.lang.String identifierType) {
        this.identifierType = identifierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeGroupPriceUpdateRequestParam)) return false;
        CatalogProductAttributeGroupPriceUpdateRequestParam other = (CatalogProductAttributeGroupPriceUpdateRequestParam) obj;
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
            ((this.groupPrices==null && other.getGroupPrices()==null) || 
             (this.groupPrices!=null &&
              java.util.Arrays.equals(this.groupPrices, other.getGroupPrices()))) &&
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
        if (getGroupPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupPrices(), i);
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
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeGroupPriceUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeGroupPriceUpdateRequestParam"));
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
        elemField.setFieldName("groupPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GroupPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogProductGroupPriceEntity"));
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
