package com.jw22.community.model;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.description
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.create_time
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.modify_time
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Long modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.creator_id
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Long creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.comment_count
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.view_count
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.up_vote
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Integer upVote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.down_vote
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private Integer downVote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.tag
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.description
     *
     * @return the value of question.description
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.description
     *
     * @param description the value for question.description
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.create_time
     *
     * @return the value of question.create_time
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.create_time
     *
     * @param createTime the value for question.create_time
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.modify_time
     *
     * @return the value of question.modify_time
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.modify_time
     *
     * @param modifyTime the value for question.modify_time
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.creator_id
     *
     * @return the value of question.creator_id
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.creator_id
     *
     * @param creatorId the value for question.creator_id
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.comment_count
     *
     * @return the value of question.comment_count
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.comment_count
     *
     * @param commentCount the value for question.comment_count
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.view_count
     *
     * @return the value of question.view_count
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.view_count
     *
     * @param viewCount the value for question.view_count
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.up_vote
     *
     * @return the value of question.up_vote
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Integer getUpVote() {
        return upVote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.up_vote
     *
     * @param upVote the value for question.up_vote
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setUpVote(Integer upVote) {
        this.upVote = upVote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.down_vote
     *
     * @return the value of question.down_vote
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public Integer getDownVote() {
        return downVote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.down_vote
     *
     * @param downVote the value for question.down_vote
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setDownVote(Integer downVote) {
        this.downVote = downVote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.tag
     *
     * @return the value of question.tag
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.tag
     *
     * @param tag the value for question.tag
     *
     * @mbg.generated Wed Jun 24 16:31:45 CDT 2020
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}