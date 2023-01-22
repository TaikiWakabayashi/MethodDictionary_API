package dev.itboot.mb.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.itboot.mb.Model.Method;
import dev.itboot.mb.Model.SearchRequest;
import dev.itboot.mb.Service.MethodService;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins="*")
public class MethodController {
	
	private final MethodService methodService;
	
	@PostMapping("/method")
	@ResponseBody
	public List<Method> getAll(@RequestBody(required = false) SearchRequest request) {
		
		if(request == null) {
			return methodService.selectAll();
		}else {
			System.out.println("条件取得");
			return methodService.selectMethod(request);
		}
	}
	
	@GetMapping("/method/language")
	@ResponseBody
	public List<String> selectLanguage() {
		return methodService.selectLanguage();
	}
	
	@GetMapping("/method/type")
	@ResponseBody
	public List<String> selectType() {
		return methodService.selectType();
	}
	
	@PostMapping("/method/add")
	@ResponseBody
	public boolean insert(@RequestBody Method method) {
		boolean status = methodService.insert(method);
		
		return status;
	}
	
	@GetMapping("/edit/{id}")
	public Method selectById(@PathVariable Long id) {
		return methodService.selectById(id);
	}
	
	@PostMapping("/edit")
	@ResponseBody
	public Method edit(@RequestBody Method method) {
		methodService.edit(method);
		return methodService.selectById(method.getId());
	}
	
	@GetMapping("/delete/{id}")
	public List<Method> delete(@PathVariable Long id) {
		methodService.delete(id);
		
		return methodService.selectAll();
	}
}
