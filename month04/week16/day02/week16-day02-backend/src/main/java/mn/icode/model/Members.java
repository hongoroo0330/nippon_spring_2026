package mn.icode.model;

import java.math.BigDecimal;

import java.time.Instant;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")

public class Members {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true, nullable = false, length = 200)
	private String email;
	
	@Column( name = "full_name", nullable = false, length = 100)
	private String fullname;
	
	@Column(name = "subscription_fee", precision = 10, scale = 2)
	private BigDecimal subscriptionfee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "club_id")
	private Clubs clubs;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public BigDecimal getSubscriptionfee() {
		return subscriptionfee;
	}

	public void setSubscriptionfee(BigDecimal subscriptionfee) {
		this.subscriptionfee = subscriptionfee;
	}

	public Instant getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(Instant joinedAt) {
		this.joinedAt = joinedAt;
	}

	@Column(name = "joined_at", updatable = false)
	private Instant joinedAt = Instant.now();
	
}