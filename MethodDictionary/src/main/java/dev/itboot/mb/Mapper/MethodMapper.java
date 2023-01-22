package dev.itboot.mb.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dev.itboot.mb.Model.Method;
import dev.itboot.mb.Model.SearchRequest;

@Mapper
public interface MethodMapper {
	
	/* 全件取得 */
	List<Method> selectAll();
	
	/* 検索条件取得 */
	List<Method> selectMethod(SearchRequest request);
	
	/* セレクトボックスの初期値言語取得 */
	List<String> selectLanguage();
	
	/* セレクトボックスの初期値型取得 */
	List<String> selectType();

	/* IDで1件取得 */
	Method selectById(Long id);
	
	/* 新規登録 */
	boolean insert(Method method);
	
	/* 編集・修正 */
	int edit(Method method);
	
	/* 削除 */
	void delete(Long id);
}
