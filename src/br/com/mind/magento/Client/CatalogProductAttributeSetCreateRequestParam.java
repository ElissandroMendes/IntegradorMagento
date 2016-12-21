/**
 * CatalogProductAttributeSetCreateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogProductAttributeSetCreateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String attributeSetName;

    private java.lang.String skeletonSetId;

    public CatalogProductAttributeSetCreateRequestParam() {
    }

    public CatalogProductAttributeSetCreateRequestParam(
           java.lang.String sessionId,
           java.lang.String attributeSetName,
           java.lang.String skeletonSetId) {
           this.sessionId = sessionId;
           this.attributeSetName = attributeSetName;
           this.skeletonSetId = skeletonSetId;
    }


    /**
     * Gets the sessionId value for this CatalogProductAttributeSetCreateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductAttributeSetCreateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the attributeSetName value for this CatalogProductAttributeSetCreateRequestParam.
     * 
     * @return attributeSetName
     */
    public java.lang.String getAttributeSetName() {
        return attributeSetName;
    }


    /**
     * Sets the attributeSetName value for this CatalogProductAttributeSetCreateRequestParam.
     * 
     * @param attributeSetName
     */
    public void setAttributeSetName(java.lang.String attributeSetName) {
        this.attributeSetName = attributeSetName;
    }


    /**
     * Gets the skeletonSetId value for this CatalogProductAttributeSetCreateRequestParam.
     * 
     * @return skeletonSetId
     */
    public java.lang.String getSkeletonSetId() {
        return skeletonSetId;
    }


    /**
     * Sets the skeletonSetId value for this CatalogProductAttributeSetCreateRequestParam.
     * 
     * @param skeletonSetId
     */
    public void setSkeletonSetId(java.lang.String skeletonSetId) {
        this.skeletonSetId = skeletonSetId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeSetCreateRequestParam)) return false;
        CatalogProductAttributeSetCreateRequestParam other = (CatalogProductAttributeSetCreateRequestParam) obj;
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
            ((this.attributeSetName==null && other.getAttributeSetName()==null) || 
             (this.attributeSetName!=null &&
              this.attributeSetName.equals(other.getAttributeSetName()))) &&
            ((this.skeletonSetId==null && other.getSkeletonSetId()==null) || 
             (this.skeletonSetId!=null &&
              this.skeletonSetId.equals(other.getSkeletonSetId())));
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
        if (getAttributeSetName() != null) {
            _hashCode += getAttributeSetName().hashCode();
        }
        if (getSkeletonSetId() != null) {
            _hashCode += getSkeletonSetId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeSetCreateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetCreateRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeSetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeSetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skeletonSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skeletonSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
