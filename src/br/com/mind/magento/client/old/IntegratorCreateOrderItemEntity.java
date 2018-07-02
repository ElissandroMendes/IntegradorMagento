/**
 * IntegratorCreateOrderItemEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client.old;

public class IntegratorCreateOrderItemEntity  implements java.io.Serializable {
    private java.lang.String sku;

    private java.lang.String qty;

    private java.lang.String original_price;

    private java.lang.String special_price;

    public IntegratorCreateOrderItemEntity() {
    }

    public IntegratorCreateOrderItemEntity(
           java.lang.String sku,
           java.lang.String qty,
           java.lang.String original_price,
           java.lang.String special_price) {
           this.sku = sku;
           this.qty = qty;
           this.original_price = original_price;
           this.special_price = special_price;
    }


    /**
     * Gets the sku value for this IntegratorCreateOrderItemEntity.
     * 
     * @return sku
     */
    public java.lang.String getSku() {
        return sku;
    }


    /**
     * Sets the sku value for this IntegratorCreateOrderItemEntity.
     * 
     * @param sku
     */
    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }


    /**
     * Gets the qty value for this IntegratorCreateOrderItemEntity.
     * 
     * @return qty
     */
    public java.lang.String getQty() {
        return qty;
    }


    /**
     * Sets the qty value for this IntegratorCreateOrderItemEntity.
     * 
     * @param qty
     */
    public void setQty(java.lang.String qty) {
        this.qty = qty;
    }


    /**
     * Gets the original_price value for this IntegratorCreateOrderItemEntity.
     * 
     * @return original_price
     */
    public java.lang.String getOriginal_price() {
        return original_price;
    }


    /**
     * Sets the original_price value for this IntegratorCreateOrderItemEntity.
     * 
     * @param original_price
     */
    public void setOriginal_price(java.lang.String original_price) {
        this.original_price = original_price;
    }


    /**
     * Gets the special_price value for this IntegratorCreateOrderItemEntity.
     * 
     * @return special_price
     */
    public java.lang.String getSpecial_price() {
        return special_price;
    }


    /**
     * Sets the special_price value for this IntegratorCreateOrderItemEntity.
     * 
     * @param special_price
     */
    public void setSpecial_price(java.lang.String special_price) {
        this.special_price = special_price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorCreateOrderItemEntity)) return false;
        IntegratorCreateOrderItemEntity other = (IntegratorCreateOrderItemEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sku==null && other.getSku()==null) || 
             (this.sku!=null &&
              this.sku.equals(other.getSku()))) &&
            ((this.qty==null && other.getQty()==null) || 
             (this.qty!=null &&
              this.qty.equals(other.getQty()))) &&
            ((this.original_price==null && other.getOriginal_price()==null) || 
             (this.original_price!=null &&
              this.original_price.equals(other.getOriginal_price()))) &&
            ((this.special_price==null && other.getSpecial_price()==null) || 
             (this.special_price!=null &&
              this.special_price.equals(other.getSpecial_price())));
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
        if (getSku() != null) {
            _hashCode += getSku().hashCode();
        }
        if (getQty() != null) {
            _hashCode += getQty().hashCode();
        }
        if (getOriginal_price() != null) {
            _hashCode += getOriginal_price().hashCode();
        }
        if (getSpecial_price() != null) {
            _hashCode += getSpecial_price().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorCreateOrderItemEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorCreateOrderItemEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("original_price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "original_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "special_price"));
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
