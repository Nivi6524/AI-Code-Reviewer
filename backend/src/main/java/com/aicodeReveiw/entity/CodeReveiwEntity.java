package com.aicodeReveiw.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CODE_REVIEWS")
public class CodeReveiwEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long reviewId;

	    @ManyToOne
	    @JoinColumn(name = "PROJECT_ID")
	    private ProjectEntity project;

	    private String fileName;

	    @Lob
	    private String codeText;

	    @Lob
	    private String aiFeedback;

	    @Column(name = "CREATED_AT")
	    private Timestamp createdAt;

		public Long getReviewId() {
			return reviewId;
		}

		public void setReviewId(Long reviewId) {
			this.reviewId = reviewId;
		}

		public ProjectEntity getProject() {
			return project;
		}

		public void setProject(ProjectEntity project) {
			this.project = project;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getCodeText() {
			return codeText;
		}

		public void setCodeText(String codeText) {
			this.codeText = codeText;
		}

		public String getAiFeedback() {
			return aiFeedback;
		}

		public void setAiFeedback(String aiFeedback) {
			this.aiFeedback = aiFeedback;
		}

		public Timestamp getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Timestamp createdAt) {
			this.createdAt = createdAt;
		}
	    
	    

}
