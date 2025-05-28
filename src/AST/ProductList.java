package AST;

import java.util.List;
import java.util.stream.Collectors;

public class ProductList extends ComponentMetadata {
    public List<Product> products;

    public ProductList(List<Product> products) {

        this.products = products;
    }

    @Override
    public String toString() {
        return "[" + products.stream().map(Product::toString).collect(Collectors.joining(", ")) + "]";
    }
}