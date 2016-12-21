/**
 * CatalogProductCustomOptionValueAddRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogProductCustomOptionValueAddRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String optionId;

    private br.com.mind.magento.Client.CatalogProductCustomOptionValueAddEntity[] data;

    private java.lang.String store;

    public CatalogProductCustomOptionValueAddRequestParam() {
    }

    public CatalogProductCustomOptionValueAddRequestParam(
           java.lang.String sessionId,
           java.lang.String optionId,
           br.com.mind.magento.Client.CatalogProductCustomOptionValueAddEntity[] data,
           java.lang.String store) {
           this.sessionId = sessionId;
           this.optionId = optionId;
           this.data = data;
           this.store = store;
    }


    /**
     * Gets the sessionId value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the optionId value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @return optionId
     */
    public java.lang.String getOptionId() {
        return optionId;
    }


    /**
     * Sets the optionId value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @param optionId
     */
    public void setOptionId(java.lang.String optionId) {
        this.optionId = optionId;
    }


    /**
     * Gets the data value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @return data
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionValueAddEntity[] getData() {
        return data;
    }


    /**
     * Sets the data value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @param data
     */
    public void setData(br.com.mind.magento.Client.CatalogProductCustomOptionValueAddEntity[] data) {
        this.data = data;
    }


    /**
     * Gets the store value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this CatalogProductCustomOptionValueAddRequestParam.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductCustomOptionValueAddRequestParam)) return false;
        CatalogProductCustomOptionValueAddRequestParam other = (CatalogProductCustomOptionValueAddRequestParam) obj;
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
            ((this.optionId==null && other.getOptionId()==null) || 
             (this.optionId!=null &&
              this.optionId.equals(other.getOptionId()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
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
        if (getOptionId() != null) {
            _hashCode += getOptionId().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
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
        new org.apache.axis.description.TypeDesc(CatalogProductCustomOptionValueAddRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueAddRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueAddEntity"));
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
