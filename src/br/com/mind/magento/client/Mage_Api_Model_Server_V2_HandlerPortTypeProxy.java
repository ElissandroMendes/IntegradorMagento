package br.com.mind.magento.client;

public class Mage_Api_Model_Server_V2_HandlerPortTypeProxy implements br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType {
  private String _endpoint = null;
  private br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType mage_Api_Model_Server_V2_HandlerPortType = null;
  
  public Mage_Api_Model_Server_V2_HandlerPortTypeProxy() {
    _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
  }
  
  public Mage_Api_Model_Server_V2_HandlerPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
  }
  
  private void _initMage_Api_Model_Server_V2_HandlerPortTypeProxy() {
    try {
      mage_Api_Model_Server_V2_HandlerPortType = (new br.com.mind.magento.client.MagentoServiceLocator()).getMage_Api_Model_Server_V2_HandlerPort();
      if (mage_Api_Model_Server_V2_HandlerPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mage_Api_Model_Server_V2_HandlerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mage_Api_Model_Server_V2_HandlerPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mage_Api_Model_Server_V2_HandlerPortType != null)
      ((javax.xml.rpc.Stub)mage_Api_Model_Server_V2_HandlerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType getMage_Api_Model_Server_V2_HandlerPortType() {
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType;
  }
  
  public boolean endSession(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.endSession(sessionId);
  }
  
  public java.lang.String login(java.lang.String username, java.lang.String apiKey) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.login(username, apiKey);
  }
  
  public java.lang.String startSession() throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.startSession();
  }
  
  public br.com.mind.magento.client.ApiEntity[] resources(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.resources(sessionId);
  }
  
  public br.com.mind.magento.client.ExistsFaltureEntity[] globalFaults(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.globalFaults(sessionId);
  }
  
  public br.com.mind.magento.client.ExistsFaltureEntity[] resourceFaults(java.lang.String resourceName, java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.resourceFaults(resourceName, sessionId);
  }
  
  public br.com.mind.magento.client.StoreEntity[] storeList(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.storeList(sessionId);
  }
  
  public br.com.mind.magento.client.StoreEntity storeInfo(java.lang.String sessionId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.storeInfo(sessionId, storeId);
  }
  
  public br.com.mind.magento.client.MagentoInfoEntity magentoInfo(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.magentoInfo(sessionId);
  }
  
  public br.com.mind.magento.client.DirectoryCountryEntity[] directoryCountryList(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.directoryCountryList(sessionId);
  }
  
  public br.com.mind.magento.client.DirectoryRegionEntity[] directoryRegionList(java.lang.String sessionId, java.lang.String country) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.directoryRegionList(sessionId, country);
  }
  
  public br.com.mind.magento.client.CustomerCustomerEntity[] customerCustomerList(java.lang.String sessionId, br.com.mind.magento.client.Filters filters) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerCustomerList(sessionId, filters);
  }
  
  public int customerCustomerCreate(java.lang.String sessionId, br.com.mind.magento.client.CustomerCustomerEntityToCreate customerData) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerCustomerCreate(sessionId, customerData);
  }
  
  public br.com.mind.magento.client.CustomerCustomerEntity customerCustomerInfo(java.lang.String sessionId, int customerId, java.lang.String[] attributes) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerCustomerInfo(sessionId, customerId, attributes);
  }
  
  public boolean customerCustomerUpdate(java.lang.String sessionId, int customerId, br.com.mind.magento.client.CustomerCustomerEntityToCreate customerData) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerCustomerUpdate(sessionId, customerId, customerData);
  }
  
  public boolean customerCustomerDelete(java.lang.String sessionId, int customerId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerCustomerDelete(sessionId, customerId);
  }
  
  public br.com.mind.magento.client.CustomerGroupEntity[] customerGroupList(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerGroupList(sessionId);
  }
  
  public br.com.mind.magento.client.CustomerAddressEntityItem[] customerAddressList(java.lang.String sessionId, int customerId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerAddressList(sessionId, customerId);
  }
  
  public int customerAddressCreate(java.lang.String sessionId, int customerId, br.com.mind.magento.client.CustomerAddressEntityCreate addressData) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerAddressCreate(sessionId, customerId, addressData);
  }
  
  public br.com.mind.magento.client.CustomerAddressEntityItem customerAddressInfo(java.lang.String sessionId, int addressId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerAddressInfo(sessionId, addressId);
  }
  
  public boolean customerAddressUpdate(java.lang.String sessionId, int addressId, br.com.mind.magento.client.CustomerAddressEntityCreate addressData) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerAddressUpdate(sessionId, addressId, addressData);
  }
  
  public boolean customerAddressDelete(java.lang.String sessionId, int addressId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.customerAddressDelete(sessionId, addressId);
  }
  
  public int catalogCategoryCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryCurrentStore(sessionId, storeView);
  }
  
  public br.com.mind.magento.client.CatalogCategoryTree catalogCategoryTree(java.lang.String sessionId, java.lang.String parentId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryTree(sessionId, parentId, storeView);
  }
  
  public br.com.mind.magento.client.CatalogCategoryEntityNoChildren[] catalogCategoryLevel(java.lang.String sessionId, java.lang.String website, java.lang.String storeView, java.lang.String parentCategory) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryLevel(sessionId, website, storeView, parentCategory);
  }
  
  public br.com.mind.magento.client.CatalogCategoryInfo catalogCategoryInfo(java.lang.String sessionId, int categoryId, java.lang.String storeView, java.lang.String[] attributes) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryInfo(sessionId, categoryId, storeView, attributes);
  }
  
  public int catalogCategoryCreate(java.lang.String sessionId, int parentId, br.com.mind.magento.client.CatalogCategoryEntityCreate categoryData, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryCreate(sessionId, parentId, categoryData, storeView);
  }
  
  public boolean catalogCategoryUpdate(java.lang.String sessionId, int categoryId, br.com.mind.magento.client.CatalogCategoryEntityCreate categoryData, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryUpdate(sessionId, categoryId, categoryData, storeView);
  }
  
  public boolean catalogCategoryMove(java.lang.String sessionId, int categoryId, int parentId, java.lang.String afterId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryMove(sessionId, categoryId, parentId, afterId);
  }
  
  public boolean catalogCategoryDelete(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryDelete(sessionId, categoryId);
  }
  
  public br.com.mind.magento.client.CatalogAssignedProduct[] catalogCategoryAssignedProducts(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryAssignedProducts(sessionId, categoryId);
  }
  
  public boolean catalogCategoryAssignProduct(java.lang.String sessionId, int categoryId, java.lang.String product, java.lang.String position, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryAssignProduct(sessionId, categoryId, product, position, identifierType);
  }
  
  public boolean catalogCategoryUpdateProduct(java.lang.String sessionId, int categoryId, java.lang.String product, java.lang.String position, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryUpdateProduct(sessionId, categoryId, product, position, identifierType);
  }
  
  public boolean catalogCategoryRemoveProduct(java.lang.String sessionId, int categoryId, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryRemoveProduct(sessionId, categoryId, product, identifierType);
  }
  
  public int catalogCategoryAttributeCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryAttributeCurrentStore(sessionId, storeView);
  }
  
  public br.com.mind.magento.client.CatalogAttributeEntity[] catalogCategoryAttributeList(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryAttributeList(sessionId);
  }
  
  public br.com.mind.magento.client.CatalogAttributeOptionEntity[] catalogCategoryAttributeOptions(java.lang.String sessionId, java.lang.String attributeId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogCategoryAttributeOptions(sessionId, attributeId, storeView);
  }
  
  public int catalogProductCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCurrentStore(sessionId, storeView);
  }
  
  public br.com.mind.magento.client.CatalogProductEntity[] catalogProductList(java.lang.String sessionId, br.com.mind.magento.client.Filters filters, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductList(sessionId, filters, storeView);
  }
  
  public br.com.mind.magento.client.CatalogProductReturnEntity catalogProductInfo(java.lang.String sessionId, java.lang.String productId, java.lang.String storeView, br.com.mind.magento.client.CatalogProductRequestAttributes attributes, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductInfo(sessionId, productId, storeView, attributes, identifierType);
  }
  
  public int catalogProductCreate(java.lang.String sessionId, java.lang.String type, java.lang.String set, java.lang.String sku, br.com.mind.magento.client.CatalogProductCreateEntity productData, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCreate(sessionId, type, set, sku, productData, storeView);
  }
  
  public boolean catalogProductUpdate(java.lang.String sessionId, java.lang.String product, br.com.mind.magento.client.CatalogProductCreateEntity productData, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductUpdate(sessionId, product, productData, storeView, identifierType);
  }
  
  public boolean catalogProductMultiUpdate(java.lang.String sessionId, java.lang.String[] productIds, br.com.mind.magento.client.CatalogProductCreateEntity[] productData, java.lang.String store, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductMultiUpdate(sessionId, productIds, productData, store, identifierType);
  }
  
  public int catalogProductSetSpecialPrice(java.lang.String sessionId, java.lang.String product, java.lang.String specialPrice, java.lang.String fromDate, java.lang.String toDate, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductSetSpecialPrice(sessionId, product, specialPrice, fromDate, toDate, storeView, identifierType);
  }
  
  public br.com.mind.magento.client.CatalogProductSpecialPriceReturnEntity catalogProductGetSpecialPrice(java.lang.String sessionId, java.lang.String product, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductGetSpecialPrice(sessionId, product, storeView, identifierType);
  }
  
  public int catalogProductDelete(java.lang.String sessionId, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductDelete(sessionId, product, identifierType);
  }
  
  public int catalogProductAttributeCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeCurrentStore(sessionId, storeView);
  }
  
  public br.com.mind.magento.client.CatalogAttributeEntity[] catalogProductListOfAdditionalAttributes(java.lang.String sessionId, java.lang.String productType, java.lang.String attributeSetId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductListOfAdditionalAttributes(sessionId, productType, attributeSetId);
  }
  
  public br.com.mind.magento.client.CatalogAttributeEntity[] catalogProductAttributeList(java.lang.String sessionId, int setId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeList(sessionId, setId);
  }
  
  public br.com.mind.magento.client.CatalogAttributeOptionEntity[] catalogProductAttributeOptions(java.lang.String sessionId, java.lang.String attributeId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeOptions(sessionId, attributeId, storeView);
  }
  
  public int catalogProductAttributeSetCreate(java.lang.String sessionId, java.lang.String attributeSetName, java.lang.String skeletonSetId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetCreate(sessionId, attributeSetName, skeletonSetId);
  }
  
  public boolean catalogProductAttributeSetRemove(java.lang.String sessionId, java.lang.String attributeSetId, java.lang.String forceProductsRemove) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetRemove(sessionId, attributeSetId, forceProductsRemove);
  }
  
  public br.com.mind.magento.client.CatalogProductAttributeSetEntity[] catalogProductAttributeSetList(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetList(sessionId);
  }
  
  public boolean catalogProductAttributeSetAttributeAdd(java.lang.String sessionId, java.lang.String attributeId, java.lang.String attributeSetId, java.lang.String attributeGroupId, java.lang.String sortOrder) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetAttributeAdd(sessionId, attributeId, attributeSetId, attributeGroupId, sortOrder);
  }
  
  public boolean catalogProductAttributeSetAttributeRemove(java.lang.String sessionId, java.lang.String attributeId, java.lang.String attributeSetId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetAttributeRemove(sessionId, attributeId, attributeSetId);
  }
  
  public int catalogProductAttributeSetGroupAdd(java.lang.String sessionId, java.lang.String attributeSetId, java.lang.String groupName) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetGroupAdd(sessionId, attributeSetId, groupName);
  }
  
  public boolean catalogProductAttributeSetGroupRename(java.lang.String sessionId, java.lang.String groupId, java.lang.String groupName) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetGroupRename(sessionId, groupId, groupName);
  }
  
  public boolean catalogProductAttributeSetGroupRemove(java.lang.String sessionId, java.lang.String attributeGroupId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeSetGroupRemove(sessionId, attributeGroupId);
  }
  
  public br.com.mind.magento.client.CatalogAttributeOptionEntity[] catalogProductAttributeTypes(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeTypes(sessionId);
  }
  
  public int catalogProductAttributeCreate(java.lang.String sessionId, br.com.mind.magento.client.CatalogProductAttributeEntityToCreate data) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeCreate(sessionId, data);
  }
  
  public boolean catalogProductAttributeRemove(java.lang.String sessionId, java.lang.String attribute) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeRemove(sessionId, attribute);
  }
  
  public br.com.mind.magento.client.CatalogProductAttributeEntity catalogProductAttributeInfo(java.lang.String sessionId, java.lang.String attribute) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeInfo(sessionId, attribute);
  }
  
  public boolean catalogProductAttributeUpdate(java.lang.String sessionId, java.lang.String attribute, br.com.mind.magento.client.CatalogProductAttributeEntityToUpdate data) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeUpdate(sessionId, attribute, data);
  }
  
  public boolean catalogProductAttributeAddOption(java.lang.String sessionId, java.lang.String attribute, br.com.mind.magento.client.CatalogProductAttributeOptionEntityToAdd data) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeAddOption(sessionId, attribute, data);
  }
  
  public boolean catalogProductAttributeRemoveOption(java.lang.String sessionId, java.lang.String attribute, java.lang.String optionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeRemoveOption(sessionId, attribute, optionId);
  }
  
  public br.com.mind.magento.client.CatalogProductTypeEntity[] catalogProductTypeList(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductTypeList(sessionId);
  }
  
  public br.com.mind.magento.client.CatalogProductTierPriceEntity[] catalogProductAttributeTierPriceInfo(java.lang.String sessionId, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeTierPriceInfo(sessionId, product, identifierType);
  }
  
  public int catalogProductAttributeTierPriceUpdate(java.lang.String sessionId, java.lang.String product, br.com.mind.magento.client.CatalogProductTierPriceEntity[] tier_price, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeTierPriceUpdate(sessionId, product, tier_price, identifierType);
  }
  
  public int catalogProductAttributeMediaCurrentStore(java.lang.String sessionId, java.lang.String storeView) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaCurrentStore(sessionId, storeView);
  }
  
  public br.com.mind.magento.client.CatalogProductImageEntity[] catalogProductAttributeMediaList(java.lang.String sessionId, java.lang.String product, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaList(sessionId, product, storeView, identifierType);
  }
  
  public br.com.mind.magento.client.CatalogProductImageEntity catalogProductAttributeMediaInfo(java.lang.String sessionId, java.lang.String product, java.lang.String file, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaInfo(sessionId, product, file, storeView, identifierType);
  }
  
  public br.com.mind.magento.client.CatalogProductAttributeMediaTypeEntity[] catalogProductAttributeMediaTypes(java.lang.String sessionId, java.lang.String setId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaTypes(sessionId, setId);
  }
  
  public java.lang.String catalogProductAttributeMediaCreate(java.lang.String sessionId, java.lang.String product, br.com.mind.magento.client.CatalogProductAttributeMediaCreateEntity data, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaCreate(sessionId, product, data, storeView, identifierType);
  }
  
  public boolean catalogProductAttributeMediaUpdate(java.lang.String sessionId, java.lang.String product, java.lang.String file, br.com.mind.magento.client.CatalogProductAttributeMediaCreateEntity data, java.lang.String storeView, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaUpdate(sessionId, product, file, data, storeView, identifierType);
  }
  
  public boolean catalogProductAttributeMediaRemove(java.lang.String sessionId, java.lang.String product, java.lang.String file, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductAttributeMediaRemove(sessionId, product, file, identifierType);
  }
  
  public br.com.mind.magento.client.CatalogProductLinkEntity[] catalogProductLinkList(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductLinkList(sessionId, type, product, identifierType);
  }
  
  public boolean catalogProductLinkAssign(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String linkedProduct, br.com.mind.magento.client.CatalogProductLinkEntity data, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductLinkAssign(sessionId, type, product, linkedProduct, data, identifierType);
  }
  
  public boolean catalogProductLinkUpdate(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String linkedProduct, br.com.mind.magento.client.CatalogProductLinkEntity data, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductLinkUpdate(sessionId, type, product, linkedProduct, data, identifierType);
  }
  
  public boolean catalogProductLinkRemove(java.lang.String sessionId, java.lang.String type, java.lang.String product, java.lang.String linkedProduct, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductLinkRemove(sessionId, type, product, linkedProduct, identifierType);
  }
  
  public java.lang.String[] catalogProductLinkTypes(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductLinkTypes(sessionId);
  }
  
  public br.com.mind.magento.client.CatalogProductLinkAttributeEntity[] catalogProductLinkAttributes(java.lang.String sessionId, java.lang.String type) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductLinkAttributes(sessionId, type);
  }
  
  public boolean catalogProductCustomOptionAdd(java.lang.String sessionId, java.lang.String productId, br.com.mind.magento.client.CatalogProductCustomOptionToAdd data, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionAdd(sessionId, productId, data, store);
  }
  
  public boolean catalogProductCustomOptionUpdate(java.lang.String sessionId, java.lang.String optionId, br.com.mind.magento.client.CatalogProductCustomOptionToUpdate data, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionUpdate(sessionId, optionId, data, store);
  }
  
  public br.com.mind.magento.client.CatalogProductCustomOptionTypesEntity[] catalogProductCustomOptionTypes(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionTypes(sessionId);
  }
  
  public br.com.mind.magento.client.CatalogProductCustomOptionInfoEntity catalogProductCustomOptionInfo(java.lang.String sessionId, java.lang.String optionId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionInfo(sessionId, optionId, store);
  }
  
  public br.com.mind.magento.client.CatalogProductCustomOptionListEntity[] catalogProductCustomOptionList(java.lang.String sessionId, java.lang.String productId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionList(sessionId, productId, store);
  }
  
  public boolean catalogProductCustomOptionRemove(java.lang.String sessionId, java.lang.String optionId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionRemove(sessionId, optionId);
  }
  
  public br.com.mind.magento.client.CatalogProductCustomOptionValueInfoEntity catalogProductCustomOptionValueInfo(java.lang.String sessionId, java.lang.String valueId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionValueInfo(sessionId, valueId, store);
  }
  
  public br.com.mind.magento.client.CatalogProductCustomOptionValueListEntity[] catalogProductCustomOptionValueList(java.lang.String sessionId, java.lang.String optionId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionValueList(sessionId, optionId, store);
  }
  
  public boolean catalogProductCustomOptionValueAdd(java.lang.String sessionId, java.lang.String optionId, br.com.mind.magento.client.CatalogProductCustomOptionValueAddEntity[] data, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionValueAdd(sessionId, optionId, data, store);
  }
  
  public boolean catalogProductCustomOptionValueUpdate(java.lang.String sessionId, java.lang.String valueId, br.com.mind.magento.client.CatalogProductCustomOptionValueUpdateEntity data, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionValueUpdate(sessionId, valueId, data, storeId);
  }
  
  public boolean catalogProductCustomOptionValueRemove(java.lang.String sessionId, java.lang.String valueId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductCustomOptionValueRemove(sessionId, valueId);
  }
  
  public br.com.mind.magento.client.SalesOrderListEntity[] salesOrderList(java.lang.String sessionId, br.com.mind.magento.client.Filters filters) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderList(sessionId, filters);
  }
  
  public br.com.mind.magento.client.SalesOrderEntity salesOrderInfo(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInfo(sessionId, orderIncrementId);
  }
  
  public boolean salesOrderAddComment(java.lang.String sessionId, java.lang.String orderIncrementId, java.lang.String status, java.lang.String comment, java.lang.String notify) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderAddComment(sessionId, orderIncrementId, status, comment, notify);
  }
  
  public boolean salesOrderHold(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderHold(sessionId, orderIncrementId);
  }
  
  public boolean salesOrderUnhold(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderUnhold(sessionId, orderIncrementId);
  }
  
  public boolean salesOrderCancel(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderCancel(sessionId, orderIncrementId);
  }
  
  public br.com.mind.magento.client.SalesOrderShipmentEntity[] salesOrderShipmentList(java.lang.String sessionId, br.com.mind.magento.client.Filters filters) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentList(sessionId, filters);
  }
  
  public br.com.mind.magento.client.SalesOrderShipmentEntity salesOrderShipmentInfo(java.lang.String sessionId, java.lang.String shipmentIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentInfo(sessionId, shipmentIncrementId);
  }
  
  public java.lang.String salesOrderShipmentCreate(java.lang.String sessionId, java.lang.String orderIncrementId, br.com.mind.magento.client.OrderItemIdQty[] itemsQty, java.lang.String comment, int email, int includeComment) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentCreate(sessionId, orderIncrementId, itemsQty, comment, email, includeComment);
  }
  
  public boolean salesOrderShipmentAddComment(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String comment, java.lang.String email, java.lang.String includeInEmail) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentAddComment(sessionId, shipmentIncrementId, comment, email, includeInEmail);
  }
  
  public int salesOrderShipmentAddTrack(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String carrier, java.lang.String title, java.lang.String trackNumber) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentAddTrack(sessionId, shipmentIncrementId, carrier, title, trackNumber);
  }
  
  public boolean salesOrderShipmentSendInfo(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String comment) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentSendInfo(sessionId, shipmentIncrementId, comment);
  }
  
  public boolean salesOrderShipmentRemoveTrack(java.lang.String sessionId, java.lang.String shipmentIncrementId, java.lang.String trackId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentRemoveTrack(sessionId, shipmentIncrementId, trackId);
  }
  
  public br.com.mind.magento.client.AssociativeEntity[] salesOrderShipmentGetCarriers(java.lang.String sessionId, java.lang.String orderIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderShipmentGetCarriers(sessionId, orderIncrementId);
  }
  
  public br.com.mind.magento.client.SalesOrderInvoiceEntity[] salesOrderInvoiceList(java.lang.String sessionId, br.com.mind.magento.client.Filters filters) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceList(sessionId, filters);
  }
  
  public br.com.mind.magento.client.SalesOrderInvoiceEntity salesOrderInvoiceInfo(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceInfo(sessionId, invoiceIncrementId);
  }
  
  public java.lang.String salesOrderInvoiceCreate(java.lang.String sessionId, java.lang.String invoiceIncrementId, br.com.mind.magento.client.OrderItemIdQty[] itemsQty, java.lang.String comment, java.lang.String email, java.lang.String includeComment) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceCreate(sessionId, invoiceIncrementId, itemsQty, comment, email, includeComment);
  }
  
  public boolean salesOrderInvoiceAddComment(java.lang.String sessionId, java.lang.String invoiceIncrementId, java.lang.String comment, java.lang.String email, java.lang.String includeComment) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceAddComment(sessionId, invoiceIncrementId, comment, email, includeComment);
  }
  
  public boolean salesOrderInvoiceCapture(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceCapture(sessionId, invoiceIncrementId);
  }
  
  public boolean salesOrderInvoiceVoid(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceVoid(sessionId, invoiceIncrementId);
  }
  
  public boolean salesOrderInvoiceCancel(java.lang.String sessionId, java.lang.String invoiceIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderInvoiceCancel(sessionId, invoiceIncrementId);
  }
  
  public br.com.mind.magento.client.SalesOrderCreditmemoEntity[] salesOrderCreditmemoList(java.lang.String sessionId, br.com.mind.magento.client.Filters filters) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderCreditmemoList(sessionId, filters);
  }
  
  public br.com.mind.magento.client.SalesOrderCreditmemoEntity salesOrderCreditmemoInfo(java.lang.String sessionId, java.lang.String creditmemoIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderCreditmemoInfo(sessionId, creditmemoIncrementId);
  }
  
  public java.lang.String salesOrderCreditmemoCreate(java.lang.String sessionId, java.lang.String orderIncrementId, br.com.mind.magento.client.SalesOrderCreditmemoData creditmemoData, java.lang.String comment, int notifyCustomer, int includeComment, java.lang.String refundToStoreCreditAmount) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderCreditmemoCreate(sessionId, orderIncrementId, creditmemoData, comment, notifyCustomer, includeComment, refundToStoreCreditAmount);
  }
  
  public boolean salesOrderCreditmemoAddComment(java.lang.String sessionId, java.lang.String creditmemoIncrementId, java.lang.String comment, int notifyCustomer, int includeComment) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderCreditmemoAddComment(sessionId, creditmemoIncrementId, comment, notifyCustomer, includeComment);
  }
  
  public boolean salesOrderCreditmemoCancel(java.lang.String sessionId, java.lang.String creditmemoIncrementId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.salesOrderCreditmemoCancel(sessionId, creditmemoIncrementId);
  }
  
  public br.com.mind.magento.client.CatalogInventoryStockItemEntity[] catalogInventoryStockItemList(java.lang.String sessionId, java.lang.String[] products) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogInventoryStockItemList(sessionId, products);
  }
  
  public int catalogInventoryStockItemUpdate(java.lang.String sessionId, java.lang.String product, br.com.mind.magento.client.CatalogInventoryStockItemUpdateEntity data) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogInventoryStockItemUpdate(sessionId, product, data);
  }
  
  public boolean catalogInventoryStockItemMultiUpdate(java.lang.String sessionId, java.lang.String[] productIds, br.com.mind.magento.client.CatalogInventoryStockItemUpdateEntity[] productData) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogInventoryStockItemMultiUpdate(sessionId, productIds, productData);
  }
  
  public int shoppingCartCreate(java.lang.String sessionId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartCreate(sessionId, storeId);
  }
  
  public br.com.mind.magento.client.ShoppingCartInfoEntity shoppingCartInfo(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartInfo(sessionId, quoteId, storeId);
  }
  
  public java.lang.String shoppingCartOrder(java.lang.String sessionId, int quoteId, java.lang.String storeId, java.lang.String[] licenses) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartOrder(sessionId, quoteId, storeId, licenses);
  }
  
  public br.com.mind.magento.client.ShoppingCartTotalsEntity[] shoppingCartTotals(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartTotals(sessionId, quoteId, storeId);
  }
  
  public br.com.mind.magento.client.ShoppingCartLicenseEntity[] shoppingCartLicense(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartLicense(sessionId, quoteId, storeId);
  }
  
  public boolean shoppingCartProductAdd(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartProductAdd(sessionId, quoteId, products, storeId);
  }
  
  public boolean shoppingCartProductUpdate(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartProductUpdate(sessionId, quoteId, products, storeId);
  }
  
  public boolean shoppingCartProductRemove(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartProductRemove(sessionId, quoteId, products, storeId);
  }
  
  public br.com.mind.magento.client.CatalogProductEntity[] shoppingCartProductList(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartProductList(sessionId, quoteId, storeId);
  }
  
  public boolean shoppingCartProductMoveToCustomerQuote(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartProductEntity[] products, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartProductMoveToCustomerQuote(sessionId, quoteId, products, storeId);
  }
  
  public boolean shoppingCartCustomerSet(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartCustomerEntity customer, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartCustomerSet(sessionId, quoteId, customer, storeId);
  }
  
  public boolean shoppingCartCustomerAddresses(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartCustomerAddressEntity[] customer, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartCustomerAddresses(sessionId, quoteId, customer, storeId);
  }
  
  public boolean shoppingCartShippingMethod(java.lang.String sessionId, int quoteId, java.lang.String method, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartShippingMethod(sessionId, quoteId, method, storeId);
  }
  
  public br.com.mind.magento.client.ShoppingCartShippingMethodEntity[] shoppingCartShippingList(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartShippingList(sessionId, quoteId, storeId);
  }
  
  public boolean shoppingCartPaymentMethod(java.lang.String sessionId, int quoteId, br.com.mind.magento.client.ShoppingCartPaymentMethodEntity method, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartPaymentMethod(sessionId, quoteId, method, storeId);
  }
  
  public br.com.mind.magento.client.ShoppingCartPaymentMethodResponseEntity[] shoppingCartPaymentList(java.lang.String sessionId, int quoteId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartPaymentList(sessionId, quoteId, store);
  }
  
  public boolean shoppingCartCouponAdd(java.lang.String sessionId, int quoteId, java.lang.String couponCode, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartCouponAdd(sessionId, quoteId, couponCode, storeId);
  }
  
  public boolean shoppingCartCouponRemove(java.lang.String sessionId, int quoteId, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.shoppingCartCouponRemove(sessionId, quoteId, storeId);
  }
  
  public br.com.mind.magento.client.CatalogProductTagListEntity[] catalogProductTagList(java.lang.String sessionId, java.lang.String productId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductTagList(sessionId, productId, store);
  }
  
  public br.com.mind.magento.client.CatalogProductTagInfoEntity catalogProductTagInfo(java.lang.String sessionId, java.lang.String tagId, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductTagInfo(sessionId, tagId, store);
  }
  
  public br.com.mind.magento.client.AssociativeEntity[] catalogProductTagAdd(java.lang.String sessionId, br.com.mind.magento.client.CatalogProductTagAddEntity data) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductTagAdd(sessionId, data);
  }
  
  public boolean catalogProductTagUpdate(java.lang.String sessionId, java.lang.String tagId, br.com.mind.magento.client.CatalogProductTagUpdateEntity data, java.lang.String store) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductTagUpdate(sessionId, tagId, data, store);
  }
  
  public boolean catalogProductTagRemove(java.lang.String sessionId, java.lang.String tagId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductTagRemove(sessionId, tagId);
  }
  
  public br.com.mind.magento.client.GiftMessageResponse giftMessageSetForQuote(java.lang.String sessionId, java.lang.String quoteId, br.com.mind.magento.client.GiftMessageEntity giftMessage, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.giftMessageSetForQuote(sessionId, quoteId, giftMessage, storeId);
  }
  
  public br.com.mind.magento.client.GiftMessageResponse giftMessageSetForQuoteItem(java.lang.String sessionId, java.lang.String quoteItemId, br.com.mind.magento.client.GiftMessageEntity giftMessage, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.giftMessageSetForQuoteItem(sessionId, quoteItemId, giftMessage, storeId);
  }
  
  public br.com.mind.magento.client.GiftMessageResponse[] giftMessageSetForQuoteProduct(java.lang.String sessionId, java.lang.String quoteId, br.com.mind.magento.client.GiftMessageAssociativeProductsEntity[] productsAndMessages, java.lang.String storeId) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.giftMessageSetForQuoteProduct(sessionId, quoteId, productsAndMessages, storeId);
  }
  
  public int catalogProductDownloadableLinkAdd(java.lang.String sessionId, java.lang.String productId, br.com.mind.magento.client.CatalogProductDownloadableLinkAddEntity resource, java.lang.String resourceType, java.lang.String store, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductDownloadableLinkAdd(sessionId, productId, resource, resourceType, store, identifierType);
  }
  
  public br.com.mind.magento.client.CatalogProductDownloadableLinkInfoEntity catalogProductDownloadableLinkList(java.lang.String sessionId, java.lang.String productId, java.lang.String store, java.lang.String identifierType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductDownloadableLinkList(sessionId, productId, store, identifierType);
  }
  
  public boolean catalogProductDownloadableLinkRemove(java.lang.String sessionId, java.lang.String linkId, java.lang.String resourceType) throws java.rmi.RemoteException{
    if (mage_Api_Model_Server_V2_HandlerPortType == null)
      _initMage_Api_Model_Server_V2_HandlerPortTypeProxy();
    return mage_Api_Model_Server_V2_HandlerPortType.catalogProductDownloadableLinkRemove(sessionId, linkId, resourceType);
  }
  
  
}