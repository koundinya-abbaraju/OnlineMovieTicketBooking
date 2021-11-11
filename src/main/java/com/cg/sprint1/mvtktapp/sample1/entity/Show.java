package com.cg.sprint1.mvtktapp.sample1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="show")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="showTheatreId")
public class Show 
{
	@Id
	@Column(name="show_theatre_id ")
	String showTheatreId;
	
	@Column(name="show_number")
	String showNumber;
	
	@Column(name="show_begin_time")
	String showBeginTime;
	
	@Column(name="movie_id")
	String movieId;
	
	@Column(name="theatre_id")
	String theatreId;
//-----------------------------------------------------------------------------------
	@ManyToOne
	@JoinColumn(name="theatre_id",updatable=false,insertable=false)
	Theatre theatre;
	
	@ManyToOne
	@JoinColumn(name="movie_id",updatable=false,insertable=false)
	Movie movie;
//-------------------------------------------------------------------------------
	
	public Show() {}

	public Show(String showTheatreId, String showNumber, String showBeginTime, String movieId, String theatreId) 
	{
		super();
		this.showTheatreId = showTheatreId;
		this.showNumber = showNumber;
		this.showBeginTime = showBeginTime;
		this.movieId = movieId;
		this.theatreId = theatreId;
	}

	public String getShowTheatreId() {
		return showTheatreId;
	}

	public void setShowTheatreId(String showTheatreId) {
		this.showTheatreId = showTheatreId;
	}

	public String getShowNumber() {
		return showNumber;
	}

	public void setShowNumber(String showNumber) {
		this.showNumber = showNumber;
	}

	public String getShowBeginTime() {
		return showBeginTime;
	}

	public void setShowBeginTime(String showBeginTime) {
		this.showBeginTime = showBeginTime;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
}
