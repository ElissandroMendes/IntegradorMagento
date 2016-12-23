/**
 * IntegratorCreateOrderEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithoutWSI;

public class IntegratorCreateOrderEntity  implements java.io.Serializable {
    private java.lang.String skyhub_code;

    private java.lang.String shipping_amount;

    private java.lang.String shipping_description;

    private java.lang.String status;

    private java.lang.String customer_email;

    private java.lang.String customer_firstname;

    private java.lang.String customer_lastname;

    private br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity shipping_address;

    private br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity billing_address;

    private br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderItemEntity[] items;

    private java.lang.String customer_dob;

    private java.lang.String customer_gender;

    public IntegratorCreateOrderEntity() {
    }

    public IntegratorCreateOrderEntity(
           java.lang.String skyhub_code,
           java.lang.String shipping_amount,
           java.lang.String shipping_description,
           java.lang.String status,
           java.lang.String customer_email,
           java.lang.String customer_firstname,
           java.lang.String customer_lastname,
           br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity shipping_address,
           br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity billing_address,
           br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderItemEntity[] items,
           java.lang.String customer_dob,
           java.lang.String customer_gender) {
           this.skyhub_code = skyhub_code;
           this.shipping_amount = shipping_amount;
           this.shipping_description = shipping_description;
           this.status = status;
           this.customer_email = customer_email;
           this.customer_firstname = customer_firstname;
           this.customer_lastname = customer_lastname;
           this.shipping_address = shipping_address;
           this.billing_address = billing_address;
           this.items = items;
           this.customer_dob = customer_dob;
           this.customer_gender = customer_gender;
    }


    /**
     * Gets the skyhub_code value for this IntegratorCreateOrderEntity.
     * 
     * @return skyhub_code
     */
    public java.lang.String getSkyhub_code() {
        return skyhub_code;
    }


    /**
     * Sets the skyhub_code value for this IntegratorCreateOrderEntity.
     * 
     * @param skyhub_code
     */
    public void setSkyhub_code(java.lang.String skyhub_code) {
        this.skyhub_code = skyhub_code;
    }


    /**
     * Gets the shipping_amount value for this IntegratorCreateOrderEntity.
     * 
     * @return shipping_amount
     */
    public java.lang.String getShipping_amount() {
        return shipping_amount;
    }


    /**
     * Sets the shipping_amount value for this IntegratorCreateOrderEntity.
     * 
     * @param shipping_amount
     */
    public void setShipping_amount(java.lang.String shipping_amount) {
        this.shipping_amount = shipping_amount;
    }


    /**
     * Gets the shipping_description value for this IntegratorCreateOrderEntity.
     * 
     * @return shipping_description
     */
    public java.lang.String getShipping_description() {
        return shipping_description;
    }


    /**
     * Sets the shipping_description value for this IntegratorCreateOrderEntity.
     * 
     * @param shipping_description
     */
    public void setShipping_description(java.lang.String shipping_description) {
        this.shipping_description = shipping_description;
    }


    /**
     * Gets the status value for this IntegratorCreateOrderEntity.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this IntegratorCreateOrderEntity.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the customer_email value for this IntegratorCreateOrderEntity.
     * 
     * @return customer_email
     */
    public java.lang.String getCustomer_email() {
        return customer_email;
    }


    /**
     * Sets the customer_email value for this IntegratorCreateOrderEntity.
     * 
     * @param customer_email
     */
    public void setCustomer_email(java.lang.String customer_email) {
        this.customer_email = customer_email;
    }


    /**
     * Gets the customer_firstname value for this IntegratorCreateOrderEntity.
     * 
     * @return customer_firstname
     */
    public java.lang.String getCustomer_firstname() {
        return customer_firstname;
    }


    /**
     * Sets the customer_firstname value for this IntegratorCreateOrderEntity.
     * 
     * @param customer_firstname
     */
    public void setCustomer_firstname(java.lang.String customer_firstname) {
        this.customer_firstname = customer_firstname;
    }


    /**
     * Gets the customer_lastname value for this IntegratorCreateOrderEntity.
     * 
     * @return customer_lastname
     */
    public java.lang.String getCustomer_lastname() {
        return customer_lastname;
    }


    /**
     * Sets the customer_lastname value for this IntegratorCreateOrderEntity.
     * 
     * @param customer_lastname
     */
    public void setCustomer_lastname(java.lang.String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }


    /**
     * Gets the shipping_address value for this IntegratorCreateOrderEntity.
     * 
     * @return shipping_address
     */
    public br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity getShipping_address() {
        return shipping_address;
    }


    /**
     * Sets the shipping_address value for this IntegratorCreateOrderEntity.
     * 
     * @param shipping_address
     */
    public void setShipping_address(br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity shipping_address) {
        this.shipping_address = shipping_address;
    }


    /**
     * Gets the billing_address value for this IntegratorCreateOrderEntity.
     * 
     * @return billing_address
     */
    public br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity getBilling_address() {
        return billing_address;
    }


    /**
     * Sets the billing_address value for this IntegratorCreateOrderEntity.
     * 
     * @param billing_address
     */
    public void setBilling_address(br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderAddressEntity billing_address) {
        this.billing_address = billing_address;
    }


    /**
     * Gets the items value for this IntegratorCreateOrderEntity.
     * 
     * @return items
     */
    public br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderItemEntity[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this IntegratorCreateOrderEntity.
     * 
     * @param items
     */
    public void setItems(br.com.mind.magento.ClientWithoutWSI.IntegratorCreateOrderItemEntity[] items) {
        this.items = items;
    }


    /**
     * Gets the customer_dob value for this IntegratorCreateOrderEntity.
     * 
     * @return customer_dob
     */
    public java.lang.String getCustomer_dob() {
        return customer_dob;
    }


    /**
     * Sets the customer_dob value for this IntegratorCreateOrderEntity.
     * 
     * @param customer_dob
     */
    public void setCustomer_dob(java.lang.String customer_dob) {
        this.customer_dob = customer_dob;
    }


    /**
     * Gets the customer_gender value for this IntegratorCreateOrderEntity.
     * 
     * @return customer_gender
     */
    public java.lang.String getCustomer_gender() {
        return customer_gender;
    }


    /**
     * Sets the customer_gender value for this IntegratorCreateOrderEntity.
     * 
     * @param customer_gender
     */
    public void setCustomer_gender(java.lang.String customer_gender) {
        this.customer_gender = customer_gender;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorCreateOrderEntity)) return false;
        IntegratorCreateOrderEntity other = (IntegratorCreateOrderEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.skyhub_code==null && other.getSkyhub_code()==null) || 
             (this.skyhub_code!=null &&
              this.skyhub_code.equals(other.getSkyhub_code()))) &&
            ((this.shipping_amount==null && other.getShipping_amount()==null) || 
             (this.shipping_amount!=null &&
              this.shipping_amount.equals(other.getShipping_amount()))) &&
            ((this.shipping_description==null && other.getShipping_description()==null) || 
             (this.shipping_description!=null &&
              this.shipping_description.equals(other.getShipping_description()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.customer_email==null && other.getCustomer_email()==null) || 
             (this.customer_email!=null &&
              this.customer_email.equals(other.getCustomer_email()))) &&
            ((this.customer_firstname==null && other.getCustomer_firstname()==null) || 
             (this.customer_firstname!=null &&
              this.customer_firstname.equals(other.getCustomer_firstname()))) &&
            ((this.customer_lastname==null && other.getCustomer_lastname()==null) || 
             (this.customer_lastname!=null &&
              this.customer_lastname.equals(other.getCustomer_lastname()))) &&
            ((this.shipping_address==null && other.getShipping_address()==null) || 
             (this.shipping_address!=null &&
              this.shipping_address.equals(other.getShipping_address()))) &&
            ((this.billing_address==null && other.getBilling_address()==null) || 
             (this.billing_address!=null &&
              this.billing_address.equals(other.getBilling_address()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.customer_dob==null && other.getCustomer_dob()==null) || 
             (this.customer_dob!=null &&
              this.customer_dob.equals(other.getCustomer_dob()))) &&
            ((this.customer_gender==null && other.getCustomer_gender()==null) || 
             (this.customer_gender!=null &&
              this.customer_gender.equals(other.getCustomer_gender())));
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
        if (getSkyhub_code() != null) {
            _hashCode += getSkyhub_code().hashCode();
        }
        if (getShipping_amount() != null) {
            _hashCode += getShipping_amount().hashCode();
        }
        if (getShipping_description() != null) {
            _hashCode += getShipping_description().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCustomer_email() != null) {
            _hashCode += getCustomer_email().hashCode();
        }
        if (getCustomer_firstname() != null) {
            _hashCode += getCustomer_firstname().hashCode();
        }
        if (getCustomer_lastname() != null) {
            _hashCode += getCustomer_lastname().hashCode();
        }
        if (getShipping_address() != null) {
            _hashCode += getShipping_address().hashCode();
        }
        if (getBilling_address() != null) {
            _hashCode += getBilling_address().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer_dob() != null) {
            _hashCode += getCustomer_dob().hashCode();
        }
        if (getCustomer_gender() != null) {
            _hashCode += getCustomer_gender().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorCreateOrderEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "integratorCreateOrderEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skyhub_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skyhub_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("customer_firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "integratorCreateOrderAddressEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "integratorCreateOrderAddressEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "integratorCreateOrderItemEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_dob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_dob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_gender"));
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
