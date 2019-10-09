package run.halo.app.model.dto;

import lombok.Data;

/**
 * Statistic DTO.
 *
 * @author johnniang
 * @date 3/19/19
 */
@Data
public class StatisticDTO {

    private long postCount;

    private long commentCount;

    private long attachmentCount;

    private long birthday;

    private long establishDays;

    private long linkCount;

    private long visitCount;

    public long getPostCount() {
        return postCount;
    }

    public void setPostCount(long postCount) {
        this.postCount = postCount;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public long getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(long attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public long getEstablishDays() {
        return establishDays;
    }

    public void setEstablishDays(long establishDays) {
        this.establishDays = establishDays;
    }

    public long getLinkCount() {
        return linkCount;
    }

    public void setLinkCount(long linkCount) {
        this.linkCount = linkCount;
    }

    public long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(long visitCount) {
        this.visitCount = visitCount;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    private long likeCount;
}
