/**
 * SalesOrderShipmentCreateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderShipmentCreateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String orderIncrementId;

    private br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] itemsQty;

    private java.lang.String comment;

    private int email;

    private int includeComment;

    public SalesOrderShipmentCreateRequestParam() {
    }

    public SalesOrderShipmentCreateRequestParam(
           java.lang.String sessionId,
           java.lang.String orderIncrementId,
           br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] itemsQty,
           java.lang.String comment,
           int email,
           int includeComment) {
           this.sessionId = sessionId;
           this.orderIncrementId = orderIncrementId;
           this.itemsQty = itemsQty;
           this.comment = comment;
           this.email = email;
           this.includeComment = includeComment;
    }


    /**
     * Gets the sessionId value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the orderIncrementId value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @return orderIncrementId
     */
    public java.lang.String getOrderIncrementId() {
        return orderIncrementId;
    }


    /**
     * Sets the orderIncrementId value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @param orderIncrementId
     */
    public void setOrderIncrementId(java.lang.String orderIncrementId) {
        this.orderIncrementId = orderIncrementId;
    }


    /**
     * Gets the itemsQty value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @return itemsQty
     */
    public br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] getItemsQty() {
        return itemsQty;
    }


    /**
     * Sets the itemsQty value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @param itemsQty
     */
    public void setItemsQty(br.com.mind.magento.ClientWithWSI.OrderItemIdQty[] itemsQty) {
        this.itemsQty = itemsQty;
    }


    /**
     * Gets the comment value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @return email
     */
    public int getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @param email
     */
    public void setEmail(int email) {
        this.email = email;
    }


    /**
     * Gets the includeComment value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @return includeComment
     */
    public int getIncludeComment() {
        return includeComment;
    }


    /**
     * Sets the includeComment value for this SalesOrderShipmentCreateRequestParam.
     * 
     * @param includeComment
     */
    public void setIncludeComment(int includeComment) {
        this.includeComment = includeComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderShipmentCreateRequestParam)) return false;
        SalesOrderShipmentCreateRequestParam other = (SalesOrderShipmentCreateRequestParam) obj;
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
            ((this.itemsQty==null && other.getItemsQty()==null) || 
             (this.itemsQty!=null &&
              java.util.Arrays.equals(this.itemsQty, other.getItemsQty()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            this.email == other.getEmail() &&
            this.includeComment == other.getIncludeComment();
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
        _hashCode += getEmail();
        _hashCode += getIncludeComment();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderShipmentCreateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateRequestParam"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
