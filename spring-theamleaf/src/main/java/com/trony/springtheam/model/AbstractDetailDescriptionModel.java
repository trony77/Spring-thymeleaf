package com.trony.springtheam.model;

public abstract class AbstractDetailDescriptionModel {

        private String label;
        private String type;
        private ProductModel product;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ProductModel getProduct() {
            return product;
        }

        public void setProduct(ProductModel product) {
            this.product = product;
        }

}
