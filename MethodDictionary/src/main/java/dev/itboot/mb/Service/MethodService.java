package dev.itboot.mb.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.itboot.mb.Mapper.MethodMapper;
import dev.itboot.mb.Model.Method;
import dev.itboot.mb.Model.SearchRequest;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional
public class MethodService {
	
	private final MethodMapper mapper;
	
	public List<Method> selectAll() {
		return mapper.selectAll();
	}
	
	public List<String> selectLanguage() {
		return mapper.selectLanguage();
	}
	
	public List<String> selectType() {
		return mapper.selectType();
	}
	
	public List<Method> selectMethod(SearchRequest request) {
		
		/* 選択項目なしの場合、nullを保持する */
		if(StringUtils.isBlank(request.getLanguage())) {
			request.setLanguage(null);
		}
		if(StringUtils.isBlank(request.getMethodName())) {
			request.setMethodName(null);
		}
		if(StringUtils.isBlank(request.getType())) {
			request.setType(null);
		}
		if(StringUtils.isBlank(request.getKeyword1())) {
			request.setKeyword1(null);
		}
		if(StringUtils.isBlank(request.getKeyword2())) {
			request.setKeyword2(null);
		}
		if(StringUtils.isBlank(request.getKeyword3())) {
			request.setKeyword3(null);
		}
		return mapper.selectMethod(request);
	}
	
	public Method selectById(Long id) {
		return mapper.selectById(id);
	}
	
	public boolean insert(Method method) {
		return mapper.insert(method);
	}
	
	public int edit(Method method) {
		return mapper.edit(method);
	}
	
	public void delete(Long id) {
		mapper.delete(id);
	}
}
