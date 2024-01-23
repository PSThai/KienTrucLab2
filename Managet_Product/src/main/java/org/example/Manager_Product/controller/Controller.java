package org.example.Manager_Product.controller;


import org.example.Manager_Product.entity.Product;
import org.example.Manager_Product.entity.User;
import org.example.Manager_Product.reponsitory.OrderReponsitory;
import org.example.Manager_Product.reponsitory.ProductReponsitory;
import org.example.Manager_Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products") // Thay đổi đường dẫn chung cho tất cả các phương thức trong controller
public class Controller {

    @Autowired
    private ProductService productService;

    @Autowired
	RestTemplate restTemplate;

    @Autowired
    private ProductReponsitory productReponsitory;

    // Lấy danh sách sản phẩm
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    // Thêm mới sản phẩm
//    @PostMapping("/add")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {
        productService.addProducts(product);
        return product;
    }
 // Lấy thong tin người dùng và product
 	@GetMapping("/orderproduct/{id}/{productId}")
 	public ResponseEntity<OrderReponsitory> orderProductByUser(@PathVariable Integer id,
 			@PathVariable Integer productId) {
 		OrderReponsitory orderReponsitory = new OrderReponsitory();
 		String url = "http://localhost:8081/user/get/" + id;
 		ResponseEntity<User> reponse = restTemplate.getForEntity(url, User.class);
 		Optional<Product> optional = productReponsitory.findById(productId);
 		Product product = null;
 		if (optional.isPresent()) {
 			product = optional.get();
 		} else {
 			new RuntimeException("Khong co user theo id này");
 		}
 		User user = reponse.getBody();
 		orderReponsitory.setUser(user);
 		orderReponsitory.setProduct(product);
 		return new ResponseEntity<OrderReponsitory>(orderReponsitory, HttpStatus.OK);
 	}
}
