/**
 * SalesOrderShipmentAddTrackRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderShipmentAddTrackRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String shipmentIncrementId;

    private java.lang.String carrier;

    private java.lang.String title;

    private java.lang.String trackNumber;

    public SalesOrderShipmentAddTrackRequestParam() {
    }

    public SalesOrderShipmentAddTrackRequestParam(
           java.lang.String sessionId,
           java.lang.String shipmentIncrementId,
           java.lang.String carrier,
           java.lang.String title,
           java.lang.String trackNumber) {
           this.sessionId = sessionId;
           this.shipmentIncrementId = shipmentIncrementId;
           this.carrier = carrier;
           this.title = title;
           this.trackNumber = trackNumber;
    }


    /**
     * Gets the sessionId value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the shipmentIncrementId value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @return shipmentIncrementId
     */
    public java.lang.String getShipmentIncrementId() {
        return shipmentIncrementId;
    }


    /**
     * Sets the shipmentIncrementId value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @param shipmentIncrementId
     */
    public void setShipmentIncrementId(java.lang.String shipmentIncrementId) {
        this.shipmentIncrementId = shipmentIncrementId;
    }


    /**
     * Gets the carrier value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the title value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the trackNumber value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @return trackNumber
     */
    public java.lang.String getTrackNumber() {
        return trackNumber;
    }


    /**
     * Sets the trackNumber value for this SalesOrderShipmentAddTrackRequestParam.
     * 
     * @param trackNumber
     */
    public void setTrackNumber(java.lang.String trackNumber) {
        this.trackNumber = trackNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderShipmentAddTrackRequestParam)) return false;
        SalesOrderShipmentAddTrackRequestParam other = (SalesOrderShipmentAddTrackRequestParam) obj;
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
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.trackNumber==null && other.getTrackNumber()==null) || 
             (this.trackNumber!=null &&
              this.trackNumber.equals(other.getTrackNumber())));
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
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTrackNumber() != null) {
            _hashCode += getTrackNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderShipmentAddTrackRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddTrackRequestParam"));
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
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackNumber"));
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
