/**
 * CatalogProductCustomOptionValueUpdateEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class CatalogProductCustomOptionValueUpdateEntity  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String price;

    private java.lang.String price_type;

    private java.lang.String sku;

    private java.lang.String sort_order;

    public CatalogProductCustomOptionValueUpdateEntity() {
    }

    public CatalogProductCustomOptionValueUpdateEntity(
           java.lang.String title,
           java.lang.String price,
           java.lang.String price_type,
           java.lang.String sku,
           java.lang.String sort_order) {
           this.title = title;
           this.price = price;
           this.price_type = price_type;
           this.sku = sku;
           this.sort_order = sort_order;
    }


    /**
     * Gets the title value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the price value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the price_type value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @return price_type
     */
    public java.lang.String getPrice_type() {
        return price_type;
    }


    /**
     * Sets the price_type value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @param price_type
     */
    public void setPrice_type(java.lang.String price_type) {
        this.price_type = price_type;
    }


    /**
     * Gets the sku value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @return sku
     */
    public java.lang.String getSku() {
        return sku;
    }


    /**
     * Sets the sku value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @param sku
     */
    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }


    /**
     * Gets the sort_order value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @return sort_order
     */
    public java.lang.String getSort_order() {
        return sort_order;
    }


    /**
     * Sets the sort_order value for this CatalogProductCustomOptionValueUpdateEntity.
     * 
     * @param sort_order
     */
    public void setSort_order(java.lang.String sort_order) {
        this.sort_order = sort_order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductCustomOptionValueUpdateEntity)) return false;
        CatalogProductCustomOptionValueUpdateEntity other = (CatalogProductCustomOptionValueUpdateEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.price_type==null && other.getPrice_type()==null) || 
             (this.price_type!=null &&
              this.price_type.equals(other.getPrice_type()))) &&
            ((this.sku==null && other.getSku()==null) || 
             (this.sku!=null &&
              this.sku.equals(other.getSku()))) &&
            ((this.sort_order==null && other.getSort_order()==null) || 
             (this.sort_order!=null &&
              this.sort_order.equals(other.getSort_order())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPrice_type() != null) {
            _hashCode += getPrice_type().hashCode();
        }
        if (getSku() != null) {
            _hashCode += getSku().hashCode();
        }
        if (getSort_order() != null) {
            _hashCode += getSort_order().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductCustomOptionValueUpdateEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueUpdateEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort_order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort_order"));
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
