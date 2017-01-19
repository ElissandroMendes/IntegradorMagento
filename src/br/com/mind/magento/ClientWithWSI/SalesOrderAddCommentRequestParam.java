/**
 * SalesOrderAddCommentRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderAddCommentRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String orderIncrementId;

    private java.lang.String status;

    private java.lang.String comment;

    private java.lang.Integer notify;

    public SalesOrderAddCommentRequestParam() {
    }

    public SalesOrderAddCommentRequestParam(
           java.lang.String sessionId,
           java.lang.String orderIncrementId,
           java.lang.String status,
           java.lang.String comment,
           java.lang.Integer notify) {
           this.sessionId = sessionId;
           this.orderIncrementId = orderIncrementId;
           this.status = status;
           this.comment = comment;
           this.notify = notify;
    }


    /**
     * Gets the sessionId value for this SalesOrderAddCommentRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderAddCommentRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the orderIncrementId value for this SalesOrderAddCommentRequestParam.
     * 
     * @return orderIncrementId
     */
    public java.lang.String getOrderIncrementId() {
        return orderIncrementId;
    }


    /**
     * Sets the orderIncrementId value for this SalesOrderAddCommentRequestParam.
     * 
     * @param orderIncrementId
     */
    public void setOrderIncrementId(java.lang.String orderIncrementId) {
        this.orderIncrementId = orderIncrementId;
    }


    /**
     * Gets the status value for this SalesOrderAddCommentRequestParam.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SalesOrderAddCommentRequestParam.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the comment value for this SalesOrderAddCommentRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderAddCommentRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the notify value for this SalesOrderAddCommentRequestParam.
     * 
     * @return notify
     */
    public java.lang.Integer getNotify() {
        return notify;
    }


    /**
     * Sets the notify value for this SalesOrderAddCommentRequestParam.
     * 
     * @param notify
     */
    public void setNotify(java.lang.Integer notify) {
        this.notify = notify;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderAddCommentRequestParam)) return false;
        SalesOrderAddCommentRequestParam other = (SalesOrderAddCommentRequestParam) obj;
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
            ((this.orderIncrementId==null && other.getOrderIncrementId()==null) || 
             (this.orderIncrementId!=null &&
              this.orderIncrementId.equals(other.getOrderIncrementId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.notify==null && other.getNotify()==null) || 
             (this.notify!=null &&
              this.notify.equals(other.getNotify())));
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
        if (getOrderIncrementId() != null) {
            _hashCode += getOrderIncrementId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getNotify() != null) {
            _hashCode += getNotify().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderAddCommentRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderAddCommentRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIncrementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderIncrementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("notify");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
