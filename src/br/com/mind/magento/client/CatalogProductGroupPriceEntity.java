/**
 * CatalogProductGroupPriceEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class CatalogProductGroupPriceEntity  implements java.io.Serializable {
    private java.lang.String cust_group;

    private java.lang.String website_id;

    private java.lang.Double price;

    private java.lang.Integer group_id;

    private java.lang.Integer website;

    public CatalogProductGroupPriceEntity() {
    }

    public CatalogProductGroupPriceEntity(
           java.lang.String cust_group,
           java.lang.String website_id,
           java.lang.Double price,
           java.lang.Integer group_id,
           java.lang.Integer website) {
           this.cust_group = cust_group;
           this.website_id = website_id;
           this.price = price;
           this.group_id = group_id;
           this.website = website;
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


    /**
     * Gets the group_id value for this CatalogProductGroupPriceEntity.
     * 
     * @return group_id
     */
    public java.lang.Integer getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this CatalogProductGroupPriceEntity.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Integer group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the website value for this CatalogProductGroupPriceEntity.
     * 
     * @return website
     */
    public java.lang.Integer getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this CatalogProductGroupPriceEntity.
     * 
     * @param website
     */
    public void setWebsite(java.lang.Integer website) {
        this.website = website;
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
              this.price.equals(other.getPrice()))) &&
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite())));
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
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductGroupPriceEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "catalogProductGroupPriceEntity"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("", "website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
