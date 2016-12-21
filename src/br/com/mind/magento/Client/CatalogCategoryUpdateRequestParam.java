/**
 * CatalogCategoryUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogCategoryUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private int categoryId;

    private br.com.mind.magento.Client.CatalogCategoryEntityCreate categoryData;

    private java.lang.String store;

    public CatalogCategoryUpdateRequestParam() {
    }

    public CatalogCategoryUpdateRequestParam(
           java.lang.String sessionId,
           int categoryId,
           br.com.mind.magento.Client.CatalogCategoryEntityCreate categoryData,
           java.lang.String store) {
           this.sessionId = sessionId;
           this.categoryId = categoryId;
           this.categoryData = categoryData;
           this.store = store;
    }


    /**
     * Gets the sessionId value for this CatalogCategoryUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogCategoryUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the categoryId value for this CatalogCategoryUpdateRequestParam.
     * 
     * @return categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this CatalogCategoryUpdateRequestParam.
     * 
     * @param categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the categoryData value for this CatalogCategoryUpdateRequestParam.
     * 
     * @return categoryData
     */
    public br.com.mind.magento.Client.CatalogCategoryEntityCreate getCategoryData() {
        return categoryData;
    }


    /**
     * Sets the categoryData value for this CatalogCategoryUpdateRequestParam.
     * 
     * @param categoryData
     */
    public void setCategoryData(br.com.mind.magento.Client.CatalogCategoryEntityCreate categoryData) {
        this.categoryData = categoryData;
    }


    /**
     * Gets the store value for this CatalogCategoryUpdateRequestParam.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this CatalogCategoryUpdateRequestParam.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogCategoryUpdateRequestParam)) return false;
        CatalogCategoryUpdateRequestParam other = (CatalogCategoryUpdateRequestParam) obj;
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
            this.categoryId == other.getCategoryId() &&
            ((this.categoryData==null && other.getCategoryData()==null) || 
             (this.categoryData!=null &&
              this.categoryData.equals(other.getCategoryData()))) &&
            ((this.store==null && other.getStore()==null) || 
             (this.store!=null &&
              this.store.equals(other.getStore())));
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
        _hashCode += getCategoryId();
        if (getCategoryData() != null) {
            _hashCode += getCategoryData().hashCode();
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogCategoryUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityCreate"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store"));
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
