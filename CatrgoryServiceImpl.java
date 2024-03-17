package nim.prodCat.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nim.prodCat.Entity.CategoryEntity;
import nim.prodCat.Entity.ProductEntity;
import nim.prodCat.Repository.CatrgoryRepo;
@Service
public class CatrgoryServiceImpl implements CategoryService{
	
	@Autowired
	private CatrgoryRepo catrgoryRepo;
	@Override
	public CategoryEntity saveCategory(CategoryEntity category) {
		// TODO Auto-generated method stub
		return catrgoryRepo.save(category);
	}

	@Override
	public List<CategoryEntity> getAllCategory() {
		// TODO Auto-generated method stub
		return (List<CategoryEntity>) catrgoryRepo.findAll();
	}

	@Override
	public CategoryEntity updateCategory(CategoryEntity category, Integer categoryId) {
		// TODO Auto-generated method stub
		CategoryEntity cat = catrgoryRepo.findById(categoryId).get();

		if (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())) {
			cat.setCategoryName(category.getCategoryName());
		}

		return catrgoryRepo.save(cat);
	}

	@Override
	public void delectCategoryById(Integer categoryId) {
		// TODO Auto-generated method stub
		catrgoryRepo.deleteById(categoryId);
		
	}

	@Override
	public Optional<CategoryEntity> findById(Integer categoryId) {
		// TODO Auto-generated method stub
		return catrgoryRepo.findById(categoryId);
	}

}
