package com.fastcampus.projectboard.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "content"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy"),
})
@Entity
public class ArticleComment extends AuditingFields{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @ManyToOne(optional = false) private Article article; // 게시글 ID
    @Setter @Column(nullable = false,length = 500) private String content; // 본문



    protected ArticleComment() {}//@NoArgsConstructor(access = AccessLevel.PROTECTED) 애노테이션으로도 만들 수 있다.

    private ArticleComment(Article article, String content) {
        this.article = article;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleComment that)) return false;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static ArticleComment of (Article article, String content) {
        return new ArticleComment(article, content);

    }
}
