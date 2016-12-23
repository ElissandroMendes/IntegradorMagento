/**
 * SalesOrderCreditmemoAddCommentRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderCreditmemoAddCommentRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String creditmemoIncrementId;

    private java.lang.String comment;

    private java.lang.Integer notifyCustomer;

    private java.lang.Integer includeComment;

    public SalesOrderCreditmemoAddCommentRequestParam() {
    }

    public SalesOrderCreditmemoAddCommentRequestParam(
           java.lang.String sessionId,
           java.lang.String creditmemoIncrementId,
           java.lang.String comment,
           java.lang.Integer notifyCustomer,
           java.lang.Integer includeComment) {
           this.sessionId = sessionId;
           this.creditmemoIncrementId = creditmemoIncrementId;
           this.comment = comment;
           this.notifyCustomer = notifyCustomer;
           this.includeComment = includeComment;
    }


    /**
     * Gets the sessionId value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the creditmemoIncrementId value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @return creditmemoIncrementId
     */
    public java.lang.String getCreditmemoIncrementId() {
        return creditmemoIncrementId;
    }


    /**
     * Sets the creditmemoIncrementId value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @param creditmemoIncrementId
     */
    public void setCreditmemoIncrementId(java.lang.String creditmemoIncrementId) {
        this.creditmemoIncrementId = creditmemoIncrementId;
    }


    /**
     * Gets the comment value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the notifyCustomer value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @return notifyCustomer
     */
    public java.lang.Integer getNotifyCustomer() {
        return notifyCustomer;
    }


    /**
     * Sets the notifyCustomer value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @param notifyCustomer
     */
    public void setNotifyCustomer(java.lang.Integer notifyCustomer) {
        this.notifyCustomer = notifyCustomer;
    }


    /**
     * Gets the includeComment value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @return includeComment
     */
    public java.lang.Integer getIncludeComment() {
        return includeComment;
    }


    /**
     * Sets the includeComment value for this SalesOrderCreditmemoAddCommentRequestParam.
     * 
     * @param includeComment
     */
    public void setIncludeComment(java.lang.Integer includeComment) {
        this.includeComment = includeComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderCreditmemoAddCommentRequestParam)) return false;
        SalesOrderCreditmemoAddCommentRequestParam other = (SalesOrderCreditmemoAddCommentRequestParam) obj;
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
            ((this.creditmemoIncrementId==null && other.getCreditmemoIncrementId()==null) || 
             (this.creditmemoIncrementId!=null &&
              this.creditmemoIncrementId.equals(other.getCreditmemoIncrementId()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.notifyCustomer==null && other.getNotifyCustomer()==null) || 
             (this.notifyCustomer!=null &&
              this.notifyCustomer.equals(other.getNotifyCustomer()))) &&
            ((this.includeComment==null && other.getIncludeComment()==null) || 
             (this.includeComment!=null &&
              this.includeComment.equals(other.getIncludeComment())));
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
        if (getCreditmemoIncrementId() != null) {
            _hashCode += getCreditmemoIncrementId().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getNotifyCustomer() != null) {
            _hashCode += getNotifyCustomer().hashCode();
        }
        if (getIncludeComment() != null) {
            _hashCode += getIncludeComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderCreditmemoAddCommentRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditmemoIncrementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditmemoIncrementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeComment"));
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
