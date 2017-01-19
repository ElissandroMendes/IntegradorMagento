/**
 * SalesOrderCreditmemoCreateRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class SalesOrderCreditmemoCreateRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String orderIncrementId;

    private br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoData creditmemoData;

    private java.lang.String comment;

    private java.lang.Integer notifyCustomer;

    private java.lang.Integer includeComment;

    private java.lang.String refundToStoreCreditAmount;

    public SalesOrderCreditmemoCreateRequestParam() {
    }

    public SalesOrderCreditmemoCreateRequestParam(
           java.lang.String sessionId,
           java.lang.String orderIncrementId,
           br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoData creditmemoData,
           java.lang.String comment,
           java.lang.Integer notifyCustomer,
           java.lang.Integer includeComment,
           java.lang.String refundToStoreCreditAmount) {
           this.sessionId = sessionId;
           this.orderIncrementId = orderIncrementId;
           this.creditmemoData = creditmemoData;
           this.comment = comment;
           this.notifyCustomer = notifyCustomer;
           this.includeComment = includeComment;
           this.refundToStoreCreditAmount = refundToStoreCreditAmount;
    }


    /**
     * Gets the sessionId value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the orderIncrementId value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return orderIncrementId
     */
    public java.lang.String getOrderIncrementId() {
        return orderIncrementId;
    }


    /**
     * Sets the orderIncrementId value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param orderIncrementId
     */
    public void setOrderIncrementId(java.lang.String orderIncrementId) {
        this.orderIncrementId = orderIncrementId;
    }


    /**
     * Gets the creditmemoData value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return creditmemoData
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoData getCreditmemoData() {
        return creditmemoData;
    }


    /**
     * Sets the creditmemoData value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param creditmemoData
     */
    public void setCreditmemoData(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoData creditmemoData) {
        this.creditmemoData = creditmemoData;
    }


    /**
     * Gets the comment value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the notifyCustomer value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return notifyCustomer
     */
    public java.lang.Integer getNotifyCustomer() {
        return notifyCustomer;
    }


    /**
     * Sets the notifyCustomer value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param notifyCustomer
     */
    public void setNotifyCustomer(java.lang.Integer notifyCustomer) {
        this.notifyCustomer = notifyCustomer;
    }


    /**
     * Gets the includeComment value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return includeComment
     */
    public java.lang.Integer getIncludeComment() {
        return includeComment;
    }


    /**
     * Sets the includeComment value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param includeComment
     */
    public void setIncludeComment(java.lang.Integer includeComment) {
        this.includeComment = includeComment;
    }


    /**
     * Gets the refundToStoreCreditAmount value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @return refundToStoreCreditAmount
     */
    public java.lang.String getRefundToStoreCreditAmount() {
        return refundToStoreCreditAmount;
    }


    /**
     * Sets the refundToStoreCreditAmount value for this SalesOrderCreditmemoCreateRequestParam.
     * 
     * @param refundToStoreCreditAmount
     */
    public void setRefundToStoreCreditAmount(java.lang.String refundToStoreCreditAmount) {
        this.refundToStoreCreditAmount = refundToStoreCreditAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderCreditmemoCreateRequestParam)) return false;
        SalesOrderCreditmemoCreateRequestParam other = (SalesOrderCreditmemoCreateRequestParam) obj;
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
            ((this.creditmemoData==null && other.getCreditmemoData()==null) || 
             (this.creditmemoData!=null &&
              this.creditmemoData.equals(other.getCreditmemoData()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.notifyCustomer==null && other.getNotifyCustomer()==null) || 
             (this.notifyCustomer!=null &&
              this.notifyCustomer.equals(other.getNotifyCustomer()))) &&
            ((this.includeComment==null && other.getIncludeComment()==null) || 
             (this.includeComment!=null &&
              this.includeComment.equals(other.getIncludeComment()))) &&
            ((this.refundToStoreCreditAmount==null && other.getRefundToStoreCreditAmount()==null) || 
             (this.refundToStoreCreditAmount!=null &&
              this.refundToStoreCreditAmount.equals(other.getRefundToStoreCreditAmount())));
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
        if (getCreditmemoData() != null) {
            _hashCode += getCreditmemoData().hashCode();
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
        if (getRefundToStoreCreditAmount() != null) {
            _hashCode += getRefundToStoreCreditAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderCreditmemoCreateRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCreateRequestParam"));
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
        elemField.setFieldName("creditmemoData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditmemoData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoData"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundToStoreCreditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundToStoreCreditAmount"));
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
