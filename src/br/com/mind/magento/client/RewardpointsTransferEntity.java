/**
 * RewardpointsTransferEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class RewardpointsTransferEntity  implements java.io.Serializable {
    private java.lang.Integer transfer_id;

    private java.lang.Integer sender_email;

    private java.lang.Integer receiver_email;

    private java.lang.String point_amount;

    private java.lang.String send_transaction_id;

    private java.lang.Integer receive_transaction_id;

    private java.lang.Integer sender_customer_id;

    private java.lang.Integer receiver_customer_id;

    private java.lang.Integer extra_content;

    private java.lang.Integer status;

    private java.lang.String store_id;

    private java.lang.String pending_day;

    private java.lang.String holding_day;

    private java.lang.Integer created_time;

    private java.lang.Integer updated_time;

    public RewardpointsTransferEntity() {
    }

    public RewardpointsTransferEntity(
           java.lang.Integer transfer_id,
           java.lang.Integer sender_email,
           java.lang.Integer receiver_email,
           java.lang.String point_amount,
           java.lang.String send_transaction_id,
           java.lang.Integer receive_transaction_id,
           java.lang.Integer sender_customer_id,
           java.lang.Integer receiver_customer_id,
           java.lang.Integer extra_content,
           java.lang.Integer status,
           java.lang.String store_id,
           java.lang.String pending_day,
           java.lang.String holding_day,
           java.lang.Integer created_time,
           java.lang.Integer updated_time) {
           this.transfer_id = transfer_id;
           this.sender_email = sender_email;
           this.receiver_email = receiver_email;
           this.point_amount = point_amount;
           this.send_transaction_id = send_transaction_id;
           this.receive_transaction_id = receive_transaction_id;
           this.sender_customer_id = sender_customer_id;
           this.receiver_customer_id = receiver_customer_id;
           this.extra_content = extra_content;
           this.status = status;
           this.store_id = store_id;
           this.pending_day = pending_day;
           this.holding_day = holding_day;
           this.created_time = created_time;
           this.updated_time = updated_time;
    }


    /**
     * Gets the transfer_id value for this RewardpointsTransferEntity.
     * 
     * @return transfer_id
     */
    public java.lang.Integer getTransfer_id() {
        return transfer_id;
    }


    /**
     * Sets the transfer_id value for this RewardpointsTransferEntity.
     * 
     * @param transfer_id
     */
    public void setTransfer_id(java.lang.Integer transfer_id) {
        this.transfer_id = transfer_id;
    }


    /**
     * Gets the sender_email value for this RewardpointsTransferEntity.
     * 
     * @return sender_email
     */
    public java.lang.Integer getSender_email() {
        return sender_email;
    }


    /**
     * Sets the sender_email value for this RewardpointsTransferEntity.
     * 
     * @param sender_email
     */
    public void setSender_email(java.lang.Integer sender_email) {
        this.sender_email = sender_email;
    }


    /**
     * Gets the receiver_email value for this RewardpointsTransferEntity.
     * 
     * @return receiver_email
     */
    public java.lang.Integer getReceiver_email() {
        return receiver_email;
    }


    /**
     * Sets the receiver_email value for this RewardpointsTransferEntity.
     * 
     * @param receiver_email
     */
    public void setReceiver_email(java.lang.Integer receiver_email) {
        this.receiver_email = receiver_email;
    }


    /**
     * Gets the point_amount value for this RewardpointsTransferEntity.
     * 
     * @return point_amount
     */
    public java.lang.String getPoint_amount() {
        return point_amount;
    }


    /**
     * Sets the point_amount value for this RewardpointsTransferEntity.
     * 
     * @param point_amount
     */
    public void setPoint_amount(java.lang.String point_amount) {
        this.point_amount = point_amount;
    }


    /**
     * Gets the send_transaction_id value for this RewardpointsTransferEntity.
     * 
     * @return send_transaction_id
     */
    public java.lang.String getSend_transaction_id() {
        return send_transaction_id;
    }


    /**
     * Sets the send_transaction_id value for this RewardpointsTransferEntity.
     * 
     * @param send_transaction_id
     */
    public void setSend_transaction_id(java.lang.String send_transaction_id) {
        this.send_transaction_id = send_transaction_id;
    }


    /**
     * Gets the receive_transaction_id value for this RewardpointsTransferEntity.
     * 
     * @return receive_transaction_id
     */
    public java.lang.Integer getReceive_transaction_id() {
        return receive_transaction_id;
    }


    /**
     * Sets the receive_transaction_id value for this RewardpointsTransferEntity.
     * 
     * @param receive_transaction_id
     */
    public void setReceive_transaction_id(java.lang.Integer receive_transaction_id) {
        this.receive_transaction_id = receive_transaction_id;
    }


    /**
     * Gets the sender_customer_id value for this RewardpointsTransferEntity.
     * 
     * @return sender_customer_id
     */
    public java.lang.Integer getSender_customer_id() {
        return sender_customer_id;
    }


    /**
     * Sets the sender_customer_id value for this RewardpointsTransferEntity.
     * 
     * @param sender_customer_id
     */
    public void setSender_customer_id(java.lang.Integer sender_customer_id) {
        this.sender_customer_id = sender_customer_id;
    }


    /**
     * Gets the receiver_customer_id value for this RewardpointsTransferEntity.
     * 
     * @return receiver_customer_id
     */
    public java.lang.Integer getReceiver_customer_id() {
        return receiver_customer_id;
    }


    /**
     * Sets the receiver_customer_id value for this RewardpointsTransferEntity.
     * 
     * @param receiver_customer_id
     */
    public void setReceiver_customer_id(java.lang.Integer receiver_customer_id) {
        this.receiver_customer_id = receiver_customer_id;
    }


    /**
     * Gets the extra_content value for this RewardpointsTransferEntity.
     * 
     * @return extra_content
     */
    public java.lang.Integer getExtra_content() {
        return extra_content;
    }


    /**
     * Sets the extra_content value for this RewardpointsTransferEntity.
     * 
     * @param extra_content
     */
    public void setExtra_content(java.lang.Integer extra_content) {
        this.extra_content = extra_content;
    }


    /**
     * Gets the status value for this RewardpointsTransferEntity.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RewardpointsTransferEntity.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the store_id value for this RewardpointsTransferEntity.
     * 
     * @return store_id
     */
    public java.lang.String getStore_id() {
        return store_id;
    }


    /**
     * Sets the store_id value for this RewardpointsTransferEntity.
     * 
     * @param store_id
     */
    public void setStore_id(java.lang.String store_id) {
        this.store_id = store_id;
    }


    /**
     * Gets the pending_day value for this RewardpointsTransferEntity.
     * 
     * @return pending_day
     */
    public java.lang.String getPending_day() {
        return pending_day;
    }


    /**
     * Sets the pending_day value for this RewardpointsTransferEntity.
     * 
     * @param pending_day
     */
    public void setPending_day(java.lang.String pending_day) {
        this.pending_day = pending_day;
    }


    /**
     * Gets the holding_day value for this RewardpointsTransferEntity.
     * 
     * @return holding_day
     */
    public java.lang.String getHolding_day() {
        return holding_day;
    }


    /**
     * Sets the holding_day value for this RewardpointsTransferEntity.
     * 
     * @param holding_day
     */
    public void setHolding_day(java.lang.String holding_day) {
        this.holding_day = holding_day;
    }


    /**
     * Gets the created_time value for this RewardpointsTransferEntity.
     * 
     * @return created_time
     */
    public java.lang.Integer getCreated_time() {
        return created_time;
    }


    /**
     * Sets the created_time value for this RewardpointsTransferEntity.
     * 
     * @param created_time
     */
    public void setCreated_time(java.lang.Integer created_time) {
        this.created_time = created_time;
    }


    /**
     * Gets the updated_time value for this RewardpointsTransferEntity.
     * 
     * @return updated_time
     */
    public java.lang.Integer getUpdated_time() {
        return updated_time;
    }


    /**
     * Sets the updated_time value for this RewardpointsTransferEntity.
     * 
     * @param updated_time
     */
    public void setUpdated_time(java.lang.Integer updated_time) {
        this.updated_time = updated_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardpointsTransferEntity)) return false;
        RewardpointsTransferEntity other = (RewardpointsTransferEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transfer_id==null && other.getTransfer_id()==null) || 
             (this.transfer_id!=null &&
              this.transfer_id.equals(other.getTransfer_id()))) &&
            ((this.sender_email==null && other.getSender_email()==null) || 
             (this.sender_email!=null &&
              this.sender_email.equals(other.getSender_email()))) &&
            ((this.receiver_email==null && other.getReceiver_email()==null) || 
             (this.receiver_email!=null &&
              this.receiver_email.equals(other.getReceiver_email()))) &&
            ((this.point_amount==null && other.getPoint_amount()==null) || 
             (this.point_amount!=null &&
              this.point_amount.equals(other.getPoint_amount()))) &&
            ((this.send_transaction_id==null && other.getSend_transaction_id()==null) || 
             (this.send_transaction_id!=null &&
              this.send_transaction_id.equals(other.getSend_transaction_id()))) &&
            ((this.receive_transaction_id==null && other.getReceive_transaction_id()==null) || 
             (this.receive_transaction_id!=null &&
              this.receive_transaction_id.equals(other.getReceive_transaction_id()))) &&
            ((this.sender_customer_id==null && other.getSender_customer_id()==null) || 
             (this.sender_customer_id!=null &&
              this.sender_customer_id.equals(other.getSender_customer_id()))) &&
            ((this.receiver_customer_id==null && other.getReceiver_customer_id()==null) || 
             (this.receiver_customer_id!=null &&
              this.receiver_customer_id.equals(other.getReceiver_customer_id()))) &&
            ((this.extra_content==null && other.getExtra_content()==null) || 
             (this.extra_content!=null &&
              this.extra_content.equals(other.getExtra_content()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.store_id==null && other.getStore_id()==null) || 
             (this.store_id!=null &&
              this.store_id.equals(other.getStore_id()))) &&
            ((this.pending_day==null && other.getPending_day()==null) || 
             (this.pending_day!=null &&
              this.pending_day.equals(other.getPending_day()))) &&
            ((this.holding_day==null && other.getHolding_day()==null) || 
             (this.holding_day!=null &&
              this.holding_day.equals(other.getHolding_day()))) &&
            ((this.created_time==null && other.getCreated_time()==null) || 
             (this.created_time!=null &&
              this.created_time.equals(other.getCreated_time()))) &&
            ((this.updated_time==null && other.getUpdated_time()==null) || 
             (this.updated_time!=null &&
              this.updated_time.equals(other.getUpdated_time())));
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
        if (getTransfer_id() != null) {
            _hashCode += getTransfer_id().hashCode();
        }
        if (getSender_email() != null) {
            _hashCode += getSender_email().hashCode();
        }
        if (getReceiver_email() != null) {
            _hashCode += getReceiver_email().hashCode();
        }
        if (getPoint_amount() != null) {
            _hashCode += getPoint_amount().hashCode();
        }
        if (getSend_transaction_id() != null) {
            _hashCode += getSend_transaction_id().hashCode();
        }
        if (getReceive_transaction_id() != null) {
            _hashCode += getReceive_transaction_id().hashCode();
        }
        if (getSender_customer_id() != null) {
            _hashCode += getSender_customer_id().hashCode();
        }
        if (getReceiver_customer_id() != null) {
            _hashCode += getReceiver_customer_id().hashCode();
        }
        if (getExtra_content() != null) {
            _hashCode += getExtra_content().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStore_id() != null) {
            _hashCode += getStore_id().hashCode();
        }
        if (getPending_day() != null) {
            _hashCode += getPending_day().hashCode();
        }
        if (getHolding_day() != null) {
            _hashCode += getHolding_day().hashCode();
        }
        if (getCreated_time() != null) {
            _hashCode += getCreated_time().hashCode();
        }
        if (getUpdated_time() != null) {
            _hashCode += getUpdated_time().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardpointsTransferEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transfer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "point_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_transaction_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "send_transaction_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receive_transaction_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receive_transaction_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender_customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender_customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver_customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver_customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra_content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extra_content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pending_day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pending_day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holding_day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holding_day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated_time"));
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
