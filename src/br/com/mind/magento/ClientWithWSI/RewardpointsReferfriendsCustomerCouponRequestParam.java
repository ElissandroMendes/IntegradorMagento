/**
 * RewardpointsReferfriendsCustomerCouponRequestParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class RewardpointsReferfriendsCustomerCouponRequestParam  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String couponCode;

    public RewardpointsReferfriendsCustomerCouponRequestParam() {
    }

    public RewardpointsReferfriendsCustomerCouponRequestParam(
           java.lang.String sessionId,
           java.lang.String couponCode) {
           this.sessionId = sessionId;
           this.couponCode = couponCode;
    }


    /**
     * Gets the sessionId value for this RewardpointsReferfriendsCustomerCouponRequestParam.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this RewardpointsReferfriendsCustomerCouponRequestParam.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the couponCode value for this RewardpointsReferfriendsCustomerCouponRequestParam.
     * 
     * @return couponCode
     */
    public java.lang.String getCouponCode() {
        return couponCode;
    }


    /**
     * Sets the couponCode value for this RewardpointsReferfriendsCustomerCouponRequestParam.
     * 
     * @param couponCode
     */
    public void setCouponCode(java.lang.String couponCode) {
        this.couponCode = couponCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardpointsReferfriendsCustomerCouponRequestParam)) return false;
        RewardpointsReferfriendsCustomerCouponRequestParam other = (RewardpointsReferfriendsCustomerCouponRequestParam) obj;
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
            ((this.couponCode==null && other.getCouponCode()==null) || 
             (this.couponCode!=null &&
              this.couponCode.equals(other.getCouponCode())));
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
        if (getCouponCode() != null) {
            _hashCode += getCouponCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardpointsReferfriendsCustomerCouponRequestParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerCouponRequestParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponCode"));
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
