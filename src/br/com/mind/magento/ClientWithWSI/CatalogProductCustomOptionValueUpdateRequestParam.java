/**
 * CatalogProductCustomOptionValueUpdateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductCustomOptionValueUpdateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String valueId;

    private br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateEntity data;

    private java.lang.String store;

    public CatalogProductCustomOptionValueUpdateRequestParam() {
    }

    public CatalogProductCustomOptionValueUpdateRequestParam(
           java.lang.String sessionId,
           java.lang.String valueId,
           br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateEntity data,
           java.lang.String store) {
           this.sessionId = sessionId;
           this.valueId = valueId;
           this.data = data;
           this.store = store;
    }


    /**
     * Gets the sessionId value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the valueId value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @return valueId
     */
    public java.lang.String getValueId() {
        return valueId;
    }


    /**
     * Sets the valueId value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @param valueId
     */
    public void setValueId(java.lang.String valueId) {
        this.valueId = valueId;
    }


    /**
     * Gets the data value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @return data
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateEntity getData() {
        return data;
    }


    /**
     * Sets the data value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @param data
     */
    public void setData(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateEntity data) {
        this.data = data;
    }


    /**
     * Gets the store value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this CatalogProductCustomOptionValueUpdateRequestParam.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductCustomOptionValueUpdateRequestParam)) return false;
        CatalogProductCustomOptionValueUpdateRequestParam other = (CatalogProductCustomOptionValueUpdateRequestParam) obj;
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
            ((this.valueId==null && other.getValueId()==null) || 
             (this.valueId!=null &&
              this.valueId.equals(other.getValueId()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
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
        if (getValueId() != null) {
            _hashCode += getValueId().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductCustomOptionValueUpdateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueUpdateRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueUpdateEntity"));
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
