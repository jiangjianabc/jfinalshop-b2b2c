package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductPromotion<M extends BaseProductPromotion<M>> extends Model<M> implements IBean {

	public void setProductsId(java.lang.Long productsId) {
		set("products_id", productsId);
	}

	public java.lang.Long getProductsId() {
		return getLong("products_id");
	}

	public void setPromotionsId(java.lang.Long promotionsId) {
		set("promotions_id", promotionsId);
	}

	public java.lang.Long getPromotionsId() {
		return getLong("promotions_id");
	}

}
