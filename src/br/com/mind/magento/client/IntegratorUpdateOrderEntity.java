/**
 * IntegratorUpdateOrderEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class IntegratorUpdateOrderEntity  implements java.io.Serializable {
    private java.lang.String increment_id;

    private java.lang.String skyhub_code;

    private java.lang.String customer_email;

    private br.com.mind.magento.client.IntegratorCreateOrderAddressEntity shipping_address;

    private br.com.mind.magento.client.IntegratorCreateOrderAddressEntity billing_address;

    public IntegratorUpdateOrderEntity() {
    }

    public IntegratorUpdateOrderEntity(
           java.lang.String increment_id,
           java.lang.String skyhub_code,
           java.lang.String customer_email,
           br.com.mind.magento.client.IntegratorCreateOrderAddressEntity shipping_address,
           br.com.mind.magento.client.IntegratorCreateOrderAddressEntity billing_address) {
           this.increment_id = increment_id;
           this.skyhub_code = skyhub_code;
           this.customer_email = customer_email;
           this.shipping_address = shipping_address;
           this.billing_address = billing_address;
    }


    /**
     * Gets the increment_id value for this IntegratorUpdateOrderEntity.
     * 
     * @return increment_id
     */
    public java.lang.String getIncrement_id() {
        return increment_id;
    }


    /**
     * Sets the increment_id value for this IntegratorUpdateOrderEntity.
     * 
     * @param increment_id
     */
    public void setIncrement_id(java.lang.String increment_id) {
        this.increment_id = increment_id;
    }


    /**
     * Gets the skyhub_code value for this IntegratorUpdateOrderEntity.
     * 
     * @return skyhub_code
     */
    public java.lang.String getSkyhub_code() {
        return skyhub_code;
    }


    /**
     * Sets the skyhub_code value for this IntegratorUpdateOrderEntity.
     * 
     * @param skyhub_code
     */
    public void setSkyhub_code(java.lang.String skyhub_code) {
        this.skyhub_code = skyhub_code;
    }


    /**
     * Gets the customer_email value for this IntegratorUpdateOrderEntity.
     * 
     * @return customer_email
     */
    public java.lang.String getCustomer_email() {
        return customer_email;
    }


    /**
     * Sets the customer_email value for this IntegratorUpdateOrderEntity.
     * 
     * @param customer_email
     */
    public void setCustomer_email(java.lang.String customer_email) {
        this.customer_email = customer_email;
    }


    /**
     * Gets the shipping_address value for this IntegratorUpdateOrderEntity.
     * 
     * @return shipping_address
     */
    public br.com.mind.magento.client.IntegratorCreateOrderAddressEntity getShipping_address() {
        return shipping_address;
    }


    /**
     * Sets the shipping_address value for this IntegratorUpdateOrderEntity.
     * 
     * @param shipping_address
     */
    public void setShipping_address(br.com.mind.magento.client.IntegratorCreateOrderAddressEntity shipping_address) {
        this.shipping_address = shipping_address;
    }


    /**
     * Gets the billing_address value for this IntegratorUpdateOrderEntity.
     * 
     * @return billing_address
     */
    public br.com.mind.magento.client.IntegratorCreateOrderAddressEntity getBilling_address() {
        return billing_address;
    }


    /**
     * Sets the billing_address value for this IntegratorUpdateOrderEntity.
     * 
     * @param billing_address
     */
    public void setBilling_address(br.com.mind.magento.client.IntegratorCreateOrderAddressEntity billing_address) {
        this.billing_address = billing_address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorUpdateOrderEntity)) return false;
        IntegratorUpdateOrderEntity other = (IntegratorUpdateOrderEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.increment_id==null && other.getIncrement_id()==null) || 
             (this.increment_id!=null &&
              this.increment_id.equals(other.getIncrement_id()))) &&
            ((this.skyhub_code==null && other.getSkyhub_code()==null) || 
             (this.skyhub_code!=null &&
              this.skyhub_code.equals(other.getSkyhub_code()))) &&
            ((this.customer_email==null && other.getCustomer_email()==null) || 
             (this.customer_email!=null &&
              this.customer_email.equals(other.getCustomer_email()))) &&
            ((this.shipping_address==null && other.getShipping_address()==null) || 
             (this.shipping_address!=null &&
              this.shipping_address.equals(other.getShipping_address()))) &&
            ((this.billing_address==null && other.getBilling_address()==null) || 
             (this.billing_address!=null &&
              this.billing_address.equals(other.getBilling_address())));
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
        if (getIncrement_id() != null) {
            _hashCode += getIncrement_id().hashCode();
        }
        if (getSkyhub_code() != null) {
            _hashCode += getSkyhub_code().hashCode();
        }
        if (getCustomer_email() != null) {
            _hashCode += getCustomer_email().hashCode();
        }
        if (getShipping_address() != null) {
            _hashCode += getShipping_address().hashCode();
        }
        if (getBilling_address() != null) {
            _hashCode += getBilling_address().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorUpdateOrderEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorUpdateOrderEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("increment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "increment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skyhub_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skyhub_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorCreateOrderAddressEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorCreateOrderAddressEntity"));
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
