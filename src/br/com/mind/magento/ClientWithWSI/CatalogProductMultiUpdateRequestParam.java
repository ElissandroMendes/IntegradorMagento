/**
 * CatalogProductMultiUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductMultiUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String[] productIds;

    private br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity[] productData;

    private java.lang.String store;

    private java.lang.String identifierType;

    public CatalogProductMultiUpdateRequestParam() {
    }

    public CatalogProductMultiUpdateRequestParam(
           java.lang.String sessionId,
           java.lang.String[] productIds,
           br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity[] productData,
           java.lang.String store,
           java.lang.String identifierType) {
           this.sessionId = sessionId;
           this.productIds = productIds;
           this.productData = productData;
           this.store = store;
           this.identifierType = identifierType;
    }


    /**
     * Gets the sessionId value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the productIds value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @return productIds
     */
    public java.lang.String[] getProductIds() {
        return productIds;
    }


    /**
     * Sets the productIds value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @param productIds
     */
    public void setProductIds(java.lang.String[] productIds) {
        this.productIds = productIds;
    }


    /**
     * Gets the productData value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @return productData
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity[] getProductData() {
        return productData;
    }


    /**
     * Sets the productData value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @param productData
     */
    public void setProductData(br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity[] productData) {
        this.productData = productData;
    }


    /**
     * Gets the store value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }


    /**
     * Gets the identifierType value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @return identifierType
     */
    public java.lang.String getIdentifierType() {
        return identifierType;
    }


    /**
     * Sets the identifierType value for this CatalogProductMultiUpdateRequestParam.
     * 
     * @param identifierType
     */
    public void setIdentifierType(java.lang.String identifierType) {
        this.identifierType = identifierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductMultiUpdateRequestParam)) return false;
        CatalogProductMultiUpdateRequestParam other = (CatalogProductMultiUpdateRequestParam) obj;
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
            ((this.productIds==null && other.getProductIds()==null) || 
             (this.productIds!=null &&
              java.util.Arrays.equals(this.productIds, other.getProductIds()))) &&
            ((this.productData==null && other.getProductData()==null) || 
             (this.productData!=null &&
              java.util.Arrays.equals(this.productData, other.getProductData()))) &&
            ((this.store==null && other.getStore()==null) || 
             (this.store!=null &&
              this.store.equals(other.getStore()))) &&
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
        if (getProductIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        if (getIdentifierType() != null) {
            _hashCode += getIdentifierType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductMultiUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductMultiUpdateRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "complexObjectArray"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCreateEntity"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "complexObjectArray"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
