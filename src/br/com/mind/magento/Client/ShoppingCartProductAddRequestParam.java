/**
 * ShoppingCartProductAddRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class ShoppingCartProductAddRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private int quoteId;

    private br.com.mind.magento.Client.ShoppingCartProductEntity[] productsData;

    private java.lang.String store;

    public ShoppingCartProductAddRequestParam() {
    }

    public ShoppingCartProductAddRequestParam(
           java.lang.String sessionId,
           int quoteId,
           br.com.mind.magento.Client.ShoppingCartProductEntity[] productsData,
           java.lang.String store) {
           this.sessionId = sessionId;
           this.quoteId = quoteId;
           this.productsData = productsData;
           this.store = store;
    }


    /**
     * Gets the sessionId value for this ShoppingCartProductAddRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this ShoppingCartProductAddRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the quoteId value for this ShoppingCartProductAddRequestParam.
     * 
     * @return quoteId
     */
    public int getQuoteId() {
        return quoteId;
    }


    /**
     * Sets the quoteId value for this ShoppingCartProductAddRequestParam.
     * 
     * @param quoteId
     */
    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }


    /**
     * Gets the productsData value for this ShoppingCartProductAddRequestParam.
     * 
     * @return productsData
     */
    public br.com.mind.magento.Client.ShoppingCartProductEntity[] getProductsData() {
        return productsData;
    }


    /**
     * Sets the productsData value for this ShoppingCartProductAddRequestParam.
     * 
     * @param productsData
     */
    public void setProductsData(br.com.mind.magento.Client.ShoppingCartProductEntity[] productsData) {
        this.productsData = productsData;
    }


    /**
     * Gets the store value for this ShoppingCartProductAddRequestParam.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this ShoppingCartProductAddRequestParam.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingCartProductAddRequestParam)) return false;
        ShoppingCartProductAddRequestParam other = (ShoppingCartProductAddRequestParam) obj;
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
            this.quoteId == other.getQuoteId() &&
            ((this.productsData==null && other.getProductsData()==null) || 
             (this.productsData!=null &&
              java.util.Arrays.equals(this.productsData, other.getProductsData()))) &&
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
        _hashCode += getQuoteId();
        if (getProductsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingCartProductAddRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quoteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productsData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntity"));
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
