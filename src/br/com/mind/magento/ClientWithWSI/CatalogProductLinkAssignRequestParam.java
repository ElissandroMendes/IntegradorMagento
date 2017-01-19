/**
 * CatalogProductLinkAssignRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductLinkAssignRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String type;

    private java.lang.String productId;

    private java.lang.String linkedProductId;

    private br.com.mind.magento.ClientWithWSI.CatalogProductLinkEntity data;

    private java.lang.String identifierType;

    public CatalogProductLinkAssignRequestParam() {
    }

    public CatalogProductLinkAssignRequestParam(
           java.lang.String sessionId,
           java.lang.String type,
           java.lang.String productId,
           java.lang.String linkedProductId,
           br.com.mind.magento.ClientWithWSI.CatalogProductLinkEntity data,
           java.lang.String identifierType) {
           this.sessionId = sessionId;
           this.type = type;
           this.productId = productId;
           this.linkedProductId = linkedProductId;
           this.data = data;
           this.identifierType = identifierType;
    }


    /**
     * Gets the sessionId value for this CatalogProductLinkAssignRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductLinkAssignRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the type value for this CatalogProductLinkAssignRequestParam.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CatalogProductLinkAssignRequestParam.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the productId value for this CatalogProductLinkAssignRequestParam.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CatalogProductLinkAssignRequestParam.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the linkedProductId value for this CatalogProductLinkAssignRequestParam.
     * 
     * @return linkedProductId
     */
    public java.lang.String getLinkedProductId() {
        return linkedProductId;
    }


    /**
     * Sets the linkedProductId value for this CatalogProductLinkAssignRequestParam.
     * 
     * @param linkedProductId
     */
    public void setLinkedProductId(java.lang.String linkedProductId) {
        this.linkedProductId = linkedProductId;
    }


    /**
     * Gets the data value for this CatalogProductLinkAssignRequestParam.
     * 
     * @return data
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkEntity getData() {
        return data;
    }


    /**
     * Sets the data value for this CatalogProductLinkAssignRequestParam.
     * 
     * @param data
     */
    public void setData(br.com.mind.magento.ClientWithWSI.CatalogProductLinkEntity data) {
        this.data = data;
    }


    /**
     * Gets the identifierType value for this CatalogProductLinkAssignRequestParam.
     * 
     * @return identifierType
     */
    public java.lang.String getIdentifierType() {
        return identifierType;
    }


    /**
     * Sets the identifierType value for this CatalogProductLinkAssignRequestParam.
     * 
     * @param identifierType
     */
    public void setIdentifierType(java.lang.String identifierType) {
        this.identifierType = identifierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductLinkAssignRequestParam)) return false;
        CatalogProductLinkAssignRequestParam other = (CatalogProductLinkAssignRequestParam) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.linkedProductId==null && other.getLinkedProductId()==null) || 
             (this.linkedProductId!=null &&
              this.linkedProductId.equals(other.getLinkedProductId()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getLinkedProductId() != null) {
            _hashCode += getLinkedProductId().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getIdentifierType() != null) {
            _hashCode += getIdentifierType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductLinkAssignRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAssignRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("linkedProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkedProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkEntity"));
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
