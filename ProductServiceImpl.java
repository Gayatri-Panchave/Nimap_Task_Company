package nim.prodCat.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nim.prodCat.Entity.ProductEntity;
import nim.prodCat.Repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		// TODO Auto-generated method stub
		return (List<ProductEntity>) productRepo.findAll();
	}

	@Override
	public void delectProductById(Integer productId) {
		// TODO Auto-generated method stub
		productRepo.deleteById(productId);
	}

	@Override
	public ProductEntity updateProduct(ProductEntity product, Integer productId) {
		// TODO Auto-generated method stub
		ProductEntity prod = productRepo.findById(productId).get();

		if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
			prod.setProductName(product.getProductName());
		}

		if (Objects.nonNull(product.getProductPrice()) && !"".equalsIgnoreCase(product.getProductPrice())) {
			prod.setProductPrice(product.getProductPrice());
		}

		return productRepo.save(prod);
	}

	@Override
	public Optional<ProductEntity> findById(Integer productId) {
		// TODO Auto-generated method stub
		return productRepo.findById(productId);
	}

}
