/**
 * SalesOrderInvoiceAddCommentRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class SalesOrderInvoiceAddCommentRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String invoiceIncrementId;

    private java.lang.String comment;

    private java.lang.String email;

    private java.lang.String includeComment;

    public SalesOrderInvoiceAddCommentRequestParam() {
    }

    public SalesOrderInvoiceAddCommentRequestParam(
           java.lang.String sessionId,
           java.lang.String invoiceIncrementId,
           java.lang.String comment,
           java.lang.String email,
           java.lang.String includeComment) {
           this.sessionId = sessionId;
           this.invoiceIncrementId = invoiceIncrementId;
           this.comment = comment;
           this.email = email;
           this.includeComment = includeComment;
    }


    /**
     * Gets the sessionId value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the invoiceIncrementId value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @return invoiceIncrementId
     */
    public java.lang.String getInvoiceIncrementId() {
        return invoiceIncrementId;
    }


    /**
     * Sets the invoiceIncrementId value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @param invoiceIncrementId
     */
    public void setInvoiceIncrementId(java.lang.String invoiceIncrementId) {
        this.invoiceIncrementId = invoiceIncrementId;
    }


    /**
     * Gets the comment value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the includeComment value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @return includeComment
     */
    public java.lang.String getIncludeComment() {
        return includeComment;
    }


    /**
     * Sets the includeComment value for this SalesOrderInvoiceAddCommentRequestParam.
     * 
     * @param includeComment
     */
    public void setIncludeComment(java.lang.String includeComment) {
        this.includeComment = includeComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderInvoiceAddCommentRequestParam)) return false;
        SalesOrderInvoiceAddCommentRequestParam other = (SalesOrderInvoiceAddCommentRequestParam) obj;
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
            ((this.invoiceIncrementId==null && other.getInvoiceIncrementId()==null) || 
             (this.invoiceIncrementId!=null &&
              this.invoiceIncrementId.equals(other.getInvoiceIncrementId()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
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
        if (getInvoiceIncrementId() != null) {
            _hashCode += getInvoiceIncrementId().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getIncludeComment() != null) {
            _hashCode += getIncludeComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderInvoiceAddCommentRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceIncrementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceIncrementId"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeComment"));
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
