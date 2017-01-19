/**
 * GiftMessageForQuoteProductRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class GiftMessageForQuoteProductRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String quoteId;

    private br.com.mind.magento.ClientWithWSI.GiftMessageAssociativeProductsEntity[] productsAndMessages;

    private java.lang.String store;

    public GiftMessageForQuoteProductRequestParam() {
    }

    public GiftMessageForQuoteProductRequestParam(
           java.lang.String sessionId,
           java.lang.String quoteId,
           br.com.mind.magento.ClientWithWSI.GiftMessageAssociativeProductsEntity[] productsAndMessages,
           java.lang.String store) {
           this.sessionId = sessionId;
           this.quoteId = quoteId;
           this.productsAndMessages = productsAndMessages;
           this.store = store;
    }


    /**
     * Gets the sessionId value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the quoteId value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @return quoteId
     */
    public java.lang.String getQuoteId() {
        return quoteId;
    }


    /**
     * Sets the quoteId value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @param quoteId
     */
    public void setQuoteId(java.lang.String quoteId) {
        this.quoteId = quoteId;
    }


    /**
     * Gets the productsAndMessages value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @return productsAndMessages
     */
    public br.com.mind.magento.ClientWithWSI.GiftMessageAssociativeProductsEntity[] getProductsAndMessages() {
        return productsAndMessages;
    }


    /**
     * Sets the productsAndMessages value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @param productsAndMessages
     */
    public void setProductsAndMessages(br.com.mind.magento.ClientWithWSI.GiftMessageAssociativeProductsEntity[] productsAndMessages) {
        this.productsAndMessages = productsAndMessages;
    }


    /**
     * Gets the store value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this GiftMessageForQuoteProductRequestParam.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftMessageForQuoteProductRequestParam)) return false;
        GiftMessageForQuoteProductRequestParam other = (GiftMessageForQuoteProductRequestParam) obj;
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
            ((this.quoteId==null && other.getQuoteId()==null) || 
             (this.quoteId!=null &&
              this.quoteId.equals(other.getQuoteId()))) &&
            ((this.productsAndMessages==null && other.getProductsAndMessages()==null) || 
             (this.productsAndMessages!=null &&
              java.util.Arrays.equals(this.productsAndMessages, other.getProductsAndMessages()))) &&
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
        if (getQuoteId() != null) {
            _hashCode += getQuoteId().hashCode();
        }
        if (getProductsAndMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductsAndMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductsAndMessages(), i);
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
        new org.apache.axis.description.TypeDesc(GiftMessageForQuoteProductRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteProductRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quoteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productsAndMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productsAndMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageAssociativeProductsEntity"));
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
