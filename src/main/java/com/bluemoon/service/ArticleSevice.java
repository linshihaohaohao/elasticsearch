package com.bluemoon.service;

import com.bluemoon.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;

import java.util.List;

/**
 * Created by lsh on 2017/7/13.
 */
public class ArticleSevice {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    public List<Article> queryForObject(){
        CriteriaQuery criteriaQuery = new CriteriaQuery(new Criteria("title").contains("spring"));
        // when
        List<Article> article = elasticsearchTemplate.queryForList(criteriaQuery, Article.class);

        return article;
    }

}
