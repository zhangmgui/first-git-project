package com.xytest.domain;

import lombok.Data;

/**
 * Created by zhangmg on 2017/4/28.
 */
@Data
public class ArticleContent {
    private Integer ID;
    private String title;
    private String type;
    private String publishOrganization;
    private String articleNum;
    private String publishDate;
    private String implementation_date;
    private String textContent;
    private String policyArea;
}
