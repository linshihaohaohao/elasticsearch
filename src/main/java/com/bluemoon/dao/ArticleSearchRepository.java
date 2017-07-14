package com.bluemoon.dao;

import com.bluemoon.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by lsh on 2017/7/11.
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
//    匹配标题
    List<Article> findByTitle(String title);
    Page<Article> findByTitle(String title,Pageable page);
//    List<Article> findByNameOrContent(String name, Integer content);
//    List<Book> findByNameAndPrice(String name, Integer price);
//    List<Book> findByNameOrPrice(String name, Integer price);
//
//    //    添加某些特定类型的参数(如:Pageable和Sort)来动态的在查询中添加分页和排序。
//    // 排序操作也可以通过Pageable实例来处理。但如果你需要的只是排序，只需要为方法添加org.springframework.data.domain.Sort类型的参数即可
//    Page<Book> findByName(String name, Pageable page);
//    Page<Book> findByNameNot(String name,Pageable page);
//    Page<Book> findByPriceBetween(int price,Pageable page);
//    List<Book> findByLastname(String lastname, Sort sort);
//    Page<Book> findByNameLike(String name,Pageable page);
//    @Query("{\"bool\" : {\"must\" : {\"term\" : {\"message\" : \"?0\"}}}}")
//    Page<Book> findByMessage(String message, Pageable pageable);
//
//    // 排序 在方法名中加入OrderBy
//    List<Book> findByLastnameOrderByFirstnameAsc(String lastname);
//    List<Book> findByLastnameOrderByFirstnameDesc(String lastname);
////    List<Person> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);
//
//    /*在方法名中，可以使用And和Or连接多个属性。除此之外还可以使用Between,LessThan,GreaterThan,Like等等，不同数据库支持的连接符是不一样的，需要查看相关文档
//可以使用IgnoreCase来忽略单个属性的大小写，比如findByLastnameIgoreCase,也可以使用AllIgnoreCase来忽略全部属性的大小写。前提是，实际选择的数据库/搜索引擎支持。
//可以使用OrderBy来对相关属性进行排序。具体是升序还是降序，是通过Asc和Desc控制的。如果想了解动态排序，*/


}
