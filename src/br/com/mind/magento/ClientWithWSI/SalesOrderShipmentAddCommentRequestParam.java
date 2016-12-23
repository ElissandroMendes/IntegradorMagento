/**
 * SalesOrderShipmentAddCommentRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderShipmentAddCommentRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String shipmentIncrementId;

    private java.lang.String comment;

    private java.lang.String email;

    private java.lang.String includeInEmail;

    public SalesOrderShipmentAddCommentRequestParam() {
    }

    public SalesOrderShipmentAddCommentRequestParam(
           java.lang.String sessionId,
           java.lang.String shipmentIncrementId,
           java.lang.String comment,
           java.lang.String email,
           java.lang.String includeInEmail) {
           this.sessionId = sessionId;
           this.shipmentIncrementId = shipmentIncrementId;
           this.comment = comment;
           this.email = email;
           this.includeInEmail = includeInEmail;
    }


    /**
     * Gets the sessionId value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the shipmentIncrementId value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @return shipmentIncrementId
     */
    public java.lang.String getShipmentIncrementId() {
        return shipmentIncrementId;
    }


    /**
     * Sets the shipmentIncrementId value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @param shipmentIncrementId
     */
    public void setShipmentIncrementId(java.lang.String shipmentIncrementId) {
        this.shipmentIncrementId = shipmentIncrementId;
    }


    /**
     * Gets the comment value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the includeInEmail value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @return includeInEmail
     */
    public java.lang.String getIncludeInEmail() {
        return includeInEmail;
    }


    /**
     * Sets the includeInEmail value for this SalesOrderShipmentAddCommentRequestParam.
     * 
     * @param includeInEmail
     */
    public void setIncludeInEmail(java.lang.String includeInEmail) {
        this.includeInEmail = includeInEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderShipmentAddCommentRequestParam)) return false;
        SalesOrderShipmentAddCommentRequestParam other = (SalesOrderShipmentAddCommentRequestParam) obj;
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
              this.comment.equals(other.getComment()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.includeInEmail==null && other.getIncludeInEmail()==null) || 
             (this.includeInEmail!=null &&
              this.includeInEmail.equals(other.getIncludeInEmail())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getIncludeInEmail() != null) {
            _hashCode += getIncludeInEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderShipmentAddCommentRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentRequestParam"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeInEmail"));
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
