/**
 * SalesOrderShipmentSendInfoRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class SalesOrderShipmentSendInfoRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String shipmentIncrementId;

    private java.lang.String comment;

    public SalesOrderShipmentSendInfoRequestParam() {
    }

    public SalesOrderShipmentSendInfoRequestParam(
           java.lang.String sessionId,
           java.lang.String shipmentIncrementId,
           java.lang.String comment) {
           this.sessionId = sessionId;
           this.shipmentIncrementId = shipmentIncrementId;
           this.comment = comment;
    }


    /**
     * Gets the sessionId value for this SalesOrderShipmentSendInfoRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderShipmentSendInfoRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the shipmentIncrementId value for this SalesOrderShipmentSendInfoRequestParam.
     * 
     * @return shipmentIncrementId
     */
    public java.lang.String getShipmentIncrementId() {
        return shipmentIncrementId;
    }


    /**
     * Sets the shipmentIncrementId value for this SalesOrderShipmentSendInfoRequestParam.
     * 
     * @param shipmentIncrementId
     */
    public void setShipmentIncrementId(java.lang.String shipmentIncrementId) {
        this.shipmentIncrementId = shipmentIncrementId;
    }


    /**
     * Gets the comment value for this SalesOrderShipmentSendInfoRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderShipmentSendInfoRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderShipmentSendInfoRequestParam)) return false;
        SalesOrderShipmentSendInfoRequestParam other = (SalesOrderShipmentSendInfoRequestParam) obj;
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
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderShipmentSendInfoRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoRequestParam"));
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
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
