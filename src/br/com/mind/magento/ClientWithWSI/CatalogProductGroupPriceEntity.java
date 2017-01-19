/**
 * CatalogProductGroupPriceEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class CatalogProductGroupPriceEntity  implements java.io.Serializable {
    private java.lang.String cust_group;

    private java.lang.String website_id;

    private java.lang.Double price;

    public CatalogProductGroupPriceEntity() {
    }

    public CatalogProductGroupPriceEntity(
           java.lang.String cust_group,
           java.lang.String website_id,
           java.lang.Double price) {
           this.cust_group = cust_group;
           this.website_id = website_id;
           this.price = price;
    }


    /**
     * Gets the cust_group value for this CatalogProductGroupPriceEntity.
     * 
     * @return cust_group
     */
    public java.lang.String getCust_group() {
        return cust_group;
    }


    /**
     * Sets the cust_group value for this CatalogProductGroupPriceEntity.
     * 
     * @param cust_group
     */
    public void setCust_group(java.lang.String cust_group) {
        this.cust_group = cust_group;
    }


    /**
     * Gets the website_id value for this CatalogProductGroupPriceEntity.
     * 
     * @return website_id
     */
    public java.lang.String getWebsite_id() {
        return website_id;
    }


    /**
     * Sets the website_id value for this CatalogProductGroupPriceEntity.
     * 
     * @param website_id
     */
    public void setWebsite_id(java.lang.String website_id) {
        this.website_id = website_id;
    }


    /**
     * Gets the price value for this CatalogProductGroupPriceEntity.
     * 
     * @return price
     */
    public java.lang.Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CatalogProductGroupPriceEntity.
     * 
     * @param price
     */
    public void setPrice(java.lang.Double price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductGroupPriceEntity)) return false;
        CatalogProductGroupPriceEntity other = (CatalogProductGroupPriceEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cust_group==null && other.getCust_group()==null) || 
             (this.cust_group!=null &&
              this.cust_group.equals(other.getCust_group()))) &&
            ((this.website_id==null && other.getWebsite_id()==null) || 
             (this.website_id!=null &&
              this.website_id.equals(other.getWebsite_id()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        if (getCust_group() != null) {
            _hashCode += getCust_group().hashCode();
        }
        if (getWebsite_id() != null) {
            _hashCode += getWebsite_id().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductGroupPriceEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductGroupPriceEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cust_group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cust_group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "website_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
