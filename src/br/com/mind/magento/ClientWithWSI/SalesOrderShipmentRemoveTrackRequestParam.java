/**
 * SalesOrderShipmentRemoveTrackRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderShipmentRemoveTrackRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String shipmentIncrementId;

    private java.lang.String trackId;

    public SalesOrderShipmentRemoveTrackRequestParam() {
    }

    public SalesOrderShipmentRemoveTrackRequestParam(
           java.lang.String sessionId,
           java.lang.String shipmentIncrementId,
           java.lang.String trackId) {
           this.sessionId = sessionId;
           this.shipmentIncrementId = shipmentIncrementId;
           this.trackId = trackId;
    }


    /**
     * Gets the sessionId value for this SalesOrderShipmentRemoveTrackRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderShipmentRemoveTrackRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the shipmentIncrementId value for this SalesOrderShipmentRemoveTrackRequestParam.
     * 
     * @return shipmentIncrementId
     */
    public java.lang.String getShipmentIncrementId() {
        return shipmentIncrementId;
    }


    /**
     * Sets the shipmentIncrementId value for this SalesOrderShipmentRemoveTrackRequestParam.
     * 
     * @param shipmentIncrementId
     */
    public void setShipmentIncrementId(java.lang.String shipmentIncrementId) {
        this.shipmentIncrementId = shipmentIncrementId;
    }


    /**
     * Gets the trackId value for this SalesOrderShipmentRemoveTrackRequestParam.
     * 
     * @return trackId
     */
    public java.lang.String getTrackId() {
        return trackId;
    }


    /**
     * Sets the trackId value for this SalesOrderShipmentRemoveTrackRequestParam.
     * 
     * @param trackId
     */
    public void setTrackId(java.lang.String trackId) {
        this.trackId = trackId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderShipmentRemoveTrackRequestParam)) return false;
        SalesOrderShipmentRemoveTrackRequestParam other = (SalesOrderShipmentRemoveTrackRequestParam) obj;
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
            ((this.shipmentIncrementId==null && other.getShipmentIncrementId()==null) || 
             (this.shipmentIncrementId!=null &&
              this.shipmentIncrementId.equals(other.getShipmentIncrementId()))) &&
            ((this.trackId==null && other.getTrackId()==null) || 
             (this.trackId!=null &&
              this.trackId.equals(other.getTrackId())));
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
        if (getShipmentIncrementId() != null) {
            _hashCode += getShipmentIncrementId().hashCode();
        }
        if (getTrackId() != null) {
            _hashCode += getTrackId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderShipmentRemoveTrackRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentRemoveTrackRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentIncrementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentIncrementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackId"));
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
