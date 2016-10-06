package br.com.mind.integrador;

import br.com.mind.magento.client.CatalogCategoryEntityCreate;

public class CategoryCreateCommand extends Command {
	private int parentId;
	private CatalogCategoryEntityCreate categoryData;
	
	public CategoryCreateCommand() {}
	
	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public CatalogCategoryEntityCreate getCategoryData() {
		return categoryData;
	}

	public void setCategoryData(CatalogCategoryEntityCreate categoryData) {
		this.categoryData = categoryData;
	}
	
	public static CategoryCreateCommand createFromJson(String json) {
		return Command.json.fromJson(json, CategoryCreateCommand.class);
	}
}
