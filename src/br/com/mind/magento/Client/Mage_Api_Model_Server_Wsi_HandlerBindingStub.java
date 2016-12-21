/**
 * Mage_Api_Model_Server_Wsi_HandlerBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public class Mage_Api_Model_Server_Wsi_HandlerBindingStub extends org.apache.axis.client.Stub implements br.com.mind.magento.Client.Mage_Api_Model_Server_Wsi_HandlerPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[170];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("call");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "callParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">callParam"), br.com.mind.magento.Client.CallParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">callResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CallResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "callResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("multiCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "multiCallParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">multiCallParam"), br.com.mind.magento.Client.MultiCallParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">multiCallResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.MultiCallResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "multiCallResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("endSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "endSessionParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">endSessionParam"), br.com.mind.magento.Client.EndSessionParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">endSessionResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.EndSessionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "endSessionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "loginParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">loginParam"), br.com.mind.magento.Client.LoginParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">loginResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.LoginResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "loginResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startSession");
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">startSessionResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.StartSessionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "startSessionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "resourcesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">resourcesRequestParam"), br.com.mind.magento.Client.ResourcesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">resourcesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ResourcesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "resourcesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("globalFaults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "globalFaultsParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">globalFaultsParam"), br.com.mind.magento.Client.GlobalFaultsParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">globalFaultsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.GlobalFaultsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "globalFaultsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resourceFaults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "resourceFaultsParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsParam"), br.com.mind.magento.Client.ResourceFaultsParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ResourceFaultsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "resourceFaultsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "storeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">storeListRequestParam"), br.com.mind.magento.Client.StoreListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">storeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.StoreListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "storeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "storeInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">storeInfoRequestParam"), br.com.mind.magento.Client.StoreInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">storeInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.StoreInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "storeInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("magentoInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "magentoInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">magentoInfoRequestParam"), br.com.mind.magento.Client.MagentoInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">magentoInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.MagentoInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "magentoInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryCountryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "directoryCountryListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListRequestParam"), br.com.mind.magento.Client.DirectoryCountryListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.DirectoryCountryListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "directoryCountryListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryRegionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "directoryRegionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListRequestParam"), br.com.mind.magento.Client.DirectoryRegionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.DirectoryRegionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "directoryRegionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListRequestParam"), br.com.mind.magento.Client.CustomerCustomerListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerCustomerListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateRequestParam"), br.com.mind.magento.Client.CustomerCustomerCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerCustomerCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoRequestParam"), br.com.mind.magento.Client.CustomerCustomerInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerCustomerInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateRequestParam"), br.com.mind.magento.Client.CustomerCustomerUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerCustomerDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteRequestParam"), br.com.mind.magento.Client.CustomerCustomerDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerCustomerDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerGroupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerGroupListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerGroupListRequestParam"), br.com.mind.magento.Client.CustomerGroupListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerGroupListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerGroupListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerGroupListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressListRequestParam"), br.com.mind.magento.Client.CustomerAddressListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerAddressListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateRequestParam"), br.com.mind.magento.Client.CustomerAddressCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerAddressCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoRequestParam"), br.com.mind.magento.Client.CustomerAddressInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerAddressInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateRequestParam"), br.com.mind.magento.Client.CustomerAddressUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerAddressUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "customerAddressDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteRequestParam"), br.com.mind.magento.Client.CustomerAddressDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CustomerAddressDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "customerAddressDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreRequestParam"), br.com.mind.magento.Client.CatalogCategoryCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryTree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryTreeRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeRequestParam"), br.com.mind.magento.Client.CatalogCategoryTreeRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryTreeResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryTreeResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryLevelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelRequestParam"), br.com.mind.magento.Client.CatalogCategoryLevelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryLevelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryLevelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoRequestParam"), br.com.mind.magento.Client.CatalogCategoryInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateRequestParam"), br.com.mind.magento.Client.CatalogCategoryCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateRequestParam"), br.com.mind.magento.Client.CatalogCategoryUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryMove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryMoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveRequestParam"), br.com.mind.magento.Client.CatalogCategoryMoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryMoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryMoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteRequestParam"), br.com.mind.magento.Client.CatalogCategoryDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAssignedProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignedProductsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsRequestParam"), br.com.mind.magento.Client.CatalogCategoryAssignedProductsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignedProductsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAssignProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductRequestParam"), br.com.mind.magento.Client.CatalogCategoryAssignProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAssignProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryUpdateProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductRequestParam"), br.com.mind.magento.Client.CatalogCategoryUpdateProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryUpdateProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryRemoveProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryRemoveProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductRequestParam"), br.com.mind.magento.Client.CatalogCategoryRemoveProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryRemoveProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreRequestParam"), br.com.mind.magento.Client.CatalogProductCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductListRequestParam"), br.com.mind.magento.Client.CatalogProductListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoRequestParam"), br.com.mind.magento.Client.CatalogProductInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateRequestParam"), br.com.mind.magento.Client.CatalogProductCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductMultiUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductMultiUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductMultiUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductMultiUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductSetSpecialPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductSetSpecialPriceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceRequestParam"), br.com.mind.magento.Client.CatalogProductSetSpecialPriceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductSetSpecialPriceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductGetSpecialPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductGetSpecialPriceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceRequestParam"), br.com.mind.magento.Client.CatalogProductGetSpecialPriceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductGetSpecialPriceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteRequestParam"), br.com.mind.magento.Client.CatalogProductDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeOptionsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionAddRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionTypesRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionTypesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionListRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionInfoRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueListRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionValueListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueInfoRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueAddRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionValueAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetCreateRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetAttributeAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetAttributeAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeAddRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetAttributeAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetAttributeRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetAttributeRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetAttributeRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeAddOption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeAddOptionRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeAddOptionRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeAddOptionRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeAddOptionResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeAddOptionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetGroupAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetGroupAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupAddRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetGroupAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetGroupRename");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetGroupRenameRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRenameRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRenameResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetGroupRenameResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetGroupRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetGroupRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetGroupRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListRequestParam"), br.com.mind.magento.Client.CatalogProductTypeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductTypeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeTierPriceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeTierPriceUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeTierPriceUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreRequestParam"), br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListRequestParam"), br.com.mind.magento.Client.CatalogCategoryAttributeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeOptionsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsRequestParam"), br.com.mind.magento.Client.CatalogCategoryAttributeOptionsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogCategoryAttributeOptionsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListRequestParam"), br.com.mind.magento.Client.CatalogProductLinkListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductLinkListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkAssign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAssignRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignRequestParam"), br.com.mind.magento.Client.CatalogProductLinkAssignRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAssignResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductLinkUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductLinkRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesRequestParam"), br.com.mind.magento.Client.CatalogProductLinkTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesRequestParam"), br.com.mind.magento.Client.CatalogProductLinkAttributesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCreateRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeInfoRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductAttributeUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderListRequestParam"), br.com.mind.magento.Client.SalesOrderListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoRequestParam"), br.com.mind.magento.Client.SalesOrderInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentRequestParam"), br.com.mind.magento.Client.SalesOrderAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderHold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderHoldRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldRequestParam"), br.com.mind.magento.Client.SalesOrderHoldRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderHoldResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderHoldResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderUnhold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderUnholdRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdRequestParam"), br.com.mind.magento.Client.SalesOrderUnholdRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderUnholdResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderUnholdResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelRequestParam"), br.com.mind.magento.Client.SalesOrderCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentAddTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddTrackRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentAddTrackRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentAddTrackResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentRemoveTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentRemoveTrackRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentRemoveTrackResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentSendInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentSendInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentSendInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentSendInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentGetCarriers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentGetCarriersRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersRequestParam"), br.com.mind.magento.Client.SalesOrderShipmentGetCarriersRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentGetCarriersResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCaptureRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceCaptureRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCaptureResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceVoid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceVoidRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceVoidRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceVoidResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelRequestParam"), br.com.mind.magento.Client.SalesOrderInvoiceCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListRequestParam"), br.com.mind.magento.Client.SalesOrderCreditmemoListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoRequestParam"), br.com.mind.magento.Client.SalesOrderCreditmemoInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateRequestParam"), br.com.mind.magento.Client.SalesOrderCreditmemoCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentRequestParam"), br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelRequestParam"), br.com.mind.magento.Client.SalesOrderCreditmemoCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListRequestParam"), br.com.mind.magento.Client.CatalogInventoryStockItemListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateRequestParam"), br.com.mind.magento.Client.CatalogInventoryStockItemUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemMultiUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemMultiUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateRequestParam"), br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemMultiUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateRequestParam"), br.com.mind.magento.Client.ShoppingCartCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoRequestParam"), br.com.mind.magento.Client.ShoppingCartInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartTotals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsRequestParam"), br.com.mind.magento.Client.ShoppingCartTotalsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartTotalsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartOrderRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderRequestParam"), br.com.mind.magento.Client.ShoppingCartOrderRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartOrderResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartOrderResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseRequestParam"), br.com.mind.magento.Client.ShoppingCartLicenseRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartLicenseResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddRequestParam"), br.com.mind.magento.Client.ShoppingCartProductAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartProductAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateRequestParam"), br.com.mind.magento.Client.ShoppingCartProductUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveRequestParam"), br.com.mind.magento.Client.ShoppingCartProductRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListRequestParam"), br.com.mind.magento.Client.ShoppingCartProductListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartProductListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductMoveToCustomerQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductMoveToCustomerQuoteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteRequestParam"), br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductMoveToCustomerQuoteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerSetRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetRequestParam"), br.com.mind.magento.Client.ShoppingCartCustomerSetRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerSetResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesRequestParam"), br.com.mind.magento.Client.ShoppingCartCustomerAddressesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartShippingMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodRequestParam"), br.com.mind.magento.Client.ShoppingCartShippingMethodRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartShippingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListRequestParam"), br.com.mind.magento.Client.ShoppingCartShippingListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartShippingListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartPaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodRequestParam"), br.com.mind.magento.Client.ShoppingCartPaymentMethodRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartPaymentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListRequestParam"), br.com.mind.magento.Client.ShoppingCartPaymentListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCouponAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddRequestParam"), br.com.mind.magento.Client.ShoppingCartCouponAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCouponRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveRequestParam"), br.com.mind.magento.Client.ShoppingCartCouponRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "shoppingCartCouponRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListRequestParam"), br.com.mind.magento.Client.CatalogProductTagListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductTagListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoRequestParam"), br.com.mind.magento.Client.CatalogProductTagInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductTagInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddRequestParam"), br.com.mind.magento.Client.CatalogProductTagAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductTagAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateRequestParam"), br.com.mind.magento.Client.CatalogProductTagUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductTagRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductTagRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteRequestParam"), br.com.mind.magento.Client.GiftMessageForQuoteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.GiftMessageForQuoteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuoteItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteItemRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemRequestParam"), br.com.mind.magento.Client.GiftMessageForQuoteItemRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteItemResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuoteProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductRequestParam"), br.com.mind.magento.Client.GiftMessageForQuoteProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "giftMessageForQuoteProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDownloadableLinkAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkAddRequestParam"), br.com.mind.magento.Client.CatalogProductDownloadableLinkAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDownloadableLinkList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkListRequestParam"), br.com.mind.magento.Client.CatalogProductDownloadableLinkListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDownloadableLinkRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkRemoveRequestParam"), br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetcustomerbyemail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetcustomerbyemailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomerbyemailRequestParam"), br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomerbyemailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetcustomerbyemailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetcustomeridbyemail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetcustomeridbyemailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomeridbyemailRequestParam"), br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomeridbyemailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetcustomeridbyemailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetbalancebyemail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetbalancebyemailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyemailRequestParam"), br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyemailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetbalancebyemailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetbalancebyid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetbalancebyidRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyidRequestParam"), br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyidResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetbalancebyidResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetcustomersbalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetcustomersbalanceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomersbalanceRequestParam"), br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomersbalanceResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerGetcustomersbalanceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionListRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionAddRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionCompleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCompleteRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionCompleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCompleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionCompleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCancelRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionExpire");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionExpireRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionExpireRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionExpireResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionBalanceEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionBalanceEmailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionBalanceEmailRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionBalanceEmailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionBalanceEmailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionExpireEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionExpireEmailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireEmailRequestParam"), br.com.mind.magento.Client.RewardpointsTransactionExpireEmailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireEmailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionExpireEmailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsCouponRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCouponRequestParam"), br.com.mind.magento.Client.RewardpointsReferfriendsCouponRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCouponResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsCouponResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsLinkRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsLinkRequestParam"), br.com.mind.magento.Client.RewardpointsReferfriendsLinkRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsLinkResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsLinkResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsCustomerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsCustomerLinkRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerLinkRequestParam"), br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerLinkResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsCustomerLinkResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsCustomerCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsCustomerCouponRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerCouponRequestParam"), br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerCouponResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsReferfriendsCustomerCouponResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferListRequestParam"), br.com.mind.magento.Client.RewardpointsTransferListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransferListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferAddRequestParam"), br.com.mind.magento.Client.RewardpointsTransferAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransferAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferCompleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCompleteRequestParam"), br.com.mind.magento.Client.RewardpointsTransferCompleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCompleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferCompleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCancelRequestParam"), br.com.mind.magento.Client.RewardpointsTransferCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferTransferEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferTransferEmailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferTransferEmailRequestParam"), br.com.mind.magento.Client.RewardpointsTransferTransferEmailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferTransferEmailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferTransferEmailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[169] = oper;

    }

    public Mage_Api_Model_Server_Wsi_HandlerBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Mage_Api_Model_Server_Wsi_HandlerBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Mage_Api_Model_Server_Wsi_HandlerBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">callParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CallParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">callResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CallResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAssignedProductsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignedProductsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAssignProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAssignProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAttributeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAttributeOptionsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryAttributeOptionsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryLevelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryLevelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryLevelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryMoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryMoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryMoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryRemoveProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryRemoveProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryTreeRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryTreeResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryTreeResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryUpdateProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogCategoryUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemMultiUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogInventoryStockItemUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeAddOptionRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeAddOptionRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeAddOptionResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeGroupPriceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeGroupPriceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeGroupPriceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeGroupPriceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeGroupPriceUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeGroupPriceUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeGroupPriceUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeGroupPriceUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeMediaUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeOptionsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeOptionsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetAttributeRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRenameRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetGroupRenameResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeSetRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeTierPriceUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductAttributeUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductCustomOptionValueUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductDownloadableLinkRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductGetSpecialPriceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductGetSpecialPriceResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkAssignRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAssignResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkAttributesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkAttributesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductLinkUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductMultiUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductMultiUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductSetSpecialPriceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductSetSpecialPriceResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTagUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTypeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductTypeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTypeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">catalogProductUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerAddressUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerCustomerUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerGroupListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerGroupListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">customerGroupListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerGroupListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryCountryListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryCountryListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryCountryListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryRegionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">directoryRegionListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryRegionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">endSessionParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.EndSessionParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">endSessionResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.EndSessionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageForQuoteItemRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteItemResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageForQuoteProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageForQuoteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">giftMessageForQuoteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageForQuoteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">globalFaultsParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GlobalFaultsParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">globalFaultsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GlobalFaultsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">loginParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.LoginParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">loginResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.LoginResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">magentoInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.MagentoInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">magentoInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.MagentoInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">multiCallParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.MultiCallParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">multiCallResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.MultiCallResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ResourceFaultsParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourceFaultsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ResourceFaultsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourcesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ResourcesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">resourcesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ResourcesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyemailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyemailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyidRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetbalancebyidResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomerbyemailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomerbyemailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomeridbyemailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomeridbyemailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomersbalanceRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsCustomerGetcustomersbalanceResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCouponRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsCouponRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCouponResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerCouponRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerCouponResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerLinkRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsCustomerLinkResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsLinkRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsLinkRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsReferfriendsLinkResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionBalanceEmailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionBalanceEmailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCompleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionCompleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionCompleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireEmailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionExpireEmailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireEmailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionExpireRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionExpireResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransactionListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCompleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferCompleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferCompleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferTransferEmailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferTransferEmailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">rewardpointsTransferTransferEmailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderCreditmemoListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderHoldRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderHoldResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderHoldResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCaptureRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCaptureResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceVoidRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderInvoiceVoidResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentAddTrackRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentAddTrackResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentGetCarriersRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentGetCarriersResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentRemoveTrackResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentSendInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderShipmentSendInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderUnholdRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">salesOrderUnholdResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderUnholdResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCouponAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCouponRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCouponRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerAddressesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerAddressesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerSetRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartCustomerSetResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartLicenseRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartLicenseResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartLicenseResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartOrderRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartOrderResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartOrderResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentMethodRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartPaymentMethodResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductMoveToCustomerQuoteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartProductUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartShippingListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartShippingListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartShippingMethodRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartShippingMethodResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartTotalsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">shoppingCartTotalsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartTotalsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">startSessionResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StartSessionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StoreInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StoreInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StoreListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", ">storeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StoreListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "apiEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ApiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "apiMethodEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ApiMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfApiMethods");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ApiMethodEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "apiMethodEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfApis");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ApiEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "apiEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfCatalogCategoryEntities");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfCatalogCategoryEntitiesNoChildren");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryEntityNoChildren[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityNoChildren");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfExistsFaltures");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ExistsFaltureEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "existsFaltureEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.AssociativeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "associativeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.AssociativeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeMultiArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.AssociativeMultiEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "associativeMultiEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "associativeMultiEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.AssociativeMultiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAssignedProduct");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogAssignedProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAssignedProductArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogAssignedProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAssignedProduct");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogAttributeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeOptionEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogAttributeOptionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeOptionEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogAttributeOptionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogAttributeOptionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryEntityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryEntityNoChildren");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryEntityNoChildren.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryInfo");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogCategoryTree");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogCategoryTree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogInventoryStockItemUpdateEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogInventoryStockItemUpdateEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeEntityToCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeEntityToCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeEntityToUpdate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeEntityToUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeFrontendLabelArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeFrontendLabelEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeFrontendLabelEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeFrontendLabelEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeFrontendLabelEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaCreateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaCreateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaTypeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeMediaTypeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeMediaTypeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionEntityToAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeOptionEntityToAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionLabelArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeOptionLabelEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionLabelEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeOptionLabelEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeOptionLabelEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductAttributeSetEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductAttributeSetEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCreateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCreateEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCreateEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionAdditionalFieldsArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionAdditionalFieldsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionAdditionalFieldsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionAdditionalFieldsEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionAdditionalFieldsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionListArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionToAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionToAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionToUpdate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionToUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionTypesArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionTypesEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionTypesEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionTypesEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionTypesEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueAddArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueAddEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueAddEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueAddEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueListArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductCustomOptionValueUpdateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkAddEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkAddSampleEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkAddSampleEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkFileEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkFileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkFileInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkFileInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkFileInfoEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkFileInfoEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkFileInfoEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkSampleEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkSampleEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkSampleEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductDownloadableLinkSampleEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductDownloadableLinkSampleEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductGroupPriceEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductGroupPriceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductGroupPriceEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductGroupPriceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductGroupPriceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductImageEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductImageEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductImageFileEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductImageFileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkAttributeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkAttributeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductLinkEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductLinkEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductRequestAttributes");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductRequestAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductReturnEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductReturnEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductSpecialPriceReturnEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductSpecialPriceReturnEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagAddEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTagUpdateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTagUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTierPriceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTierPriceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTierPriceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTypeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductTypeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductTypeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "complexFilter");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ComplexFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "complexFilterArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ComplexFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "complexFilter");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "complexMultiArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ComplexMultiFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "complexMultiFilter");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "complexMultiFilter");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ComplexMultiFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressEntityItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityItem");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressEntityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerAddressEntityItem");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerAddressEntityItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntityToCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerCustomerEntityToCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerGroupEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerGroupEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "customerGroupEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CustomerGroupEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "customerGroupEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryCountryEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryCountryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryCountryEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryCountryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "directoryCountryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryRegionEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryRegionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "directoryRegionEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.DirectoryRegionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "directoryRegionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "existsFaltureEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ExistsFaltureEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "filters");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.Filters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageAssociativeProductsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageAssociativeProductsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageResponse");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageResponseArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.GiftMessageResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "giftMessageResponse");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "magentoInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.MagentoInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "orderItemIdQty");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.OrderItemIdQty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "orderItemIdQtyArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.OrderItemIdQty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "orderItemIdQty");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsCustomerEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsCustomerEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransactionAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransactionEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTranstionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTranstionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTransferEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTransferEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "rewardpointsTranstionEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.RewardpointsTranstionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderAddressEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCommentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoData");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderCreditmemoItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderCreditmemoItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCommentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderInvoiceItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderInvoiceItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderListEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderPaymentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderPaymentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCommentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentTrackEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentTrackEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentTrackEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderShipmentTrackEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderShipmentTrackEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderStatusHistoryEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderStatusHistoryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderStatusHistoryEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.SalesOrderStatusHistoryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "salesOrderStatusHistoryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartAddressEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerAddressEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerAddressEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartCustomerEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartLicenseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartLicenseEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartLicenseEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodResponseEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodResponseEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartPaymentMethodResponseEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductResponseEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.CatalogProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "catalogProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartShippingMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartShippingMethodEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartShippingMethodEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartTotalsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.ShoppingCartTotalsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "shoppingCartTotalsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Magento", "storeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StoreEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Magento", "storeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.Client.StoreEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Magento", "storeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.mind.magento.Client.CallResponseParam call(br.com.mind.magento.Client.CallParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "call"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CallResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CallResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CallResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.MultiCallResponseParam multiCall(br.com.mind.magento.Client.MultiCallParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "multiCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.MultiCallResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.MultiCallResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.MultiCallResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.EndSessionResponseParam endSession(br.com.mind.magento.Client.EndSessionParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "endSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.EndSessionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.EndSessionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.EndSessionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.LoginResponseParam login(br.com.mind.magento.Client.LoginParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.LoginResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.LoginResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.LoginResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.StartSessionResponseParam startSession() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.StartSessionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.StartSessionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.StartSessionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ResourcesResponseParam resources(br.com.mind.magento.Client.ResourcesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ResourcesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ResourcesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ResourcesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.GlobalFaultsResponseParam globalFaults(br.com.mind.magento.Client.GlobalFaultsParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "globalFaults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.GlobalFaultsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.GlobalFaultsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.GlobalFaultsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ResourceFaultsResponseParam resourceFaults(br.com.mind.magento.Client.ResourceFaultsParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resourceFaults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ResourceFaultsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ResourceFaultsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ResourceFaultsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.StoreListResponseParam storeList(br.com.mind.magento.Client.StoreListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "storeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.StoreListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.StoreListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.StoreListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.StoreInfoResponseParam storeInfo(br.com.mind.magento.Client.StoreInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "storeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.StoreInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.StoreInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.StoreInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.MagentoInfoResponseParam magentoInfo(br.com.mind.magento.Client.MagentoInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "magentoInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.MagentoInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.MagentoInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.MagentoInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.DirectoryCountryListResponseParam directoryCountryList(br.com.mind.magento.Client.DirectoryCountryListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryCountryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.DirectoryCountryListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.DirectoryCountryListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.DirectoryCountryListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.DirectoryRegionListResponseParam directoryRegionList(br.com.mind.magento.Client.DirectoryRegionListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryRegionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.DirectoryRegionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.DirectoryRegionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.DirectoryRegionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerCustomerListResponseParam customerCustomerList(br.com.mind.magento.Client.CustomerCustomerListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerCustomerListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerCustomerListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerCustomerListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerCustomerCreateResponseParam customerCustomerCreate(br.com.mind.magento.Client.CustomerCustomerCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerCustomerCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerCustomerCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerCustomerCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerCustomerInfoResponseParam customerCustomerInfo(br.com.mind.magento.Client.CustomerCustomerInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerCustomerInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerCustomerInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerCustomerInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam customerCustomerUpdate(br.com.mind.magento.Client.CustomerCustomerUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam customerCustomerDelete(br.com.mind.magento.Client.CustomerCustomerDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerCustomerDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerGroupListResponseParam customerGroupList(br.com.mind.magento.Client.CustomerGroupListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerGroupList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerGroupListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerGroupListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerGroupListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerAddressListResponseParam customerAddressList(br.com.mind.magento.Client.CustomerAddressListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerAddressListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerAddressListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerAddressListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerAddressCreateResponseParam customerAddressCreate(br.com.mind.magento.Client.CustomerAddressCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerAddressCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerAddressCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerAddressCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerAddressInfoResponseParam customerAddressInfo(br.com.mind.magento.Client.CustomerAddressInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerAddressInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerAddressInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerAddressInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerAddressUpdateResponseParam customerAddressUpdate(br.com.mind.magento.Client.CustomerAddressUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerAddressUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerAddressUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerAddressUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CustomerAddressDeleteResponseParam customerAddressDelete(br.com.mind.magento.Client.CustomerAddressDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customerAddressDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CustomerAddressDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CustomerAddressDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CustomerAddressDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam catalogCategoryCurrentStore(br.com.mind.magento.Client.CatalogCategoryCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryTreeResponseParam catalogCategoryTree(br.com.mind.magento.Client.CatalogCategoryTreeRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryTree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryTreeResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryTreeResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryTreeResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryLevelResponseParam catalogCategoryLevel(br.com.mind.magento.Client.CatalogCategoryLevelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryLevelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryLevelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryLevelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryInfoResponseParam catalogCategoryInfo(br.com.mind.magento.Client.CatalogCategoryInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryCreateResponseParam catalogCategoryCreate(br.com.mind.magento.Client.CatalogCategoryCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam catalogCategoryUpdate(br.com.mind.magento.Client.CatalogCategoryUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryMoveResponseParam catalogCategoryMove(br.com.mind.magento.Client.CatalogCategoryMoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryMove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryMoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryMoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryMoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam catalogCategoryDelete(br.com.mind.magento.Client.CatalogCategoryDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam catalogCategoryAssignedProducts(br.com.mind.magento.Client.CatalogCategoryAssignedProductsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAssignedProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam catalogCategoryAssignProduct(br.com.mind.magento.Client.CatalogCategoryAssignProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAssignProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam catalogCategoryUpdateProduct(br.com.mind.magento.Client.CatalogCategoryUpdateProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryUpdateProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam catalogCategoryRemoveProduct(br.com.mind.magento.Client.CatalogCategoryRemoveProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryRemoveProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam catalogProductCurrentStore(br.com.mind.magento.Client.CatalogProductCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductListResponseParam catalogProductList(br.com.mind.magento.Client.CatalogProductListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductInfoResponseParam catalogProductInfo(br.com.mind.magento.Client.CatalogProductInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCreateResponseParam catalogProductCreate(br.com.mind.magento.Client.CatalogProductCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductUpdateResponseParam catalogProductUpdate(br.com.mind.magento.Client.CatalogProductUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam catalogProductMultiUpdate(br.com.mind.magento.Client.CatalogProductMultiUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductMultiUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam catalogProductSetSpecialPrice(br.com.mind.magento.Client.CatalogProductSetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductSetSpecialPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam catalogProductGetSpecialPrice(br.com.mind.magento.Client.CatalogProductGetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductGetSpecialPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductDeleteResponseParam catalogProductDelete(br.com.mind.magento.Client.CatalogProductDeleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam catalogProductAttributeCurrentStore(br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeListResponseParam catalogProductAttributeList(br.com.mind.magento.Client.CatalogProductAttributeListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam catalogProductAttributeOptions(br.com.mind.magento.Client.CatalogProductAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam catalogProductCustomOptionAdd(br.com.mind.magento.Client.CatalogProductCustomOptionAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam catalogProductCustomOptionUpdate(br.com.mind.magento.Client.CatalogProductCustomOptionUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam catalogProductCustomOptionTypes(br.com.mind.magento.Client.CatalogProductCustomOptionTypesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam catalogProductCustomOptionList(br.com.mind.magento.Client.CatalogProductCustomOptionListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam catalogProductCustomOptionInfo(br.com.mind.magento.Client.CatalogProductCustomOptionInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam catalogProductCustomOptionRemove(br.com.mind.magento.Client.CatalogProductCustomOptionRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam catalogProductCustomOptionValueList(br.com.mind.magento.Client.CatalogProductCustomOptionValueListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionValueList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam catalogProductCustomOptionValueInfo(br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionValueInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam catalogProductCustomOptionValueAdd(br.com.mind.magento.Client.CatalogProductCustomOptionValueAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionValueAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam catalogProductCustomOptionValueUpdate(br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionValueUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam catalogProductCustomOptionValueRemove(br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductCustomOptionValueRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam catalogProductAttributeSetCreate(br.com.mind.magento.Client.CatalogProductAttributeSetCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam catalogProductAttributeSetRemove(br.com.mind.magento.Client.CatalogProductAttributeSetRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam catalogProductAttributeSetList(br.com.mind.magento.Client.CatalogProductAttributeSetListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam catalogProductAttributeSetAttributeAdd(br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetAttributeAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam catalogProductAttributeSetAttributeRemove(br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetAttributeRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam catalogProductAttributeAddOption(br.com.mind.magento.Client.CatalogProductAttributeAddOptionRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeAddOption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam catalogProductAttributeSetGroupAdd(br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetGroupAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam catalogProductAttributeSetGroupRename(br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetGroupRename"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam catalogProductAttributeSetGroupRemove(br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeSetGroupRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductTypeListResponseParam catalogProductTypeList(br.com.mind.magento.Client.CatalogProductTypeListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductTypeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductTypeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductTypeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam catalogProductAttributeTierPriceInfo(br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeTierPriceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam catalogProductAttributeTierPriceUpdate(br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeTierPriceUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam catalogCategoryAttributeCurrentStore(br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAttributeCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam catalogCategoryAttributeList(br.com.mind.magento.Client.CatalogCategoryAttributeListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAttributeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam catalogCategoryAttributeOptions(br.com.mind.magento.Client.CatalogCategoryAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogCategoryAttributeOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam catalogProductAttributeMediaCurrentStore(br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaCurrentStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam catalogProductAttributeMediaList(br.com.mind.magento.Client.CatalogProductAttributeMediaListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam catalogProductAttributeMediaInfo(br.com.mind.magento.Client.CatalogProductAttributeMediaInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam catalogProductAttributeMediaTypes(br.com.mind.magento.Client.CatalogProductAttributeMediaTypesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam catalogProductAttributeMediaCreate(br.com.mind.magento.Client.CatalogProductAttributeMediaCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam catalogProductAttributeMediaUpdate(br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam catalogProductAttributeMediaRemove(br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeMediaRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductLinkListResponseParam catalogProductLinkList(br.com.mind.magento.Client.CatalogProductLinkListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductLinkListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductLinkListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductLinkListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam catalogProductLinkAssign(br.com.mind.magento.Client.CatalogProductLinkAssignRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkAssign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam catalogProductLinkUpdate(br.com.mind.magento.Client.CatalogProductLinkUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam catalogProductLinkRemove(br.com.mind.magento.Client.CatalogProductLinkRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam catalogProductLinkTypes(br.com.mind.magento.Client.CatalogProductLinkTypesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam catalogProductLinkAttributes(br.com.mind.magento.Client.CatalogProductLinkAttributesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductLinkAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam catalogProductAttributeCreate(br.com.mind.magento.Client.CatalogProductAttributeCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam catalogProductAttributeRemove(br.com.mind.magento.Client.CatalogProductAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam catalogProductAttributeInfo(br.com.mind.magento.Client.CatalogProductAttributeInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam catalogProductAttributeUpdate(br.com.mind.magento.Client.CatalogProductAttributeUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductAttributeUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderListResponseParam salesOrderList(br.com.mind.magento.Client.SalesOrderListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInfoResponseParam salesOrderInfo(br.com.mind.magento.Client.SalesOrderInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderAddCommentResponseParam salesOrderAddComment(br.com.mind.magento.Client.SalesOrderAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderHoldResponseParam salesOrderHold(br.com.mind.magento.Client.SalesOrderHoldRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderHold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderHoldResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderHoldResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderHoldResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderUnholdResponseParam salesOrderUnhold(br.com.mind.magento.Client.SalesOrderUnholdRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderUnhold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderUnholdResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderUnholdResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderUnholdResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderCancelResponseParam salesOrderCancel(br.com.mind.magento.Client.SalesOrderCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentListResponseParam salesOrderShipmentList(br.com.mind.magento.Client.SalesOrderShipmentListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam salesOrderShipmentInfo(br.com.mind.magento.Client.SalesOrderShipmentInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam salesOrderShipmentCreate(br.com.mind.magento.Client.SalesOrderShipmentCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam salesOrderShipmentAddComment(br.com.mind.magento.Client.SalesOrderShipmentAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam salesOrderShipmentAddTrack(br.com.mind.magento.Client.SalesOrderShipmentAddTrackRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentAddTrack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam salesOrderShipmentRemoveTrack(br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentRemoveTrack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam salesOrderShipmentSendInfo(br.com.mind.magento.Client.SalesOrderShipmentSendInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentSendInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam salesOrderShipmentGetCarriers(br.com.mind.magento.Client.SalesOrderShipmentGetCarriersRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderShipmentGetCarriers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam salesOrderInvoiceList(br.com.mind.magento.Client.SalesOrderInvoiceListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam salesOrderInvoiceInfo(br.com.mind.magento.Client.SalesOrderInvoiceInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam salesOrderInvoiceCreate(br.com.mind.magento.Client.SalesOrderInvoiceCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam salesOrderInvoiceAddComment(br.com.mind.magento.Client.SalesOrderInvoiceAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam salesOrderInvoiceCapture(br.com.mind.magento.Client.SalesOrderInvoiceCaptureRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceCapture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam salesOrderInvoiceVoid(br.com.mind.magento.Client.SalesOrderInvoiceVoidRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceVoid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam salesOrderInvoiceCancel(br.com.mind.magento.Client.SalesOrderInvoiceCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderInvoiceCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam salesOrderCreditmemoList(br.com.mind.magento.Client.SalesOrderCreditmemoListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam salesOrderCreditmemoInfo(br.com.mind.magento.Client.SalesOrderCreditmemoInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam salesOrderCreditmemoCreate(br.com.mind.magento.Client.SalesOrderCreditmemoCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam salesOrderCreditmemoAddComment(br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoAddComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam salesOrderCreditmemoCancel(br.com.mind.magento.Client.SalesOrderCreditmemoCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "salesOrderCreditmemoCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam catalogInventoryStockItemList(br.com.mind.magento.Client.CatalogInventoryStockItemListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogInventoryStockItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam catalogInventoryStockItemUpdate(br.com.mind.magento.Client.CatalogInventoryStockItemUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogInventoryStockItemUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam catalogInventoryStockItemMultiUpdate(br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogInventoryStockItemMultiUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartCreateResponseParam shoppingCartCreate(br.com.mind.magento.Client.ShoppingCartCreateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartInfoResponseParam shoppingCartInfo(br.com.mind.magento.Client.ShoppingCartInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartTotalsResponseParam shoppingCartTotals(br.com.mind.magento.Client.ShoppingCartTotalsRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartTotals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartTotalsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartTotalsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartTotalsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartOrderResponseParam shoppingCartOrder(br.com.mind.magento.Client.ShoppingCartOrderRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartOrderResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartOrderResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartOrderResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartLicenseResponseParam shoppingCartLicense(br.com.mind.magento.Client.ShoppingCartLicenseRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartLicense"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartLicenseResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartLicenseResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartLicenseResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartProductAddResponseParam shoppingCartProductAdd(br.com.mind.magento.Client.ShoppingCartProductAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartProductAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartProductAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartProductAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam shoppingCartProductUpdate(br.com.mind.magento.Client.ShoppingCartProductUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam shoppingCartProductRemove(br.com.mind.magento.Client.ShoppingCartProductRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartProductListResponseParam shoppingCartProductList(br.com.mind.magento.Client.ShoppingCartProductListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartProductListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartProductListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartProductListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam shoppingCartProductMoveToCustomerQuote(br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartProductMoveToCustomerQuote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam shoppingCartCustomerSet(br.com.mind.magento.Client.ShoppingCartCustomerSetRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCustomerSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam shoppingCartCustomerAddresses(br.com.mind.magento.Client.ShoppingCartCustomerAddressesRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCustomerAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam shoppingCartShippingMethod(br.com.mind.magento.Client.ShoppingCartShippingMethodRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartShippingMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartShippingListResponseParam shoppingCartShippingList(br.com.mind.magento.Client.ShoppingCartShippingListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartShippingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartShippingListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartShippingListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartShippingListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam shoppingCartPaymentMethod(br.com.mind.magento.Client.ShoppingCartPaymentMethodRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartPaymentMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam shoppingCartPaymentList(br.com.mind.magento.Client.ShoppingCartPaymentListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartPaymentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam shoppingCartCouponAdd(br.com.mind.magento.Client.ShoppingCartCouponAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCouponAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam shoppingCartCouponRemove(br.com.mind.magento.Client.ShoppingCartCouponRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shoppingCartCouponRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductTagListResponseParam catalogProductTagList(br.com.mind.magento.Client.CatalogProductTagListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductTagListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductTagListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductTagListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductTagInfoResponseParam catalogProductTagInfo(br.com.mind.magento.Client.CatalogProductTagInfoRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductTagInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductTagInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductTagInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductTagAddResponseParam catalogProductTagAdd(br.com.mind.magento.Client.CatalogProductTagAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductTagAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductTagAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductTagAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam catalogProductTagUpdate(br.com.mind.magento.Client.CatalogProductTagUpdateRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam catalogProductTagRemove(br.com.mind.magento.Client.CatalogProductTagRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductTagRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.GiftMessageForQuoteResponseParam giftMessageSetForQuote(br.com.mind.magento.Client.GiftMessageForQuoteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftMessageSetForQuote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.GiftMessageForQuoteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.GiftMessageForQuoteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.GiftMessageForQuoteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam giftMessageSetForQuoteItem(br.com.mind.magento.Client.GiftMessageForQuoteItemRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftMessageSetForQuoteItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam giftMessageSetForQuoteProduct(br.com.mind.magento.Client.GiftMessageForQuoteProductRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftMessageSetForQuoteProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam catalogProductDownloadableLinkAdd(br.com.mind.magento.Client.CatalogProductDownloadableLinkAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductDownloadableLinkAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam catalogProductDownloadableLinkList(br.com.mind.magento.Client.CatalogProductDownloadableLinkListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductDownloadableLinkList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam catalogProductDownloadableLinkRemove(br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catalogProductDownloadableLinkRemove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam rewardpointsCustomerGetcustomerbyemail(br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsCustomerGetcustomerbyemail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam rewardpointsCustomerGetcustomeridbyemail(br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsCustomerGetcustomeridbyemail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam rewardpointsCustomerGetbalancebyemail(br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsCustomerGetbalancebyemail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam rewardpointsCustomerGetbalancebyid(br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsCustomerGetbalancebyid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam rewardpointsCustomerGetcustomersbalance(br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsCustomerGetcustomersbalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionListResponseParam rewardpointsTransactionList(br.com.mind.magento.Client.RewardpointsTransactionListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam rewardpointsTransactionAdd(br.com.mind.magento.Client.RewardpointsTransactionAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam rewardpointsTransactionComplete(br.com.mind.magento.Client.RewardpointsTransactionCompleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam rewardpointsTransactionCancel(br.com.mind.magento.Client.RewardpointsTransactionCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam rewardpointsTransactionExpire(br.com.mind.magento.Client.RewardpointsTransactionExpireRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionExpire"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam rewardpointsTransactionBalanceEmail(br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionBalanceEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam rewardpointsTransactionExpireEmail(br.com.mind.magento.Client.RewardpointsTransactionExpireEmailRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransactionExpireEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam rewardpointsReferfriendsCoupon(br.com.mind.magento.Client.RewardpointsReferfriendsCouponRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsReferfriendsCoupon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam rewardpointsReferfriendsLink(br.com.mind.magento.Client.RewardpointsReferfriendsLinkRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsReferfriendsLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam rewardpointsReferfriendsCustomerLink(br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsReferfriendsCustomerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam rewardpointsReferfriendsCustomerCoupon(br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsReferfriendsCustomerCoupon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransferListResponseParam rewardpointsTransferList(br.com.mind.magento.Client.RewardpointsTransferListRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransferList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransferListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransferListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransferListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransferAddResponseParam rewardpointsTransferAdd(br.com.mind.magento.Client.RewardpointsTransferAddRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransferAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransferAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransferAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransferAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam rewardpointsTransferComplete(br.com.mind.magento.Client.RewardpointsTransferCompleteRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransferComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam rewardpointsTransferCancel(br.com.mind.magento.Client.RewardpointsTransferCancelRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransferCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam rewardpointsTransferTransferEmail(br.com.mind.magento.Client.RewardpointsTransferTransferEmailRequestParam parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rewardpointsTransferTransferEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
