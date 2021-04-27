package com.interview;

import java.util.List;

public class FilteredProductList {
    public String typeName;
    public List categoryList ;

    public FilteredProductList(String typeName, List categoryList ) {
        this.typeName = typeName;
        this.categoryList  = categoryList ;
    }

    public List getCategoryList() {
        return categoryList;
    }
}
