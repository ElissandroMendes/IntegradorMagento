/**
 * CatalogProductDownloadableLinkRemoveRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductDownloadableLinkRemoveRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String linkId;

    private java.lang.String resourceType;

    public CatalogProductDownloadableLinkRemoveRequestParam() {
    }

    public CatalogProductDownloadableLinkRemoveRequestParam(
           java.lang.String sessionId,
           java.lang.String linkId,
           java.lang.String resourceType) {
           this.sessionId = sessionId;
           this.linkId = linkId;
           this.resourceType = resourceType;
    }


    /**
     * Gets the sessionId value for this CatalogProductDownloadableLinkRemoveRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CatalogProductDownloadableLinkRemoveRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the linkId value for this CatalogProductDownloadableLinkRemoveRequestParam.
     * 
     * @return linkId
     */
    public java.lang.String getLinkId() {
        return linkId;
    }


    /**
     * Sets the linkId value for this CatalogProductDownloadableLinkRemoveRequestParam.
     * 
     * @param linkId
     */
    public void setLinkId(java.lang.String linkId) {
        this.linkId = linkId;
    }


    /**
     * Gets the resourceType value for this CatalogProductDownloadableLinkRemoveRequestParam.
     * 
     * @return resourceType
     */
    public java.lang.String getResourceType() {
        return resourceType;
    }


    /**
     * Sets the resourceType value for this CatalogProductDownloadableLinkRemoveRequestParam.
     * 
     * @param resourceType
     */
    public void setResourceType(java.lang.String resourceType) {
        this.resourceType = resourceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductDownloadableLinkRemoveRequestParam)) return false;
        CatalogProductDownloadableLinkRemoveRequestParam other = (CatalogProductDownloadableLinkRemoveRequestParam) obj;
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
            ((this.linkId==null && other.getLinkId()==null) || 
             (this.linkId!=null &&
              this.linkId.equals(other.getLinkId()))) &&
            ((this.resourceType==null && other.getResourceType()==null) || 
             (this.resourceType!=null &&
              this.resourceType.equals(other.getResourceType())));
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
        if (getLinkId() != null) {
            _hashCode += getLinkId().hashCode();
        }
        if (getResourceType() != null) {
            _hashCode += getResourceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductDownloadableLinkRemoveRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkRemoveRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceType"));
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
