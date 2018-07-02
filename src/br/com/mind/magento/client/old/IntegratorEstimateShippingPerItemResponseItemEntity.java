/**
 * IntegratorEstimateShippingPerItemResponseItemEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client.old;

public class IntegratorEstimateShippingPerItemResponseItemEntity  implements java.io.Serializable {
    private java.lang.String item;

    private br.com.mind.magento.client.old.IntegratorEstimateShippingResponseItemEntity[] shipping_info;

    public IntegratorEstimateShippingPerItemResponseItemEntity() {
    }

    public IntegratorEstimateShippingPerItemResponseItemEntity(
           java.lang.String item,
           br.com.mind.magento.client.old.IntegratorEstimateShippingResponseItemEntity[] shipping_info) {
           this.item = item;
           this.shipping_info = shipping_info;
    }


    /**
     * Gets the item value for this IntegratorEstimateShippingPerItemResponseItemEntity.
     * 
     * @return item
     */
    public java.lang.String getItem() {
        return item;
    }


    /**
     * Sets the item value for this IntegratorEstimateShippingPerItemResponseItemEntity.
     * 
     * @param item
     */
    public void setItem(java.lang.String item) {
        this.item = item;
    }


    /**
     * Gets the shipping_info value for this IntegratorEstimateShippingPerItemResponseItemEntity.
     * 
     * @return shipping_info
     */
    public br.com.mind.magento.client.old.IntegratorEstimateShippingResponseItemEntity[] getShipping_info() {
        return shipping_info;
    }


    /**
     * Sets the shipping_info value for this IntegratorEstimateShippingPerItemResponseItemEntity.
     * 
     * @param shipping_info
     */
    public void setShipping_info(br.com.mind.magento.client.old.IntegratorEstimateShippingResponseItemEntity[] shipping_info) {
        this.shipping_info = shipping_info;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorEstimateShippingPerItemResponseItemEntity)) return false;
        IntegratorEstimateShippingPerItemResponseItemEntity other = (IntegratorEstimateShippingPerItemResponseItemEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.shipping_info==null && other.getShipping_info()==null) || 
             (this.shipping_info!=null &&
              java.util.Arrays.equals(this.shipping_info, other.getShipping_info())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getShipping_info() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipping_info());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipping_info(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorEstimateShippingPerItemResponseItemEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorEstimateShippingPerItemResponseItemEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorEstimateShippingResponseItemEntity"));
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
