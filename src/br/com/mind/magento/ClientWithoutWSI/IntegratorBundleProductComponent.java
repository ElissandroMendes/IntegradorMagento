/**
 * IntegratorBundleProductComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithoutWSI;

public class IntegratorBundleProductComponent  implements java.io.Serializable {
    private java.lang.String associated_product_sku;

    private java.lang.String associated_product_qty;

    public IntegratorBundleProductComponent() {
    }

    public IntegratorBundleProductComponent(
           java.lang.String associated_product_sku,
           java.lang.String associated_product_qty) {
           this.associated_product_sku = associated_product_sku;
           this.associated_product_qty = associated_product_qty;
    }


    /**
     * Gets the associated_product_sku value for this IntegratorBundleProductComponent.
     * 
     * @return associated_product_sku
     */
    public java.lang.String getAssociated_product_sku() {
        return associated_product_sku;
    }


    /**
     * Sets the associated_product_sku value for this IntegratorBundleProductComponent.
     * 
     * @param associated_product_sku
     */
    public void setAssociated_product_sku(java.lang.String associated_product_sku) {
        this.associated_product_sku = associated_product_sku;
    }


    /**
     * Gets the associated_product_qty value for this IntegratorBundleProductComponent.
     * 
     * @return associated_product_qty
     */
    public java.lang.String getAssociated_product_qty() {
        return associated_product_qty;
    }


    /**
     * Sets the associated_product_qty value for this IntegratorBundleProductComponent.
     * 
     * @param associated_product_qty
     */
    public void setAssociated_product_qty(java.lang.String associated_product_qty) {
        this.associated_product_qty = associated_product_qty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorBundleProductComponent)) return false;
        IntegratorBundleProductComponent other = (IntegratorBundleProductComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.associated_product_sku==null && other.getAssociated_product_sku()==null) || 
             (this.associated_product_sku!=null &&
              this.associated_product_sku.equals(other.getAssociated_product_sku()))) &&
            ((this.associated_product_qty==null && other.getAssociated_product_qty()==null) || 
             (this.associated_product_qty!=null &&
              this.associated_product_qty.equals(other.getAssociated_product_qty())));
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
        if (getAssociated_product_sku() != null) {
            _hashCode += getAssociated_product_sku().hashCode();
        }
        if (getAssociated_product_qty() != null) {
            _hashCode += getAssociated_product_qty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorBundleProductComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "integratorBundleProductComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_product_sku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associated_product_sku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_product_qty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associated_product_qty"));
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
