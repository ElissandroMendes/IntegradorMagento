/**
 * RewardpointsTransferAddRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class RewardpointsTransferAddRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private br.com.mind.magento.Client.RewardpointsTransferAdd transferData;

    public RewardpointsTransferAddRequestParam() {
    }

    public RewardpointsTransferAddRequestParam(
           java.lang.String sessionId,
           br.com.mind.magento.Client.RewardpointsTransferAdd transferData) {
           this.sessionId = sessionId;
           this.transferData = transferData;
    }


    /**
     * Gets the sessionId value for this RewardpointsTransferAddRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this RewardpointsTransferAddRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the transferData value for this RewardpointsTransferAddRequestParam.
     * 
     * @return transferData
     */
    public br.com.mind.magento.Client.RewardpointsTransferAdd getTransferData() {
        return transferData;
    }


    /**
     * Sets the transferData value for this RewardpointsTransferAddRequestParam.
     * 
     * @param transferData
     */
    public void setTransferData(br.com.mind.magento.Client.RewardpointsTransferAdd transferData) {
        this.transferData = transferData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardpointsTransferAddRequestParam)) return false;
        RewardpointsTransferAddRequestParam other = (RewardpointsTransferAddRequestParam) obj;
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
            ((this.transferData==null && other.getTransferData()==null) || 
             (this.transferData!=null &&
              this.transferData.equals(other.getTransferData())));
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
        if (getTransferData() != null) {
            _hashCode += getTransferData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardpointsTransferAddRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferAddRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferAdd"));
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
