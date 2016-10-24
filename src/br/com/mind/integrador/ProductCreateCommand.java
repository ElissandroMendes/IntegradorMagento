package br.com.mind.integrador;

import br.com.mind.magento.client.CatalogProductCreateEntity;

public class ProductCreateCommand {
	public String type;
	public String set;
	public String sku;
	public String storeView;
	public CatalogProductCreateEntity productData;
	
	public ProductCreateCommand() {
		
	}
	
	public static void main(String[] args) {
//		String c = \"[{\\"set\\":\\"9\\",\\"storeView\\":\\"1\\",\\"sku\\":\\"12345678\\",\\"type\\":\\"simple\\",\\"productData\\":{\\"status\\":\\"1\\",\\"description\\":\\"Descricao Longa\\",\\"stock_Data\\":{\\"min_qty\\":1,\\"use_config_manage_stock\\":1,\\"is_qty_decimal\\":1,\\"use_config_notify_stock_qty\\":1,\\"use_config_min_sale_qty\\":1,\\"max_sale_qty\\":999,\\"backorders\\":1,\\"min_sale_qty\\":1,\\"use_config_backorders\\":1,\\"qty\\":10,\\"is_in_stock\\":1,\\"manage_stock\\":1,\\"use_config_min_qty\\":1,\\"notify_stock_qty\\":1,\\"use_config_max_sale_qty\\":1},\\"weight\\":\\"1.0\\",\\"price\\":20,\\"visibility\\":\\"1\\",\\"websites\\":[\\"1\\"],\\"name\\":\\"Produto Teste\\",\\"short_description\\":\\"Descricao Curta\\",\\"categories\\":[56]}}]\";
//		String c = "{\"status\":\"1\",\"description\":\"Descricao Longa\",\"stock_data\":{\"min_qty\":1,\"use_config_manage_stock\":1,\"is_qty_decimal\":1,\"use_config_notify_stock_qty\":1,\"use_config_min_sale_qty\":1,\"max_sale_qty\":999,\"backorders\":1,\"min_sale_qty\":1,\"use_config_backorders\":1,\"qty\":10,\"is_in_stock\":1,\"manage_stock\":1,\"use_config_min_qty\":1,\"notify_stock_qty\":1,\"use_config_max_sale_qty\":1}}";
//		CatalogProductCreateEntity products = Command.json.fromJson(c, CatalogProductCreateEntity.class);
//		System.out.println(products.getStock_data().getQty());
	}
}
