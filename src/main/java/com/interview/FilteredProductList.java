package com.interview;

import java.util.List;

public class FilteredProductList {
    public String typeName;
    public List<String> categoryList ;

    public FilteredProductList(String typeName, List<String> categoryList ) {
        this.typeName = typeName;
        this.categoryList  = categoryList ;
    }

    public List<String> getCategoryList() {
        return categoryList;
    }
}
