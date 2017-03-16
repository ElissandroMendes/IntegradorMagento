/**
 * IntegratorProductReturnEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class IntegratorProductReturnEntity  implements java.io.Serializable {
    private br.com.mind.magento.client.AssociativeEntity[] attributes;

    private br.com.mind.magento.client.AssociativeEntity[] multiselect_attributes;

    private br.com.mind.magento.client.IntegratorConfigurableAttribute[] configurable_attributes;

    private br.com.mind.magento.client.IntegratorConfigurableProductVariation[] variations;

    private br.com.mind.magento.client.IntegratorBundleProductComponent[] bundle_components;

    private java.lang.String[] image_urls;

    private java.lang.String full_url;

    public IntegratorProductReturnEntity() {
    }

    public IntegratorProductReturnEntity(
           br.com.mind.magento.client.AssociativeEntity[] attributes,
           br.com.mind.magento.client.AssociativeEntity[] multiselect_attributes,
           br.com.mind.magento.client.IntegratorConfigurableAttribute[] configurable_attributes,
           br.com.mind.magento.client.IntegratorConfigurableProductVariation[] variations,
           br.com.mind.magento.client.IntegratorBundleProductComponent[] bundle_components,
           java.lang.String[] image_urls,
           java.lang.String full_url) {
           this.attributes = attributes;
           this.multiselect_attributes = multiselect_attributes;
           this.configurable_attributes = configurable_attributes;
           this.variations = variations;
           this.bundle_components = bundle_components;
           this.image_urls = image_urls;
           this.full_url = full_url;
    }


    /**
     * Gets the attributes value for this IntegratorProductReturnEntity.
     * 
     * @return attributes
     */
    public br.com.mind.magento.client.AssociativeEntity[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this IntegratorProductReturnEntity.
     * 
     * @param attributes
     */
    public void setAttributes(br.com.mind.magento.client.AssociativeEntity[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the multiselect_attributes value for this IntegratorProductReturnEntity.
     * 
     * @return multiselect_attributes
     */
    public br.com.mind.magento.client.AssociativeEntity[] getMultiselect_attributes() {
        return multiselect_attributes;
    }


    /**
     * Sets the multiselect_attributes value for this IntegratorProductReturnEntity.
     * 
     * @param multiselect_attributes
     */
    public void setMultiselect_attributes(br.com.mind.magento.client.AssociativeEntity[] multiselect_attributes) {
        this.multiselect_attributes = multiselect_attributes;
    }


    /**
     * Gets the configurable_attributes value for this IntegratorProductReturnEntity.
     * 
     * @return configurable_attributes
     */
    public br.com.mind.magento.client.IntegratorConfigurableAttribute[] getConfigurable_attributes() {
        return configurable_attributes;
    }


    /**
     * Sets the configurable_attributes value for this IntegratorProductReturnEntity.
     * 
     * @param configurable_attributes
     */
    public void setConfigurable_attributes(br.com.mind.magento.client.IntegratorConfigurableAttribute[] configurable_attributes) {
        this.configurable_attributes = configurable_attributes;
    }


    /**
     * Gets the variations value for this IntegratorProductReturnEntity.
     * 
     * @return variations
     */
    public br.com.mind.magento.client.IntegratorConfigurableProductVariation[] getVariations() {
        return variations;
    }


    /**
     * Sets the variations value for this IntegratorProductReturnEntity.
     * 
     * @param variations
     */
    public void setVariations(br.com.mind.magento.client.IntegratorConfigurableProductVariation[] variations) {
        this.variations = variations;
    }


    /**
     * Gets the bundle_components value for this IntegratorProductReturnEntity.
     * 
     * @return bundle_components
     */
    public br.com.mind.magento.client.IntegratorBundleProductComponent[] getBundle_components() {
        return bundle_components;
    }


    /**
     * Sets the bundle_components value for this IntegratorProductReturnEntity.
     * 
     * @param bundle_components
     */
    public void setBundle_components(br.com.mind.magento.client.IntegratorBundleProductComponent[] bundle_components) {
        this.bundle_components = bundle_components;
    }


    /**
     * Gets the image_urls value for this IntegratorProductReturnEntity.
     * 
     * @return image_urls
     */
    public java.lang.String[] getImage_urls() {
        return image_urls;
    }


    /**
     * Sets the image_urls value for this IntegratorProductReturnEntity.
     * 
     * @param image_urls
     */
    public void setImage_urls(java.lang.String[] image_urls) {
        this.image_urls = image_urls;
    }


    /**
     * Gets the full_url value for this IntegratorProductReturnEntity.
     * 
     * @return full_url
     */
    public java.lang.String getFull_url() {
        return full_url;
    }


    /**
     * Sets the full_url value for this IntegratorProductReturnEntity.
     * 
     * @param full_url
     */
    public void setFull_url(java.lang.String full_url) {
        this.full_url = full_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegratorProductReturnEntity)) return false;
        IntegratorProductReturnEntity other = (IntegratorProductReturnEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.multiselect_attributes==null && other.getMultiselect_attributes()==null) || 
             (this.multiselect_attributes!=null &&
              java.util.Arrays.equals(this.multiselect_attributes, other.getMultiselect_attributes()))) &&
            ((this.configurable_attributes==null && other.getConfigurable_attributes()==null) || 
             (this.configurable_attributes!=null &&
              java.util.Arrays.equals(this.configurable_attributes, other.getConfigurable_attributes()))) &&
            ((this.variations==null && other.getVariations()==null) || 
             (this.variations!=null &&
              java.util.Arrays.equals(this.variations, other.getVariations()))) &&
            ((this.bundle_components==null && other.getBundle_components()==null) || 
             (this.bundle_components!=null &&
              java.util.Arrays.equals(this.bundle_components, other.getBundle_components()))) &&
            ((this.image_urls==null && other.getImage_urls()==null) || 
             (this.image_urls!=null &&
              java.util.Arrays.equals(this.image_urls, other.getImage_urls()))) &&
            ((this.full_url==null && other.getFull_url()==null) || 
             (this.full_url!=null &&
              this.full_url.equals(other.getFull_url())));
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
        if (getMultiselect_attributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiselect_attributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiselect_attributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigurable_attributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurable_attributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurable_attributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBundle_components() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundle_components());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundle_components(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getFull_url() != null) {
            _hashCode += getFull_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegratorProductReturnEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorProductReturnEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "associativeEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiselect_attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multiselect_attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "associativeEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurable_attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configurable_attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorConfigurableAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorConfigurableProductVariation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundle_components");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bundle_components"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.client", "integratorBundleProductComponent"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("full_url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "full_url"));
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
