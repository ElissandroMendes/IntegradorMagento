/**
 * CatalogProductAttributeSetAttributeAddRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class CatalogProductAttributeSetAttributeAddRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String attributeId;

    private java.lang.String attributeSetId;

    private java.lang.String attributeGroupId;

    private java.lang.String sortOrder;

    public CatalogProductAttributeSetAttributeAddRequestParam() {
    }

    public CatalogProductAttributeSetAttributeAddRequestParam(
           java.lang.String sessionId,
           java.lang.String attributeId,
           java.lang.String attributeSetId,
           java.lang.String attributeGroupId,
           java.lang.String sortOrder) {
           this.sessionId = sessionId;
           this.attributeId = attributeId;
           this.attributeSetId = attributeSetId;
           this.attributeGroupId = attributeGroupId;
           this.sortOrder = sortOrder;
    }


    /**
     * Gets the sessionId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the attributeId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @return attributeId
     */
    public java.lang.String getAttributeId() {
        return attributeId;
    }


    /**
     * Sets the attributeId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @param attributeId
     */
    public void setAttributeId(java.lang.String attributeId) {
        this.attributeId = attributeId;
    }


    /**
     * Gets the attributeSetId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @return attributeSetId
     */
    public java.lang.String getAttributeSetId() {
        return attributeSetId;
    }


    /**
     * Sets the attributeSetId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @param attributeSetId
     */
    public void setAttributeSetId(java.lang.String attributeSetId) {
        this.attributeSetId = attributeSetId;
    }


    /**
     * Gets the attributeGroupId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @return attributeGroupId
     */
    public java.lang.String getAttributeGroupId() {
        return attributeGroupId;
    }


    /**
     * Sets the attributeGroupId value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @param attributeGroupId
     */
    public void setAttributeGroupId(java.lang.String attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }


    /**
     * Gets the sortOrder value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @return sortOrder
     */
    public java.lang.String getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this CatalogProductAttributeSetAttributeAddRequestParam.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.String sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeSetAttributeAddRequestParam)) return false;
        CatalogProductAttributeSetAttributeAddRequestParam other = (CatalogProductAttributeSetAttributeAddRequestParam) obj;
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
            ((this.attributeId==null && other.getAttributeId()==null) || 
             (this.attributeId!=null &&
              this.attributeId.equals(other.getAttributeId()))) &&
            ((this.attributeSetId==null && other.getAttributeSetId()==null) || 
             (this.attributeSetId!=null &&
              this.attributeSetId.equals(other.getAttributeSetId()))) &&
            ((this.attributeGroupId==null && other.getAttributeGroupId()==null) || 
             (this.attributeGroupId!=null &&
              this.attributeGroupId.equals(other.getAttributeGroupId()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder())));
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
        if (getAttributeId() != null) {
            _hashCode += getAttributeId().hashCode();
        }
        if (getAttributeSetId() != null) {
            _hashCode += getAttributeSetId().hashCode();
        }
        if (getAttributeGroupId() != null) {
            _hashCode += getAttributeGroupId().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeSetAttributeAddRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeAddRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
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
