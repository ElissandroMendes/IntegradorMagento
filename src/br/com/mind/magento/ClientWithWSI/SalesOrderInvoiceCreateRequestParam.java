/**
 * SalesOrderInvoiceCreateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderInvoiceCreateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String invoiceIncrementId;

    private br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] itemsQty;

    private java.lang.String comment;

    private java.lang.String email;

    private java.lang.String includeComment;

    public SalesOrderInvoiceCreateRequestParam() {
    }

    public SalesOrderInvoiceCreateRequestParam(
           java.lang.String sessionId,
           java.lang.String invoiceIncrementId,
           br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] itemsQty,
           java.lang.String comment,
           java.lang.String email,
           java.lang.String includeComment) {
           this.sessionId = sessionId;
           this.invoiceIncrementId = invoiceIncrementId;
           this.itemsQty = itemsQty;
           this.comment = comment;
           this.email = email;
           this.includeComment = includeComment;
    }


    /**
     * Gets the sessionId value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the invoiceIncrementId value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @return invoiceIncrementId
     */
    public java.lang.String getInvoiceIncrementId() {
        return invoiceIncrementId;
    }


    /**
     * Sets the invoiceIncrementId value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @param invoiceIncrementId
     */
    public void setInvoiceIncrementId(java.lang.String invoiceIncrementId) {
        this.invoiceIncrementId = invoiceIncrementId;
    }


    /**
     * Gets the itemsQty value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @return itemsQty
     */
    public br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] getItemsQty() {
        return itemsQty;
    }


    /**
     * Sets the itemsQty value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @param itemsQty
     */
    public void setItemsQty(br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] itemsQty) {
        this.itemsQty = itemsQty;
    }


    /**
     * Gets the comment value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the includeComment value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @return includeComment
     */
    public java.lang.String getIncludeComment() {
        return includeComment;
    }


    /**
     * Sets the includeComment value for this SalesOrderInvoiceCreateRequestParam.
     * 
     * @param includeComment
     */
    public void setIncludeComment(java.lang.String includeComment) {
        this.includeComment = includeComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderInvoiceCreateRequestParam)) return false;
        SalesOrderInvoiceCreateRequestParam other = (SalesOrderInvoiceCreateRequestParam) obj;
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
            ((this.itemsQty==null && other.getItemsQty()==null) || 
             (this.itemsQty!=null &&
              java.util.Arrays.equals(this.itemsQty, other.getItemsQty()))) &&
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
        if (getItemsQty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsQty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsQty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(SalesOrderInvoiceCreateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateRequestParam"));
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
        elemField.setFieldName("itemsQty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemsQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "orderItemIdQty"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "complexObjectArray"));
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
