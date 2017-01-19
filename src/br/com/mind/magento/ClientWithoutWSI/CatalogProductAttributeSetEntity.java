/**
 * CatalogProductAttributeSetEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithoutWSI;

public class CatalogProductAttributeSetEntity  implements java.io.Serializable {
    private java.lang.Integer set_id;

    private java.lang.String name;

    public CatalogProductAttributeSetEntity() {
    }

    public CatalogProductAttributeSetEntity(
           java.lang.Integer set_id,
           java.lang.String name) {
           this.set_id = set_id;
           this.name = name;
    }


    /**
     * Gets the set_id value for this CatalogProductAttributeSetEntity.
     * 
     * @return set_id
     */
    public java.lang.Integer getSet_id() {
        return set_id;
    }


    /**
     * Sets the set_id value for this CatalogProductAttributeSetEntity.
     * 
     * @param set_id
     */
    public void setSet_id(java.lang.Integer set_id) {
        this.set_id = set_id;
    }


    /**
     * Gets the name value for this CatalogProductAttributeSetEntity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CatalogProductAttributeSetEntity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogProductAttributeSetEntity)) return false;
        CatalogProductAttributeSetEntity other = (CatalogProductAttributeSetEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.set_id==null && other.getSet_id()==null) || 
             (this.set_id!=null &&
              this.set_id.equals(other.getSet_id()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getSet_id() != null) {
            _hashCode += getSet_id().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogProductAttributeSetEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("set_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "set_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
