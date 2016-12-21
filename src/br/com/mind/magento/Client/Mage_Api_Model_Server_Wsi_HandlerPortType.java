/**
 * Mage_Api_Model_Server_Wsi_HandlerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.Client;

public interface Mage_Api_Model_Server_Wsi_HandlerPortType extends java.rmi.Remote {

    /**
     * Call api functionality
     */
    public br.com.mind.magento.Client.CallResponseParam call(br.com.mind.magento.Client.CallParam parameters) throws java.rmi.RemoteException;

    /**
     * Multiple calls of resource functionality
     */
    public br.com.mind.magento.Client.MultiCallResponseParam multiCall(br.com.mind.magento.Client.MultiCallParam parameters) throws java.rmi.RemoteException;

    /**
     * End web service session
     */
    public br.com.mind.magento.Client.EndSessionResponseParam endSession(br.com.mind.magento.Client.EndSessionParam parameters) throws java.rmi.RemoteException;

    /**
     * Login user and retrive session id
     */
    public br.com.mind.magento.Client.LoginResponseParam login(br.com.mind.magento.Client.LoginParam parameters) throws java.rmi.RemoteException;

    /**
     * Start web service session
     */
    public br.com.mind.magento.Client.StartSessionResponseParam startSession() throws java.rmi.RemoteException;

    /**
     * List of available resources
     */
    public br.com.mind.magento.Client.ResourcesResponseParam resources(br.com.mind.magento.Client.ResourcesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of global faults
     */
    public br.com.mind.magento.Client.GlobalFaultsResponseParam globalFaults(br.com.mind.magento.Client.GlobalFaultsParam parameters) throws java.rmi.RemoteException;

    /**
     * List of resource faults
     */
    public br.com.mind.magento.Client.ResourceFaultsResponseParam resourceFaults(br.com.mind.magento.Client.ResourceFaultsParam parameters) throws java.rmi.RemoteException;

    /**
     * List of stores
     */
    public br.com.mind.magento.Client.StoreListResponseParam storeList(br.com.mind.magento.Client.StoreListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Store view info
     */
    public br.com.mind.magento.Client.StoreInfoResponseParam storeInfo(br.com.mind.magento.Client.StoreInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Info about current Magento installation
     */
    public br.com.mind.magento.Client.MagentoInfoResponseParam magentoInfo(br.com.mind.magento.Client.MagentoInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of countries
     */
    public br.com.mind.magento.Client.DirectoryCountryListResponseParam directoryCountryList(br.com.mind.magento.Client.DirectoryCountryListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * List of regions in specified country
     */
    public br.com.mind.magento.Client.DirectoryRegionListResponseParam directoryRegionList(br.com.mind.magento.Client.DirectoryRegionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customers
     */
    public br.com.mind.magento.Client.CustomerCustomerListResponseParam customerCustomerList(br.com.mind.magento.Client.CustomerCustomerListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create customer
     */
    public br.com.mind.magento.Client.CustomerCustomerCreateResponseParam customerCustomerCreate(br.com.mind.magento.Client.CustomerCustomerCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer data
     */
    public br.com.mind.magento.Client.CustomerCustomerInfoResponseParam customerCustomerInfo(br.com.mind.magento.Client.CustomerCustomerInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update customer data
     */
    public br.com.mind.magento.Client.CustomerCustomerUpdateResponseParam customerCustomerUpdate(br.com.mind.magento.Client.CustomerCustomerUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete customer
     */
    public br.com.mind.magento.Client.CustomerCustomerDeleteResponseParam customerCustomerDelete(br.com.mind.magento.Client.CustomerCustomerDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer groups
     */
    public br.com.mind.magento.Client.CustomerGroupListResponseParam customerGroupList(br.com.mind.magento.Client.CustomerGroupListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer addresses
     */
    public br.com.mind.magento.Client.CustomerAddressListResponseParam customerAddressList(br.com.mind.magento.Client.CustomerAddressListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create customer address
     */
    public br.com.mind.magento.Client.CustomerAddressCreateResponseParam customerAddressCreate(br.com.mind.magento.Client.CustomerAddressCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve customer address data
     */
    public br.com.mind.magento.Client.CustomerAddressInfoResponseParam customerAddressInfo(br.com.mind.magento.Client.CustomerAddressInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update customer address data
     */
    public br.com.mind.magento.Client.CustomerAddressUpdateResponseParam customerAddressUpdate(br.com.mind.magento.Client.CustomerAddressUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete customer address
     */
    public br.com.mind.magento.Client.CustomerAddressDeleteResponseParam customerAddressDelete(br.com.mind.magento.Client.CustomerAddressDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set_Get current store view
     */
    public br.com.mind.magento.Client.CatalogCategoryCurrentStoreResponseParam catalogCategoryCurrentStore(br.com.mind.magento.Client.CatalogCategoryCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public br.com.mind.magento.Client.CatalogCategoryTreeResponseParam catalogCategoryTree(br.com.mind.magento.Client.CatalogCategoryTreeRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public br.com.mind.magento.Client.CatalogCategoryLevelResponseParam catalogCategoryLevel(br.com.mind.magento.Client.CatalogCategoryLevelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve hierarchical tree of categories.
     */
    public br.com.mind.magento.Client.CatalogCategoryInfoResponseParam catalogCategoryInfo(br.com.mind.magento.Client.CatalogCategoryInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new category and return its id.
     */
    public br.com.mind.magento.Client.CatalogCategoryCreateResponseParam catalogCategoryCreate(br.com.mind.magento.Client.CatalogCategoryCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update category
     */
    public br.com.mind.magento.Client.CatalogCategoryUpdateResponseParam catalogCategoryUpdate(br.com.mind.magento.Client.CatalogCategoryUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Move category in tree
     */
    public br.com.mind.magento.Client.CatalogCategoryMoveResponseParam catalogCategoryMove(br.com.mind.magento.Client.CatalogCategoryMoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete category
     */
    public br.com.mind.magento.Client.CatalogCategoryDeleteResponseParam catalogCategoryDelete(br.com.mind.magento.Client.CatalogCategoryDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of assigned products
     */
    public br.com.mind.magento.Client.CatalogCategoryAssignedProductsResponseParam catalogCategoryAssignedProducts(br.com.mind.magento.Client.CatalogCategoryAssignedProductsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Assign product to category
     */
    public br.com.mind.magento.Client.CatalogCategoryAssignProductResponseParam catalogCategoryAssignProduct(br.com.mind.magento.Client.CatalogCategoryAssignProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update assigned product
     */
    public br.com.mind.magento.Client.CatalogCategoryUpdateProductResponseParam catalogCategoryUpdateProduct(br.com.mind.magento.Client.CatalogCategoryUpdateProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product assignment from category
     */
    public br.com.mind.magento.Client.CatalogCategoryRemoveProductResponseParam catalogCategoryRemoveProduct(br.com.mind.magento.Client.CatalogCategoryRemoveProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreResponseParam catalogCategoryAttributeCurrentStore(br.com.mind.magento.Client.CatalogCategoryAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve category attributes
     */
    public br.com.mind.magento.Client.CatalogCategoryAttributeListResponseParam catalogCategoryAttributeList(br.com.mind.magento.Client.CatalogCategoryAttributeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public br.com.mind.magento.Client.CatalogCategoryAttributeOptionsResponseParam catalogCategoryAttributeOptions(br.com.mind.magento.Client.CatalogCategoryAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.Client.CatalogProductCurrentStoreResponseParam catalogProductCurrentStore(br.com.mind.magento.Client.CatalogProductCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve products list by filters
     */
    public br.com.mind.magento.Client.CatalogProductListResponseParam catalogProductList(br.com.mind.magento.Client.CatalogProductListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product
     */
    public br.com.mind.magento.Client.CatalogProductInfoResponseParam catalogProductInfo(br.com.mind.magento.Client.CatalogProductInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new product and return product id
     */
    public br.com.mind.magento.Client.CatalogProductCreateResponseParam catalogProductCreate(br.com.mind.magento.Client.CatalogProductCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product
     */
    public br.com.mind.magento.Client.CatalogProductUpdateResponseParam catalogProductUpdate(br.com.mind.magento.Client.CatalogProductUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Product multi update
     */
    public br.com.mind.magento.Client.CatalogProductMultiUpdateResponseParam catalogProductMultiUpdate(br.com.mind.magento.Client.CatalogProductMultiUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product special price
     */
    public br.com.mind.magento.Client.CatalogProductSetSpecialPriceResponseParam catalogProductSetSpecialPrice(br.com.mind.magento.Client.CatalogProductSetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get product special price data
     */
    public br.com.mind.magento.Client.CatalogProductGetSpecialPriceResponseParam catalogProductGetSpecialPrice(br.com.mind.magento.Client.CatalogProductGetSpecialPriceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete product
     */
    public br.com.mind.magento.Client.CatalogProductDeleteResponseParam catalogProductDelete(br.com.mind.magento.Client.CatalogProductDeleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreResponseParam catalogProductAttributeCurrentStore(br.com.mind.magento.Client.CatalogProductAttributeCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute list
     */
    public br.com.mind.magento.Client.CatalogProductAttributeListResponseParam catalogProductAttributeList(br.com.mind.magento.Client.CatalogProductAttributeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve attribute options
     */
    public br.com.mind.magento.Client.CatalogProductAttributeOptionsResponseParam catalogProductAttributeOptions(br.com.mind.magento.Client.CatalogProductAttributeOptionsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new custom option into product
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionAddResponseParam catalogProductCustomOptionAdd(br.com.mind.magento.Client.CatalogProductCustomOptionAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product custom option
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionUpdateResponseParam catalogProductCustomOptionUpdate(br.com.mind.magento.Client.CatalogProductCustomOptionUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available custom option types
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionTypesResponseParam catalogProductCustomOptionTypes(br.com.mind.magento.Client.CatalogProductCustomOptionTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of product custom options
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionListResponseParam catalogProductCustomOptionList(br.com.mind.magento.Client.CatalogProductCustomOptionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get full information about custom option in product
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionInfoResponseParam catalogProductCustomOptionInfo(br.com.mind.magento.Client.CatalogProductCustomOptionInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove custom option
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionRemoveResponseParam catalogProductCustomOptionRemove(br.com.mind.magento.Client.CatalogProductCustomOptionRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve custom option values list
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionValueListResponseParam catalogProductCustomOptionValueList(br.com.mind.magento.Client.CatalogProductCustomOptionValueListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new custom option values
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionValueAddResponseParam catalogProductCustomOptionValueAdd(br.com.mind.magento.Client.CatalogProductCustomOptionValueAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve custom option value info
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoResponseParam catalogProductCustomOptionValueInfo(br.com.mind.magento.Client.CatalogProductCustomOptionValueInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update custom option value
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateResponseParam catalogProductCustomOptionValueUpdate(br.com.mind.magento.Client.CatalogProductCustomOptionValueUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove value from custom option
     */
    public br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveResponseParam catalogProductCustomOptionValueRemove(br.com.mind.magento.Client.CatalogProductCustomOptionValueRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create product attribute set based on another set
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetCreateResponseParam catalogProductAttributeSetCreate(br.com.mind.magento.Client.CatalogProductAttributeSetCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product attribute set
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetRemoveResponseParam catalogProductAttributeSetRemove(br.com.mind.magento.Client.CatalogProductAttributeSetRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product attribute sets
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetListResponseParam catalogProductAttributeSetList(br.com.mind.magento.Client.CatalogProductAttributeSetListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add attribute into attribute set
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddResponseParam catalogProductAttributeSetAttributeAdd(br.com.mind.magento.Client.CatalogProductAttributeSetAttributeAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add option to attribute
     */
    public br.com.mind.magento.Client.CatalogProductAttributeAddOptionResponseParam catalogProductAttributeAddOption(br.com.mind.magento.Client.CatalogProductAttributeAddOptionRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove attribute from attribute set
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveResponseParam catalogProductAttributeSetAttributeRemove(br.com.mind.magento.Client.CatalogProductAttributeSetAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create group within existing attribute set
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddResponseParam catalogProductAttributeSetGroupAdd(br.com.mind.magento.Client.CatalogProductAttributeSetGroupAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Rename existing group
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameResponseParam catalogProductAttributeSetGroupRename(br.com.mind.magento.Client.CatalogProductAttributeSetGroupRenameRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove group from attribute set
     */
    public br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveResponseParam catalogProductAttributeSetGroupRemove(br.com.mind.magento.Client.CatalogProductAttributeSetGroupRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product types
     */
    public br.com.mind.magento.Client.CatalogProductTypeListResponseParam catalogProductTypeList(br.com.mind.magento.Client.CatalogProductTypeListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product tier prices
     */
    public br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoResponseParam catalogProductAttributeTierPriceInfo(br.com.mind.magento.Client.CatalogProductAttributeTierPriceInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product tier prices
     */
    public br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateResponseParam catalogProductAttributeTierPriceUpdate(br.com.mind.magento.Client.CatalogProductAttributeTierPriceUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set/Get current store view
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreResponseParam catalogProductAttributeMediaCurrentStore(br.com.mind.magento.Client.CatalogProductAttributeMediaCurrentStoreRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image list
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaListResponseParam catalogProductAttributeMediaList(br.com.mind.magento.Client.CatalogProductAttributeMediaListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image data
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaInfoResponseParam catalogProductAttributeMediaInfo(br.com.mind.magento.Client.CatalogProductAttributeMediaInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product image types
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaTypesResponseParam catalogProductAttributeMediaTypes(br.com.mind.magento.Client.CatalogProductAttributeMediaTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Upload new product image
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaCreateResponseParam catalogProductAttributeMediaCreate(br.com.mind.magento.Client.CatalogProductAttributeMediaCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product image
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateResponseParam catalogProductAttributeMediaUpdate(br.com.mind.magento.Client.CatalogProductAttributeMediaUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product image
     */
    public br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveResponseParam catalogProductAttributeMediaRemove(br.com.mind.magento.Client.CatalogProductAttributeMediaRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve linked products
     */
    public br.com.mind.magento.Client.CatalogProductLinkListResponseParam catalogProductLinkList(br.com.mind.magento.Client.CatalogProductLinkListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Assign product link
     */
    public br.com.mind.magento.Client.CatalogProductLinkAssignResponseParam catalogProductLinkAssign(br.com.mind.magento.Client.CatalogProductLinkAssignRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product link
     */
    public br.com.mind.magento.Client.CatalogProductLinkUpdateResponseParam catalogProductLinkUpdate(br.com.mind.magento.Client.CatalogProductLinkUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product link
     */
    public br.com.mind.magento.Client.CatalogProductLinkRemoveResponseParam catalogProductLinkRemove(br.com.mind.magento.Client.CatalogProductLinkRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product link types
     */
    public br.com.mind.magento.Client.CatalogProductLinkTypesResponseParam catalogProductLinkTypes(br.com.mind.magento.Client.CatalogProductLinkTypesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product link type attributes
     */
    public br.com.mind.magento.Client.CatalogProductLinkAttributesResponseParam catalogProductLinkAttributes(br.com.mind.magento.Client.CatalogProductLinkAttributesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new attribute
     */
    public br.com.mind.magento.Client.CatalogProductAttributeCreateResponseParam catalogProductAttributeCreate(br.com.mind.magento.Client.CatalogProductAttributeCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update attribute
     */
    public br.com.mind.magento.Client.CatalogProductAttributeUpdateResponseParam catalogProductAttributeUpdate(br.com.mind.magento.Client.CatalogProductAttributeUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Delete attribute
     */
    public br.com.mind.magento.Client.CatalogProductAttributeRemoveResponseParam catalogProductAttributeRemove(br.com.mind.magento.Client.CatalogProductAttributeRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get full information about attribute with list of options
     */
    public br.com.mind.magento.Client.CatalogProductAttributeInfoResponseParam catalogProductAttributeInfo(br.com.mind.magento.Client.CatalogProductAttributeInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of orders by filters
     */
    public br.com.mind.magento.Client.SalesOrderListResponseParam salesOrderList(br.com.mind.magento.Client.SalesOrderListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve order information
     */
    public br.com.mind.magento.Client.SalesOrderInfoResponseParam salesOrderInfo(br.com.mind.magento.Client.SalesOrderInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add comment to order
     */
    public br.com.mind.magento.Client.SalesOrderAddCommentResponseParam salesOrderAddComment(br.com.mind.magento.Client.SalesOrderAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Hold order
     */
    public br.com.mind.magento.Client.SalesOrderHoldResponseParam salesOrderHold(br.com.mind.magento.Client.SalesOrderHoldRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Unhold order
     */
    public br.com.mind.magento.Client.SalesOrderUnholdResponseParam salesOrderUnhold(br.com.mind.magento.Client.SalesOrderUnholdRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel order
     */
    public br.com.mind.magento.Client.SalesOrderCancelResponseParam salesOrderCancel(br.com.mind.magento.Client.SalesOrderCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of shipments by filters
     */
    public br.com.mind.magento.Client.SalesOrderShipmentListResponseParam salesOrderShipmentList(br.com.mind.magento.Client.SalesOrderShipmentListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve shipment information
     */
    public br.com.mind.magento.Client.SalesOrderShipmentInfoResponseParam salesOrderShipmentInfo(br.com.mind.magento.Client.SalesOrderShipmentInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new shipment for order
     */
    public br.com.mind.magento.Client.SalesOrderShipmentCreateResponseParam salesOrderShipmentCreate(br.com.mind.magento.Client.SalesOrderShipmentCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public br.com.mind.magento.Client.SalesOrderShipmentAddCommentResponseParam salesOrderShipmentAddComment(br.com.mind.magento.Client.SalesOrderShipmentAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new tracking number
     */
    public br.com.mind.magento.Client.SalesOrderShipmentAddTrackResponseParam salesOrderShipmentAddTrack(br.com.mind.magento.Client.SalesOrderShipmentAddTrackRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove tracking number
     */
    public br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackResponseParam salesOrderShipmentRemoveTrack(br.com.mind.magento.Client.SalesOrderShipmentRemoveTrackRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send shipment info
     */
    public br.com.mind.magento.Client.SalesOrderShipmentSendInfoResponseParam salesOrderShipmentSendInfo(br.com.mind.magento.Client.SalesOrderShipmentSendInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of allowed carriers for order
     */
    public br.com.mind.magento.Client.SalesOrderShipmentGetCarriersResponseParam salesOrderShipmentGetCarriers(br.com.mind.magento.Client.SalesOrderShipmentGetCarriersRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of invoices by filters
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceListResponseParam salesOrderInvoiceList(br.com.mind.magento.Client.SalesOrderInvoiceListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve invoice information
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceInfoResponseParam salesOrderInvoiceInfo(br.com.mind.magento.Client.SalesOrderInvoiceInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new invoice for order
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceCreateResponseParam salesOrderInvoiceCreate(br.com.mind.magento.Client.SalesOrderInvoiceCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to shipment
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceAddCommentResponseParam salesOrderInvoiceAddComment(br.com.mind.magento.Client.SalesOrderInvoiceAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Capture invoice
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceCaptureResponseParam salesOrderInvoiceCapture(br.com.mind.magento.Client.SalesOrderInvoiceCaptureRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Void invoice
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceVoidResponseParam salesOrderInvoiceVoid(br.com.mind.magento.Client.SalesOrderInvoiceVoidRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel invoice
     */
    public br.com.mind.magento.Client.SalesOrderInvoiceCancelResponseParam salesOrderInvoiceCancel(br.com.mind.magento.Client.SalesOrderInvoiceCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of creditmemos by filters
     */
    public br.com.mind.magento.Client.SalesOrderCreditmemoListResponseParam salesOrderCreditmemoList(br.com.mind.magento.Client.SalesOrderCreditmemoListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve creditmemo information
     */
    public br.com.mind.magento.Client.SalesOrderCreditmemoInfoResponseParam salesOrderCreditmemoInfo(br.com.mind.magento.Client.SalesOrderCreditmemoInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create new creditmemo for order
     */
    public br.com.mind.magento.Client.SalesOrderCreditmemoCreateResponseParam salesOrderCreditmemoCreate(br.com.mind.magento.Client.SalesOrderCreditmemoCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add new comment to creditmemo
     */
    public br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentResponseParam salesOrderCreditmemoAddComment(br.com.mind.magento.Client.SalesOrderCreditmemoAddCommentRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel creditmemo
     */
    public br.com.mind.magento.Client.SalesOrderCreditmemoCancelResponseParam salesOrderCreditmemoCancel(br.com.mind.magento.Client.SalesOrderCreditmemoCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve stock data by product ids
     */
    public br.com.mind.magento.Client.CatalogInventoryStockItemListResponseParam catalogInventoryStockItemList(br.com.mind.magento.Client.CatalogInventoryStockItemListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product stock data
     */
    public br.com.mind.magento.Client.CatalogInventoryStockItemUpdateResponseParam catalogInventoryStockItemUpdate(br.com.mind.magento.Client.CatalogInventoryStockItemUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Multi update product stock data
     */
    public br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateResponseParam catalogInventoryStockItemMultiUpdate(br.com.mind.magento.Client.CatalogInventoryStockItemMultiUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartCreateResponseParam shoppingCartCreate(br.com.mind.magento.Client.ShoppingCartCreateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve information about shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartInfoResponseParam shoppingCartInfo(br.com.mind.magento.Client.ShoppingCartInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Create an order from shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartOrderResponseParam shoppingCartOrder(br.com.mind.magento.Client.ShoppingCartOrderRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get total prices for shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartTotalsResponseParam shoppingCartTotals(br.com.mind.magento.Client.ShoppingCartTotalsRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get terms and conditions
     */
    public br.com.mind.magento.Client.ShoppingCartLicenseResponseParam shoppingCartLicense(br.com.mind.magento.Client.ShoppingCartLicenseRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add product(s) to shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartProductAddResponseParam shoppingCartProductAdd(br.com.mind.magento.Client.ShoppingCartProductAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product(s) quantities in shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartProductUpdateResponseParam shoppingCartProductUpdate(br.com.mind.magento.Client.ShoppingCartProductUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product(s) from shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartProductRemoveResponseParam shoppingCartProductRemove(br.com.mind.magento.Client.ShoppingCartProductRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of products in shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartProductListResponseParam shoppingCartProductList(br.com.mind.magento.Client.ShoppingCartProductListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Move product(s) to customer quote
     */
    public br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteResponseParam shoppingCartProductMoveToCustomerQuote(br.com.mind.magento.Client.ShoppingCartProductMoveToCustomerQuoteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set customer for shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartCustomerSetResponseParam shoppingCartCustomerSet(br.com.mind.magento.Client.ShoppingCartCustomerSetRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set customer's addresses in shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartCustomerAddressesResponseParam shoppingCartCustomerAddresses(br.com.mind.magento.Client.ShoppingCartCustomerAddressesRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set shipping method
     */
    public br.com.mind.magento.Client.ShoppingCartShippingMethodResponseParam shoppingCartShippingMethod(br.com.mind.magento.Client.ShoppingCartShippingMethodRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available shipping methods
     */
    public br.com.mind.magento.Client.ShoppingCartShippingListResponseParam shoppingCartShippingList(br.com.mind.magento.Client.ShoppingCartShippingListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set payment method
     */
    public br.com.mind.magento.Client.ShoppingCartPaymentMethodResponseParam shoppingCartPaymentMethod(br.com.mind.magento.Client.ShoppingCartPaymentMethodRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get list of available payment methods
     */
    public br.com.mind.magento.Client.ShoppingCartPaymentListResponseParam shoppingCartPaymentList(br.com.mind.magento.Client.ShoppingCartPaymentListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add coupon code for shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartCouponAddResponseParam shoppingCartCouponAdd(br.com.mind.magento.Client.ShoppingCartCouponAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove coupon code from shopping cart
     */
    public br.com.mind.magento.Client.ShoppingCartCouponRemoveResponseParam shoppingCartCouponRemove(br.com.mind.magento.Client.ShoppingCartCouponRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of tags by product
     */
    public br.com.mind.magento.Client.CatalogProductTagListResponseParam catalogProductTagList(br.com.mind.magento.Client.CatalogProductTagListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve product tag info
     */
    public br.com.mind.magento.Client.CatalogProductTagInfoResponseParam catalogProductTagInfo(br.com.mind.magento.Client.CatalogProductTagInfoRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add tag(s) to product
     */
    public br.com.mind.magento.Client.CatalogProductTagAddResponseParam catalogProductTagAdd(br.com.mind.magento.Client.CatalogProductTagAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Update product tag
     */
    public br.com.mind.magento.Client.CatalogProductTagUpdateResponseParam catalogProductTagUpdate(br.com.mind.magento.Client.CatalogProductTagUpdateRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove product tag
     */
    public br.com.mind.magento.Client.CatalogProductTagRemoveResponseParam catalogProductTagRemove(br.com.mind.magento.Client.CatalogProductTagRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Set a gift message to the cart
     */
    public br.com.mind.magento.Client.GiftMessageForQuoteResponseParam giftMessageSetForQuote(br.com.mind.magento.Client.GiftMessageForQuoteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote item
     */
    public br.com.mind.magento.Client.GiftMessageForQuoteItemResponseParam giftMessageSetForQuoteItem(br.com.mind.magento.Client.GiftMessageForQuoteItemRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Setting a gift messages to the quote items by products
     */
    public br.com.mind.magento.Client.GiftMessageForQuoteProductResponseParam giftMessageSetForQuoteProduct(br.com.mind.magento.Client.GiftMessageForQuoteProductRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add links to downloadable product
     */
    public br.com.mind.magento.Client.CatalogProductDownloadableLinkAddResponseParam catalogProductDownloadableLinkAdd(br.com.mind.magento.Client.CatalogProductDownloadableLinkAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Retrieve list of links and samples for downloadable product
     */
    public br.com.mind.magento.Client.CatalogProductDownloadableLinkListResponseParam catalogProductDownloadableLinkList(br.com.mind.magento.Client.CatalogProductDownloadableLinkListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Remove links and samples from downloadable product
     */
    public br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveResponseParam catalogProductDownloadableLinkRemove(br.com.mind.magento.Client.CatalogProductDownloadableLinkRemoveRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer by email
     */
    public br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailResponseParam rewardpointsCustomerGetcustomerbyemail(br.com.mind.magento.Client.RewardpointsCustomerGetcustomerbyemailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer Id by email
     */
    public br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailResponseParam rewardpointsCustomerGetcustomeridbyemail(br.com.mind.magento.Client.RewardpointsCustomerGetcustomeridbyemailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get balance by email
     */
    public br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailResponseParam rewardpointsCustomerGetbalancebyemail(br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyemailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get balance by customer Id
     */
    public br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidResponseParam rewardpointsCustomerGetbalancebyid(br.com.mind.magento.Client.RewardpointsCustomerGetbalancebyidRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get balance by customers
     */
    public br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceResponseParam rewardpointsCustomerGetcustomersbalance(br.com.mind.magento.Client.RewardpointsCustomerGetcustomersbalanceRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionListResponseParam rewardpointsTransactionList(br.com.mind.magento.Client.RewardpointsTransactionListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionAddResponseParam rewardpointsTransactionAdd(br.com.mind.magento.Client.RewardpointsTransactionAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Complete transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionCompleteResponseParam rewardpointsTransactionComplete(br.com.mind.magento.Client.RewardpointsTransactionCompleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionCancelResponseParam rewardpointsTransactionCancel(br.com.mind.magento.Client.RewardpointsTransactionCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Expire transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionExpireResponseParam rewardpointsTransactionExpire(br.com.mind.magento.Client.RewardpointsTransactionExpireRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send update balance email transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailResponseParam rewardpointsTransactionBalanceEmail(br.com.mind.magento.Client.RewardpointsTransactionBalanceEmailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send email before expire transactions
     */
    public br.com.mind.magento.Client.RewardpointsTransactionExpireEmailResponseParam rewardpointsTransactionExpireEmail(br.com.mind.magento.Client.RewardpointsTransactionExpireEmailRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get coupon by customer
     */
    public br.com.mind.magento.Client.RewardpointsReferfriendsCouponResponseParam rewardpointsReferfriendsCoupon(br.com.mind.magento.Client.RewardpointsReferfriendsCouponRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get link by customer
     */
    public br.com.mind.magento.Client.RewardpointsReferfriendsLinkResponseParam rewardpointsReferfriendsLink(br.com.mind.magento.Client.RewardpointsReferfriendsLinkRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer by coupon
     */
    public br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponResponseParam rewardpointsReferfriendsCustomerCoupon(br.com.mind.magento.Client.RewardpointsReferfriendsCustomerCouponRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get customer by link
     */
    public br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkResponseParam rewardpointsReferfriendsCustomerLink(br.com.mind.magento.Client.RewardpointsReferfriendsCustomerLinkRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Get transfer
     */
    public br.com.mind.magento.Client.RewardpointsTransferListResponseParam rewardpointsTransferList(br.com.mind.magento.Client.RewardpointsTransferListRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Add transfer
     */
    public br.com.mind.magento.Client.RewardpointsTransferAddResponseParam rewardpointsTransferAdd(br.com.mind.magento.Client.RewardpointsTransferAddRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Complete transfer
     */
    public br.com.mind.magento.Client.RewardpointsTransferCompleteResponseParam rewardpointsTransferComplete(br.com.mind.magento.Client.RewardpointsTransferCompleteRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Cancel transfer
     */
    public br.com.mind.magento.Client.RewardpointsTransferCancelResponseParam rewardpointsTransferCancel(br.com.mind.magento.Client.RewardpointsTransferCancelRequestParam parameters) throws java.rmi.RemoteException;

    /**
     * Send transfer email
     */
    public br.com.mind.magento.Client.RewardpointsTransferTransferEmailResponseParam rewardpointsTransferTransferEmail(br.com.mind.magento.Client.RewardpointsTransferTransferEmailRequestParam parameters) throws java.rmi.RemoteException;
}
