/**
 * Mage_Api_Model_Server_Wsi_HandlerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.ClientWithWSI;

public interface Mage_Api_Model_Server_Wsi_HandlerPortType extends java.rmi.Remote {

    /**
     * Call api functionality
     */
    public br.com.mind.magento.ClientWithWSI.CallResponseParam call(br.com.mind.magento.ClientWithWSI.CallParam parameters) throws java.rmi.RemoteException;

    /**
     * Multiple calls of resource functionality
     */
    public br.com.mind.magento.ClientWithWSI.MultiCallResponseParam multiCall(br.com.mind.magento.ClientWithWSI.MultiCallParam parameters) throws java.rmi.RemoteException;

    /**
     * End web service session
     */
    public br.com.mind.magento.ClientWithWSI.EndSessionResponseParam endSession(br.com.mind.magento.ClientWithWSI.EndSessionParam parameters) throws java.rmi.RemoteException;

    /**
     * Login user and retrive session id
     */
    public br.com.mind.magento.ClientWithWSI.LoginResponseParam login(br.com.mind.magento.ClientWithWSI.LoginParam parameters) throws java.rmi.RemoteException;

    /**
     * Start web service session
     */
    public br.com.mind.magento.ClientWithWSI.StartSessionResponseParam startSession() throws java.rmi.RemoteException;

    /**
     * List of available resources
     */
    public br.com.mind.magento.ClientWithWSI.ResourcesResponseParam resources(br.com.mind.magento.ClientWithWSI.ResourcesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of global faults
     */
    public br.com.mind.magento.ClientWithWSI.GlobalFaultsResponseParam globalFaults(br.com.mind.magento.ClientWithWSI.GlobalFaultsParam parameters) throws java.rmi.RemoteException;

    /**
     * List of resource faults
     */
    public br.com.mind.magento.ClientWithWSI.ResourceFaultsResponseParam resourceFaults(br.com.mind.magento.ClientWithWSI.ResourceFaultsParam parameters) throws java.rmi.RemoteException;

    /**
     * List of stores
     */
    public br.com.mind.magento.ClientWithWSI.StoreListResponseParam storeList(br.com.mind.magento.ClientWithWSI.StoreListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Store view info
     */
    public br.com.mind.magento.ClientWithWSI.StoreInfoResponseParam storeInfo(br.com.mind.magento.ClientWithWSI.StoreInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Info about current Magento installation
     */
    public br.com.mind.magento.ClientWithWSI.MagentoInfoResponseParam magentoInfo(br.com.mind.magento.ClientWithWSI.MagentoInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of countries
     */
    public br.com.mind.magento.ClientWithWSI.DirectoryCountryListResponseParam directoryCountryList(br.com.mind.magento.ClientWithWSI.DirectoryCountryListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of regions in specified country
     */
    public br.com.mind.magento.ClientWithWSI.DirectoryRegionListResponseParam directoryRegionList(br.com.mind.magento.ClientWithWSI.DirectoryRegionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customers
     */
    public br.com.mind.magento.ClientWithWSI.CustomerCustomerListResponseParam customerCustomerList(br.com.mind.magento.ClientWithWSI.CustomerCustomerListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create customer
     */
    public br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateResponseParam customerCustomerCreate(br.com.mind.magento.ClientWithWSI.CustomerCustomerCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer data
     */
    public br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoResponseParam customerCustomerInfo(br.com.mind.magento.ClientWithWSI.CustomerCustomerInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update customer data
     */
    public br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateResponseParam customerCustomerUpdate(br.com.mind.magento.ClientWithWSI.CustomerCustomerUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete customer
     */
    public br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteResponseParam customerCustomerDelete(br.com.mind.magento.ClientWithWSI.CustomerCustomerDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer groups
     */
    public br.com.mind.magento.ClientWithWSI.CustomerGroupListResponseParam customerGroupList(br.com.mind.magento.ClientWithWSI.CustomerGroupListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer addresses
     */
    public br.com.mind.magento.ClientWithWSI.CustomerAddressListResponseParam customerAddressList(br.com.mind.magento.ClientWithWSI.CustomerAddressListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create customer address
     */
    public br.com.mind.magento.ClientWithWSI.CustomerAddressCreateResponseParam customerAddressCreate(br.com.mind.magento.ClientWithWSI.CustomerAddressCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer address data
     */
    public br.com.mind.magento.ClientWithWSI.CustomerAddressInfoResponseParam customerAddressInfo(br.com.mind.magento.ClientWithWSI.CustomerAddressInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update customer address data
     */
    public br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateResponseParam customerAddressUpdate(br.com.mind.magento.ClientWithWSI.CustomerAddressUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete customer address
     */
    public br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteResponseParam customerAddressDelete(br.com.mind.magento.ClientWithWSI.CustomerAddressDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set_Get current store view
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreResponseParam catalogCategoryCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogCategoryCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeResponseParam catalogCategoryTree(br.com.mind.magento.ClientWithWSI.CatalogCategoryTreeRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelResponseParam catalogCategoryLevel(br.com.mind.magento.ClientWithWSI.CatalogCategoryLevelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoResponseParam catalogCategoryInfo(br.com.mind.magento.ClientWithWSI.CatalogCategoryInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new category and return its id.
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateResponseParam catalogCategoryCreate(br.com.mind.magento.ClientWithWSI.CatalogCategoryCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update category
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateResponseParam catalogCategoryUpdate(br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Move category in tree
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveResponseParam catalogCategoryMove(br.com.mind.magento.ClientWithWSI.CatalogCategoryMoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete category
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteResponseParam catalogCategoryDelete(br.com.mind.magento.ClientWithWSI.CatalogCategoryDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of assigned products
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsResponseParam catalogCategoryAssignedProducts(br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignedProductsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Assign product to category
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductResponseParam catalogCategoryAssignProduct(br.com.mind.magento.ClientWithWSI.CatalogCategoryAssignProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update assigned product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductResponseParam catalogCategoryUpdateProduct(br.com.mind.magento.ClientWithWSI.CatalogCategoryUpdateProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product assignment from category
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductResponseParam catalogCategoryRemoveProduct(br.com.mind.magento.ClientWithWSI.CatalogCategoryRemoveProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreResponseParam catalogCategoryAttributeCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve category attributes
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListResponseParam catalogCategoryAttributeList(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsResponseParam catalogCategoryAttributeOptions(br.com.mind.magento.ClientWithWSI.CatalogCategoryAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreResponseParam catalogProductCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogProductCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve products list by filters
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductListResponseParam catalogProductList(br.com.mind.magento.ClientWithWSI.CatalogProductListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductInfoResponseParam catalogProductInfo(br.com.mind.magento.ClientWithWSI.CatalogProductInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new product and return product id
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCreateResponseParam catalogProductCreate(br.com.mind.magento.ClientWithWSI.CatalogProductCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductUpdateResponseParam catalogProductUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Product multi update
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateResponseParam catalogProductMultiUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductMultiUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product special price
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceResponseParam catalogProductSetSpecialPrice(br.com.mind.magento.ClientWithWSI.CatalogProductSetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get product special price data
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceResponseParam catalogProductGetSpecialPrice(br.com.mind.magento.ClientWithWSI.CatalogProductGetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductDeleteResponseParam catalogProductDelete(br.com.mind.magento.ClientWithWSI.CatalogProductDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreResponseParam catalogProductAttributeCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute list
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListResponseParam catalogProductAttributeList(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsResponseParam catalogProductAttributeOptions(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new custom option into product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddResponseParam catalogProductCustomOptionAdd(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product custom option
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateResponseParam catalogProductCustomOptionUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available custom option types
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesResponseParam catalogProductCustomOptionTypes(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of product custom options
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListResponseParam catalogProductCustomOptionList(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get full information about custom option in product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoResponseParam catalogProductCustomOptionInfo(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove custom option
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveResponseParam catalogProductCustomOptionRemove(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve custom option values list
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListResponseParam catalogProductCustomOptionValueList(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new custom option values
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddResponseParam catalogProductCustomOptionValueAdd(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve custom option value info
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoResponseParam catalogProductCustomOptionValueInfo(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update custom option value
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateResponseParam catalogProductCustomOptionValueUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove value from custom option
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveResponseParam catalogProductCustomOptionValueRemove(br.com.mind.magento.ClientWithWSI.CatalogProductCustomOptionValueRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create product attribute set based on another set
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateResponseParam catalogProductAttributeSetCreate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product attribute set
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveResponseParam catalogProductAttributeSetRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product attribute sets
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListResponseParam catalogProductAttributeSetList(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add attribute into attribute set
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddResponseParam catalogProductAttributeSetAttributeAdd(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add option to attribute
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionResponseParam catalogProductAttributeAddOption(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeAddOptionRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove attribute from attribute set
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveResponseParam catalogProductAttributeSetAttributeRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create group within existing attribute set
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddResponseParam catalogProductAttributeSetGroupAdd(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Rename existing group
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameResponseParam catalogProductAttributeSetGroupRename(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRenameRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove group from attribute set
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveResponseParam catalogProductAttributeSetGroupRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeSetGroupRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product types
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductTypeListResponseParam catalogProductTypeList(br.com.mind.magento.ClientWithWSI.CatalogProductTypeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product tier prices
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoResponseParam catalogProductAttributeTierPriceInfo(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product tier prices
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateResponseParam catalogProductAttributeTierPriceUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeTierPriceUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreResponseParam catalogProductAttributeMediaCurrentStore(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image list
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListResponseParam catalogProductAttributeMediaList(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image data
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoResponseParam catalogProductAttributeMediaInfo(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image types
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesResponseParam catalogProductAttributeMediaTypes(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Upload new product image
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateResponseParam catalogProductAttributeMediaCreate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product image
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateResponseParam catalogProductAttributeMediaUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product image
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveResponseParam catalogProductAttributeMediaRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeMediaRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve linked products
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkListResponseParam catalogProductLinkList(br.com.mind.magento.ClientWithWSI.CatalogProductLinkListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Assign product link
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignResponseParam catalogProductLinkAssign(br.com.mind.magento.ClientWithWSI.CatalogProductLinkAssignRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product link
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateResponseParam catalogProductLinkUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductLinkUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product link
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveResponseParam catalogProductLinkRemove(br.com.mind.magento.ClientWithWSI.CatalogProductLinkRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product link types
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesResponseParam catalogProductLinkTypes(br.com.mind.magento.ClientWithWSI.CatalogProductLinkTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product link type attributes
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesResponseParam catalogProductLinkAttributes(br.com.mind.magento.ClientWithWSI.CatalogProductLinkAttributesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new attribute
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateResponseParam catalogProductAttributeCreate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update attribute
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateResponseParam catalogProductAttributeUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete attribute
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveResponseParam catalogProductAttributeRemove(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get full information about attribute with list of options
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoResponseParam catalogProductAttributeInfo(br.com.mind.magento.ClientWithWSI.CatalogProductAttributeInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of orders by filters
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderListResponseParam salesOrderList(br.com.mind.magento.ClientWithWSI.SalesOrderListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve order information
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInfoResponseParam salesOrderInfo(br.com.mind.magento.ClientWithWSI.SalesOrderInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add comment to order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentResponseParam salesOrderAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Hold order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderHoldResponseParam salesOrderHold(br.com.mind.magento.ClientWithWSI.SalesOrderHoldRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Unhold order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderUnholdResponseParam salesOrderUnhold(br.com.mind.magento.ClientWithWSI.SalesOrderUnholdRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCancelResponseParam salesOrderCancel(br.com.mind.magento.ClientWithWSI.SalesOrderCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of shipments by filters
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListResponseParam salesOrderShipmentList(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve shipment information
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoResponseParam salesOrderShipmentInfo(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new shipment for order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateResponseParam salesOrderShipmentCreate(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentResponseParam salesOrderShipmentAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new tracking number
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackResponseParam salesOrderShipmentAddTrack(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentAddTrackRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove tracking number
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackResponseParam salesOrderShipmentRemoveTrack(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentRemoveTrackRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send shipment info
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoResponseParam salesOrderShipmentSendInfo(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentSendInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of allowed carriers for order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersResponseParam salesOrderShipmentGetCarriers(br.com.mind.magento.ClientWithWSI.SalesOrderShipmentGetCarriersRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of invoices by filters
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListResponseParam salesOrderInvoiceList(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve invoice information
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoResponseParam salesOrderInvoiceInfo(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new invoice for order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateResponseParam salesOrderInvoiceCreate(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentResponseParam salesOrderInvoiceAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Capture invoice
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureResponseParam salesOrderInvoiceCapture(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCaptureRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Void invoice
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidResponseParam salesOrderInvoiceVoid(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceVoidRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel invoice
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelResponseParam salesOrderInvoiceCancel(br.com.mind.magento.ClientWithWSI.SalesOrderInvoiceCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of creditmemos by filters
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListResponseParam salesOrderCreditmemoList(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve creditmemo information
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoResponseParam salesOrderCreditmemoInfo(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new creditmemo for order
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateResponseParam salesOrderCreditmemoCreate(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to creditmemo
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentResponseParam salesOrderCreditmemoAddComment(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel creditmemo
     */
    public br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelResponseParam salesOrderCreditmemoCancel(br.com.mind.magento.ClientWithWSI.SalesOrderCreditmemoCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve stock data by product ids
     */
    public br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListResponseParam catalogInventoryStockItemList(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product stock data
     */
    public br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateResponseParam catalogInventoryStockItemUpdate(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Multi update product stock data
     */
    public br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateResponseParam catalogInventoryStockItemMultiUpdate(br.com.mind.magento.ClientWithWSI.CatalogInventoryStockItemMultiUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartCreateResponseParam shoppingCartCreate(br.com.mind.magento.ClientWithWSI.ShoppingCartCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve information about shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartInfoResponseParam shoppingCartInfo(br.com.mind.magento.ClientWithWSI.ShoppingCartInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create an order from shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartOrderResponseParam shoppingCartOrder(br.com.mind.magento.ClientWithWSI.ShoppingCartOrderRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get total prices for shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsResponseParam shoppingCartTotals(br.com.mind.magento.ClientWithWSI.ShoppingCartTotalsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get terms and conditions
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseResponseParam shoppingCartLicense(br.com.mind.magento.ClientWithWSI.ShoppingCartLicenseRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add product(s) to shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddResponseParam shoppingCartProductAdd(br.com.mind.magento.ClientWithWSI.ShoppingCartProductAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product(s) quantities in shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateResponseParam shoppingCartProductUpdate(br.com.mind.magento.ClientWithWSI.ShoppingCartProductUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product(s) from shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveResponseParam shoppingCartProductRemove(br.com.mind.magento.ClientWithWSI.ShoppingCartProductRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of products in shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductListResponseParam shoppingCartProductList(br.com.mind.magento.ClientWithWSI.ShoppingCartProductListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Move product(s) to customer quote
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteResponseParam shoppingCartProductMoveToCustomerQuote(br.com.mind.magento.ClientWithWSI.ShoppingCartProductMoveToCustomerQuoteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set customer for shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetResponseParam shoppingCartCustomerSet(br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerSetRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set customer's addresses in shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesResponseParam shoppingCartCustomerAddresses(br.com.mind.magento.ClientWithWSI.ShoppingCartCustomerAddressesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set shipping method
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodResponseParam shoppingCartShippingMethod(br.com.mind.magento.ClientWithWSI.ShoppingCartShippingMethodRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available shipping methods
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListResponseParam shoppingCartShippingList(br.com.mind.magento.ClientWithWSI.ShoppingCartShippingListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set payment method
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodResponseParam shoppingCartPaymentMethod(br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentMethodRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available payment methods
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListResponseParam shoppingCartPaymentList(br.com.mind.magento.ClientWithWSI.ShoppingCartPaymentListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add coupon code for shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddResponseParam shoppingCartCouponAdd(br.com.mind.magento.ClientWithWSI.ShoppingCartCouponAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove coupon code from shopping cart
     */
    public br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveResponseParam shoppingCartCouponRemove(br.com.mind.magento.ClientWithWSI.ShoppingCartCouponRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of tags by product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductTagListResponseParam catalogProductTagList(br.com.mind.magento.ClientWithWSI.CatalogProductTagListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product tag info
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoResponseParam catalogProductTagInfo(br.com.mind.magento.ClientWithWSI.CatalogProductTagInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add tag(s) to product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductTagAddResponseParam catalogProductTagAdd(br.com.mind.magento.ClientWithWSI.CatalogProductTagAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product tag
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateResponseParam catalogProductTagUpdate(br.com.mind.magento.ClientWithWSI.CatalogProductTagUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product tag
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveResponseParam catalogProductTagRemove(br.com.mind.magento.ClientWithWSI.CatalogProductTagRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set a gift message to the cart
     */
    public br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteResponseParam giftMessageSetForQuote(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote item
     */
    public br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemResponseParam giftMessageSetForQuoteItem(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteItemRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote items by products
     */
    public br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductResponseParam giftMessageSetForQuoteProduct(br.com.mind.magento.ClientWithWSI.GiftMessageForQuoteProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add links to downloadable product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddResponseParam catalogProductDownloadableLinkAdd(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of links and samples for downloadable product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListResponseParam catalogProductDownloadableLinkList(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove links and samples from downloadable product
     */
    public br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveResponseParam catalogProductDownloadableLinkRemove(br.com.mind.magento.ClientWithWSI.CatalogProductDownloadableLinkRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer by email
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailResponseParam rewardpointsCustomerGetcustomerbyemail(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomerbyemailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer Id by email
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailResponseParam rewardpointsCustomerGetcustomeridbyemail(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomeridbyemailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get balance by email
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailResponseParam rewardpointsCustomerGetbalancebyemail(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyemailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get balance by customer Id
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidResponseParam rewardpointsCustomerGetbalancebyid(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetbalancebyidRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get balance by customers
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceResponseParam rewardpointsCustomerGetcustomersbalance(br.com.mind.magento.ClientWithWSI.RewardpointsCustomerGetcustomersbalanceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListResponseParam rewardpointsTransactionList(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddResponseParam rewardpointsTransactionAdd(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Complete transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteResponseParam rewardpointsTransactionComplete(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCompleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelResponseParam rewardpointsTransactionCancel(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Expire transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireResponseParam rewardpointsTransactionExpire(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send update balance email transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailResponseParam rewardpointsTransactionBalanceEmail(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionBalanceEmailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send email before expire transactions
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailResponseParam rewardpointsTransactionExpireEmail(br.com.mind.magento.ClientWithWSI.RewardpointsTransactionExpireEmailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get coupon by customer
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponResponseParam rewardpointsReferfriendsCoupon(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCouponRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get link by customer
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkResponseParam rewardpointsReferfriendsLink(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsLinkRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer by coupon
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponResponseParam rewardpointsReferfriendsCustomerCoupon(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerCouponRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer by link
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkResponseParam rewardpointsReferfriendsCustomerLink(br.com.mind.magento.ClientWithWSI.RewardpointsReferfriendsCustomerLinkRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get transfer
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferListResponseParam rewardpointsTransferList(br.com.mind.magento.ClientWithWSI.RewardpointsTransferListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add transfer
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddResponseParam rewardpointsTransferAdd(br.com.mind.magento.ClientWithWSI.RewardpointsTransferAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Complete transfer
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteResponseParam rewardpointsTransferComplete(br.com.mind.magento.ClientWithWSI.RewardpointsTransferCompleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel transfer
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelResponseParam rewardpointsTransferCancel(br.com.mind.magento.ClientWithWSI.RewardpointsTransferCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send transfer email
     */
    public br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailResponseParam rewardpointsTransferTransferEmail(br.com.mind.magento.ClientWithWSI.RewardpointsTransferTransferEmailRequestParam parameters) throws java.rmi.RemoteException;
}
