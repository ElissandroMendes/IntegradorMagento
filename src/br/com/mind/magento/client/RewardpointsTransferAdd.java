/**
 * RewardpointsTransferAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class RewardpointsTransferAdd  implements java.io.Serializable {
    private java.lang.String emailSend;

    private java.lang.String emailReceive;

    private java.lang.String pointAmount;

    private java.lang.String message;

    private java.lang.String storeId;

    public RewardpointsTransferAdd() {
    }

    public RewardpointsTransferAdd(
           java.lang.String emailSend,
           java.lang.String emailReceive,
           java.lang.String pointAmount,
           java.lang.String message,
           java.lang.String storeId) {
           this.emailSend = emailSend;
           this.emailReceive = emailReceive;
           this.pointAmount = pointAmount;
           this.message = message;
           this.storeId = storeId;
    }


    /**
     * Gets the emailSend value for this RewardpointsTransferAdd.
     * 
     * @return emailSend
     */
    public java.lang.String getEmailSend() {
        return emailSend;
    }


    /**
     * Sets the emailSend value for this RewardpointsTransferAdd.
     * 
     * @param emailSend
     */
    public void setEmailSend(java.lang.String emailSend) {
        this.emailSend = emailSend;
    }


    /**
     * Gets the emailReceive value for this RewardpointsTransferAdd.
     * 
     * @return emailReceive
     */
    public java.lang.String getEmailReceive() {
        return emailReceive;
    }


    /**
     * Sets the emailReceive value for this RewardpointsTransferAdd.
     * 
     * @param emailReceive
     */
    public void setEmailReceive(java.lang.String emailReceive) {
        this.emailReceive = emailReceive;
    }


    /**
     * Gets the pointAmount value for this RewardpointsTransferAdd.
     * 
     * @return pointAmount
     */
    public java.lang.String getPointAmount() {
        return pointAmount;
    }


    /**
     * Sets the pointAmount value for this RewardpointsTransferAdd.
     * 
     * @param pointAmount
     */
    public void setPointAmount(java.lang.String pointAmount) {
        this.pointAmount = pointAmount;
    }


    /**
     * Gets the message value for this RewardpointsTransferAdd.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RewardpointsTransferAdd.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the storeId value for this RewardpointsTransferAdd.
     * 
     * @return storeId
     */
    public java.lang.String getStoreId() {
        return storeId;
    }


    /**
     * Sets the storeId value for this RewardpointsTransferAdd.
     * 
     * @param storeId
     */
    public void setStoreId(java.lang.String storeId) {
        this.storeId = storeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardpointsTransferAdd)) return false;
        RewardpointsTransferAdd other = (RewardpointsTransferAdd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailSend==null && other.getEmailSend()==null) || 
             (this.emailSend!=null &&
              this.emailSend.equals(other.getEmailSend()))) &&
            ((this.emailReceive==null && other.getEmailReceive()==null) || 
             (this.emailReceive!=null &&
              this.emailReceive.equals(other.getEmailReceive()))) &&
            ((this.pointAmount==null && other.getPointAmount()==null) || 
             (this.pointAmount!=null &&
              this.pointAmount.equals(other.getPointAmount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.storeId==null && other.getStoreId()==null) || 
             (this.storeId!=null &&
              this.storeId.equals(other.getStoreId())));
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
        if (getEmailSend() != null) {
            _hashCode += getEmailSend().hashCode();
        }
        if (getEmailReceive() != null) {
            _hashCode += getEmailReceive().hashCode();
        }
        if (getPointAmount() != null) {
            _hashCode += getPointAmount().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getStoreId() != null) {
            _hashCode += getStoreId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardpointsTransferAdd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "rewardpointsTransferAdd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailReceive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailReceive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storeId"));
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
