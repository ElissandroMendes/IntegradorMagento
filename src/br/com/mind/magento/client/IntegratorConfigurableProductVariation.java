/**
 * IntegratorConfigurableProductVariation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class IntegratorConfigurableProductVariation  implements java.io.Serializable {
    private java.lang.String associated_product_sku;

    private java.lang.String associated_product_id;

    private java.lang.String weight;

    private java.lang.String[] image_urls;

    private java.lang.String price;

    private java.lang.String special_price;

    private br.com.mind.magento.client.AssociativeEntity[] attributes;

    public IntegratorConfigurableProductVariation() {
    }

    public IntegratorConfigurableProductVariation(
           java.lang.String associated_product_sku,
           java.lang.String associated_product_id,
           java.lang.String weight,
           java.lang.String[] image_urls,
           java.lang.String price,
           java.lang.String special_price,
           br.com.mind.magento.client.AssociativeEntity[] attributes) {
           this.associated_product_sku = associated_product_sku;
           this.associated_product_id = associated_product_id;
           this.weight = weight;
           this.image_urls = image_urls;
           this.price = price;
           this.special_price = special_price;
           this.attributes = attributes;
    }


    /**
     * Gets the associated_product_sku value for this IntegratorConfigurableProductVariation.
     * 
     * @return associated_product_sku
     */
    public java.lang.String getAssociated_product_sku() {
        return associated_product_sku;
    }


    /**
     * Sets the associated_product_sku value for this IntegratorConfigurableProductVariation.
     * 
     * @param associated_product_sku
     */
    public void setAssociated_product_sku(java.lang.String associated_product_sku) {
        this.associated_product_sku = associated_product_sku;
    }


    /**
     * Gets the associated_product_id value for this IntegratorConfigurableProductVariation.
     * 
     * @return associated_product_id
     */
    public java.lang.String getAssociated_product_id() {
        return associated_product_id;
    }


    /**
     * Sets the associated_product_id value for this IntegratorConfigurableProductVariation.
     * 
     * @param associated_product_id
     */
    public void setAssociated_product_id(java.lang.String associated_product_id) {
        this.associated_product_id = associated_product_id;
    }


    /**
     * Gets the weight value for this IntegratorConfigurableProductVariation.
     * 
     * @return weight
     */
    public java.lang.String getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this IntegratorConfigurableProductVariation.
     * 
     * @param weight
     */
    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }


    /**
     * Gets the image_urls value for this IntegratorConfigurableProductVariation.
     * 
     * @return image_urls
     */
    public java.lang.String[] getImage_urls() {
        return image_urls;
    }


    /**
     * Sets the image_urls value for this IntegratorConfigurableProductVariation.
     * 
     * @param image_urls
     */
    public void setImage_urls(java.lang.String[] image_urls) {
        this.image_urls = image_urls;
    }


    /**
     * Gets the price value for this IntegratorConfigurableProductVariation.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this IntegratorConfigurableProductVariation.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the special_price value for this IntegratorConfigurableProductVariation.
     * 
     * @return special_price
     */
    public java.lang.String getSpecial_price() {
        return special_price;
    }


    /**
     * Sets the special_price value for this IntegratorConfigurableProductVariation.
     * 
     * @param special_price
     */
    public void setSpecial_price(java.lang.String special_price) {
        this.special_price = special_price;
    }


    /**
     * Gets the attributes value for this IntegratorConfigurableProductVariation.
     * 
     * @return attributes
     */
    public br.com.mind.magento.client.AssociativeEntity[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this IntegratorConfigurableProductVariation.
     * 
     * @param attributes
     */
    public void setAttributes(br.com.mind.magento.client.AssociativeEntity[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorConfigurableProductVariation)) return false;
        IntegratorConfigurableProductVariation other = (IntegratorConfigurableProductVariation) obj;
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
            ((this.associated_product_id==null && other.getAssociated_product_id()==null) || 
             (this.associated_product_id!=null &&
              this.associated_product_id.equals(other.getAssociated_product_id()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.image_urls==null && other.getImage_urls()==null) || 
             (this.image_urls!=null &&
              java.util.Arrays.equals(this.image_urls, other.getImage_urls()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.special_price==null && other.getSpecial_price()==null) || 
             (this.special_price!=null &&
              this.special_price.equals(other.getSpecial_price()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getAssociated_product_id() != null) {
            _hashCode += getAssociated_product_id().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getImage_urls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage_urls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage_urls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSpecial_price() != null) {
            _hashCode += getSpecial_price().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(IntegratorConfigurableProductVariation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorConfigurableProductVariation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_product_sku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associated_product_sku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_product_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associated_product_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_urls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image_urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "associativeEntity"));
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
