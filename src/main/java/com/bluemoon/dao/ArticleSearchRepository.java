package com.bluemoon.dao;

import com.bluemoon.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by lsh on 2017/7/11.
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
//    匹配标题
    List<Article> findByTitle(String title);
}
