/**
 * CatalogInventoryStockItemMultiUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogInventoryStockItemMultiUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String[] productIds;

    private br.com.mind.magento.Client.CatalogInventoryStockItemUpdateEntity[] productData;

    public CatalogInventoryStockItemMultiUpdateRequestParam() {
    }

    public CatalogInventoryStockItemMultiUpdateRequestParam(
           java.lang.String sessionId,
           java.lang.String[] productIds,
           br.com.mind.magento.Client.CatalogInventoryStockItemUpdateEntity[] productData) {
           this.sessionId = sessionId;
           this.productIds = productIds;
           this.productData = productData;
    }


    /**
     * Gets the sessionId value for this CatalogInventoryStockItemMultiUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogInventoryStockItemMultiUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the productIds value for this CatalogInventoryStockItemMultiUpdateRequestParam.
     * 
     * @return productIds
     */
    public java.lang.String[] getProductIds() {
        return productIds;
    }


    /**
     * Sets the productIds value for this CatalogInventoryStockItemMultiUpdateRequestParam.
     * 
     * @param productIds
     */
    public void setProductIds(java.lang.String[] productIds) {
        this.productIds = productIds;
    }


    /**
     * Gets the productData value for this CatalogInventoryStockItemMultiUpdateRequestParam.
     * 
     * @return productData
     */
    public br.com.mind.magento.Client.CatalogInventoryStockItemUpdateEntity[] getProductData() {
        return productData;
    }


    /**
     * Sets the productData value for this CatalogInventoryStockItemMultiUpdateRequestParam.
     * 
     * @param productData
     */
    public void setProductData(br.com.mind.magento.Client.CatalogInventoryStockItemUpdateEntity[] productData) {
        this.productData = productData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogInventoryStockItemMultiUpdateRequestParam)) return false;
        CatalogInventoryStockItemMultiUpdateRequestParam other = (CatalogInventoryStockItemMultiUpdateRequestParam) obj;
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
              java.util.Arrays.equals(this.productData, other.getProductData())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogInventoryStockItemMultiUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateRequestParam"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntity"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "complexObjectArray"));
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
