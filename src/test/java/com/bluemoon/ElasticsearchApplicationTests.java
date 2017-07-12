package com.bluemoon;

import com.bluemoon.dao.ArticleSearchRepository;
import com.bluemoon.entity.Article;
import com.bluemoon.entity.Author;
import com.bluemoon.entity.Tutorial;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class ElasticsearchApplicationTests {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;
    @Test
    public void testSaveArticleIndex(){
        Author author = new Author();
        author.setId(1L);
        author.setName("tianshouzhi");
        author.setRemark("java developer");

        Tutorial tutorial = new Tutorial();
        tutorial.setId(1L);
        tutorial.setName("elastic search");

        for(int i=0;i<10;i++){
            Article article1 = new Article();
            article1.setId((long)i);
            article1.setTitle("springboot书籍" +i);
            article1.setAbstracts("springboot的书" + i);
            article1.setTutorial(tutorial);
            article1.setAuthor(author);
            article1.setContent("elasticsearch based on lucene" + i);
            article1.setPostTime(new Date());
            article1.setClickCount((long)i);
            articleSearchRepository.save(article1);
        }
        for(int i=10;i<20;i++){
            Article article1 = new Article();
            article1.setId((long)i);
            article1.setTitle("蓝月亮指的导手册" +i);
            article1.setAbstracts("蓝月亮指导手册的书" + i);
            article1.setTutorial(tutorial);
            article1.setAuthor(author);
            article1.setContent("蓝月亮书中自有黄金屋" + i);
            article1.setPostTime(new Date());
            article1.setClickCount((long)i);
            articleSearchRepository.save(article1);
        }
        for(int i=20;i<30;i++){
            Article article1 = new Article();
            article1.setId((long)i);
            article1.setTitle("编程的世界" +i);
            article1.setAbstracts("机洗至尊" + i);
            article1.setTutorial(tutorial);
            article1.setAuthor(author);
            article1.setContent("编程思想的博客好屌" + i);
            article1.setPostTime(new Date());
            article1.setClickCount((long)i);
            articleSearchRepository.save(article1);
        }

    }
    @Test
    public void testSearch(){
        String queryString="springboot";//搜索关键字
        QueryStringQueryBuilder builder=new QueryStringQueryBuilder(queryString);
        Iterable<Article> searchResult = articleSearchRepository.search(builder);
        Iterator<Article> iterator = searchResult.iterator();
        while(iterator.hasNext()){
            System.out.println("elasticsearch 搜索结果---"+iterator.next());
        }
    }
    @Test
    public void testSearchTitle(){
        String queryString="的";//搜索关键字
        List<Article> searchResult = articleSearchRepository.findByTitle(queryString);
        Iterator<Article> iterator = searchResult.iterator();
        while(iterator.hasNext()){
            System.out.println("elasticsearch 搜索结果---" + iterator.next());
        }
    }

}
