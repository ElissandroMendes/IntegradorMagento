/**
 * Mage_Api_Model_Server_Wsi_HandlerBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public class Mage_Api_Model_Server_Wsi_HandlerBindingStub extends org.apache.axis.client.Stub implements br.com.mind.magento.ClientWithWSI.Mage_Api_Model_Server_Wsi_HandlerPortType {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "callParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">callParam"), br.com.mind.magento.ClientWithWSI.CallParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">callResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CallResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "callResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("multiCall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "multiCallParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">multiCallParam"), br.com.mind.magento.ClientWithWSI.MultiCallParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">multiCallResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.MultiCallResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "multiCallResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("endSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "endSessionParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">endSessionParam"), br.com.mind.magento.ClientWithWSI.EndSessionParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">endSessionResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.EndSessionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "endSessionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "loginParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">loginParam"), br.com.mind.magento.ClientWithWSI.LoginParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">loginResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.LoginResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "loginResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startSession");
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">startSessionResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.StartSessionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "startSessionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "resourcesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourcesRequestParam"), br.com.mind.magento.ClientWithWSI.ResourcesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourcesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ResourcesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "resourcesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("globalFaults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "globalFaultsParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">globalFaultsParam"), br.com.mind.magento.ClientWithWSI.GlobalFaultsParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">globalFaultsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "globalFaultsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resourceFaults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "resourceFaultsParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourceFaultsParam"), br.com.mind.magento.ClientWithWSI.ResourceFaultsParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourceFaultsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "resourceFaultsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeListRequestParam"), br.com.mind.magento.ClientWithWSI.StoreListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.StoreListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeInfoRequestParam"), br.com.mind.magento.ClientWithWSI.StoreInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("magentoInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "magentoInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">magentoInfoRequestParam"), br.com.mind.magento.ClientWithWSI.MagentoInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">magentoInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "magentoInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryCountryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryCountryListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryCountryListRequestParam"), br.com.mind.magento.ClientWithWSI.DirectoryCountryListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryCountryListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryCountryListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryRegionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryRegionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryRegionListRequestParam"), br.com.mind.magento.ClientWithWSI.DirectoryRegionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryRegionListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryRegionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerListRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerCustomerListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerCustomerDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerDeleteRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerGroupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerGroupListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerGroupListRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerGroupListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerGroupListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerGroupListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressListRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerAddressListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerAddressCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerAddressInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerAddressDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressDeleteRequestParam"), br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCurrentStoreRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryTree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryTreeRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryTreeRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryTreeResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryTreeResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryLevelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryLevelRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryLevelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryLevelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryMove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryMoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryMoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryMoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryMoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryDeleteRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAssignedProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAssignedProductsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignedProductsRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignedProductsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAssignedProductsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAssignProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAssignProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignProductRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAssignProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryUpdateProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryUpdateProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateProductRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryUpdateProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryRemoveProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryRemoveProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryRemoveProductRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryRemoveProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryRemoveProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCurrentStoreRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductMultiUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductMultiUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductMultiUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductMultiUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductMultiUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductSetSpecialPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductSetSpecialPriceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductSetSpecialPriceRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductSetSpecialPriceResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductSetSpecialPriceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductGetSpecialPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductGetSpecialPriceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductGetSpecialPriceRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductGetSpecialPriceResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductGetSpecialPriceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDeleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDeleteRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductDeleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDeleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDeleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCurrentStoreRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeOptionsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeOptionsRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeOptionsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeOptionsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionAddRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionTypesRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionTypesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueAddRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductCustomOptionValueRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetAttributeAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetAttributeAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeAddRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetAttributeAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetAttributeRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetAttributeRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetAttributeRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeAddOption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeAddOptionRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeAddOptionRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeAddOptionResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeAddOptionResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetGroupAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetGroupAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupAddRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetGroupAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetGroupRename");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetGroupRenameRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRenameRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRenameResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetGroupRenameResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeSetGroupRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetGroupRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetGroupRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTypeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTypeListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductTypeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTypeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTypeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeTierPriceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeTierPriceInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeTierPriceInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeTierPriceUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeTierPriceUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeTierPriceUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAttributeCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeCurrentStoreRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAttributeCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAttributeListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAttributeListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogCategoryAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAttributeOptionsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeOptionsRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeOptionsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryAttributeOptionsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaCurrentStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaCurrentStoreRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCurrentStoreRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCurrentStoreResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaCurrentStoreResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaTypesRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaTypesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeMediaRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductLinkListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkAssign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAssignRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAssignRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAssignResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAssignResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkTypesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkTypesRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkTypesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkTypesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductLinkAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAttributesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAttributesRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAttributesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAttributesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCreateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductAttributeUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderListRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInfoRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderAddCommentRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderHold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderHoldRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderHoldRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderHoldRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderHoldResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderHoldResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderUnhold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderUnholdRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderUnholdRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderUnholdRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderUnholdResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderUnholdResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCancelRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentListRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentInfoRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentCreateRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddCommentRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentAddTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentAddTrackRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddTrackRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddTrackResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentAddTrackResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentRemoveTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentRemoveTrackRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentRemoveTrackRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentRemoveTrackResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentRemoveTrackResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentSendInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentSendInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentSendInfoRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentSendInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentSendInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderShipmentGetCarriers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentGetCarriersRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentGetCarriersRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentGetCarriersResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentGetCarriersResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceListRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceInfoRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCreateRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceAddCommentRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCaptureRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCaptureRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCaptureResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCaptureResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceVoid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceVoidRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceVoidRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceVoidResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceVoidResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderInvoiceCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCancelRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoListRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoInfoRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCreateRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoAddComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoAddCommentRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoAddCommentRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoAddCommentResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoAddCommentResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesOrderCreditmemoCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCancelRequestParam"), br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogInventoryStockItemMultiUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemMultiUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemMultiUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemMultiUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemMultiUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCreateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCreateRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartCreateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCreateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCreateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartInfoRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartTotals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartTotalsRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartTotalsRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartTotalsResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartTotalsResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartOrderRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartOrderRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartOrderRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartOrderResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartOrderResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartLicenseRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartLicenseRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartLicenseResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartLicenseResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductAddRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductListRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartProductListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartProductMoveToCustomerQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductMoveToCustomerQuoteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductMoveToCustomerQuoteRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductMoveToCustomerQuoteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductMoveToCustomerQuoteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerSetRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerSetRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerSetResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerSetResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCustomerAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerAddressesRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerAddressesRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerAddressesResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerAddressesResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartShippingMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingMethodRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingMethodRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingMethodResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingMethodResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartShippingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingListRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartPaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentMethodRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentMethodRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentMethodResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentMethodResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartPaymentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentListRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCouponAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCouponAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponAddRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCouponAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartCouponRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCouponRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCouponRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductTagListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagInfoRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagInfoRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagInfoResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagInfoResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagAddRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductTagAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagUpdateRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagUpdateRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagUpdateResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagUpdateResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductTagRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageForQuoteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteRequestParam"), br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageForQuoteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuoteItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageForQuoteItemRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteItemRequestParam"), br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteItemResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageForQuoteItemResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftMessageSetForQuoteProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageForQuoteProductRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteProductRequestParam"), br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteProductResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageForQuoteProductResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDownloadableLinkAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkAddRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDownloadableLinkList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkListRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catalogProductDownloadableLinkRemove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkRemoveRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkRemoveRequestParam"), br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkRemoveResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkRemoveResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetcustomerbyemail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetcustomerbyemailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomerbyemailRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomerbyemailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetcustomerbyemailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetcustomeridbyemail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetcustomeridbyemailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomeridbyemailRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomeridbyemailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetcustomeridbyemailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetbalancebyemail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetbalancebyemailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyemailRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyemailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetbalancebyemailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetbalancebyid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetbalancebyidRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyidRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyidResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetbalancebyidResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsCustomerGetcustomersbalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetcustomersbalanceRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomersbalanceRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomersbalanceResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerGetcustomersbalanceResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionListRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionAddRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionCompleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCompleteRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCompleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionCompleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCancelRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionExpire");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionExpireRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionExpireResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionBalanceEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionBalanceEmailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionBalanceEmailRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionBalanceEmailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionBalanceEmailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransactionExpireEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionExpireEmailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireEmailRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireEmailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionExpireEmailResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsCouponRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCouponRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCouponResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsCouponResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsLinkRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsLinkRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsLinkResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsLinkResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsCustomerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsCustomerLinkRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerLinkRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerLinkResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsCustomerLinkResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsReferfriendsCustomerCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsCustomerCouponRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerCouponRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerCouponResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsReferfriendsCustomerCouponResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferListRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferListRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransferListRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferListResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferListResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferAddRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferAddRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferAddResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferAddResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferCompleteRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCompleteRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCompleteResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferCompleteResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferCancelRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCancelRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCancelResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferCancelResponseParam"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rewardpointsTransferTransferEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferTransferEmailRequestParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferTransferEmailRequestParam"), br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailRequestParam.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferTransferEmailResponseParam"));
        oper.setReturnClass(br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferTransferEmailResponseParam"));
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
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">callParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CallParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">callResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CallResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignedProductsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignedProductsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAssignProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeOptionsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryAttributeOptionsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryLevelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryLevelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryMoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryMoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryRemoveProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryRemoveProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryTreeRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryTreeResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogCategoryUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemMultiUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemMultiUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogInventoryStockItemUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeAddOptionRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeAddOptionResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeGroupPriceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeGroupPriceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeGroupPriceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeGroupPriceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeGroupPriceUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeGroupPriceUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeGroupPriceUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeGroupPriceUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeMediaUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeOptionsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeOptionsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetAttributeRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRenameRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetGroupRenameResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeSetRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeTierPriceUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductAttributeUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCurrentStoreRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCurrentStoreResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam.class;
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
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductCustomOptionValueUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductDownloadableLinkRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductGetSpecialPriceRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductGetSpecialPriceResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAssignRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAssignResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAttributesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkAttributesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkTypesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkTypesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductLinkUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductMultiUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductMultiUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductSetSpecialPriceRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductSetSpecialPriceResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTagUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTypeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTypeListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductTypeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">catalogProductUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerAddressUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerDeleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerDeleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerCustomerUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerGroupListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerGroupListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">customerGroupListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryCountryListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryCountryListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryCountryListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryRegionListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryRegionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">directoryRegionListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">endSessionParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.EndSessionParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">endSessionResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.EndSessionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteItemRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteItemResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteProductRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteProductResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">giftMessageForQuoteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">globalFaultsParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GlobalFaultsParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">globalFaultsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">loginParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.LoginParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">loginResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.LoginResponseParam.class;
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
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">magentoInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.MagentoInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">magentoInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">multiCallParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.MultiCallParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">multiCallResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.MultiCallResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourceFaultsParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ResourceFaultsParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourceFaultsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourcesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ResourcesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">resourcesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ResourcesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyemailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyemailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyidRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetbalancebyidResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomerbyemailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomerbyemailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomeridbyemailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomeridbyemailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomersbalanceRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsCustomerGetcustomersbalanceResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCouponRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCouponResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerCouponRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerCouponResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerLinkRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsCustomerLinkResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsLinkRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsReferfriendsLinkResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionBalanceEmailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionBalanceEmailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCompleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionCompleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireEmailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireEmailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionExpireResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransactionListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCompleteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferCompleteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferTransferEmailRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">rewardpointsTransferTransferEmailResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderCreditmemoListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderHoldRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderHoldRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderHoldResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCancelRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCancelResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCaptureRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCaptureResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceVoidRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderInvoiceVoidResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddCommentRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddCommentResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddTrackRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentAddTrackResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentGetCarriersRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentGetCarriersResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentRemoveTrackRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentRemoveTrackResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentSendInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderShipmentSendInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam.class;
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
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderUnholdRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderUnholdRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">salesOrderUnholdResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCouponRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCreateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCreateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCreateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerAddressesRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerAddressesResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerSetRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartCustomerSetResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartLicenseRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartLicenseResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartOrderRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartOrderRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartOrderResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentMethodRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartPaymentMethodResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductAddRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductAddResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductMoveToCustomerQuoteRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductMoveToCustomerQuoteResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductRemoveRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductRemoveResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductUpdateRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartProductUpdateResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingMethodRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartShippingMethodResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartTotalsRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">shoppingCartTotalsResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">startSessionResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StartSessionResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeInfoRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StoreInfoRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeInfoResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeListRequestParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StoreListRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", ">storeListResponseParam");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StoreListResponseParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "apiEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ApiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "apiMethodEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ApiMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfApiMethods");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ApiMethodEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "apiMethodEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfApis");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ApiEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "apiEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfCatalogCategoryEntities");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfCatalogCategoryEntitiesNoChildren");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryEntityNoChildren[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryEntityNoChildren");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfExistsFaltures");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ExistsFaltureEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "existsFaltureEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "associativeArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.AssociativeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "associativeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "associativeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.AssociativeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "associativeMultiArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.AssociativeMultiEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "associativeMultiEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "associativeMultiEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.AssociativeMultiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAssignedProduct");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogAssignedProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAssignedProductArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogAssignedProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAssignedProduct");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAttributeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAttributeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogAttributeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAttributeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAttributeOptionEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogAttributeOptionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAttributeOptionEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogAttributeOptionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogAttributeOptionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryEntityCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryEntityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryEntityNoChildren");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryEntityNoChildren.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryInfo");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogCategoryTree");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogCategoryTree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemUpdateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemUpdateEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogInventoryStockItemUpdateEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeEntityToCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeEntityToCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeEntityToUpdate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeEntityToUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeFrontendLabelArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeFrontendLabelEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeFrontendLabelEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeFrontendLabelEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeFrontendLabelEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaCreateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaTypeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaTypeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeMediaTypeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeOptionEntityToAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionEntityToAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeOptionLabelArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionLabelEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeOptionLabelEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeOptionLabelEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionLabelEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductAttributeSetEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCreateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCreateEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCreateEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionAdditionalFieldsArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAdditionalFieldsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionAdditionalFieldsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionAdditionalFieldsEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAdditionalFieldsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionListArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionToAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionToAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionToUpdate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionToUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionTypesArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionTypesEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionTypesEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueAddArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueAddEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueAddEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueListArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListEntity.class;
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
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductCustomOptionValueUpdateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkAddEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkAddSampleEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddSampleEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkFileEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkFileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkFileInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkFileInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkFileInfoEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkFileInfoEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkFileInfoEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkSampleEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkSampleEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkSampleEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkSampleEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductDownloadableLinkSampleEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductGroupPriceEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductGroupPriceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductGroupPriceEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductGroupPriceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductGroupPriceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductImageEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductImageEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductImageEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductImageEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductImageEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductImageFileEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductImageFileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAttributeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAttributeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkAttributeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductLinkEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductLinkEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductRequestAttributes");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductRequestAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductReturnEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductReturnEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductSpecialPriceReturnEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductSpecialPriceReturnEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagAddEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagAddEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagListEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTagUpdateEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTierPriceEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTierPriceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTierPriceEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTierPriceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTierPriceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTypeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTypeEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTypeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductTypeEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductTypeEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "complexFilter");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ComplexFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "complexFilterArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ComplexFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "complexFilter");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "complexMultiArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ComplexMultiFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "complexMultiFilter");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "complexMultiFilter");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ComplexMultiFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressEntityItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressEntityItem");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressEntityCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressEntityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerAddressEntityItem");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerAddressEntityItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerCustomerEntityToCreate");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerCustomerEntityToCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerGroupEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerGroupEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerGroupEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CustomerGroupEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "customerGroupEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryCountryEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryCountryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryCountryEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryCountryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryCountryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryRegionEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryRegionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryRegionEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.DirectoryRegionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "directoryRegionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "existsFaltureEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ExistsFaltureEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "filters");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.Filters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageAssociativeProductsEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageAssociativeProductsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageAssociativeProductsEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageAssociativeProductsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageAssociativeProductsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageResponse");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageResponseArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.GiftMessageResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "giftMessageResponse");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "magentoInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.MagentoInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "orderItemIdQty");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.OrderItemIdQty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "orderItemIdQtyArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.OrderItemIdQty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "orderItemIdQty");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsCustomerEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsCustomerEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransactionEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTranstionEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTranstionEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferAdd");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTransferEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTransferEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "rewardpointsTranstionEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.RewardpointsTranstionEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderAddressEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCommentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoData");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderCreditmemoItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCommentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderInvoiceItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderListEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderListEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderListEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderListEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderPaymentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderPaymentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentCommentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCommentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentCommentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCommentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentCommentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentTrackEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentTrackEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentTrackEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderShipmentTrackEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderShipmentTrackEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderStatusHistoryEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderStatusHistoryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderStatusHistoryEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.SalesOrderStatusHistoryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "salesOrderStatusHistoryEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartAddressEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartAddressEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerAddressEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressEntity.class;
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
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerAddressEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerAddressEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartCustomerEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartInfoEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartInfoEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartItemEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartItemEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartItemEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartItemEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartItemEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartLicenseEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartLicenseEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartLicenseEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentMethodEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentMethodResponseEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentMethodResponseEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartPaymentMethodResponseEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartProductResponseEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.CatalogProductEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "catalogProductEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingMethodEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingMethodEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartShippingMethodEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartTotalsEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartTotalsEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "shoppingCartTotalsEntity");
            qName2 = new javax.xml.namespace.QName("", "complexObjectArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeEntity");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StoreEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeEntityArray");
            cachedSerQNames.add(qName);
            cls = br.com.mind.magento.ClientWithWSI.StoreEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:br.com.mind.magento.ClientWithoutWSI", "storeEntity");
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

    public br.com.mind.magento.ClientWithWSI.CallResponseParam call(br.com.mind.magento.ClientWithWSI.CallParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CallResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CallResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CallResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.MultiCallResponseParam multiCall(br.com.mind.magento.ClientWithWSI.MultiCallParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.MultiCallResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.MultiCallResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.MultiCallResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.EndSessionResponseParam endSession(br.com.mind.magento.ClientWithWSI.EndSessionParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.EndSessionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.EndSessionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.EndSessionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.LoginResponseParam login(br.com.mind.magento.ClientWithWSI.LoginParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.LoginResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.LoginResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.LoginResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.StartSessionResponseParam startSession() throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.StartSessionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.StartSessionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.StartSessionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ResourcesResponseParam resources(br.com.mind.magento.ClientWithWSI.ResourcesRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ResourcesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ResourcesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ResourcesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam globalFaults(br.com.mind.magento.ClientWithWSI.GlobalFaultsParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam resourceFaults(br.com.mind.magento.ClientWithWSI.ResourceFaultsParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.StoreListResponseParam storeList(br.com.mind.magento.ClientWithWSI.StoreListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.StoreListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.StoreListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.StoreListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam storeInfo(br.com.mind.magento.ClientWithWSI.StoreInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam magentoInfo(br.com.mind.magento.ClientWithWSI.MagentoInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam directoryCountryList(br.com.mind.magento.ClientWithWSI.DirectoryCountryListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam directoryRegionList(br.com.mind.magento.ClientWithWSI.DirectoryRegionListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam customerCustomerList(br.com.mind.magento.ClientWithWSI.CustomerCustomerListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam customerCustomerCreate(br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam customerCustomerInfo(br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam customerCustomerUpdate(br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam customerCustomerDelete(br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam customerGroupList(br.com.mind.magento.ClientWithWSI.CustomerGroupListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam customerAddressList(br.com.mind.magento.ClientWithWSI.CustomerAddressListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam customerAddressCreate(br.com.mind.magento.ClientWithWSI.CustomerAddressCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam customerAddressInfo(br.com.mind.magento.ClientWithWSI.CustomerAddressInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam customerAddressUpdate(br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam customerAddressDelete(br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam catalogCategoryCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam catalogCategoryTree(br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam catalogCategoryLevel(br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam catalogCategoryInfo(br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam catalogCategoryCreate(br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam catalogCategoryUpdate(br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam catalogCategoryMove(br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam catalogCategoryDelete(br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam catalogCategoryAssignedProducts(br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam catalogCategoryAssignProduct(br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam catalogCategoryUpdateProduct(br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam catalogCategoryRemoveProduct(br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam catalogProductCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam catalogProductList(br.com.mind.magento.ClientWithWSI.CatalogProductListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam catalogProductInfo(br.com.mind.magento.ClientWithWSI.CatalogProductInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam catalogProductCreate(br.com.mind.magento.ClientWithWSI.CatalogProductCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam catalogProductUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam catalogProductMultiUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam catalogProductSetSpecialPrice(br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam catalogProductGetSpecialPrice(br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam catalogProductDelete(br.com.mind.magento.ClientWithWSI.CatalogProductDeleteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam catalogProductAttributeCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam catalogProductAttributeList(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam catalogProductAttributeOptions(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam catalogProductCustomOptionAdd(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam catalogProductCustomOptionUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam catalogProductCustomOptionTypes(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam catalogProductCustomOptionList(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam catalogProductCustomOptionInfo(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam catalogProductCustomOptionRemove(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam catalogProductCustomOptionValueList(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam catalogProductCustomOptionValueInfo(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam catalogProductCustomOptionValueAdd(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam catalogProductCustomOptionValueUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam catalogProductCustomOptionValueRemove(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam catalogProductAttributeSetCreate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam catalogProductAttributeSetRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam catalogProductAttributeSetList(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam catalogProductAttributeSetAttributeAdd(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam catalogProductAttributeSetAttributeRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam catalogProductAttributeAddOption(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam catalogProductAttributeSetGroupAdd(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam catalogProductAttributeSetGroupRename(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam catalogProductAttributeSetGroupRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam catalogProductTypeList(br.com.mind.magento.ClientWithWSI.CatalogProductTypeListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam catalogProductAttributeTierPriceInfo(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam catalogProductAttributeTierPriceUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam catalogCategoryAttributeCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam catalogCategoryAttributeList(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam catalogCategoryAttributeOptions(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam catalogProductAttributeMediaCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam catalogProductAttributeMediaList(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam catalogProductAttributeMediaInfo(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam catalogProductAttributeMediaTypes(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam catalogProductAttributeMediaCreate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam catalogProductAttributeMediaUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam catalogProductAttributeMediaRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam catalogProductLinkList(br.com.mind.magento.ClientWithWSI.CatalogProductLinkListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam catalogProductLinkAssign(br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam catalogProductLinkUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam catalogProductLinkRemove(br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam catalogProductLinkTypes(br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam catalogProductLinkAttributes(br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam catalogProductAttributeCreate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam catalogProductAttributeRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam catalogProductAttributeInfo(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam catalogProductAttributeUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam salesOrderList(br.com.mind.magento.ClientWithWSI.SalesOrderListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam salesOrderInfo(br.com.mind.magento.ClientWithWSI.SalesOrderInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam salesOrderAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam salesOrderHold(br.com.mind.magento.ClientWithWSI.SalesOrderHoldRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam salesOrderUnhold(br.com.mind.magento.ClientWithWSI.SalesOrderUnholdRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam salesOrderCancel(br.com.mind.magento.ClientWithWSI.SalesOrderCancelRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam salesOrderShipmentList(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam salesOrderShipmentInfo(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam salesOrderShipmentCreate(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam salesOrderShipmentAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam salesOrderShipmentAddTrack(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam salesOrderShipmentRemoveTrack(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam salesOrderShipmentSendInfo(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam salesOrderShipmentGetCarriers(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam salesOrderInvoiceList(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam salesOrderInvoiceInfo(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam salesOrderInvoiceCreate(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam salesOrderInvoiceAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam salesOrderInvoiceCapture(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam salesOrderInvoiceVoid(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam salesOrderInvoiceCancel(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam salesOrderCreditmemoList(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam salesOrderCreditmemoInfo(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam salesOrderCreditmemoCreate(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam salesOrderCreditmemoAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam salesOrderCreditmemoCancel(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam catalogInventoryStockItemList(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam catalogInventoryStockItemUpdate(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam catalogInventoryStockItemMultiUpdate(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam shoppingCartCreate(br.com.mind.magento.ClientWithWSI.ShoppingCartCreateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam shoppingCartInfo(br.com.mind.magento.ClientWithWSI.ShoppingCartInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam shoppingCartTotals(br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam shoppingCartOrder(br.com.mind.magento.ClientWithWSI.ShoppingCartOrderRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam shoppingCartLicense(br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam shoppingCartProductAdd(br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam shoppingCartProductUpdate(br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam shoppingCartProductRemove(br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam shoppingCartProductList(br.com.mind.magento.ClientWithWSI.ShoppingCartProductListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam shoppingCartProductMoveToCustomerQuote(br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam shoppingCartCustomerSet(br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam shoppingCartCustomerAddresses(br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam shoppingCartShippingMethod(br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam shoppingCartShippingList(br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam shoppingCartPaymentMethod(br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam shoppingCartPaymentList(br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam shoppingCartCouponAdd(br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam shoppingCartCouponRemove(br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam catalogProductTagList(br.com.mind.magento.ClientWithWSI.CatalogProductTagListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam catalogProductTagInfo(br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam catalogProductTagAdd(br.com.mind.magento.ClientWithWSI.CatalogProductTagAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam catalogProductTagUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam catalogProductTagRemove(br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam giftMessageSetForQuote(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam giftMessageSetForQuoteItem(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam giftMessageSetForQuoteProduct(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam catalogProductDownloadableLinkAdd(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam catalogProductDownloadableLinkList(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam catalogProductDownloadableLinkRemove(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam rewardpointsCustomerGetcustomerbyemail(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam rewardpointsCustomerGetcustomeridbyemail(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam rewardpointsCustomerGetbalancebyemail(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam rewardpointsCustomerGetbalancebyid(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam rewardpointsCustomerGetcustomersbalance(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam rewardpointsTransactionList(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam rewardpointsTransactionAdd(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam rewardpointsTransactionComplete(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam rewardpointsTransactionCancel(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam rewardpointsTransactionExpire(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam rewardpointsTransactionBalanceEmail(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam rewardpointsTransactionExpireEmail(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam rewardpointsReferfriendsCoupon(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam rewardpointsReferfriendsLink(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam rewardpointsReferfriendsCustomerLink(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam rewardpointsReferfriendsCustomerCoupon(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam rewardpointsTransferList(br.com.mind.magento.ClientWithWSI.RewardpointsTransferListRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam rewardpointsTransferAdd(br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam rewardpointsTransferComplete(br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam rewardpointsTransferCancel(br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam rewardpointsTransferTransferEmail(br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailRequestParam parameters) throws java.rmi.RemoteException {
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
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
