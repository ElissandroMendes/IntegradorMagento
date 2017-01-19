/**
 * RewardpointsTransactionEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithoutWSI;

public class RewardpointsTransactionEntity  implements java.io.Serializable {
    private java.lang.Integer transaction_id;

    private java.lang.Integer reward_id;

    private java.lang.Integer customer_id;

    private java.lang.String title;

    private java.lang.String action;

    private java.lang.Integer action_type;

    private java.lang.Integer store_id;

    private java.lang.Integer point_amount;

    private java.lang.Integer point_used;

    private java.lang.Integer real_point;

    private java.lang.Integer status;

    private java.lang.String created_time;

    private java.lang.String updated_time;

    private java.lang.String expiration_date;

    private java.lang.Integer expire_email;

    private java.lang.Integer order_id;

    private java.lang.String order_increment_id;

    private java.lang.String order_base_amount;

    private java.lang.String order_amount;

    private java.lang.String base_discount;

    private java.lang.String discount;

    private java.lang.String extra_content;

    public RewardpointsTransactionEntity() {
    }

    public RewardpointsTransactionEntity(
           java.lang.Integer transaction_id,
           java.lang.Integer reward_id,
           java.lang.Integer customer_id,
           java.lang.String title,
           java.lang.String action,
           java.lang.Integer action_type,
           java.lang.Integer store_id,
           java.lang.Integer point_amount,
           java.lang.Integer point_used,
           java.lang.Integer real_point,
           java.lang.Integer status,
           java.lang.String created_time,
           java.lang.String updated_time,
           java.lang.String expiration_date,
           java.lang.Integer expire_email,
           java.lang.Integer order_id,
           java.lang.String order_increment_id,
           java.lang.String order_base_amount,
           java.lang.String order_amount,
           java.lang.String base_discount,
           java.lang.String discount,
           java.lang.String extra_content) {
           this.transaction_id = transaction_id;
           this.reward_id = reward_id;
           this.customer_id = customer_id;
           this.title = title;
           this.action = action;
           this.action_type = action_type;
           this.store_id = store_id;
           this.point_amount = point_amount;
           this.point_used = point_used;
           this.real_point = real_point;
           this.status = status;
           this.created_time = created_time;
           this.updated_time = updated_time;
           this.expiration_date = expiration_date;
           this.expire_email = expire_email;
           this.order_id = order_id;
           this.order_increment_id = order_increment_id;
           this.order_base_amount = order_base_amount;
           this.order_amount = order_amount;
           this.base_discount = base_discount;
           this.discount = discount;
           this.extra_content = extra_content;
    }


    /**
     * Gets the transaction_id value for this RewardpointsTransactionEntity.
     * 
     * @return transaction_id
     */
    public java.lang.Integer getTransaction_id() {
        return transaction_id;
    }


    /**
     * Sets the transaction_id value for this RewardpointsTransactionEntity.
     * 
     * @param transaction_id
     */
    public void setTransaction_id(java.lang.Integer transaction_id) {
        this.transaction_id = transaction_id;
    }


    /**
     * Gets the reward_id value for this RewardpointsTransactionEntity.
     * 
     * @return reward_id
     */
    public java.lang.Integer getReward_id() {
        return reward_id;
    }


    /**
     * Sets the reward_id value for this RewardpointsTransactionEntity.
     * 
     * @param reward_id
     */
    public void setReward_id(java.lang.Integer reward_id) {
        this.reward_id = reward_id;
    }


    /**
     * Gets the customer_id value for this RewardpointsTransactionEntity.
     * 
     * @return customer_id
     */
    public java.lang.Integer getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this RewardpointsTransactionEntity.
     * 
     * @param customer_id
     */
    public void setCustomer_id(java.lang.Integer customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the title value for this RewardpointsTransactionEntity.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RewardpointsTransactionEntity.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the action value for this RewardpointsTransactionEntity.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this RewardpointsTransactionEntity.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the action_type value for this RewardpointsTransactionEntity.
     * 
     * @return action_type
     */
    public java.lang.Integer getAction_type() {
        return action_type;
    }


    /**
     * Sets the action_type value for this RewardpointsTransactionEntity.
     * 
     * @param action_type
     */
    public void setAction_type(java.lang.Integer action_type) {
        this.action_type = action_type;
    }


    /**
     * Gets the store_id value for this RewardpointsTransactionEntity.
     * 
     * @return store_id
     */
    public java.lang.Integer getStore_id() {
        return store_id;
    }


    /**
     * Sets the store_id value for this RewardpointsTransactionEntity.
     * 
     * @param store_id
     */
    public void setStore_id(java.lang.Integer store_id) {
        this.store_id = store_id;
    }


    /**
     * Gets the point_amount value for this RewardpointsTransactionEntity.
     * 
     * @return point_amount
     */
    public java.lang.Integer getPoint_amount() {
        return point_amount;
    }


    /**
     * Sets the point_amount value for this RewardpointsTransactionEntity.
     * 
     * @param point_amount
     */
    public void setPoint_amount(java.lang.Integer point_amount) {
        this.point_amount = point_amount;
    }


    /**
     * Gets the point_used value for this RewardpointsTransactionEntity.
     * 
     * @return point_used
     */
    public java.lang.Integer getPoint_used() {
        return point_used;
    }


    /**
     * Sets the point_used value for this RewardpointsTransactionEntity.
     * 
     * @param point_used
     */
    public void setPoint_used(java.lang.Integer point_used) {
        this.point_used = point_used;
    }


    /**
     * Gets the real_point value for this RewardpointsTransactionEntity.
     * 
     * @return real_point
     */
    public java.lang.Integer getReal_point() {
        return real_point;
    }


    /**
     * Sets the real_point value for this RewardpointsTransactionEntity.
     * 
     * @param real_point
     */
    public void setReal_point(java.lang.Integer real_point) {
        this.real_point = real_point;
    }


    /**
     * Gets the status value for this RewardpointsTransactionEntity.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RewardpointsTransactionEntity.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the created_time value for this RewardpointsTransactionEntity.
     * 
     * @return created_time
     */
    public java.lang.String getCreated_time() {
        return created_time;
    }


    /**
     * Sets the created_time value for this RewardpointsTransactionEntity.
     * 
     * @param created_time
     */
    public void setCreated_time(java.lang.String created_time) {
        this.created_time = created_time;
    }


    /**
     * Gets the updated_time value for this RewardpointsTransactionEntity.
     * 
     * @return updated_time
     */
    public java.lang.String getUpdated_time() {
        return updated_time;
    }


    /**
     * Sets the updated_time value for this RewardpointsTransactionEntity.
     * 
     * @param updated_time
     */
    public void setUpdated_time(java.lang.String updated_time) {
        this.updated_time = updated_time;
    }


    /**
     * Gets the expiration_date value for this RewardpointsTransactionEntity.
     * 
     * @return expiration_date
     */
    public java.lang.String getExpiration_date() {
        return expiration_date;
    }


    /**
     * Sets the expiration_date value for this RewardpointsTransactionEntity.
     * 
     * @param expiration_date
     */
    public void setExpiration_date(java.lang.String expiration_date) {
        this.expiration_date = expiration_date;
    }


    /**
     * Gets the expire_email value for this RewardpointsTransactionEntity.
     * 
     * @return expire_email
     */
    public java.lang.Integer getExpire_email() {
        return expire_email;
    }


    /**
     * Sets the expire_email value for this RewardpointsTransactionEntity.
     * 
     * @param expire_email
     */
    public void setExpire_email(java.lang.Integer expire_email) {
        this.expire_email = expire_email;
    }


    /**
     * Gets the order_id value for this RewardpointsTransactionEntity.
     * 
     * @return order_id
     */
    public java.lang.Integer getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this RewardpointsTransactionEntity.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.Integer order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the order_increment_id value for this RewardpointsTransactionEntity.
     * 
     * @return order_increment_id
     */
    public java.lang.String getOrder_increment_id() {
        return order_increment_id;
    }


    /**
     * Sets the order_increment_id value for this RewardpointsTransactionEntity.
     * 
     * @param order_increment_id
     */
    public void setOrder_increment_id(java.lang.String order_increment_id) {
        this.order_increment_id = order_increment_id;
    }


    /**
     * Gets the order_base_amount value for this RewardpointsTransactionEntity.
     * 
     * @return order_base_amount
     */
    public java.lang.String getOrder_base_amount() {
        return order_base_amount;
    }


    /**
     * Sets the order_base_amount value for this RewardpointsTransactionEntity.
     * 
     * @param order_base_amount
     */
    public void setOrder_base_amount(java.lang.String order_base_amount) {
        this.order_base_amount = order_base_amount;
    }


    /**
     * Gets the order_amount value for this RewardpointsTransactionEntity.
     * 
     * @return order_amount
     */
    public java.lang.String getOrder_amount() {
        return order_amount;
    }


    /**
     * Sets the order_amount value for this RewardpointsTransactionEntity.
     * 
     * @param order_amount
     */
    public void setOrder_amount(java.lang.String order_amount) {
        this.order_amount = order_amount;
    }


    /**
     * Gets the base_discount value for this RewardpointsTransactionEntity.
     * 
     * @return base_discount
     */
    public java.lang.String getBase_discount() {
        return base_discount;
    }


    /**
     * Sets the base_discount value for this RewardpointsTransactionEntity.
     * 
     * @param base_discount
     */
    public void setBase_discount(java.lang.String base_discount) {
        this.base_discount = base_discount;
    }


    /**
     * Gets the discount value for this RewardpointsTransactionEntity.
     * 
     * @return discount
     */
    public java.lang.String getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this RewardpointsTransactionEntity.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.String discount) {
        this.discount = discount;
    }


    /**
     * Gets the extra_content value for this RewardpointsTransactionEntity.
     * 
     * @return extra_content
     */
    public java.lang.String getExtra_content() {
        return extra_content;
    }


    /**
     * Sets the extra_content value for this RewardpointsTransactionEntity.
     * 
     * @param extra_content
     */
    public void setExtra_content(java.lang.String extra_content) {
        this.extra_content = extra_content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RewardpointsTransactionEntity)) return false;
        RewardpointsTransactionEntity other = (RewardpointsTransactionEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transaction_id==null && other.getTransaction_id()==null) || 
             (this.transaction_id!=null &&
              this.transaction_id.equals(other.getTransaction_id()))) &&
            ((this.reward_id==null && other.getReward_id()==null) || 
             (this.reward_id!=null &&
              this.reward_id.equals(other.getReward_id()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.action_type==null && other.getAction_type()==null) || 
             (this.action_type!=null &&
              this.action_type.equals(other.getAction_type()))) &&
            ((this.store_id==null && other.getStore_id()==null) || 
             (this.store_id!=null &&
              this.store_id.equals(other.getStore_id()))) &&
            ((this.point_amount==null && other.getPoint_amount()==null) || 
             (this.point_amount!=null &&
              this.point_amount.equals(other.getPoint_amount()))) &&
            ((this.point_used==null && other.getPoint_used()==null) || 
             (this.point_used!=null &&
              this.point_used.equals(other.getPoint_used()))) &&
            ((this.real_point==null && other.getReal_point()==null) || 
             (this.real_point!=null &&
              this.real_point.equals(other.getReal_point()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.created_time==null && other.getCreated_time()==null) || 
             (this.created_time!=null &&
              this.created_time.equals(other.getCreated_time()))) &&
            ((this.updated_time==null && other.getUpdated_time()==null) || 
             (this.updated_time!=null &&
              this.updated_time.equals(other.getUpdated_time()))) &&
            ((this.expiration_date==null && other.getExpiration_date()==null) || 
             (this.expiration_date!=null &&
              this.expiration_date.equals(other.getExpiration_date()))) &&
            ((this.expire_email==null && other.getExpire_email()==null) || 
             (this.expire_email!=null &&
              this.expire_email.equals(other.getExpire_email()))) &&
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.order_increment_id==null && other.getOrder_increment_id()==null) || 
             (this.order_increment_id!=null &&
              this.order_increment_id.equals(other.getOrder_increment_id()))) &&
            ((this.order_base_amount==null && other.getOrder_base_amount()==null) || 
             (this.order_base_amount!=null &&
              this.order_base_amount.equals(other.getOrder_base_amount()))) &&
            ((this.order_amount==null && other.getOrder_amount()==null) || 
             (this.order_amount!=null &&
              this.order_amount.equals(other.getOrder_amount()))) &&
            ((this.base_discount==null && other.getBase_discount()==null) || 
             (this.base_discount!=null &&
              this.base_discount.equals(other.getBase_discount()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.extra_content==null && other.getExtra_content()==null) || 
             (this.extra_content!=null &&
              this.extra_content.equals(other.getExtra_content())));
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
        if (getTransaction_id() != null) {
            _hashCode += getTransaction_id().hashCode();
        }
        if (getReward_id() != null) {
            _hashCode += getReward_id().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getAction_type() != null) {
            _hashCode += getAction_type().hashCode();
        }
        if (getStore_id() != null) {
            _hashCode += getStore_id().hashCode();
        }
        if (getPoint_amount() != null) {
            _hashCode += getPoint_amount().hashCode();
        }
        if (getPoint_used() != null) {
            _hashCode += getPoint_used().hashCode();
        }
        if (getReal_point() != null) {
            _hashCode += getReal_point().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreated_time() != null) {
            _hashCode += getCreated_time().hashCode();
        }
        if (getUpdated_time() != null) {
            _hashCode += getUpdated_time().hashCode();
        }
        if (getExpiration_date() != null) {
            _hashCode += getExpiration_date().hashCode();
        }
        if (getExpire_email() != null) {
            _hashCode += getExpire_email().hashCode();
        }
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getOrder_increment_id() != null) {
            _hashCode += getOrder_increment_id().hashCode();
        }
        if (getOrder_base_amount() != null) {
            _hashCode += getOrder_base_amount().hashCode();
        }
        if (getOrder_amount() != null) {
            _hashCode += getOrder_amount().hashCode();
        }
        if (getBase_discount() != null) {
            _hashCode += getBase_discount().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getExtra_content() != null) {
            _hashCode += getExtra_content().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RewardpointsTransactionEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reward_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reward_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "point_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point_used");
        elemField.setXmlName(new javax.xml.namespace.QName("", "point_used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("real_point");
        elemField.setXmlName(new javax.xml.namespace.QName("", "real_point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_increment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_increment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_base_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_base_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base_discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "base_discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra_content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extra_content"));
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
